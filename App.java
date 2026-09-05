import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Preço unitário do produto: ");
        double precoUnitario = entrada.nextDouble();
        System.out.print("Quantidade do produto: ");
        int quantidade = entrada.nextInt();
        double subtotal = precoUnitario * quantidade;

        System.out.println("Subtotal: " + subtotal);

        if (subtotal >= 200) {
            double desconto = subtotal * 5 / 100;
            double totalComDesconto = subtotal - desconto;
            System.out.println("Desconto: " + desconto);
            System.out.println("Total com desconto: " + totalComDesconto);
        } else {
            System.out.println("Total a pagar: " + subtotal);
        }
        entrada.close();
    }
}
