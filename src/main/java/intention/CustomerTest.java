package intention;

public class CustomerTest {

    public static void main(String[] args){
        Customer customer = new Customer("李大海");

        Account account = new Account(100101,400.01);

        //实现客户和账单的关联
        customer.setAccount(account); //赋值

        System.out.println("当前客户id为: " + account.getId() + ", 余额为: " + account.getBalance() + "元");

        //开始准备取钱和存钱
        account.withDraw(100); //取钱100
        account.withAdd(200); //存钱

//        customer.getAccount().withDraw(100); //取钱100
//        customer.getAccount().withAdd(200); //存钱200
    }

}
