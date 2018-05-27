package pl.sda.helloworld.oop;

public class InitializerBlocks {


    // 1. static fields
    static int value = 1;

    // 2. static blocks
    static {
        System.out.println("Static block with value " + value);
    }

    // 3. instance fields
    int otherValue = 2;
    double someValue;

    // 4. instance blocks
    {
        someValue = otherValue * Math.random();
        System.out.println("Instance block with value " + otherValue);
    }

    // 5. constructor
    InitializerBlocks() {
        System.out.println("Constructor");
    }


    public static void main(String[] args) {
//        new InitializerBlocks();
        InitializerBlocks.doSth();
    }

    static void doSth() {
        System.out.println("Static");
    }

}
