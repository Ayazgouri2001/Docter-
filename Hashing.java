import java.util.HashSet; // important line in hash set code me 
import java.util.Iterator;

public class Hashing {

    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  //list.add(el)

        //search - contains
        if(set.contains(1)) {
            System.out.println("set contain 1");
        }
        if(!set.contains(6)) {
           System.out.println("set cantains 6");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("does not contain 1 - we deleted 1");
        }

        //size
        System.out.println("size of set is : " + set.size());

        //print all element
        System.out.println(set);
        

    }
    
}
