package GoF.factoryPattern.pizzaStore.factoryMethod;

import GoF.factoryPattern.pizzaStore.factoryMethod.pizza.*;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.factoryPattern.pizzaStore.factoryMethod
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/26/026 18:40
 * @UpdateDate: 2018/6/26/026 18:40
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        //常量放左边 避免type=null导致空指针
        if ("Cheese".equals(type))
            pizza = new ChicagoStyleCheesePizza();
        if ("Clam".equals(type))
            pizza = new ChicagoStyleClamPizza();
        if ("Pepperoni".equals(type))
            pizza = new ChicagoStylePepperoniPizza();
        if ("Veggie".equals(type))
            pizza = new ChicagoStyleVeggiePizza();

        return pizza;
    }
}
