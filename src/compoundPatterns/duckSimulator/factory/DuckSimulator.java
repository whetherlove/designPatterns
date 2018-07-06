package compoundPatterns.duckSimulator.factory;

import compoundPatterns.duckSimulator.adapter.Goose;
import compoundPatterns.duckSimulator.adapter.Goose2DuckAdapter;
import compoundPatterns.duckSimulator.decorator.QuackCounter;
import compoundPatterns.duckSimulator.ducks.Quackable;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
 
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new Goose2DuckAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Abstract Factory");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
 
		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuackCount() +
		                   " times");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
