package reflect;

import reflect.entity.Person;

import java.lang.reflect.Field;

/**
 * @author wei.jiang
 * @since 2018/11/22
 */
public class SimpleReflect {
    public static void main(String[] args) throws
            ClassNotFoundException,
            IllegalAccessException,
            InstantiationException,
            NoSuchFieldException {
        //一般的创建对象
        Person p = new Person();

        //反射的创建对象
        String className = "reflect.entity.Person";
        Class<?> c = Class.forName(className);
        Object obj = c.newInstance();

        //获取私有字段
        Field nameField = c.getDeclaredField("name");
        Field ageField = c.getDeclaredField("age");

        //set方法赋值（暴力访问）
        nameField.setAccessible(true);
        ageField.setAccessible(true);

        nameField.set(obj, "aaaa");
        ageField.set(obj, 11);

        System.out.println("name:" + nameField.get(obj));
        System.out.println("age:" + ageField.get(obj));
        p = (Person) obj;
        System.out.println("字段设置的值：name=" + p.getName() + ",age=" + p.getAge());

    }
}
