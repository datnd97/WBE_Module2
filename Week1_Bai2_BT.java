import java.util.Scanner;

public class Week1_Bai2_BT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số:");
        int number = scanner.nextInt();
        String numToText = null;


        if (number < 10 && number > 0) {
            switch (number) {
                case 1:
                    numToText = "Số 1";
                    break;
                case 2:
                    numToText = "Số 2";
                    break;
                case 3:
                    numToText = "Số 3";
                    break;
                case 4:
                    numToText = "Số 4";
                    break;
                case 5:
                    numToText = "Số 5";
                    break;
                case 6:
                    numToText = "Số 6";
                    break;
                case 7:
                    numToText = "Số 7";
                    break;
                case 8:
                    numToText = "Số 8";
                    break;
                case 9:
                    numToText = "Số 9";
                    break;

            }
        } else if (number < 20 && number > 10) {
            int num = number % 10;
            switch (num) {
                case 1:
                    numToText = "Mười một";
                    break;
                case 2:
                    numToText = "Mười  hai";
                    break;
                case 3:
                    numToText = "Mười  ba";
                    break;
                case 4:
                    numToText = "Mười  bốn";
                    break;
                case 5:
                    numToText = "Mười  năm";
                    break;
                case 6:
                    numToText = "Mười  sáu";
                    break;
                case 7:
                    numToText = "Mười bảy";
                    break;
                case 8:
                    numToText = "Mười  tám";
                    break;
                case 9:
                    numToText = "Mười  chín";
                    break;
            }
        } else if (number >= 20 && number < 100) {
            int chuc = (number % 100 / 10);
            int donVi = number % 10;
            String strChuc = null;
            String strDonVi = null;
            switch (chuc) {

                case 2:
                    strChuc = "Hai";
                    break;
                case 3:
                    strChuc = "Ba";
                    break;
                case 4:
                    strChuc = "Bốn";
                    break;
                case 5:
                    strChuc = "Năm";
                    break;
                case 6:
                    strChuc = "Sáu";
                    break;
                case 7:
                    strChuc = "Bảy";
                    break;
                case 8:
                    strChuc = "Tám";
                    break;
                case 9:
                    strChuc = "Chín";
                    break;
            }
            switch (donVi) {
                case 1:
                    strDonVi = "một";
                    break;
                case 2:
                    strDonVi = "hai";
                    break;
                case 3:
                    strDonVi = "ba";
                    break;
                case 4:
                    strDonVi = "bốn";
                    break;
                case 5:
                    strDonVi = "năm";
                    break;
                case 6:
                    strDonVi = "sáu";
                    break;
                case 7:
                    strDonVi = "bảy";
                    break;
                case 8:
                    strDonVi = "tám";
                    break;
                case 9:
                    strDonVi = "chín";
                    break;


            }
            numToText = "Số mới là: " + strChuc + " mươi " + strDonVi;
        } else if (number > 100) {
            int tram = number / 100;

            int donVi = number % 10;
            String strTram = null;
            String strChuc = null;
            String strDonVi = null;
            switch (tram) {
                case 1:
                    strTram = "Một";
                    break;
                case 2:
                    strTram = "Hai";
                    break;
                case 3:
                    strTram = "Ba";
                    break;
                case 4:
                    strTram = "Bốn";
                    break;
                case 5:
                    strTram = "Năm";
                    break;
                case 6:
                    strTram = "Sáu";
                    break;
                case 7:
                    strTram = "Bảy";
                    break;
                case 8:
                    strTram = "Tám";
                    break;
                case 9:
                    strTram = "Chín";
                    break;
            }
            int chuc = (number % 100 / 10);
            switch (chuc) {

                case 0:
                    strChuc = "";
                    break;
                case 1:
                    strChuc = "Mười";
                    break;
                case 2:
                    strChuc = "Hai";
                    break;
                case 3:
                    strChuc = "Ba";
                    break;
                case 4:
                    strChuc = "Bốn";
                    break;
                case 5:
                    strChuc = "Năm";
                    break;
                case 6:
                    strChuc = "Sáu";
                    break;
                case 7:
                    strChuc = "Bảy";
                    break;
                case 8:
                    strChuc = "Tám";
                    break;
                case 9:
                    strChuc = "Chín";
                    break;
            }
            switch (donVi) {
                case 0:
                    strDonVi = "";
                    break;
                case 1:
                    strDonVi = "một";
                    break;
                case 2:
                    strDonVi = "hai";
                    break;
                case 3:
                    strDonVi = "ba";
                    break;
                case 4:
                    strDonVi = "bốn";
                    break;
                case 5:
                    strDonVi = "năm";
                    break;
                case 6:
                    strDonVi = "sáu";
                    break;
                case 7:
                    strDonVi = "bảy";
                    break;
                case 8:
                    strDonVi = "tám";
                    break;
                case 9:
                    strDonVi = "chín";
                    break;

            }
            String newI = " linh ";

            if (strChuc == "" && strDonVi != "") {
                numToText = "Số mới là: " + strTram + " trăm " + strChuc + newI + strDonVi;
            } else {
                newI = "";
                numToText = "Số mới là: " + strTram + " trăm " + strChuc + newI + strDonVi + " mươi";
            }


        }


        if (numToText != "") {
            System.out.println("Số '" + number + "' chuyển thành là: " + numToText);
        }

    }
}
