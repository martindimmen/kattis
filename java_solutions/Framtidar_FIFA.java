import java.util.Scanner;

public class Framtidar_FIFA{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        s.close();

        int currentYear=2022+(n/k);
        System.out.println(currentYear);
    }
}
