package internal;

public class Study0004 {

    public static void main(String[] args){
        /*
        "www.toutiao.com" 输出 "com.toutiao.www"
         */

        String str = "www.toutiao.com";
        //str.length();
        char[] chars = str.toCharArray();
        System.out.println(chars);
        System.out.println("==================");
        for (char s : chars
             ) {
            //System.out.println(s);
        }
        char m = chars[12];
        char n = chars[13];
        char o = chars[14];
        chars[12] = chars[0];
        chars[0] = m;
        chars[13] = chars[1];
        chars[1] = n;
        chars[14] = chars[2];
        chars[2] = o;
        System.out.println(chars);
    }
}
