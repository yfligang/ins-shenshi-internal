package internal;

public class LoginOn {
    /*
    已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示

     */

    public void loginIn(boolean isLogin) {
        int num = 0;
        if (!isLogin) {
            System.out.println("用户名或密码错误，请重新输入!");
            num++;
        }
        System.out.println("用户输入错误密码次数 " + num);
        if (isLogin) {
            System.out.println("已正常登录");
            num = 0;
        }


    }

    public static void main(String[] args){
        LoginOn lo = new LoginOn();
        lo.loginIn(false);
        lo.loginIn(true);

    }
}
