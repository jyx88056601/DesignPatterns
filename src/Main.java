import abstract_factory.ConcreteProductFactoryA;
import abstract_factory.ConcreteProductFactoryB;
import abstract_factory.ProductCreator;
import abstract_factory.ProductFactory;
import factory.JavaCreator;
import factory.LanguageCreator;
import factory.TypescriptCreator;
import factory.creator.Creator;
import factory.creator.CreatorA;
import factory.creator.CreatorB;
import prototype.A;
import prototype.B;
import prototype.PrototypeOfClassAAndB;
import singleton.ConfigA;
import singleton.ConfigB;
import singleton.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creational Design Patterns");
       // prototype design pattern
       // creating a new object by copying an existing object
       // 使用scenario:  使用ThreadLocal对多线程环境中的共享资源隔离
       // 创建多个Object 与多个ThreadLocal 绑定
       // purpose : 减少重复的 I/O 操作以及创建对象复杂性 比如一个对象需要多次读取数据库取建造
        System.out.println("\033[31mPrototype Pattern:\033[0m");
        A a = new A(1);
        B b = new B(2);
        PrototypeOfClassAAndB newA = a.copy();
        System.out.println("new A is a new object : " + !newA.equals(a));
        PrototypeOfClassAAndB newB = a.copy();
        System.out.println("new B is a new object : " + !newB.equals(b));

        System.out.println("\033[31mSingleton Pattern:\033[0m");
        // purpose: 减少很多相同的objects 浪费资源 以及保证一致性例如数据库的连接
        // implementation:
        // 通过隐藏configuration 的constructor
        // 创建static的get instance method 获得context共享的唯一object
        // 如果这个object 比较大则不应该用在类加载的时候直接创建因为影响启动速度，而是在使用的时候创建（getInstance 方法体里面加判断）
        // 但使用时才创建又回导致线程不安全
        // 所以需要把instance 用volatile
        new ConfigA().config();
        new ConfigB().config();
        var configurationInstance = Configuration.getConfigurationInstance();
        System.out.println(configurationInstance.getAppConfig("a"));
        System.out.println(configurationInstance.getAppConfig("b"));

        System.out.println("\033[31mFactory Pattern:\033[0m");
        System.out.println("\033[33mSingle object\033[0m");
        // Initialize creator with specific subclass such as Creator A or B
        Creator creatorA = new CreatorA();
        creatorA.showProduct();
        Creator creatorB = new CreatorB();
        creatorB.showProduct();
        System.out.println("\033[31mFactory Pattern + demo:\033[0m");
        System.out.println("create language Java");
        LanguageCreator javaCreator = new JavaCreator();
        System.out.print("make actions: ");
        javaCreator.displayLanguageMethod();
        System.out.println("create language Typescript");
        LanguageCreator typescriptCreator = new TypescriptCreator();
        System.out.print("make actions ");
        typescriptCreator.displayLanguageMethod();
        System.out.println("\033[31mAbstract Factory Pattern:\033[0m");
        System.out.println("\033[33mFamily of related objects\033[0m");

        System.out.println("create product A by ProductFactoryA");
        ProductCreator productCreator = new ProductCreator();
        productCreator.createProduct(new ConcreteProductFactoryA());
        System.out.println("create product A by ProductFactoryB");
        productCreator.createProduct(new ConcreteProductFactoryB());


        System.out.println("\033[31mBuilder Pattern:\033[0m");

    }
}