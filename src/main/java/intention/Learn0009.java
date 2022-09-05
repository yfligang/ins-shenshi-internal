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
     *
    ***
   *****
  *******
     */

    public

    public static void main(String[] args){
        Learn0009 learn0009 = new Learn0009();
        //learn0009.test01();
        System.out.println("===============================");
        //learn0009.test02();
        System.out.println("===============================");
        learn0009.test03();
    }

    
}
