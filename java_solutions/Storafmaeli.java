import java.util.Scanner;
public class Storafmaeli {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int age = i.nextInt();
        i.close();
        if (age % 10 == 0){
            System.out.println("Jebb");
        }
        else{
            System.out.println("Neibb");
        }
    }
}
