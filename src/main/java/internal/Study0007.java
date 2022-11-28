package internal;

import java.util.Scanner;

public class Study0007 {
    /*
    已知用户名和密码，请用程序实现模拟用户登录。
    总共给三次机会，登录之后，给出相应的提示
     */

    public static void main(String[] args){
        String name = "lg";
        String password = "123456";

//        String name1;
//        String password1;

        for (int i = 0; i < 3; i++) {
            //捕捉用户的输入
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name1 = scanner.nextLine();
//            if (scanner.hasNext()){
//                name1 = scanner.nextLine();
//            }
            System.out.println("请输入密码");
            String password1 = scanner.nextLine();

            if ((name1.equals(name)) && (password1.equals(password))){
                System.out.println("输入正确，正常登录");
                break;
            }else if (2 - i == 0){
                System.out.println("你的账户被锁定，请与管理员联系");
            }else {
                System.out.println("登录失败，你还有" + (2 - i) + "次机会");
            }
        }


    }
}
