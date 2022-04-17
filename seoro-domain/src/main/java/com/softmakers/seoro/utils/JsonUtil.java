package com.softmakers.seoro.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class JsonUtil {

    private static Gson gson = new Gson();

    public static String toJson(Object obj) {

        return gson.toJson(obj);
    }

//    public static <T> t fromJson(String json, Class<T> type) {
//
////        return type.cast(gson.fromJson(json, type));
//        return (T)(gson.fromJson(json, type));
//    }
}
