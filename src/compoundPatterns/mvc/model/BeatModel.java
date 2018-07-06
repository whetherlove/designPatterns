package compoundPatterns.mvc.model;

import javax.sound.midi.*;
import java.util.ArrayList;

/**
 * @ProjectName: designPatterns
 * @Package: compoundPatterns.mvc.model
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 16:22
 * @UpdateDate: 2018/7/6/006 16:22
 */
public class BeatModel implements ObservableBeat,MetaEventListener {

    private Sequence sequence;
    private Sequencer sequencer;
    private Track track;

    private ArrayList<BeatObserver> beatObservers = new ArrayList<>();
    private ArrayList<BPMObserver> bpmObservers = new ArrayList<>();
    private int bpm = 90;

    @Override
    public void init() {
        setUpMidi();
        buildTrackAndStart();
    }

    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer(false);
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(bpm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        int[] trackList = {35,0,46,0};
        sequence.deleteTrack(null);
        track = sequence.createTrack();
        makeTracks(trackList);
    }

    private void makeTracks(int[] trackList) {
        for (int i=0; i<trackList.length; i++){
            int key = trackList[i];
            if (key != 0) {
                track.add(makeEvent(144,9,key,100,i));
                track.add(makeEvent(128,9,key,100,i+1));
            }
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(bpm);
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    void beatEvent(){
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        beatObservers.add(beatObserver);
    }

    @Override
    public void registerObserver(BPMObserver bpmObserver) {
        bpmObservers.add(bpmObserver);
    }

    @Override
    public void removeBeatObserver(BeatObserver beatObserver) {
        beatObservers.remove(beatObserver);
    }

    @Override
    public void removeBPMObserver(BPMObserver bpmObserver) {
        bpmObservers.remove(bpmObserver);
    }

    @Override
    public void notifyBeatObservers() {
        beatObservers.forEach(BeatObserver::updateBeat);
    }

    @Override
    public void notifyBPMObservers() {
        bpmObservers.forEach(BPMObserver::updateBPM);
    }


    @Override
    public void meta(MetaMessage meta) {
        if (meta.getType() == 47){
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }
}
