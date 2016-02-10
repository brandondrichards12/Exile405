public class cardObject{

   public int value;
   public int suit;
  
   public cardObject(int valueOfCard, int suitOfCard){
   
      value = valueOfCard;
      suit = suitOfCard;
   
   }

   
   public void setValue(int valueOfCard){
   
      value = valueOfCard;
   
   }
   
   public int getValue(){
      
      return value;
   
   }
   
    public void setSuit(int suitOfCard){
   
      suit = suitOfCard;
   
   }
   
   public int getSuit(){
      
      return suit;
  
   }
   
   public void printCard (cardObject c) { 
    String[] suits = { " ","Clubs", "Diamonds", "Hearts", "Spades" }; 
    String[] ranks = { " ", "Ace", "2", "3", "4", "5", "6", 
         "7", "8", "9", "10", "Jack", "Queen", "King" }; 

    System.out.println (ranks[c.value] + " of " + suits[c.suit]); 
  } 
  @Override

   public String toString() {
        return ("Card Type:" + this.getValue()+
                    " Card Suite: " + this.getSuit());
                   
   }  

}
