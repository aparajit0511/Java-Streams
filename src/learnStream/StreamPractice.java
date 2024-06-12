package learnStream;

import java.util.*;
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

    }
}
