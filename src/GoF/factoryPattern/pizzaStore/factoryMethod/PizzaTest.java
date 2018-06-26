package GoF.factoryPattern.pizzaStore.factoryMethod;

import GoF.factoryPattern.pizzaStore.factoryMethod.pizza.Pizza;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.factoryPattern.pizzaStore.factoryMethod
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/26/026 18:49
 * @UpdateDate: 2018/6/26/026 18:49
 */
public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.println(pizza);
    }
}
