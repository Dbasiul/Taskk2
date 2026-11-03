package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lyginiai = 0;
        int nelyginiai = 0;

        System.out.println("Įveskite skaičius:");

        while (true) {
            int skaicius = scanner.nextInt();
            
            if (skaicius == 0) {
                break;
            }
            
            if (skaicius % 2 == 0) {
                lyginiai++;
            } else {
                nelyginiai++;
            }
        }

        System.out.println("Lyginių skaičių: " + lyginiai);
        System.out.println("Nelyginių skaičių: " + nelyginiai);
        
        scanner.close();
    }
}
