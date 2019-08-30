import java.util.Scanner;

public class week1_SoNguyenTo_TH9 {
    //    [*Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = scanner.nextInt();
        System.out.println("Tat ca cac so nguyen to la: ");
        if(n >= 2)
        {
            System.out.print(2);
        }
        for(int i = 3; i < n;i +=2){
            if(isPrimeNumber(i))
            {
                System.out.println(" "+i);
            }
        }
    }

    public static boolean isPrimeNumber(int n)
    {
        if(n < 2)
        {
            return  false;
        }

        else if(n % 2 !=0)
        {
            int squareRoot = (int)Math.sqrt(n);
            for(int i = 3;i <= squareRoot ;i++)
            {
                return  false;
            }
        }
        return true;
    }
}
