import java.util.*;
class Numberguess{
    public static void main(String[] args){
        generaterandom();
    }
    public static int generaterandom(){
        Random random=new Random();
        int randomnum=random.nextInt(100);
        guess(randomnum);
        return 1;
    }
    public static void guess(int randomnum){
       System.out.println(" ");
        System.out.println("                 Number guessing game");
        System.out.print("Guess a Numbeer Between 0-100 :");
        System.out.print(" ");
        Scanner myobj= new Scanner(System.in);
        int guess=myobj.nextInt();
        while(0>guess || guess>100){
            System.out.println("you enter a wrong guess");
            System.out.print("please enter  a Numbeer Between 0-100 :");
            guess=myobj.nextInt();
            System.out.print("there are 10 attempts");
        }
        int tries=1;
        while(guess!=randomnum){
            tries++;
            System.out.println("wrong Guess!");
            
            if(guess>randomnum){
                System.out.println("Guess is too high");
            }
            if(guess<randomnum){
                System.out.println("Guess is too low");
            }
            if(tries==10){
                System.out.println("game over");
                break;
            }
            System.out.println(" ");
            System.out.println("attempts -> "+tries);
            System.out.print("Guess again:");
            guess=myobj.nextInt();
            while(0>guess || guess>100){
                System.out.println("you enter a wrong guess");
                System.out.print("please enter  a Numbeer Between 0-100 :");
                guess=myobj.nextInt();
            }
            
        }
        System.out.println("guess is correct  you won ! ");
        System.out.println("you score " +(10-tries)+" out of 10 ");
        // play again or exit
        System.out.println("press 1 to play again");
        System.out.println("press 0 to play exit");
        int choise=myobj.nextInt();
        if (choise==1){
            generaterandom();
        }
        else{
            return;
        }
    }
    

}