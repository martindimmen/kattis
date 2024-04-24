import java.util.Scanner;
public class DragaFra{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int line1=s.nextInt();
        int line2=s.nextInt();
        s.close();
        System.out.println(line1-line2);

    }
}