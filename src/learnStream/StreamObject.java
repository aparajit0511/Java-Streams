package learnStream;

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

    }
}
