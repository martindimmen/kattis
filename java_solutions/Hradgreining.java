import java.util.Scanner;
public class Hradgreining{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String text=s.nextLine();
        String substring="COV";

        if (text.contains(substring)){
            System.out.println("Veikur!");
        }
        else{
            System.out.println("Ekki veikur!");
        }
        s.close();

    }
}