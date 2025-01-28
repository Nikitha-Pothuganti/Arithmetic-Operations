import java.util.Scanner;

public class Arthematicoperations {
    public static void main(String[] args) {
       Scanner src=new Scanner(System.in);{
        System.out.println("Enter 1st Value: ");
        int a=src.nextInt();
        System.out.println("Enter 2nd Value: ");
        int b=src.nextInt();
        System.out.println("Addition of "+ a +" and "+ b +" is: "+(a+b));
        System.out.println("Subraction of "+ a +" and "+ b + " is: "+ (a-b));
        System.out.println("Multipllication of "+ a +" and "+ b +"is:"+(a*b));
        System.out.println("Division of "+ a +" and "+ b +"is: "+(b/a));
        System.out.println("Modulus of "+ a +" and "+ b +"is: "+(a%b));
        src.close();
    }
  }
}

