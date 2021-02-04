import java.util.Scanner;
public class Read {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can doi: ");
        int number = scanner.nextInt();
        if (0 <= number && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Out of ability");
                    break;
            }

        } else if (10 <= number && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eightteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
                default:
                    System.out.println("Out of ability");
                    break;
            }

        } else if (20 <= number && number < 100) {
            int ones = number % 10;
            int tens = number / 10;
            String hangchuc = " ";
            String hangdonvi = " ";

            switch (tens) {
                case 2:
                    hangchuc = "Twenty";
                    break;
                case 3:
                    hangchuc = "Thirty";
                    break;
                case 4:
                    hangchuc = "Forty";
                    break;
                case 5:
                    hangchuc = "Fifty";
                    break;
                case 6:
                    hangchuc = "Sixty";
                    break;
                case 7:
                    hangchuc = "Seventy";
                    break;
                case 8:
                    hangchuc = "Eighty";
                    break;
                case 9:
                    hangchuc = "Ninety";
                    break;
            }
            switch (ones) {
                case 1:
                    hangdonvi = "One";
                    break;
                case 2:
                    hangdonvi = "Two";
                    break;
                case 3:
                    hangdonvi = "Three";
                    break;
                case 4:
                    hangdonvi = "Four";
                    break;
                case 5:
                    hangdonvi = "Five";
                    break;
                case 6:
                    hangdonvi = "Six";
                    break;
                case 7:
                    hangdonvi = "Seven";
                    break;
                case 8:
                    hangdonvi = "Eight";
                    break;
                case 9:
                    hangdonvi = "Nine";
                    break;
            }
            System.out.println(hangchuc + " - " + hangdonvi);
        } else {
            System.out.println("Out of ability");
        }

    }
}
