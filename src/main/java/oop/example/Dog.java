package oop.example;

public class Dog extends Animal {
    public String hand = "2";
    private int foot = 22;

    @Override
    public void eat(){
        System.out.println("++++++++++aooaoa");
    }

    @Override
    public void sleep(){
        System.out.println("+++++++++ssssss");
    }
}
