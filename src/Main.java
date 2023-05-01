import java.util.Scanner;

public class Main {
    static String isPrime(int value, int divider, int divisor) {
        int remainder = value % divider;
        if (remainder == 0) {
            divisor ++;
        }
        if (divider == 1) {
            if (divisor > 2) {
                return value + " sayısı asal sayı değildir.";
            }
            else {
                return value + " sayısı asal sayıdır.";
            }
        }
        return isPrime(value,divider - 1, divisor);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Lütfen bir sayı giriniz: ");
            int value = input.nextInt();

            if (value > 1) {
                System.out.print(isPrime(value,value,0));
                break;
            }
            else {
                System.out.println("Girilen sayı 1'den büyük olmalıdır.");
            }
        }

    }
}