package compoundPatterns.duckSimulator.decorator;

import compoundPatterns.duckSimulator.adapter.Goose;
import compoundPatterns.duckSimulator.adapter.Goose2DuckAdapter;
import compoundPatterns.duckSimulator.ducks.*;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new Goose2DuckAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuackCount() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
