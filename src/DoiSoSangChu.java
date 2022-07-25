import java.util.Scanner;

public class DoiSoSangChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = scanner.nextInt();

        int hangTram = number / 100;
        int hangChuc = (number % 100) / 10;
        int hangDonVi = number % 10;
        String chuyenDoi = "";
        if (number >= 0 && number <= 999) {

            switch (hangTram) {
                case 1:
                    chuyenDoi = "one hundred ";
                    break;
                case 2:
                    chuyenDoi = "two hundred ";
                    break;
                case 3:
                    chuyenDoi = "three hundred ";
                    break;
                case 4:
                    chuyenDoi = "four hundred ";
                    break;
                case 5:
                    chuyenDoi = "five hundred ";
                    break;
                case 6:
                    chuyenDoi = "six hundred ";
                    break;
                case 7:
                    chuyenDoi = "seven hundred ";
                    break;
                case 8:
                    chuyenDoi = "eight hundred ";
                    break;
                case 9:
                    chuyenDoi = "nine hundred ";
                    break;
            }

            if (hangTram != 0 && (hangChuc != 0 || hangDonVi !=0)) {
                chuyenDoi += "and ";
            }
            if (hangChuc >= 2) {
                switch (hangChuc) {
                    case 2:
                        chuyenDoi += "twenty ";
                        break;
                    case 3:
                        chuyenDoi += "thirty ";
                        break;
                    case 4:
                        chuyenDoi += "forty ";
                        break;
                    case 5:
                        chuyenDoi += "fifty ";
                        break;
                    case 6:
                        chuyenDoi += "sixty ";
                        break;
                    case 7:
                        chuyenDoi += "seventy ";
                        break;
                    case 8:
                        chuyenDoi += "eighty ";
                        break;
                    case 9:
                        chuyenDoi += "ninety ";
                        break;
                }
            } else if (hangChuc == 1){
                switch (hangDonVi){
                    case 1:
                        chuyenDoi += "eleven";
                        break;
                    case 2:
                        chuyenDoi += "twelve";
                        break;
                    case 3:
                        chuyenDoi += "thirteen";
                        break;
                    case 4:
                        chuyenDoi += "fourteen";
                        break;
                    case 5:
                        chuyenDoi += "fifteen";
                        break;
                    case 6:
                        chuyenDoi += "sixteen";
                        break;
                    case 7:
                        chuyenDoi += "seventeen";
                        break;
                    case 8:
                        chuyenDoi += "eighteen";
                        break;
                    case 9:
                        chuyenDoi += "nineteen";
                        break;
                    case 0:
                        chuyenDoi += "ten";
                        break;
                }
            }
            if (hangChuc!=1){
                switch (hangDonVi){
                    case 1:
                        chuyenDoi += "one";
                        break;
                    case 2:
                        chuyenDoi += "two";
                        break;
                    case 3:
                        chuyenDoi += "three";
                        break;
                    case 4:
                        chuyenDoi += "four";
                        break;
                    case 5:
                        chuyenDoi += "five";
                        break;
                    case 6:
                        chuyenDoi += "six";
                        break;
                    case 7:
                        chuyenDoi += "seven";
                        break;
                    case 8:
                        chuyenDoi += "eight";
                        break;
                    case 9:
                        chuyenDoi += "nine";
                        break;
                }
            }
            if (hangTram ==0 && hangChuc == 0 && hangDonVi == 0){
                chuyenDoi = "zero";
            }
        } else {
            chuyenDoi = "out of ability";
        }
        System.out.printf("%s",chuyenDoi);
    }
}