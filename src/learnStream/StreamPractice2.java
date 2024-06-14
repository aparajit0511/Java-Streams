package learnStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice2 {
    public static void main(String[] args) {

        // 7) From the given list of integers, print the numbers which are multiples of 5?

        List<Integer> array1 = Arrays.asList(1,2,5,50,123,12,75,10,20);

        for(Integer number:array1){
            if(number % 5 == 0){
                System.out.println(number + " is a multiple of 5");
            }
        }

        List<Integer> stream_numbers = array1.stream().filter(x->x%5==0).collect(Collectors.toList());
        System.out.println("Multiples of 5 are ->" + stream_numbers);

        // 8) Given a list of integers, find maximum and minimum of those numbers?

        System.out.println("Maximum ->" + array1.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Minimum ->" + array1.stream().min(Comparator.naturalOrder()).get());

        // 9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
//        List<Integer> array2 = Arrays.asList(11,22,5,50,13,121,75,100,220,1);
        int[] array12 = {5, 2, 8, 3};
        int[] array2 = {7, 6, 4, 1};

//        IntStream.concat(Arrays.stream(array1),Arrays.stream(array2));

        System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(array12), Arrays.stream(array2)).sorted().toArray()));
    }

}

