package com.epam.coding;

import java.util.*;

/*
For example “23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"]
if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …}
* */
public class Service {

    public static List<String> calculatePermutations(String phoneNumber) {
        return calculatePermutations(phoneNumber, 0, phoneNumber.length(), "");
    }

    public static List<String> calculatePermutations(String phoneNumber, int index, int len, String output) {
        List<String> result = new ArrayList<>();

        if (index == len) {
            return new ArrayList<String>(Collections.singleton(output));
        }

        for (int i = 0; i < getCharactersListFromMapping(String.valueOf(phoneNumber.charAt(index))).size(); i++){

            String sCopy =
                    String.copyValueOf(output.toCharArray());
            sCopy = sCopy.concat(
                    getCharactersListFromMapping(String.valueOf(phoneNumber.charAt(index))).get(i));
            result.addAll(calculatePermutations(phoneNumber, index + 1, len, sCopy));
        }
        return result;
    }

    public static List<String> getCharactersListFromMapping(String digit) {
        return getStringMapping().get(digit);
    }
    
    public static Map<String, List<String>> getStringMapping() {
        Map<String, List<String>> mapping = new HashMap<>();
        mapping.put("1", new ArrayList<>(Arrays.asList("\0")));
        mapping.put("2", new ArrayList<>(Arrays.asList("a", "b", "c")));
        mapping.put("3", new ArrayList<>(Arrays.asList("d", "e", "f")));
        mapping.put("4", new ArrayList<>(Arrays.asList("g", "h", "i")));
        mapping.put("5", new ArrayList<>(Arrays.asList("j", "k", "l")));
        mapping.put("6", new ArrayList<>(Arrays.asList("m", "n", "o")));
        mapping.put("7", new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
        mapping.put("8", new ArrayList<>(Arrays.asList("t", "u", "v")));
        mapping.put("9", new ArrayList<>(Arrays.asList("w", "x", "y", "z")));
        mapping.put("0", new ArrayList<>(Arrays.asList("\0")));
        return mapping;
    }
}
//        phoneNumber.chars().mapToObj(c -> (char) c).forEach(System.out::println); //String to stream by each char
//        Arrays.stream(result).forEach(System.out::println); //Array to stream


