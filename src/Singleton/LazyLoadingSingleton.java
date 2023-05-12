package Singleton;

public class LazyLoadingSingleton {
    private static LazyLoadingSingleton instance = null;

    private LazyLoadingSingleton(){}

    public static synchronized LazyLoadingSingleton getInstance() {
        if (instance == null) {
            instance = new LazyLoadingSingleton();
        }
        return instance;
    }
}
