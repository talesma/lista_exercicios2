import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        int maior=Integer.MIN_VALUE;
        int menor=Integer.MAX_VALUE;

        for (int i=0; i < 12; i++) {
            System.out.println("Digite a " +(i+1)+ "° idade:");
            n = input.nextInt();
            if (n>maior) {
                maior=n;
            }
            if (n<menor) {
                menor=n;
            }
        }

        System.out.println("O mais velho é: " +maior);
        System.out.println("O mais novo é: " +menor);
        
        input.close();
    }
    
}
