package intention;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class Learn0005 {
    public static List<String> strList = new ArrayList<String>();

    static {
        strList.add("123");
        //log.println();
    }



    public static void main(String[] args){
        //不安全的线程
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        //安全的线程
        List<String> arrayListNew = new CopyOnWriteArrayList<String>();
        arrayListNew.add("1");
        arrayListNew.add("2");
        arrayListNew.add("3");

        System.out.print("arrayList为: ");
        for (String str:arrayList
             ) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("===================");

        System.out.print("arrayListNew为: ");
        for (String strNew:arrayListNew
             ) {
            System.out.print(strNew + " ");
        }

        System.out.println();

        Learn0004.method02();
    }
}
