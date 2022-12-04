package internal;

import java.util.Scanner;

public class Study0009 {
    /*
    键盘录入一个字符串，使用程序实现在控制台遍历该字符串
     */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        System.out.println("输入的字符串为: ");
        for (char ch: array
             ) {
            System.out.print(ch);
        }


    }
    
}
