package pl.ciolak.ig;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Klasa testujaca klase ReverseWords i jej metode reverse
 * @author Aleksander Ciolak
 * @version 1.0
 */
public class ReverseWordsTest {

    ReverseWords reverseWords = new ReverseWords();

    @Test
    public void testWord() {
        String result = reverseWords.reverse("Usatysfakcjonowany");
        assertEquals("ynawonojckafsytasU",result);
    }

    @Test
    public void testManyWords() {
        String result = reverseWords.reverse("Ala ma kota kot ma ale");
        assertEquals("alA am atok tok am ela",result);
    }

    @Test
    public void testNumber() {
        String result = reverseWords.reverse("123456789");
        assertEquals("987654321",result);
    }

    @Test
    public void testManyNumbers() {
        String result = reverseWords.reverse("123456789 123 456 789");
        assertEquals("987654321 321 654 987",result);
    }

    @Test
    public void testSeperatedLetters() {
        String result = reverseWords.reverse("a b c d e f g h i j k l m n");
        assertEquals("a b c d e f g h i j k l m n",result);
    }

    @Test
    public void testManyWhitespace() {
        String result = reverseWords.reverse("Ala        ma 	kota    kot   ma 	ale");
        assertEquals("alA am atok tok am ela",result);
    }

    @Test
    public void testManyWordsWithPunctuationMarks() {
        String result = reverseWords.reverse("Ala ma kota, kot ma ale.");
        assertEquals("alA am ,atok tok am .ela",result);
    }

    @Test
    public void testManyWordsWithNewLinesSigns() {
        String result = reverseWords.reverse("Ala ma kota kot ma ale\nKrzysiek ma psa\rJulka ma chomika\r\nZosia ma rybki");
        assertEquals("alA am atok tok am ela keisyzrK am asp akluJ am akimohc aisoZ am ikbyr",result);
    }
}