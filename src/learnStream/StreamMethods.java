package learnStream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // filter takes a predicate - boolean value

        List<String> names = List.of("Aman","Ajay","Adam","Durga");

        List<String> newList =   names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());

        newList.forEach(e-> System.out.println(e));
        System.out.println(newList);

        // map takes a function

        List<Integer> numbers = List.of(1,2,3,4,5);

        List<Integer> newNumber = numbers.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(newNumber);

        // prints same as this newList.forEach(e-> System.out.println(e));

        numbers.stream().forEach(System.out::println);

        // sorted
        System.out.println("Print sorted numbers");
        numbers.stream().sorted().forEach(System.out::println);

        // min and max

        Integer min_ = numbers.stream().min((x,y)->x.compareTo(y)).get();
        //  get() to get a single number
        System.out.println("Minimum number "+min_);

        Integer max_ = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Maxmimum number "+ max_);




    }
}
