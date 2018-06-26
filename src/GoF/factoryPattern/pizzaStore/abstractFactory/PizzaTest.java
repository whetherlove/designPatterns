package GoF.factoryPattern.pizzaStore.abstractFactory;

import GoF.factoryPattern.pizzaStore.abstractFactory.pizza.Pizza;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.factoryPattern.pizzaStore.abstractFactory
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/26/026 20:50
 * @UpdateDate: 2018/6/26/026 20:50
 */
public class PizzaTest {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
