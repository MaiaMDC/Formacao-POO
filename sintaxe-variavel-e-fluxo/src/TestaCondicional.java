public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Você não tem 18, mas pode entrar por estar acompanhado");
            } else {
                System.out.println("infelizmente você não pode entrar");
            }

        }

    }
}
