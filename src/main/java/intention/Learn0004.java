package intention;

import java.util.ArrayList;
import java.util.List;

public class Learn0004 {
    //取IP地址(192.168.1.100)中的每段数字
    public static void main(String[] args){
        String l = "123:345:567";
        String[] strArrayNew = l.split(":");
        for (String str:strArrayNew
             ) {
            System.out.println(str);
        }

        System.out.println("===============");



        String s = "192x";
        boolean a = s.matches(s);
        //System.out.println("a为 " + a);

        String m = "2013X1@!";
        String[] strArray = m.split("");
//        for (String str:strArray
//             ) {
//            System.out.println(str);
//        }

        Learn0004 learn0004 = new Learn0004();
        learn0004.test01();

    }

    public void test01(){
        String str = "192.168.1.100";
        //List<String> list = new ArrayList<String>();
        String[] strArray = str.split("\\.");
        for (String strNew:strArray) {
            System.out.println(strNew);
        }
//        for (int i = 0; i < strArray.length; i++) {
//            if (strArray[i].matches("[0-9]")){
//                list.add(strArray[i]);
//            }
//        }
    }
}
