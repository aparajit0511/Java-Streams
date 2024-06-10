package learnStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        System.out.println("In Stream Object");

        // blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e-> System.out.println("Show data"+ e));

        // array, object, collection
        // create a stream from an array

        String names[] = {"ap","ac","ag","af"};
        Stream<String> stream1 = Stream.of(names);

        stream1.forEach(e-> System.out.println(e));

        // stream builder
        Stream<Object> streamBuilder =  Stream.builder().build();
        System.out.println(streamBuilder);

        streamBuilder.forEach(e-> System.out.println(e));

        // array as streams

        IntStream stream = Arrays.stream(new int[]{2,3,4,65,123});
        stream.forEach(e-> System.out.println(e));

        // list,set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(1);
        list2.add(123);

        System.out.println("List Stream");

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e-> System.out.println(e));


    }
}
