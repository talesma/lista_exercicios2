import java.util.Scanner;

public class CNH {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            int rodas;
            float peso;
            int pessoas;
    
            System.out.println("Informe a quantidade de rodas de seu veículo:");
            rodas = input.nextInt();
    
            System.out.println("Informe o peso do seu veículo em Kg:");
            peso = input.nextFloat();
    
            System.out.println("Informe a quantidade de pessoas que seu veículo comporta:");
            pessoas = input.nextInt();
    
            if (rodas <=3) {
                System.out.println("CNH Tipo A.");
            } else if (rodas >= 4 && pessoas <= 8 && peso <= 3500) {
                System.out.println("CNH Tipo B.");
            } else if (rodas >= 4 && peso > 3500 && peso <= 6000) {
                System.out.println("CNH Tipo C.");
            } else if (rodas >= 4 && pessoas > 8) {
                System.out.println("CNH Tipo D.");
            } else if (rodas >= 4 && peso > 6000) {
                System.out.println("CNH Tipo E.");
            } else {
                System.out.println("CNH INVÁLIDA.");
            }
    
            input.close();
    
        }

        }
