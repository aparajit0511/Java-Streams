package learnStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice3 {
    public static void main(String[] args) {

        // 17) How do you find common elements between two arrays?
        List<Integer> array1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> array2 = Arrays.asList(2,3,5,9,8,10);

        HashSet<Integer> set1 = new HashSet<>(array1);

        for(Integer i:array2){
            if(set1.contains(i)){
                System.out.println("Duplicate item + " + i);
            }
        }

        //  stream
        array1.stream().filter(array2::contains).forEach(System.out::println);

        // 18) Reverse each word of a string using Java 8 streams?

        String str1 = "Java is a pathetic language";
        String[] parts = str1.split(" ");
        System.out.println(parts);

        for(String word:parts){
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.println(reversedWord);
        }
        // stream
        System.out.println(Arrays.stream(str1.split(" ")).map(x-> new StringBuilder(x).reverse().toString()));
        String answer = Arrays.stream(str1.split(" ")).map(x-> new StringBuilder(x).reverse()).collect(Collectors.joining(" "));
        System.out.println(answer);

        // 19) How do you find sum of first 10 natural numbers?

        int sum = IntStream.range(1,11).sum();

        System.out.println("Print First 10 natural numbers sum->" + sum);

        // 21) Print first 10 even numbers

        IntStream.range(1,21).filter(x->x%2==0).forEach(System.out::println);

    } // main
} // class
