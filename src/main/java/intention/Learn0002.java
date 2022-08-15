package intention;

import sun.rmi.runtime.Log;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class Learn0002 {
    //替换和删除
    public static void main(String[] args){
        //String str = "Hello World!";
        Learn0002 learn0002 = new Learn0002();
        learn0002.testReplace();
    }

    public void testReplace(){
        String str = "Hello World!";
        System.out.println("替换之前 : " + str);
        //替换字符 char
        str = str.replace('l','x'); //将所有的字符char都替换
        System.out.println("替换之后 : " + str);
        System.out.println("=======================================");
        //替换所有字符串
        str = str.replace("l","x");
        System.out.println("替换后的字符串 " + str);
        System.out.println("---------------------");
        str = str.replaceAll("l","x");
        System.out.println(str);
        System.out.println("---------------------");
        //替换第一个
        str = str.replaceFirst("e","l");
        System.out.println("替换第一个" + str);

        //替换字符串

        //replaceAll
    }
}
