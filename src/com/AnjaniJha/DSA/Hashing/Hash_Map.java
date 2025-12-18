package com.AnjaniJha.DSA.Hashing;
import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Kunal",88);
        map.put("Karan",99);
        map.put("Rahul",94);

        System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("Apoorva",78));
        System.out.println(map.containsKey("Anju"));

    }
}
