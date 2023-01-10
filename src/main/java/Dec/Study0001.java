package Dec;

import java.util.Scanner;

public class Study0001 {
    /*
    定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果

    例如，键盘录入 abc，输出结果 cba
     */

    public static String input(){
        System.out.println("请输入字符串");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }



    public static String str(String string){
        char[] charArray = string.toCharArray();
        char[] charArray_new = new char[charArray.length];
        for (int i = 0; i <charArray.length ; i++) {
            charArray_new[i] = charArray[charArray.length - i - 1];
        }
        String str_new = String.valueOf(charArray_new);
        System.out.println(str_new);
        return str_new;
    }

    public static void main(String[] args){
        str(input());
    }
}
