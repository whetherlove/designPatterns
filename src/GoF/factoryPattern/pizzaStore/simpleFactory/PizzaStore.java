package GoF.factoryPattern.pizzaStore.simpleFactory;

import GoF.factoryPattern.pizzaStore.factoryMethod.pizza.Pizza;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.factoryPattern.pizzaStore.simpleFactory
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/26/026 15:54
 * @UpdateDate: 2018/6/26/026 15:54
 */
public class PizzaStore {

    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
