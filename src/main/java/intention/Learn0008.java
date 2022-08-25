package intention;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Learn0008 {

    private String sortTarget;

    public Learn0008(String sortTarget){
        this.sortTarget = sortTarget;
    }

    public static void main(String[] args){
        List<Learn0008> list = ImmutableList.of(
                new Learn0008("300"),
                new Learn0008("200"),
                new Learn0008("100"),
                new Learn0008("0")
                );
        Learn0008[] array = new Learn0008[list.size()];
        list.toArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
