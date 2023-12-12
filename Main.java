package main.java.com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees(38, "Сергей", "Java разработчик"),
                new Employees(30, "Иван", "Android разработчик"));

        SerializableObjectToFile serializableObjectToFile = new SerializableObjectToFile();
        serializableObjectToFile.writingObjectToFile(employees);
        serializableObjectToFile.readingObjectFromFile(serializableObjectToFile.getPath());
    }
}