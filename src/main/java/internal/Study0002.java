package internal;

public class Study0002 {
    //使用 do...while打印从1到200

    public static void method01(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 200);
    }

    public static void main(String[] args){
        Study0001 st1 = new Study0001();
        st1.age = 38;
        st1.name = "王子";
        st1.num = 100.0;

//        method(st1); //调用method参数
//        System.out.println(st1.age);
//        System.out.println(st1.name);
//        System.out.println(st1.num);

        //method01();
        method02();
    }

    private static void method(Study0001 st1) {
        st1.age = 40;
        st1.name = "猎聘";
        st1.num = 200.0;
    }

    //找出 1~200中能被3整除不能被5整除的数
    public static void method02(){
        System.out.print("找出 1~200中能被3整除不能被5整除的数:");
        int i = 1;
        int m = 0;
        do {
            i++;
            if ((i % 5 !=0) && (i % 3 == 0) && (i % 2 == 0)){
                m++;
                System.out.println(i);
            }
        }while (i <= 200);
        System.out.print("符合条件的数有: " + m);
    }


}
