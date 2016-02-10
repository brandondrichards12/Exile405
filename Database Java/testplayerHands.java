import java.io.*;
public class testplayerHands{
   
   int value;
   int type;
   char suit;
   
   testplayerHands(int cardValue, int cardType, char cardSuit){
   
      value = cardValue;
      type = cardType;
      suit = cardSuit;
   
   }
   
   @override
   public String toString(){
   String output = value + type + suit;
   
   return output;
   }  



   public static void main(String[] args){
  
   
   testplayerHands card = new testplayerHands(7, 7, 'c');   
   
   System.out.println(card);
   
   
   }
   
}