package com.leetcode.exp.Leetcode_exp.on9thFeb2024.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonMain {
    public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //exmapleSerialzation();
        reflectionExample();
    }
    private static void exmapleSerialzation() throws IOException, ClassNotFoundException {
        /*LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object.txt"));
        System.out.println(lazySingleton.hashCode());
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object.txt"));
        LazySingleton deserializeSingleton = (LazySingleton)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("obj1 " + lazySingleton.hashCode());
        System.out.println("obj2 " + deserializeSingleton.hashCode());*/

        LazySingletonFixSerialization lazySingletonFixSerialization = LazySingletonFixSerialization.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object2.txt"));
        objectOutputStream.writeObject(lazySingletonFixSerialization);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object2.txt"));
        LazySingletonFixSerialization deserialzeObject = (LazySingletonFixSerialization)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(lazySingletonFixSerialization.hashCode());
        System.out.println(deserialzeObject.hashCode());

    }
    private static void reflectionExample() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = (LazySingleton) constructor.newInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        //Constructor[] constructors2 = EnumSingleton.class.getDeclaredConstructors();
    }
    
}
