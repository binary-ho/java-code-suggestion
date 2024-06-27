package org.example.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapService {
    private final Map<String, String> map = new HashMap<>();

    // 11에선 가능하다
    private Map<String, String> putAnything2() {
        map.put("KEY1", "value2");
        map.put("KEY2", "value3");
        map.put("KEY3", "value4");
        return Map.copyOf(map);
    }
}
