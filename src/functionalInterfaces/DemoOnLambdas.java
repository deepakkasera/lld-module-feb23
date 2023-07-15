package functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class DemoOnLambdas {
    public static void main(String[] args) {
        Consumer<String> consumer = new DemoConsumerClass();
        consumer.accept("Scaler");

        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer1.accept("Interviewbit");

        //Using Lambdas.
        //() : function parameters.
        //{} : provide the implementation of abstract method.
        Consumer<String> consumer2 = (str) -> {
            System.out.println(str);
        };
        consumer2.accept("Mock Interview");

        BiPredicate<String, String> biPredicate = (str1, str2) -> {
            if (str1.length() > str2.length()) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(biPredicate.test("Scaler", "Interviewbit"));
    }
}
