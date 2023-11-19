//package GuessingTheMovie;
import java.util.Scanner;

public class guessingTheMovieName{
    public static void main(String[] args){
        String movieName = args[0].trim();
        Scanner sc = new Scanner(System.in);
        String guess = "";
        int count = 0;
        String temp = "";
        System.out.println("Guess the name");
        while(count <= movieName.length()){
            if(count < movieName.length())
            {String ch = sc.next();

                if(movieName.contains(ch.toLowerCase()) || movieName.contains(ch.toUpperCase())){
                    count++;
                    temp += ch;
                    System.out.println(ch + " is in the movie name");
                }
                else System.out.println(ch + " is not in the movie name");

                System.out.println("------------------------------------------------------------------");
                System.out.println("These many characters are in the name    :   " + temp);
                System.out.println("------------------------------------------------------------------");
                if(count == movieName.length())System.out.println("These are the total scribbled charactes now guess the correct name");
            }
            else {
                String fullName = sc.next().trim();
                if(fullName.toLowerCase().equals(movieName.toLowerCase())) {System.out.println("----****Excellent!!****----");
                    System.out.println("It is the correct Answer");
                    break;
                }
                else System.out.println("Try Again");
            }
        }
    }
}