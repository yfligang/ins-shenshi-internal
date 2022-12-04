package internal;

import java.util.Scanner;

public class Study0010 {

    /*
    键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
    大写字母字符  >= 'A' 并且 <= 'Z'
    小写字母字符  >= 'a' 并且 >= 'z'
    Character.isDigit(char)怕判断是不是数字
     */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入...");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        int m = 0;
        int n = 0;
        int o = 0;
        for (int i = 0;i < str.length();i++){
            if (charArray[i] >= 'A' && charArray[i] <= 'Z'){
                m++;
            }else if (charArray[i] >= 'a' && charArray[i] <= 'z'){
                n++;
            }else if (Character.isDigit(charArray[i])){ //判断一个字符是不是数字
                o++;
            }else {

            }
        }
        System.out.println("输入的字符串中大写字符有 " + m +"个");
        System.out.println("输入的字符串中小写字符有 " + n +"个");
        System.out.println("输入的字符串中数字字符有 " + o +"个");
    }
}
