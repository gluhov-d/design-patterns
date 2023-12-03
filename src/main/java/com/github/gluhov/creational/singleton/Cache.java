package com.github.gluhov.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private static Cache instance;
    private static Map<String, String> data;

    private Cache() {
        data = new HashMap<>();
    }

    public static synchronized Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    public void setData(String key, String value) {
        data.put(key, value);
    }

    public String getData(String key) {
        return data.get(key);
    }

    public void removeData(String key) {
        data.remove(key);
    }
}
