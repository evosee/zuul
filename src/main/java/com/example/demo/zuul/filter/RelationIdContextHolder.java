package com.example.demo.zuul.filter;

public class RelationIdContextHolder {
    private static final ThreadLocal<String> relation = new ThreadLocal<>();
    public static String get(){
        return relation.get();
    }
    public static void set(String value){
         relation.set(value);
    }
}
