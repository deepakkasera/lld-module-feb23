package Singleton25thAug;

import javax.xml.crypto.Data;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private String url;
    private int port;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

//This implementation is not multithreaded.
//Multiple threads can call the getInstance() method,
//then multiple objects will be created.
