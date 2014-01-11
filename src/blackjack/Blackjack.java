package blackjack;
import java.util.Random;
import java.util.Scanner;
public class Blackjack {
    public static void main(String[] args) {
        Random cardgen = new Random();
        Scanner input = new Scanner(System.in);
        String HOD;
        int User1 = cardgen.nextInt(10) +1;
        int User2 = cardgen.nextInt(10) +1;
        int dealer1 = cardgen.nextInt(10) +1;
        int dealer2 = cardgen.nextInt(10) +1;
        int userTotal = User1 + User2;
        int dealerTotal = dealer1 + dealer2;
        int u =0;
        int i=0;
        System.out.println("You have a " +User1+ " and a "+User2+ " with a total of " +userTotal );
        System.out.println("The dealer has a " +dealer1+" and his other card is covered.");
            while(i==0){
            System.out.println("Hit or stand : ");
            HOD = input.nextLine();
            String hod = HOD.toLowerCase();
                
                if(hod.equals("hit")){
                int card = cardgen.nextInt(10) +1;
                int newTotal = userTotal + card;
                userTotal = newTotal;
                System.out.println("You got a " +card+ " making your total " +userTotal);            
                }
                
                if(hod.equals("stand")){
                i++;
                }             
                
                if(userTotal> 21){
                System.out.println("You bust! Game Over!");
                System.exit(0);
                }
            }
            
            while(u==0){
                if(dealerTotal<18){
                int card1 = cardgen.nextInt(10) +1;
                int newDealerTotal = dealerTotal + card1;
                dealerTotal = newDealerTotal;
                System.out.println("Dealer got a " +card1+ " making his total " +dealerTotal);
                }
                
                if(dealerTotal>=18){
                u++;
                }
                
                if(dealerTotal >21){    
                    System.out.println("Dealer Busts! You Win!");
                    System.exit(0);
                }              
            }
                if(dealerTotal>=userTotal){
                    System.out.println("Dealer wins with " +dealerTotal+ " over your " +userTotal );
                    System.exit(0);
                }
                
                if(userTotal>dealerTotal){
                System.out.println("You win with " +userTotal+ " over their " +dealerTotal );
                    System.exit(0);
                }
    }   
}