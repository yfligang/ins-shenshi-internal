package Dec;

public class China003 {
    //打印0~100之间的素数

    public  static void main(String[] args){
        System.out.println("素数为: ");
        for (int i = 1; i <= 100; i++) { //在0~100之间的数进行循环
            boolean bl = true;
            for (int j = 2; j <= i - 1; j++) { //素数可以整除1和自身，其他的数不行
                if (i % j == 0){
                    bl = false;
                    break;
                }
            }

            if (bl == true){
                System.out.print(i + ",");
            }
        }


    }
}
