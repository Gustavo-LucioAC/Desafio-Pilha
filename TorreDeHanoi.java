import java.util.Scanner;

public class TorreDeHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de discos ao usuário
        System.out.print("Digite o número de discos: ");
        int numDiscos = scanner.nextInt();

        // Chamar o método para resolver as Torres de Hanoi
        resolverTorresDeHanoi(numDiscos, 'A', 'C', 'B');

        scanner.close();
    }

    // Método para resolver as Torres de Hanoi
    public static void resolverTorresDeHanoi(int numDiscos, char origem, char destino, char auxiliar) {
        if (numDiscos == 1) {
            // Caso base: mover o disco 1 diretamente da origem para o destino
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            // Passo 1: mover todos os discos exceto o último para a haste auxiliar
            resolverTorresDeHanoi(numDiscos - 1, origem, auxiliar, destino);

            // Passo 2: mover o último disco para o destino
            System.out.println("Mover disco " + numDiscos + " de " + origem + " para " + destino);

            // Passo 3: mover os discos da haste auxiliar para o destino
            resolverTorresDeHanoi(numDiscos - 1, auxiliar, destino, origem);
        }
    }
}