import java.util.Scanner;

public class TorreDeHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de discos: ");
        int numDiscos = scanner.nextInt();

        resolverTorresDeHanoi(numDiscos, 'A', 'C', 'B');

        scanner.close();
    }

    public static void resolverTorresDeHanoi(int numDiscos, char origem, char destino, char auxiliar) {
        if (numDiscos == 1) {

            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {

            resolverTorresDeHanoi(numDiscos - 1, origem, auxiliar, destino);

            System.out.println("Mover disco " + numDiscos + " de " + origem + " para " + destino);

            resolverTorresDeHanoi(numDiscos - 1, auxiliar, destino, origem);
        }
    }
}