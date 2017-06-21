package pl.ciolak.ig;

import java.util.Scanner;

/**
 * Klasa sluzaca do obracania slow/ciagow znakow w podanym tekscie
 * @author Aleksander Ciolak
 * @version 1.0
 */
public class ReverseWords {

    public String reverse(String text){

        Scanner scanner = new Scanner(text);
        StringBuilder mainBuilder = new StringBuilder();

        while(scanner.hasNext()){

            //String word = scanner.next();
            StringBuilder builderTmp = new StringBuilder(scanner.next());
            mainBuilder.append(builderTmp.reverse());
            if(scanner.hasNext())
                mainBuilder.append(" ");
        }
        scanner.close();
        return mainBuilder.toString();

    }
}