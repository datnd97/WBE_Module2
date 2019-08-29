import java.util.Scanner;

public class TH4_bai1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolve ");
        System.out.println("Given a equations as 'a * x + b =0',please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        if( a!=0)
        {
            int solution = -b/a;
            System.out.printf("The solution is:%d",solution);


        }
        else
        {
            if(b ==0 )
            {
                System.out.print("The solution is all x!");
            }
            else
            {
                System.out.print("No solution!");
            }
        }
    }
}
