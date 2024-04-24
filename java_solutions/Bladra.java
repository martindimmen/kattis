import java.util.Scanner;
public class Bladra {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int v=s.nextInt(), a=s.nextInt(), t=s.nextInt();
        s.close();
        double result=distance(v,a,t);
        System.out.println(result);
    }
    static double distance(int v, int a, int t){
        return ((v*t) + 0.5*a*Math.pow(t,2));           
    }
}
