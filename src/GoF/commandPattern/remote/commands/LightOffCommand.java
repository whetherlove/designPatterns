package GoF.commandPattern.remote.commands;

import GoF.commandPattern.remote.electronics.Light;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.commandPattern.remote.commands
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/28/028 13:50
 * @UpdateDate: 2018/6/28/028 13:50
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
