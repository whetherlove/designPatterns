package GoF.commandPattern.remote.remoteTest;

import GoF.commandPattern.remote.SimpleRemote;
import GoF.commandPattern.remote.commands.GarageDoorUpCommand;
import GoF.commandPattern.remote.commands.LightOnCommand;
import GoF.commandPattern.remote.electronics.GarageDoor;
import GoF.commandPattern.remote.electronics.Light;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.commandPattern.remote.remoteTest
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/28/028 13:58
 * @UpdateDate: 2018/6/28/028 13:58
 */
public class SimpleRemoteTest {

    public static void main(String[] args) {

        SimpleRemote remote = new SimpleRemote();
        Light light = new Light("restroom");

        remote.setCommand(new LightOnCommand(light));

        remote.on();
        remote.off();

        GarageDoor garageDoor = new GarageDoor("home");

        remote.setCommand(new GarageDoorUpCommand(garageDoor));

        remote.on();
        remote.off();
    }
}
