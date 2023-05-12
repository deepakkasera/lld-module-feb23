package Singleton;

public class EarlyLoadingSingleton {
    private static EarlyLoadingSingleton instance = new EarlyLoadingSingleton();

    private EarlyLoadingSingleton(){}

    public static EarlyLoadingSingleton getInstance() {
        return instance;
    }
}
