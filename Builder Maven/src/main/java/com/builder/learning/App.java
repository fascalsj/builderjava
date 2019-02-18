package com.builder.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = Animal.builder().species("Kucing").ras("Anggora").build();
        System.out.println(animal.toString());
    }
}
