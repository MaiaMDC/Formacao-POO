import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.next();

        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é palíndroma");
        } else {
            System.out.println(palavra + " não é palíndroma");
        }
    }

    public static boolean ehPalindromo(String palavra) {
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}