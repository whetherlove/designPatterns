Java 设计模式
==========

>此项目为本人对Java常用设计模式的总结，主要参考《Head First Design Patterns》一书，预计7月份更完。。。</br>
>[Head First 官方网站](http://wickedlysmart.com/head-first-design-patterns/)&ensp;[官方代码下载](https://codeload.github.com/bethrobson/Head-First-Design-Patterns/zip/master)



目录
----

### GoF设计模式
&emsp;[策略模式（Strategy Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/strategyPattern)<br />
&emsp;策略模式定义了算法族，分别封装起来，让他们之间可以互相替换。此模式让算法的变化独立于使用算法的客户。<br /><br />
&emsp;[观察者模式（Observer Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/observerPattern)<br />
&emsp;观察者模式在对象之间定义一对多依赖（松耦合），当一个对象改变状态，依赖他的所有对象都会接到通知，并自动更新。<br /><br />
&emsp;[装饰者模式（Decorator Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/decoratorPattern)<br />
&emsp;装饰者模式动态的将责任附加到对象上。若要扩展功能能，其提供了比继承更有弹性的替代方案。<br /><br />
&emsp;[简单/静态工厂（Simple/Static Factory）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/factoryPattern/pizzaStore/simpleFactory)/
      [工厂方法（Factory Method）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/factoryPattern/pizzaStore/factoryMethod)/
      [抽象工厂（Abstract Factory）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/factoryPattern/pizzaStore/abstractFactory)<br />
&emsp;工厂模式将对象创建的过程封装起来，以便将代码从具体类解耦合。<br />
&emsp;工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。<br />
&emsp;抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。<br /><br />
&emsp;[单例模式（Singleton Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/singletonPattern)<br />
&emsp;单例模式确保一个类只有一个实例，并提供一个全局访问点。<br /><br />
&emsp;[命令模式（Command Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/commandPattern)<br />
&emsp;命令模式将请求封装成对象，这可以让你使用不同的请求，队列或者日志请求来参数化其他对象。<br />
&emsp;命令模式可用来实现事物或日志系统。<br /><br />
&emsp;[适配器模式（Adapter Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/adapterPattern)<br />
&emsp;适配器模式将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。<br /><br />
&emsp;[外观模式（Facade Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/facadePattern)<br />
&emsp;外观模式提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。<br />
&emsp;注：外观模式并没有封装子系统类，只提供简化的接口，若有需要，客户仍可直接调用子系统。<br /><br />
&emsp;[模板方法模式（Template Method Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/templatePattern)<br />
&emsp;模板方法模式在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。<br />
&emsp;模板方法可以使子类不改变算法结构的情况下，重新定义算法的某些步骤。<br /><br />
&emsp;[状态模式（State Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/statePattern)<br />
&emsp;状态模式允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。<br />
&emsp;将每个状态的行为局部化到它自己的类中，可以使各个状态对修改关闭，但装个系统对扩展开放。<br /><br />
&emsp;[桥接模式（Bridge Pattern）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/bridgePattern)<br />
&emsp;桥接模式分离抽象接口及其实现部分。提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。<br /><br />
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[更多GoF模式（More Patterns）](https://github.com/whetherlove/designPatterns/tree/master/src/GoF/commandPattern)<br />

### 复合设计模式
&emsp;[MVC（Model,View,Controller）设计模式](https://github.com/whetherlove/designPatterns/tree/master/src/compoundPatterns/mvc)<br />
&emsp;MVC设计模式包含策略，观察者及组合模式。MVC将业务逻辑、数据、界面显示分离的方法组织代码，将业务逻辑聚集到一个部件里面，在改进和个性化定制界面及用户交互的同时，不需要重新编写业务逻辑。<br /><br />



