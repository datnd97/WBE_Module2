import java.util.Scanner;

public class week1_20NguyenTo_BT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Moi ban nhap so luong So Nguyen To: ");
        int number = input.nextInt();
        int count = 0;
        int i = 2;
        if(number >= 2)
        {
            System.out.print(2);
        }
        while (count < number)
        {
            if(isPrimeNumber(i)) {
                System.out.print(" "+i);
                count++;
            }
            i++;

        }

    }
    public static boolean isPrimeNumber(int n)
    {
        if(n < 2)
        {
            return  false;
        }
        else if(n % 2 ==0)
        {
            return  false;
        }
        else if(n % 2 !=0)
        {
            int squareRoot = (int)Math.sqrt(n);
            for(int i = 3;i <= squareRoot ;i++)
            {
                return false;
            }
        }
        return true;
    }
}
