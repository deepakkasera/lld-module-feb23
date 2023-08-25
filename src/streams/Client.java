package streams;

import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        //Streams : Wrapper over datasets (Collections)

        //How to Create Stream
        //1.
        Integer[] arr = {1,6,4,5,10,8,7};
        Stream<Integer> stream = Stream.of(arr);

        //2.
        Stream<Integer> stream1 = Stream.of(1,6,4,5,10,8,7);

        //3.
        List<Integer> list = List.of(1,6,4,5,10,8,7);
        Stream<Integer> stream2 = list.stream();
    }
}
