import java.util.Scanner;

public class Array_DuyetMang_TH {
    public static void main(String[] args) {
        String[] students = {
                "Chirst","Micheal","Camila","Sienna","Tanya","Connor","Zachariah","Mallory","Zoe","Emily"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap ten sinh vien: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0 ; i < students.length;i++)
        {
            if(students[i].equals(input_name))
            {
                System.out.println("Postiton of the students in the list "+input_name+" is: "+(i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
        {
            System.out.println("Not found "+input_name+" in the list");
        }
    }
}

