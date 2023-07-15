package functionalInterfaces;

import java.util.function.Consumer;

public class DemoConsumerClass implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
