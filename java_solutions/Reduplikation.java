import java.util.Scanner;
public class Reduplikation{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String word=s.nextLine();
        int number=s.nextInt();
        s.close();

        for(int i=0; i<number; i++){
            System.out.print(word);
        };

    }
}