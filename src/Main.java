import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sicakligi: ");
        sicaklik = input.nextInt();

        if (sicaklik<5) {
            System.out.print("Kayak yapmaya gidebilirsiniz!");
        } else if (sicaklik<10) {
            System.out.print("Sinemaya gidebilirsiniz!");
        } else if (sicaklik<15) {
            System.out.print("Sinemaya veya piknige gidebilirsiniz!");
        } else if (sicaklik<25) {
            System.out.print("Piknige gidebilirsiniz!");
        } else if (sicaklik>=25) {
            System.out.print("Yuzmeye gidebilirsiniz!");
        } else {
            System.out.print("Hatali Giris Yaptiniz!\nLutfen Programi Yeniden Calistiriniz.");
        }
    }
}
