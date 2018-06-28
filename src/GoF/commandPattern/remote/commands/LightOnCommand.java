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
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
