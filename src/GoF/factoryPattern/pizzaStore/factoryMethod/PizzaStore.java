package GoF.factoryPattern.pizzaStore.factoryMethod;

import GoF.factoryPattern.pizzaStore.factoryMethod.pizza.Pizza;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.factoryPattern.pizzaStore.factoryMethod
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/26/026 18:34
 * @UpdateDate: 2018/6/26/026 18:34
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
