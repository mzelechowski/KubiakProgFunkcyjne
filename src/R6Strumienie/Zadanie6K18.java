package R6Strumienie;

import java.util.Arrays;

public class Zadanie6K18 {
    public static void main(String[] args) {
        /*Napsz program, który dla zdania
        Gdyby kózka nie skakała, to by nóżki nie złamała
        oblicza liczbę łąńcuchów (wyrazów), z których składa się zdanie.
         */
        String phrase="Gdyby kózka nie skakała, to by nóżki nie złamała";
        String[] phraseTab=phrase.split(" ");
        int countWords= (int) Arrays.stream(phraseTab).filter(s->s.length()>=0).count();
        System.out.println(countWords);
        long countWordsLong=Arrays.stream(phraseTab).map(String::length).count();
        System.out.println(countWordsLong);


    }
}
