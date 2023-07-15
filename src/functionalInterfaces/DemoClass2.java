package functionalInterfaces;

import java.util.function.BiPredicate;

public class DemoClass2 implements BiPredicate<String, String> {
    @Override
    public boolean test(String s, String s2) {
        if (s.length() > s2.length()) {
            return true;
        } return false;
    }
}
