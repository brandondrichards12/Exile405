import java.io.*;
import java.util.*;
public class Shuffle{

   public static void main(String[] args){
  
    Integer[] arr = new Integer[]{1,2,3,4};
    //int []a = { 1,2,33,5,7,8};
    /*for (int i = 0; i < arr.length; i++) {
        arr[i] = i;
    }*/
    Collections.shuffle(Arrays.asList(arr));
    System.out.println(Arrays.toString(arr));

}
   
   
   
   
   
}