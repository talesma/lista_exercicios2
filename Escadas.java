import java.util.Scanner;

public class Escadas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Digite um número");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        input.close();
    }
    
}
