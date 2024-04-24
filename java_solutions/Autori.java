import java.util.Scanner;
public class Autori {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String word=s.nextLine();
        String[] parts=word.split("-");
        String letters="";
        for (String part : parts){
            System.out.println(part);
            char firstChar=part.charAt(0);
            letters+=firstChar;
        }

        System.out.println(letters.toUpperCase());
    }
}
