package GoF.morePatterns.builderPattern;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.morePatterns.builderPattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/11/011 9:04
 * @UpdateDate: 2018/7/11/011 9:04
 */
public class StudentTest {

    //Builder模式可以将构造器的setter方法名取成类似注释的方式，这样我们
    //可以很清晰的知道刚才究竟设置的什么值，可读性较高. 并且可以自己制定需要
    //初始化的属性

    public static void main(String[] args) {

        Student student = new Student(1,"旺旺","123","男","武汉");

        //Student并不是直接new出来的，对其构造器进行了处理使其可访问范围尽可能的小，
        // 只让它通过Student.Builder来构建自己，在Student.Builder中提供了一种类
        // set的方法链的方式来设置值，然后在最后的build()方法的时候会返回一个Student对象
        StudentWithBuilder student1 =
                new StudentWithBuilder.Builder().id(2).name("小红").build();

    }
}
