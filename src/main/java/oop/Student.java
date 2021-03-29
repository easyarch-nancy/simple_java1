package oop;

public class Student extends Person{
    private int clazzLevel;
    private int clazzId;
    private boolean isClazzLeader;

    private Integer id = 3000;

    public Integer getId(){return id;}

    public void setId(Integer id){this.id=id;}

    private String clazzLeaderTitle;

    public boolean isClazzLeader() {
        return isClazzLeader;
    }

    public void setClazzLeader(boolean clazzLeader) {
        isClazzLeader = clazzLeader;
    }

    public String getClazzLeaderTitle() {
        return clazzLeaderTitle;
    }

    public void setClazzLeaderTitle(String clazzLeaderTitle) {
        this.clazzLeaderTitle = clazzLeaderTitle;
    }

    public int getClazzLevel() {
        return clazzLevel;
    }

    public void setClazzLevel(int clazzLevel) {
        this.clazzLevel = clazzLevel;
    }

    public int getClazzId() {
        return clazzId;
    }

    public void setClazzId(int clazzId) {
        this.clazzId = clazzId;
    }

    private class Test12{
        public void test(){
            Student student = new Student();
        }
    }
}
