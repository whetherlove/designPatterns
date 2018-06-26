package GoF.factoryPattern.pizzaStore.factoryMethod.pizza;

import GoF.factoryPattern.pizzaStore.factoryMethod.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
        	if (item.equals("Cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("Veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("Clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("Pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
