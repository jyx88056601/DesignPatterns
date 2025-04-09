package factory;

public class Typescript extends Language{
    @Override
    void print() {
        System.out.println("console.log");
    }

    @Override
    void showName() {
        System.out.println("TypeScript");
    }
}
