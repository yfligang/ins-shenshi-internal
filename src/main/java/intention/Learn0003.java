package intention;

public class Learn0003 {

    public static void main(String[] args){
        //testSplit01();

        Learn0003 learn0003 = new Learn0003();
        //learn0003.testSplit02();
        //learn0003.testSplit03();
        //learn0003.testSplit04();
        learn0003.testSplit05();
    }

    public static void testSplit01(){
        String str = "tomorrow,cool,sunday";
        boolean b = str.matches("Hello");
        System.out.println(b);

    }

    public void testSplit02(){
        //校验qq号码，要求必须是 5~15位数字; 0不能开头
        String qq = "2130613121";
        boolean b = qq.matches("[1-9][0-9]{4,14}");
        System.out.println(b);
    }

    public void testSplit03(){
        //校验手机号码  11位的手机号 第一位是1，第二位是，356789，后面9位是 0~9
        String numPhone = "12712341234";
        String regex = "1[356789][0-9]{9}";
        boolean b = numPhone.matches(regex);
        System.out.println(b);
    }

    public void testSplit04(){
        //分离出数字
        String s = "18-22-40-65";

        String[] strArray = s.split("-");

        for (String string:strArray
             ) {
            System.out.println("分离出的数字为: " + string);
        }

    }

    public void testSplit05(){
        //把文字中的数字替换成*
        /*
        1.先找到字符串中的所有数字，然后再替换 replaceAll
         */
        String str = "!2#4%6&8()&^456#@!12345";
        //打印出char[]数组中的字符
        char[] charArray = str.toCharArray();
        for (char c:charArray
             ) {
            System.out.println(c);
        }

        System.out.println("===============");

        String[] strArray = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            strArray[i] = charArray[i] + "";
        }

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].matches("[0-9]")){
                strArray[i] = "*";
            }
        }

        for (String str01:strArray
             ) {
            System.out.print("新的" + str01 + " ");
        }
    }
}
