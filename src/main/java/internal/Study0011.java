package internal;

public class Study0011 {
    /*
    数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
     */
    String str;
    public void method(int[] array){
        for (int i = 0; i < array.length; i++) {
            str = array[i] + "";
            if (i == array.length -1) {
                System.out.println(str + "]");
            }else if (i == 0){
                System.out.print("[" + str + ", ");
            } else {
                System.out.print(str + ", ");
            }
        }

    }
    public static void main(String[] args){
        Study0011 study0011 = new Study0011();
        int[] array = {1,2,3};
        study0011.method(array);
    }
}
