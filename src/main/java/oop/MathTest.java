package oop;

public class MathTest {
    public static MathTest Test1=new MathTest();

    public int compute(){
        int a=1;
        int b=2;
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        MathTest mathTest = new MathTest();
        mathTest.compute();
//        MathTest mathTest1 = new MathTest();
//        mathTest.compute();
        System.out.println("abc");
    }

}
