package intention;

public class Learn0010 {

    private int age;
    private String name;

    //有参构造方法
    public Learn0010(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int cool(int age,String name){
        this.age = age;
        this.name = name;
        return age;
    }
}
