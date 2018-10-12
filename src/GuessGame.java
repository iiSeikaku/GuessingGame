import java.util.Scanner;

    public class GuessGame {
        public static void main(String[] args) {
            System.out.println("Guess the number!");
            System.out.println("Does the player guess or does the computer guess? ");
            System.out.println("Type A or B");
            int A = (int) (Math.random() * 10 + 1);
            int B = (int) (Math.random() * 100 + 1);
            int C = (int) (Math.random() * 1000 + 1);
            int D = (int) (Math.random() * 10000 + 1);
            Scanner input = new Scanner(System.in);
            String gamemode = input.nextLine();
            if (gamemode.equals("A")) {
                System.out.println("Type 1 for numbers 1-10");
                System.out.println("Type 2 for numbers 1-100");
                System.out.println("Type 3 for numbers 1-1000");
                System.out.println("Type 4 for numbers 1-10000");
                int difficulty = input.nextInt();
                if (difficulty == 1) {
                    System.out.println("Guess a number!");
                    while (input.nextInt() != A) {
                        System.out.println("Try Again!");
                    }
                    System.out.println("Congratulations! You Win!");
                }
                if (difficulty ==2){
                    System.out.println("Guess a number!");
                    int num1 = input.nextInt();
                    int e = 1;
                    while (num1 != B){
                        if (num1 > B){
                            System.out.println("Lower!");
                        }
                        if (num1 < B){
                            System.out.println("Higher!");
                        }
                        e += 1;
                        System.out.println("Try Again!");
                        num1 = input.nextInt();
                    }
                    System.out.println("Congratulations! You win!");
                    System.out.println("It took you "+ e +" tries to get "+ B +"");
                }
                if (difficulty ==3){
                    System.out.println("Guess a number!");
                    int num1 = input.nextInt();
                    int e = 1;
                    while (num1 != C){
                        if (num1 > C){
                            System.out.println("Lower!");
                        }
                        if (num1 < C){
                            System.out.println("Higher!");
                        }
                        e += 1;
                        System.out.println("Try Again!");
                        num1 = input.nextInt();
                    }
                    System.out.println("Congratulations! You win!");
                    System.out.println("It took you "+ e +" tries to get "+ C +"");
                }
                if (difficulty ==4){
                    System.out.println("Guess a number!");
                    int num1 = input.nextInt();
                    int e = 1;
                    while (num1 != D){
                        if (num1 > D){
                            System.out.println("Lower!");
                        }
                        if (num1 < D){
                            System.out.println("Higher!");
                        }
                        e += 1;
                        System.out.println("Try Again!");
                        num1 = input.nextInt();
                    }
                    System.out.println("Congratulations! You win!");
                    System.out.println("It took you "+ e +" tries to get "+ D +"");
                }
            }
            if (gamemode.equals("B")){
                System.out.println("The computer will now guess your number from 1-100");
                System.out.println("Type Higher if the number is higher, or type Lower if the number is lower");
                System.out.println("Type Correct, if the answer is correct");
                int initialguess = (int)(Math.random()*100+1);
                System.out.println(""+ initialguess+"");
                String userinput = input.nextLine();
            }
        }
    }
