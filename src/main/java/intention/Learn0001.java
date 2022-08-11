package intention;

import java.io.UnsupportedEncodingException;

public class Learn0001 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "null";
        str = "1";
        System.out.println(str);
        str = str.replace("1","4");
        System.out.println("===============");
        System.out.println(str);

        System.out.println("===============");
        //story01();
        //story02();
        //story03();
        //story04();
        story05();
    }

    public static void story01() throws UnsupportedEncodingException {
        String str = "01 你好 喬亂";
        //字符串转化为byte数组
        byte[] bytes = str.getBytes("ISO-8859-1");
        for (byte bt: bytes
             ) {
            System.out.println(bt);
        }
        System.out.println("----------------------");
        System.out.println("bytes = " + bytes);
        //byte数组转化为字符串
        String str1 = new String(bytes);
        String str2 = bytes.toString();
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void story02() throws UnsupportedEncodingException {
        String str = "022 我是 喬亂";
        byte[] bytes = str.getBytes("UTF-8");
        //转换为字符串
        String str01 = new String(bytes);
        System.out.println(str01);
    }

    public static void story03(){
        String str = "null 01 100 哭";
        str = str.substring(0,1).toUpperCase() + str.substring(1);
        System.out.println(str);
    }

    public static void story04(){
        String str = "null";
        //str = str.substring(0,1).toUpperCase();
        boolean bl = "N".equals(str.substring(0,1).toUpperCase());
        System.out.println(bl);
    }

    public static void story05(){
        String str = "null";
        String str1 = str.toUpperCase();
        boolean bl = str.equals(str1);
        System.out.println(bl);
        System.out.println("===================");
        boolean bl1 = str.equalsIgnoreCase(str1);
        System.out.println(bl1);
    }
}
