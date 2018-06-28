package GoF.commandPattern.remote.commands;

import GoF.commandPattern.remote.electronics.GarageDoor;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.commandPattern.remote.commands
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/28/028 14:02
 * @UpdateDate: 2018/6/28/028 14:02
 */
public class GarageDoorDownCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
