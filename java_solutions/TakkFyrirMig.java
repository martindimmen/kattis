import java.util.Scanner;
public class TakkFyrirMig{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number=s.nextInt();
        s.nextLine();

        for(int i=0;i<number;i++){
            String text= s.nextLine();
            System.out.println("Takk "+text);
        }
        s.close();

    }
}