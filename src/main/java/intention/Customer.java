package intention;

public class Customer {

    private String name; //姓名
    private Account account; //账单，引用数据类型

    public Customer(String name){ //构造方法
        this.name = name;
    }

    public String getName(){ //没有void的，必须要返回值
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
