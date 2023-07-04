package Strings;

public class Main {
    public static void main(String[] args) {
        //stringAppend();

        stringBuilderAppend();

        /*
        String :
        n = 10 -> 3
        n = 100 -> 2
        n = 1000 -> 4
        n = 10000 -> 36
        n = 100000 -> 1478
        n = 1000000 -> Too long time
         */

        /*
        String :
        n = 10000 -> 4
        n = 100000 -> 10
        n = 1000000 -> 41
         */

    }

    public static void stringAppend() {
        String s = "";
        int n = 1000000;
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= n; i++) {
            s += 'a';
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void stringBuilderAppend() {
        StringBuilder sb = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        int n = 1000000;
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= n; i++) {
            sb.append('a');
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
