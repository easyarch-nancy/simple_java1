package oop;

public class StaticTest {

    //加下面这句之前 打印 1 4
    //加下面这句之后 打印2 3 1 4
    //类变量：准备阶段加载
    //想要创建这个类变量 就得先把这个类加载完
    static StaticTest staticTest = new StaticTest();


    static {
        System.out.println(1);
    }
    //这句放这该为1 2 3 4
//    static StaticTest staticTest = new StaticTest();

    {//实例代码块 是在对象初始化的时候做 先加载
        System.out.println(2);
    }

    //实例构造 方法
    StaticTest() {
        System.out.println(3);
    }

    public static void staticFun() {
        System.out.println(4);
    }

    int a = 5;//实例变量
    static int b = 6;//在准备阶段 这里的b值是0，b同时也在准备阶段被赋值为6
    static final int A = 1;//常量是在编译时赋的值


    public static void main(String[] args) {
        staticFun();
    }
}
