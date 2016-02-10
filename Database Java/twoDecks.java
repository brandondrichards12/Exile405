import java.io.*;
public class twoDecks{ 
   
   public static void main(String[]args)throws IOException{
      
      
      
      int count = 0;
      int value;
      
      char[] suits = {' ','c', 'd', 'h', 's'};
      int [] type = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
      
      
      PrintWriter writer = new PrintWriter("twoDecks.txt", "UTF-8");
   
      
      
      
      for(int numberOfDecks = 2; numberOfDecks > 0; numberOfDecks--){
      
      
         for(int i = 1; i <=13; i++){
      
            for(int j = 1; j<=4; j++){
            
                  if(type[i] > 9)
                  value = 10;
                  else
                  value = type[i];
               
                  writer.println(type[i] + " " + suits[j] + " " + value);
                  count++;
               
            }
         }
      }
      
      writer.close();   
      
      System.out.println("This deck has " + count + " cards");  
      
   }
}