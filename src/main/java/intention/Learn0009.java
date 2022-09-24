package intention;

public class Learn0009 {

    /*
    长方形:    ******     6
              *    *     2
              *    *     2
              ******     6
     */

    //先画一个长方形

    /*
    *****    5
    *****    5
    *****    5
     */

    public void test01(){
        for (int i = 0;i < 3;i++){
            System.out.println("*****");
        }
    }

    public void test02(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /*
    ****    4
    *  *    2(中间有2个空格)
    ****    4
     */

    public void test03(){
        for (int i = 0; i < 3; i++) {
            if (i == 0 || i == 2){
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }else {
                for (int j = 0; j < 5; j++) {
                    if (j == 0 || j == 4){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }

    /*
    等边三角形
     *        1  2n-1
    ***       3  2n-1
   *****      5  2n-1
  *******     7  2n-1
     */

    public void test04(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
         *        前面3个空格   第1行
         ***      2个空格  第2行
         *****    1个空格  第3行
         *******  0个空格  第4行
         */
    }

    public void test05(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Learn0009 learn0009 = new Learn0009();
        //learn0009.test01();
        System.out.println("===============================");
        //learn0009.test02();
        System.out.println("===============================");
        //learn0009.test03();
        //learn0009.test04();
        learn0009.test05();
    }

    
}
