package com.epam.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
This problem was asked by Yelp.

Given a mapping of digits to letters (as in a phone number),
and a digit string, return all possible letters the number could represent.
You can assume each valid number in the mapping is a single digit.

For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …}
then “23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"]
* */
public class App {
    public static void main(String[] args) {
//        String phoneNumber = "23";
//        String phoneNumber = "2312";
        String phoneNumber = "2356";
        List<String> result = Service.calculatePermutations(phoneNumber);
        System.out.println(result);
    }
}
