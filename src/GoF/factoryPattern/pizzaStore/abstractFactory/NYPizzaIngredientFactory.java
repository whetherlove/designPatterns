package GoF.factoryPattern.pizzaStore.abstractFactory;

import GoF.factoryPattern.pizzaStore.abstractFactory.ingredient.*;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.factoryPattern.pizzaStore.abstractFactory
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/26/026 20:22
 * @UpdateDate: 2018/6/26/026 20:22
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    //生产纽约特色原料
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
