package by.education;

public class FooClass {

    public void printClassLoader() {
        System.out.println("Class loaded by: " + getClass().getClassLoader());
    }
}
