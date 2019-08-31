import java.util.Scanner;

public class sesison1_InHinh_BT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choise = -1;
       while(choise != 0) {
           System.out.println("Menu: ");
           System.out.println("1.In hình chữ nhật: ");
           System.out.println("2.In hình tam giác vuông 1: ");
           System.out.println("3.In hình tam giác vuông 2: ");
           System.out.println("4.In hình tam giác cân: ");
           System.out.println("5.Out");
           choise = input.nextInt();

           switch (choise)
           {
               case 1:
                   System.out.println("Mời bạn nhập chiều dai,chiều rông lần lượt là: ");
                   InHCN(input.nextInt(),input.nextInt()); ;
               case 2:
                   System.out.println("Mời bạn nhập số dòng In hình tam giác vuông, có cạnh góc vuông ở botton-left: ");
                   InTamGiacVuong1(input.nextInt());
                   break;
               case 3:
                   System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left:");
                   InTamGiacVuong2(input.nextInt());
                   break;
               case 4:
                   System.out.println("Mời bạn nhập số dòng : ");
                   InTamGiacCan(input.nextInt());
                    break;
               case 5:
                   System.exit(0);
               default:
                   System.out.println("No choice.");
           }
       };

    }
    private static void InHCN(int num1,int num2)
    {
        for(int i =0;i< num1;i++)
        {
            for (int j = 0 ; j < num2 ;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    private static void InTamGiacVuong1(int num)
    {
        for(int i = 1 ;  i <= num ;i++)
        {
            for(int j = 0;j < i ;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    private static void InTamGiacVuong2(int num)
    {
        for(int i = num;i >=1;i--)
        {
            for(int j = 1 ; j <=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    private static void InTamGiacCan(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
