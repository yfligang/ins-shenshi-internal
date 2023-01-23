package Dec;

public class StudyStringDemo01 {

    public static void main(String[] args){
        //public StringBuilder(): 创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb = new StringBuilder();
        System.out.println("sb: " + sb);
        System.out.println("sb.length(): " + sb.length()); //字符串长度

        //public StringBuilder(String str): 根据字符串的内容，来创建可变字符串对象
        StringBuilder stringBuilder = new StringBuilder("Hello,World!");
        System.out.println("stringBuilder: " + stringBuilder);
        System.out.println("stringBuilder.length() :" + stringBuilder.length());
    }
}
