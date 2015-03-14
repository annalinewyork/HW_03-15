package c4q.annalinewyork;

/**
 * Access Code 2.1
 * Na Li
 * Main.java
 * Home work : an adventure game in forest.
 **/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("It is a dark winter night, you're walking in a forest, lost your backpack and so hungry.");
        System.out.println("The bad thing is no one in this place during cold season, the good thing is: ");
        System.out.println("you just find a little wood house!");

        int doorpin = 16;

        System.out.println("Wait, there is a coded lock on the door, Can you guess the number? " +
                "Choose a number between 10-20,please");

        //User input number, is guess right, keep going.
        //If guess wrong, keep guessing.

        while (true) {
            Scanner pin = new Scanner(System.in);
            int guessInt = pin.nextInt();

            if (guessInt == doorpin) {
                break;
            } else if (guessInt < 10 || guessInt > 20) {
                System.out.println("Wrong input! Try the number between 10~20");
            } else {
                System.out.println("Oh,No,Keep trying~");
            }
        }

        System.out.println("Congratulation! You got it!");
        System.out.println("You walk in the house,\"woo~! There is a rabbit in a cage ~\"");
        System.out.println("You will: 1.Open the cage let it go. 2. I so hungry,I wanna eat this rabbit.");

        while (true) {
            //User make a first choice between 1 and 2.
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.equals("1")) {
                System.out.println("The rabbit suddenly talk to you: Thank you for your kindness, I will give you a gift.");
                System.out.println("You wanna: Yes, I'll take it.");
                System.out.println("No. I don't need your gift, just go.");

                Scanner scanner2 = new Scanner(System.in);
                String answer2 = scanner.next();

                    //If user choose 1, continue make a second choice.
                    if (answer2.equalsIgnoreCase("yes") || answer2.equalsIgnoreCase("y")) {
                        System.out.println("The rabbit gives you a big carrot.");
                    } else if (answer2.equalsIgnoreCase("no") || answer2.equalsIgnoreCase("n")) {
                        System.out.println("The rabbit said:\"One good turn deserves another." +
                                "Let me take you to my home and have a great dinner!");
                    } else
                    {
                        System.out.println("Oops. I need a correct input, please.");
                    }
                }

            //User make a first choice between 1 and 2.
            else if (answer.equals("2")) {
                System.out.println("Are you sure? 1.YES.  2.NO. Let me think about it.");

                Scanner scanner3 = new Scanner(System.in);
                String answer3 = scanner.next();

                //If user choose 2, continue make a second choice.
                    if (answer3.equalsIgnoreCase("yes") || answer3.equalsIgnoreCase("y")) {
                        System.out.println("When you try to kill this rabbit, the door is open,owner of house come back." +
                                "He so angry, and ask you get out of his house.");
                    } else if (answer3.equalsIgnoreCase("no") || answer3.equalsIgnoreCase("n")) {
                        System.out.println("The rabbit suddenly talk to you: Thank you for your kindness, I will give you a gift." +
                                "You wanna: 1.Yes, I'll take it. 2.No. I don't need your gift, just go. ");
                    } else {
                        System.out.println("Oops. I need a correct input, please.");
                    }

                Scanner scanner4 = new Scanner(System.in);
                String answer4 = scanner.next();
                //If user choose "No" under the second choice, then make a third choice.
                if (answer4.equalsIgnoreCase("yes") || answer4.equalsIgnoreCase("y")) {
                    System.out.println("The rabbit gives you a big carrot.");
                } else if (answer4.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                    System.out.println("The rabbit said:\"One good turn deserves another." +
                            "Let me take you to my home and have a great dinner!");
                } else {
                    System.out.println("Oops. I need a correct input, please.");
                }

            } else
                System.out.println("Oops. I need a correct input, please.");
        }
    }
}