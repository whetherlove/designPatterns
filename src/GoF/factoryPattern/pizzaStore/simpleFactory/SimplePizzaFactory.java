package GoF.factoryPattern.pizzaStore.simpleFactory;

import GoF.factoryPattern.pizzaStore.factoryMethod.pizza.*;
import GoF.factoryPattern.pizzaStore.simpleFactory.pizza.CheesePizza;
import GoF.factoryPattern.pizzaStore.simpleFactory.pizza.ClamPizza;
import GoF.factoryPattern.pizzaStore.simpleFactory.pizza.PepperoniPizza;
import GoF.factoryPattern.pizzaStore.simpleFactory.pizza.VeggiePizza;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.factoryPattern.pizzaStore.simpleFactory
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/26/026 15:50
 * @UpdateDate: 2018/6/26/026 15:50
 */
public class SimplePizzaFactory {

    //若将此方法设为static 则为静态工厂模式，
    //静态工厂缺点：不能通过继承改变创建方法的行为
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //常量放左边 避免type=null导致空指针
        if ("Cheese".equals(type))
            pizza = new CheesePizza();
        if ("Clam".equals(type))
            pizza = new ClamPizza();
        if ("Pepperoni".equals(type))
            pizza = new PepperoniPizza();
        if ("Veggie".equals(type))
            pizza = new VeggiePizza();

        return pizza;
    }
}
