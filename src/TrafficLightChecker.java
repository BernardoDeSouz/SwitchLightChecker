import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current color (red, yellow, green):");

        // Ler a cor atual como uma string
        String currentColor = scanner.nextLine().trim().toLowerCase();

        // Determinar a próxima cor do sinal de trânsito
        if (currentColor.equals("red")) {
            System.out.println("The next color is green.");
        } else if (currentColor.equals("yellow")) {
            System.out.println("The next color is red.");
        } else if (currentColor.equals("green")) {
            System.out.println("The next color is yellow.");
        } else {
            System.out.println("Invalid color entered.");
        }

        scanner.close();
    }
}