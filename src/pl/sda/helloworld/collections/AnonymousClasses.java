package pl.sda.helloworld.collections;

public class AnonymousClasses {

    public static void main(String[] args) {
        AnonymousClasses anonymousClasses = new AnonymousClasses();

        anonymousClasses.someMethod(new NotAbstractClass());

        anonymousClasses.someMethod(new AnAbstractClass() {
            @Override
            void someMethod() {

            }

            @Override
            int anotherAbstractMethod() {
                return 0;
            }
        });

        anonymousClasses.someMethod(new NotAbstractClass() {
            @Override
            int anotherAbstractMethod() {
                return 5;
            }

            @Override
            void testMethod() {
                System.out.println("Anonymous");
            }
        });
    }

    void someMethod(AnAbstractClass anAbstractClass) {
        anAbstractClass.otherMethod();
    }

    static abstract class AnAbstractClass {
        abstract void someMethod();

        abstract int anotherAbstractMethod();

        void otherMethod() {
            someMethod();
        }
    }

    static class NotAbstractClass extends AnAbstractClass {

        @Override
        void someMethod() {
            System.out.println("NotAbstract");
        }

        @Override
        int anotherAbstractMethod() {
            return 42;
        }

        void testMethod() {
            System.out.println("Not abstract");
        }
    }
}
