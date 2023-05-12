package Singleton;

public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance() { //
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) { //lock - ,T2,T3
                if (instance == null) { // T1
                    instance = new DoubleCheckSingleton();
                }
            } // T1
        }

        return instance; // T4
    }
}
