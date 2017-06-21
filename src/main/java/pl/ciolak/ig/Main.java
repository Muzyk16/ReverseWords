package pl.ciolak.ig;

import java.util.Scanner;

/**
 * Klasa glowna programu do obracania slow/ciagow znakow w tekscie
 * @author Aleksander Ciolak
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter words to reverse: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        while(scanner.hasNextLine()){
            builder.append(scanner.nextLine()+" ");
        }
        scanner.close();

        String input=builder.toString();
        System.out.println("Input: " + input);

        ReverseWords reverseWords = new ReverseWords();
        String output = reverseWords.reverse(input);
        System.out.println("Output: " + output);
    }


}