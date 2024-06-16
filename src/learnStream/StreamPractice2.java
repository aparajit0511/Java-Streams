package learnStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice2 {
    public static void main(String[] args) {

        // 7) From the given list of integers, print the numbers which are multiples of 5?

        List<Integer> array1 = Arrays.asList(1, 2, 5, 50, 123, 12, 75, 10, 20);

        for (Integer number : array1) {
            if (number % 5 == 0) {
                System.out.println(number + " is a multiple of 5");
            }
        }

        List<Integer> stream_numbers = array1.stream().filter(x -> x % 5 == 0).collect(Collectors.toList());
        System.out.println("Multiples of 5 are ->" + stream_numbers);

        // 8) Given a list of integers, find maximum and minimum of those numbers?

        System.out.println("Maximum ->" + array1.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Minimum ->" + array1.stream().min(Comparator.naturalOrder()).get());

        // 9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?

        int[] array12 = {5, 2, 8, 3};
        int[] array2 = {7, 6, 4, 1};

//        IntStream.concat(Arrays.stream(array1),Arrays.stream(array2));

        System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(array12), Arrays.stream(array2)).sorted().toArray()));

        // 11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> array3 = Arrays.asList(11, 22, 5, 50, 13, 121, 75, 100, 220, 1);

        array3.stream().sorted().limit(3).forEach(System.out::println);

        array3.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        // 12) Java 8 program to check if two strings are anagrams or not?

        // traditional method

        String str1 = "ana";
        String str2 = "naa";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int j = 0; j < str1.length(); j++) {
            char c = str1.charAt(j);
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }


        System.out.println("Hashmap map1 " + map1);


            for (int i = 0; i < str2.length(); i++) {
                char d = str2.charAt(i);
                if (map2.containsKey(d)) {
                    map2.put(d, map2.get(d) + 1);
                } else {
                    map2.put(d, 1);
                }

            }
        System.out.println("Hashmap map2  " + map2);

            if(map1.equals(map2)){
                System.out.println("Strings are anagram");
            }else{
                System.out.println("Strings are not anagram");
            }

            // Stream method

        String s1 = Stream.of(str1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        String s2 = Stream.of(str2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());

        if(s1.equals(s2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }

        // 13) Find sum of all digits of a number in Java 8?

        int i = 15623;
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("Sum of digits : " + sumOfDigits);

        // 14) Find second largest number in an integer array?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer secondLargest = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);

        // 15) Given a list of strings, sort them according to increasing order of their length?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        listOfStrings.stream().sorted().forEach(System.out::println);

        // 16) Given an integer array, find sum and average of all elements?

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a).sum();
        System.out.println("Sum is :" + sum);
        double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average is : "+ average);



    } // main
} // class

