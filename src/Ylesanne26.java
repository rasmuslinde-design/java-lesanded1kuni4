import java.util.Scanner;

public class Ylesanne26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int read = Integer.parseInt(reader.nextLine());

            // Kui kasutaja sisestab 0, katkestame tsükli
            if (read == 0) {
                break;
            }

            // Lisame sisestatud arvu summale juurde
            sum = sum + read;

            // Väljastame hetkesumma
            System.out.println("Sum now: " + sum);
        }

        // Tsükkel lõppes, väljastame lõppsumma
        System.out.println("Sum in the end: " + sum);
    }
}
