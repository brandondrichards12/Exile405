import java.io.*;
import java.util.*;
public class Million{
   
   int type = 0;
  
  private final static int Value = 1000000;

   public static void main(String[] args){
  
   for (int i = 0; i < Value; i++) {
         Integer[] arr = new Integer[]{1,2,3,4};
   
    Collections.shuffle(Arrays.asList(arr));
    System.out.println(Arrays.toString(arr));
    }


}
   
   
   
   
   
}