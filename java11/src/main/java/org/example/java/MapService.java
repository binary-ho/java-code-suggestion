package org.example.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapService {
    private final Map rawMap = new HashMap<>();
    private final Map<String, String> map = new HashMap<>();

    private String getRawValue(String key) {
        return (String) rawMap.get(key);
    }

    private String getValue(String key) {
        return map.get(key);
    }

    private String getValueOrDefault(String key) {
        return map.getOrDefault(key, "기본값");
    }

    // 11에선 가능하다
    private Map putAnything2() {
        rawMap.put("KEY1", true);
        rawMap.put("KEY2", "value");
        rawMap.put("KEY3", 1234);
        return Map.copyOf(rawMap);
//        List.copyOf()
    }

    class DTO {
        private final boolean key1;
        private final String key2;
        private final int key3;

        DTO(boolean key1, String key2, int key3) {
            this.key1 = key1;
            this.key2 = key2;
            this.key3 = key3;
        }
    }
}
