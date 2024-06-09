package learnStream;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2,3,4,5,6,8,10);

        System.out.println(list1);
        // list1.add(24);  not mutable cannot add elements

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(1);
        list2.add(123);
        System.out.println(list2);

        List<Integer> list3 = Arrays.asList(1,2,3,4,5);
        System.out.println(list3);

        // not mutable list
        // list3.add(6);
        System.out.println(list3);

        // using java regular code
        List<Integer> listEven = new ArrayList<>();

        for(Integer i: list1){
            if(i % 2 == 0){
                listEven.add(i);
            }
        }

        System.out.println(listEven);

        // using Stream Api
        // First create a stream

        Stream<Integer> stream = list1.stream();
        // Returns a reference
        System.out.println(stream);
        // prints this -->> java.util.stream.ReferencePipeline$Head@53d8d10a

        // Filter even elements
        List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
//        List<Integer> newList = stream.filter(i->i%2==0).toList();
        newList.add(88);

        System.out.println(newList);

        // filter elements greater than 5

        Stream<Integer> stream1 = newList.stream();

        List<Integer> filteredList = stream1.filter(i->i > 5).collect(Collectors.toList());
        System.out.println(filteredList);


    }
}
