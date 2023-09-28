import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        System.out.println((set));

        if(set.contains(10)){
            System.out.println(("present"));
        }
        else{
            System.out.println("not found");
        }
        set.remove(10);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
    }
}
