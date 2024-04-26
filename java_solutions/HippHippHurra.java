import java.util.Scanner;
public class HippHippHurra{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String text=s.nextLine();
        int number=s.nextInt();
        s.nextLine();

        for(int i=0;i<number;i++){
            System.out.println("Hipp hipp hurra, "+text+"!");
        }
        s.close();

    }
}