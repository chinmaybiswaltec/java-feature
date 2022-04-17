package com.chinmaybiswaltec;

import java.util.HashMap;
import java.util.Map;

// Making class final
public final class ImmutableExample {

    // Making member variables final
    private final int age;
    private final String name;
    private final HashMap<String, Integer> subjectMarkMap;

    public ImmutableExample(int age, String name, Map<String, Integer> map){
        this.age = age;
        this.name = name;
        // Performing deep copy of mutable fields
        HashMap<String, Integer> tempMap = new HashMap<>();
        for(String key : map.keySet()){
            tempMap.put(key, map.get(key));
        }
        this.subjectMarkMap = tempMap;
    }

    // No setter method


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // In case mutable field return a cloned object
    public Map<String, Integer> getSubjectMarkMap() {
        return (HashMap<String, Integer>) subjectMarkMap.clone();
    }

    public static void main(String[] args) {
        Map<String, Integer> markMap = new HashMap<>();
        markMap.put("History", 78);
        markMap.put("Math", 92);
        ImmutableExample immutable = new ImmutableExample(18,"Rahul", markMap);
        System.out.println(immutable.getAge());
        System.out.println(immutable.getName());
        System.out.println(immutable.getSubjectMarkMap());
    }
}
