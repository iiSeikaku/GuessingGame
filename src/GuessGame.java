import java.util.Scanner;

    public class GuessGame {
        public static void main(String[] args) {
            System.out.println("Guess the number!");
            System.out.println("Does the player guess or does the computer guess? ");
            System.out.println("Type A or B");
            //Creates a new scanner here
            Scanner game = new Scanner(System.in);
            String gametype = game.nextLine();
            if (gametype == "A"){
                Scanner difficulty = new Scanner(System.in);
                int gamediff = difficulty.nextInt();
                System.out.println("Type 1 for numbers 1-10");
                System.out.println("Type 2 for numbers 1-100");
                System.out.println("Type 3 for numbers 1-1000");
                System.out.println("Type 4 for numbers 1-10000");
                if (gamediff==1){
                    int A = (int)(Math.random()*11+1);
                    Scanner input = new Scanner(System.in);
                    int answer = input.nextInt();
                    System.out.println("Guess a number between 1-10!");
                    while (answer != A){
                        System.out.println("Guess Again!");
                    }
                }
                if (gamediff==2){
                    int B = (int)(Math.random()*101+1);
                }
                if (gamediff==3){
                    int C = (int)(Math.random()*1001+1);
                }
                if (gamediff==4){
                    int D = (int)(Math.random()*10001+1);
                }

            }
        }

    }