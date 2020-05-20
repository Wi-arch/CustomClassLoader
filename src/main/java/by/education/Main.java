package by.education;

import java.lang.reflect.Method;

public class Main {

    public static void main(String args[]) throws Exception {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        Class<?> customClassLoaderClass = customClassLoader.findClass("by.education.FooClass");
        Object ob = customClassLoaderClass.getDeclaredConstructor().newInstance();
        Method md = customClassLoaderClass.getMethod("printClassLoader");
        md.invoke(ob);

        FooClass defaultClassLoaderFooClass = new FooClass();
        defaultClassLoaderFooClass.printClassLoader();

    }
}
