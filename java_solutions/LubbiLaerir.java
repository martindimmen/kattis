import java.util.Scanner;
public class LubbiLaerir {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String word=s.nextLine();
        char firstChar=word.charAt(0);
        s.close();
        System.out.println(firstChar);
    }
}
