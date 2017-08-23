import java.util.Scanner;

public class ScannerNotes
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); // create scanner
        Scanner scanStr = new Scanner(System.in);
        
        System.out.print("Please enter an int:");
        int num1 = scan.nextInt();
        
        System.out.print("Please enter a decimal:");
        double num2 = scan.nextDouble();
        
        System.out.print("Please enter a name:");
        String name = scanStr.next();
        System.out.print(name);
        
        System.out.printf("Price: %10.2f", num2);
    }
}
