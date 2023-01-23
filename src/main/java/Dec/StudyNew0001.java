package Dec;

import java.util.Scanner;

public class StudyNew0001 {

    public static void main(String[] args){
        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串: ");
        String line = sc.nextLine();

        //调用方法，用一个变量接收结果
        String s = reverse(line);

        //输出结果
        System.out.println("s: " + s);
    }

    //定义一个方法，实现自字符串反转
    /*
    两个明确:
    1.返回值类型: String
    2.参数 String s
     */

    public static String reverse(String s){
        //在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回

        String ss = " ";
        for (int i = 0; i < s.length(); i++) {
            ss = ss + s.charAt(s.length() - 1 - i); //s.charAt(s.length() - 1 - i) 返回值是 char值
        }

        System.out.println("ss: " + ss);
        return ss;
    }


}
