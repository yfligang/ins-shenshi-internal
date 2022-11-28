package internal;

import java.util.Scanner;

public class Study0008 {
    /*
    已知用户名和密码，请用程序实现模拟用户登录。
    总共给三次机会，登录之后，给出相应的提示
     */

    private final static String name = "lg";
    private final static String password = "hero";
    private static String str1;
    private static String str2;

    //1.捕捉用户的输入: 用户名和密码
    public static void input(){
        System.out.println("请输入用户名: ");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNext()){
            str1 = scanner1.nextLine();
        }
        System.out.println("请输入密码: ");
        Scanner scanner2 = new Scanner(System.in);
        if (scanner2.hasNext()){
            str2 = scanner2.nextLine();
        }

        while (true){
            System.out.println(str1);
            System.out.println(str2);
            if ((str1.equals(name)) && (str2.equals(password))){
                System.out.println("用户名和密码正确，成功登录!");
                break;
            }
            if ((str1 != name) || (str2 != password)){
                System.out.println("用户名或密码错误!");
                break;
            }
        }



    }

    public static void main(String[] args) {
        input();
    }
}
