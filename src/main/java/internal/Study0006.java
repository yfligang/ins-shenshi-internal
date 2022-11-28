package internal;

public class Study0006 {

    public static void main(String[] args){

        int a = 1;
        //调用的方法
        m1(a);
        System.out.println("main1 a= " + a);
        //实例化对象
        Person person = new Person("fjh");
        m2(person);
        System.out.println("main2 name= " + person.getName());
        m3(person);
        System.out.println("main3 name= " + person.getName());


    }

    public static void m1(int a1){
        a1 = 2;
        System.out.println("m1 a1= " + a1);
    }

    public static void m2(Person person1){
        person1.setName("Happy");
        System.out.println("m1 name= " + person1.getName());
    }

    public static void m3(Person person1){
        person1 = new Person("LV");
        System.out.println("m2 name=" + person1.getName());
    }
}
