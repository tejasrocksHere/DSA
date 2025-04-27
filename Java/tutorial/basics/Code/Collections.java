import java.util.*;
public class Collections {
 public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);  
        arr.add(10);  
        arr.add(3);  
        arr.add(20);
        for (Integer integer : arr) {
            System.out.println(integer);
        }  
     int len=  arr.size();
     for(int i=0;i<len;i++){
        System.err.println(arr.get(i));
     }
     Map<Integer , String> mp = new HashMap<>();
  
 }   
}
