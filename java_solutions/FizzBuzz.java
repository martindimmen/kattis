
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt(), n=s.nextInt();
        s.close();

        for(int i=1; i<n+1; i++){
            if (i%x==0 && i%y==0){
                System.out.println("FizzBuzz");
            }
            else if(i%x==0){
                System.out.println("Fizz");
            }
            else if(i%y==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}