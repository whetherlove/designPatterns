package compoundPatterns.duckSimulator.adapter;

import compoundPatterns.duckSimulator.ducks.Quackable;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.adapter
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/5/005 20:32
 * @UpdateDate: 2018/7/5/005 20:32
 */
public class Goose2DuckAdapter implements Quackable {

    private Goose goose;

    public Goose2DuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
