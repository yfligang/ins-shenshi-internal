package Dec;

public class China001 {

    //打印1000-2000年的闰年
    /*
    普通闰年：公历年份是4的倍数且不是100的倍数为普通闰年（如2004、2020年就是闰年）。
    世纪闰年：公历年份是整百数的，必须是400的倍数才是世界闰年（如2000是世纪闰年，1900不是世纪闰年）。
     */

    public static void main(String[] args){
        int m = 1000;
        int n = 2000;
        System.out.println("1000年到2000年的闰年有 ");
        for (int i = m; i <= n; i++) {
            if (((i % 4 ==0)&&(i % 100) !=0) || (i % 400 ==0)){
                System.out.print(i + ", ");
            }
        }
    }
}
