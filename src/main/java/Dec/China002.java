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
        while (m % 2 != 0 && m % 3 != 0){
            System.out.println("您输入的数字为素数");
            break;
        }
    }
}
