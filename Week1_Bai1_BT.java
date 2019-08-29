import java.util.Scanner;

public class Week1_Bai1_BT {
    public static void main(String[] args) {
//        [Bài tập] Hiển thị lời chào
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name  = scanner.nextLine();
        System.out.print("Hello: "+name);
    }
}
