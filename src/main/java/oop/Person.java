package oop;

public class Person {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;
    private int age;
    private String password;
    private String email;
    private String username;

    public boolean isStrdent() {
        return isStrdent();
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    private boolean isStudent;
//    public Person(String id,int age) {
//        this.id = id;
//        this.age = age;
//    }
//    public String getId(){
//        return id;
//    }
//    public void setId(String id){
//        this.id=id;
//    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void print() {
        System.out.println(this.age + "_" + this.username);
    }


}
