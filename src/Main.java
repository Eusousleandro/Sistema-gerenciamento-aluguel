import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rent[] rent = new Rent[10];

        System.out.print("Quantos quartos você vai alugar? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent: " + "#" + (i+1) );
            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("email: ");
            String email =  scanner.next();
            System.out.print("Rooms: ");
            int roomsNumber = scanner.nextInt();

            rent[roomsNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Bys rooms:");
        for (int i = 0; i < 10; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

        scanner.close();
    }
}

