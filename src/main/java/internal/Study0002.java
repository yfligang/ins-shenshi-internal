package internal;

public class Study0002 {

    public static void main(String[] args){
        Study0001 st1 = new Study0001();
        st1.age = 38;
        st1.name = "王子";
        st1.num = 100.0;

        method(st1); //调用method参数
        System.out.println(st1.age);
        System.out.println(st1.name);
        System.out.println(st1.num);
    }

    private static void method(Study0001 st1) {
        st1.age = 40;
        st1.name = "猎聘";
        st1.num = 200.0;
    }


}
