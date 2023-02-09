package Feb;

public class BiHui1 {
    /*
    程序阅读题

     */

    public static void main(String[] args){
        int n1;
        n1 = 13; //13
        int n2;
        n2 = 17; //17
        int n3;
        n3 = n1 + n2; //30
        System.out.println("n3 = " + n3); //30
        int n4 = 38;
        int n5 = n4 - n3; //38-30 = 8
        System.out.println("n5 = " + n5);
        // n3 = 30  n5 = 8

        /*
        使用char类型，分别保存 \n \t \r \\ 1 2 3等字符，并打印输出
         */

        char m1 = '\n'; //回车
        System.out.println("m1 = " + m1);
        char m2 = '\t'; //制表位
        System.out.println("m2 = " + m2);
        char m3 = '\r'; //回车
        System.out.println("m3 = " + m3);
        char m4 = '\\'; // 第一个斜杠，转义符 输出一个斜杠
        System.out.println("m4 = " + m4);
        char m5 = '1';
        System.out.println("m5 = " + m5);
        char m6 = '2';
        System.out.println("m6 = " + m6);
        char m7 = '3';
        System.out.println("m7 = " + m7);

        /*
        保存两本书名
        保存两个性别
        保存两本书价格
         */

        String a1 = "时间简史";
        String a2 = "三体";
        System.out.println("两本书的名字为: " +a1 + " " + a2);

        char b1 = '男';
        char b2 = '女';
        System.out.println("两个人的性格为: " + b1 + " " + b2);

        float p1 = 110.12f;
        float p2 = 77.234f;
        System.out.println("两本书的价格为: " + (p1 + p2));

        /*
        姓名 xx 年龄 xx 成绩 xx 性别 xx 爱好 xx  进行存储
        添加转义字符，使用一条语句输出
         */

        String w1 = "王子";
        int age = 22;
        int score = 99;
        char sex = '男';
        String w2 = "打乒乓球";

        System.out.println("姓名: " + w1 + '\n' + "年龄: " + age + '\n'+ "分数" + score  + "\n性别：" + sex + '\n' + "爱好: " + w2);
        System.out.println("============================================>");
        System.out.println("姓名\t年龄\t分数\t性别\t爱好\n" + w1 + '\t' + age + '\t' + score + '\t' + sex + '\t' + w2);




    }
}
