package lambdaAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 {
    public static void main(String[] args){
        Consumer<List<Integer>> displayList = list -> list.stream().forEach(x->System.out.println(x));
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        displayList.accept(list);

    }

}
