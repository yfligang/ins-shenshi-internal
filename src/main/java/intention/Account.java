package intention;

import java.util.Scanner;

public class Account {

    private int id; //账号
    private double balance; //余额
    //有参构造方法, 传入的参数值赋值给类变量
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
    }



    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    //取款
    public void withDraw(double amount){
        //分为取款 > 余额或者取款 < 余额 (用户取款)
        if (balance >= amount){ //如果余额比要取款的钱多，可以取出来，有剩余的钱
            //那么用户剩余的钱等于余额减去要取的钱
            balance = balance - amount;
            System.out.println("您已取款成功 " + amount + "元" + ", 余额还剩下 " + balance + "元");
        }else {
            System.out.println("取款失败,余额不足!");
        }

    }

    //用户存款
    public void withAdd(double amount){
        if (amount > 0){
            balance = balance + amount;
            System.out.println("您本次存钱 " + amount + "元," + "余额为 " + balance + "元");
        }else {
            System.out.println("请将钱放入钱柜中");
        }
    }


    public static void main(String[] args){
        System.out.println("请输入取款金额");
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(100,200.0);
        if (scanner.hasNextDouble()){
            account.withDraw(scanner.nextDouble());
        }

        System.out.println("====================");

        System.out.println("请输入存款金额");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNextDouble()){
            account.withAdd(scanner1.nextDouble());
        }



    }
}
