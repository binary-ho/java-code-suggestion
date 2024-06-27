package org.example.java;

import java.util.HashMap;
import java.util.Map;

public class MapService {
    private final Map rawMap = new HashMap<>();

    private String getRawValue(String key) {
        return (String) rawMap.get(key);
    }

    private void putAnything() {
        rawMap.put("KEY1", true);
        rawMap.put("KEY2", "value");
        rawMap.put("KEY3", 1234);
    }
}
