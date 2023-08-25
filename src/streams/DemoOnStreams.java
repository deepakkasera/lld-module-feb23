package streams;

import java.util.ArrayList;
import java.util.List;

public class DemoOnStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(9,5,6,3,4,10,8,15,18,19,26);

        //Task : Filter all the even values from the above list.
        List<Integer> evenList = new ArrayList<>();
        for (int x : list) {
            if (x % 2 == 0){
                evenList.add(x);
            }
        }

        System.out.println(evenList);


        //How to do the above using Stream.
        // (function param) -> {}
        System.out.println(list.stream().filter((x) -> x % 2 == 0).toList());

        //1. List is converted into Stream
        //2. Stream is looping over the elements of the list.
        //3. Every element is passed to the filter.
        //4. Filter is passing every value to Lambda.
        //5. Lambda checks the condition on every element.
        //6. If condition satisfies, take that element else neglect.

        //Assignment -> Read about Map method.
    }
}
