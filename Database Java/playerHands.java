import java.util.*;
import java.util.Arrays;
import java.io.*;
public class playerHands{
   
   int type = 0;
   



   public static void main(String[] args){
  
      int count = 0;
      int value;
      
      char[] suits = {' ','c', 'd', 'h', 's'};
      int [] type = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
      
      cardObject[] hands = new cardObject[52];
    
      
      for(int i = 1; i <=13; i++){
      
         for(int j = 1; j<=4; j++){
         
               if(type[i] > 9)
               value = 10;
               else
               value = type[i];
               
               System.out.println(type[i] + " " + value + " " + suits[j]);
               count++;
               
         }
      }
      
    
      
      System.out.println("This deck has " + count + " cards");
      
      
      
   
   
   
   
      cardObject card1 = new cardObject(1,1); 
      cardObject card2 = new cardObject(1,2);  
      cardObject card3 = new cardObject(1,3);  
      cardObject card4 = new cardObject(1,4);  
      cardObject card5 = new cardObject(2,1);  
      cardObject card6 = new cardObject(2,2);  
      cardObject card7 = new cardObject(2,3);  
      cardObject card8 = new cardObject(2,4);  
      
      
      
      
      //System.out.println(type[card1.value] + " " + suits[card1.suit]);
      
      
      
      hands[0] = card1;
      hands[1] = card2;
      hands[2] = card3;
      hands[3] = card4;
      hands[4] = card5;
      hands[5] = card6;
      //Collections.shuffle(Arrays.asList(hands));
      
      System.out.println(java.util.Arrays.toString(hands));
      
      
     
     
     
     
     
      int x = 0; 
      
      while(x < 5){
         
         
         
         hands[x] = new cardObject(1,1);
      
         x++;
         
      }
      
      //System.out.println(hands[3].value + " " + suits[hands[3].suit]);
   
   
   
   
   
   
   }
   
}