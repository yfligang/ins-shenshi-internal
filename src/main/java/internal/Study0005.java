package internal;

public class Study0005 {

    public static void main(String[] args){
        String s = "lpt.liepin.com";
        String[] strArray = s.split(".");
        for (String str: strArray){
            System.out.println(str);
        }
    }

    public int call(int n){
        int sum_1 = 0;
        for (int i = 0; i < 100; i++) {
            sum_1 = sum_1 + i;
        }

        return 0;
    }
}
