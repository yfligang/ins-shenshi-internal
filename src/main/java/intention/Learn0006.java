package intention;

public class Learn0006 {

    public transient String string = "Hello,world!";

    public static void testTransient(){

    }

    public static void main(String[] args){
        Learn0006 learn0006 = new Learn0006();
        learn0006.testCatch();
    }

    public void testCatch(){
        try {
            System.out.println("try is running");
            if (true) {
                throw new RuntimeException("try exception");
            }
        } catch (Exception e){
            System.out.println("catch is running");
            if (true) {
                throw new RuntimeException("catch exception");
            }
        } finally {
            System.out.println("finally is running");
        }
    }
}
