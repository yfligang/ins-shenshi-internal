package intention;

public class Learn0013 {

    public static void main(String[] args){
        int age = 50;
        String name = "LiePin";
        double num = 100.0;
        cool(age,name,num);
    }

    public static void cool(int age,String name,double num){
        age = age + 1;
        name = name + name;
        num = num + 100;
        System.out.println("age: " + age);
        System.out.println("name: " + name);
        System.out.println("num: " + num);
    }
}
