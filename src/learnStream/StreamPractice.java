package learnStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        // Given a list of integers, separate odd and even numbers?

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> newList = numbers.stream();

        List<Integer> oddList = newList.filter(x->x%2==1).collect(Collectors.toList());
        System.out.println("Odd numbers list => "+ oddList);

        Stream<Integer> newList1 = numbers.stream();

        List<Integer> evenList = newList1.filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("Even numbers list =>" + evenList);

        // How do you remove duplicate elements from a list using Java 8 streams?

        List<String> names = Arrays.asList("Tina","Mina","Rina","Sita","Mina","Dika");
        System.out.println(names.size());

        HashSet<String> newNames = new HashSet<>(names);
        System.out.println("Print new names"+ newNames);

        // Traditional method
        HashMap<String,Integer> hash_table = new HashMap<>();

        for(String name:names){
            if(hash_table.containsKey(name)){
                hash_table.put(name,hash_table.get(name)+1);
            }
            else{
               hash_table.put(name,1);
            }
        }

        System.out.println("Print hash table ->" + hash_table);

        List<String> newString = new ArrayList<>();

//       hash_table.forEach((key,value)->{
//           return(if(value == 1){
//               newString.add(key);
//           )}
//               )};

        for(String key: hash_table.keySet()){
                newString.add(key);
        }

        System.out.println("New Array list without duplicates -> " + newString);

        // using Streams

//        HashMap<String,Integer> nameCount = new HashMap<>({"Sita"=1, "Mina"=2, "Dika"=1, "Rina"=1, "Tina"=1});

        List<String> nameCountStream =  names.stream().distinct().collect(Collectors.toList());
        System.out.println("Array list without duplicates ->"+ nameCountStream);

        // How do you find frequency of each character in a string using Java 8 streams?

        // Traditional method

        List<String> names1 = Arrays.asList("a","a","b","x","d","e","f","e","x","x");

        HashMap<String,Integer> hash_freq = new HashMap<>();

        for(String name: names1){
            if (hash_freq.containsKey(name)){
                hash_freq.put(name,hash_freq.get(name)+1);

            }
            else{
                hash_freq.put(name,1);
            }
        }
        System.out.println("Count");
        System.out.println("Count Frequency -> "+ hash_freq);

        // Using Stream
        Map<String, Long> stationeryCountMap =
                names1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Count Frequency using Stream -> "+ stationeryCountMap);

        // 5) How do you sort the given list  in reverse order?
        // Traditional method

        List<Integer> integers = Arrays.asList(3,6,8,1,3,2,4,9);
        Collections.sort(integers);
        System.out.println("Sorted list->" + integers);

        Collections.sort(integers,Collections.reverseOrder());
        System.out.println("Reverse Sorted-> " + integers);

        // stream method
        List<Integer> integers1 = Arrays.asList(3,6,8,1,3,2,4,9);

        List<Integer> sorted_ = integers1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(" sTream Sorted list->" + sorted_);


    }
}
