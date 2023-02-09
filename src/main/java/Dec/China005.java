package Dec;

public class China005 {

    public static void main(String[] args){
        //用构造函数创建字符串
        String str1 = new String("Hello, world!");
        System.out.println("str1: " + str1);
        String str2 = "What is your name?";
        //连接字符串
        String str3 = str1.concat(" " + str2);
        System.out.println("str3: " + str3);
        
        String str4 = String.format(str3);
        System.out.println("str4 : " + str4);


    }
}
