package Dec;

import java.util.Scanner;

public class China002 {
    //判断是否为素数
    /*
    素数，也称为质数，指在大于1的自然数中，除了1和该数自身外，无法被其他自然数整除的数。
     */
    public static void main(String[] args){
        System.out.println("请输入数字: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        boolean bl = true;
        //只能整除1和自身，其他数字都不能整除,只要有能整除2到m-1的数，就不是素数
        for (int i = 2; i < m; i++) {
            if (m % i == 0){
               bl = false;
               break;
            }
        }

        if (bl == true){
            System.out.println(m + "是素数");
        }

        if (bl == false){
            System.out.println(m + "不是素数");
        }

        /*
        while (m % 2 != 0 && m % 3 != 0){
            System.out.println("您输入的数字为素数");
            break;
        }

        这里写的不对，例如 35或者49，不能被2/3整除
         */
    }
}
