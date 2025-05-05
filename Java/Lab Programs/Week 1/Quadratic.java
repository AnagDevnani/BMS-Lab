import java.util.Scanner;
import java.lang.Math;
class Quadratic{
    public static void main(String args[]){
        System.out.println("Program by Anag Devnani, USN: 1BM23CS031");
        int a,b,c;
        var con = System.console();
        Scanner sc = new Scanner(con.reader());
        System.out.print("Enter the value of a: ");
        a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        b=sc.nextInt();
        System.out.print("Enter the value of c: ");
        c=sc.nextInt();
        while(a==0){
            System.out.println("\'a\' cannot be zero, please re-enter");
            a=sc.nextInt();
        }
        double zero1, zero2;
        double discriminant = (b*b-4*a*c);
        if(discriminant > 0){
            zero1=(-b+Math.sqrt(discriminant))/(2*a);
            zero2=(-b-Math.sqrt(discriminant))/(2*a);
            System.out.println("The roots are real and distinct:");
            System.out.println("1st Root: "+zero1);
            System.out.println("2nd Root: "+zero2);
        }
        else if(discriminant == 0){
            System.out.println("The roots are real and equal");
            zero1 = (-b/(2*a));
            System.out.println("Root: "+zero1);
        }
        else{
            System.out.println("The equation has no real roots");

        }
    }
}
