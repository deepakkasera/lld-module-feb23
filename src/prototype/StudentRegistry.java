package prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> map = new HashMap<>();

    void register(String key, Student student) {
        map.put(key, student);
    }

    Student get(String key) {
        return map.get(key);
    }
}
