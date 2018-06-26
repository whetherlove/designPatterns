package GoF.factoryPattern.pizzaStore.abstractFactory;

import GoF.factoryPattern.pizzaStore.abstractFactory.ingredient.*;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.factoryPattern.pizzaStore.abstractFactory
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/26/026 20:14
 * @UpdateDate: 2018/6/26/026 20:14
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
