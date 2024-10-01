import java.util.Scanner;

public class ConversordeBases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o número decimal: ");
        int decimal = scanner.nextInt();

        System.out.print("Digite a base de destino (2 a 16): ");
        int base = scanner.nextInt();

       
        if (base < 2 || base > 16) {
            System.out.println("Base inválida! Escolha uma base entre 2 e 16.");
        } else {
            String resultado = converterDecimalParaBase(decimal, base);
            System.out.println("O número " + decimal + " em base " + base + " é: " + resultado);
        }

        scanner.close();
    }

    public static String converterDecimalParaBase(int decimal, int base) {
        StringBuilder resultado = new StringBuilder();
        int quociente = decimal;


        char[] digitos = "0123456789ABCDEF".toCharArray();

        while (quociente > 0) {
            int resto = quociente % base;
            resultado.insert(0, digitos[resto]); 
            quociente = quociente / base;
        }

        if (resultado.length() == 0) {
            return "0";
        }

        return resultado.toString();
    }
}