import java.util.Scanner;

public class session1_MoneyTranfer_TH {
    public static void main(String[] args) {
        double usd,vnd = 23000;
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = new Scanner(System.in).nextInt();
        double quyDoi = usd * vnd;
        System.out.print("Gía trị VND là: "+quyDoi);
    }
}
