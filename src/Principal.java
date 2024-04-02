import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        JogoDaForca jogo = new JogoDaForca();

        System.out.println("JOGO DA FORCA");
        System.out.println("\nEscolha a dificuldade: ");
        System.out.println("1 - Fácil ");
        System.out.println("2 - Médio ");
        System.out.println("3 - Difícil ");
        System.out.println("4 - Cavaleiro de Ouro ");

        int opcao = ler.nextInt();

        while (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida. Escolha novamente:");
            opcao = ler.nextInt();
        }

        switch (opcao) {
            case 1:
                jogo.JogoDaForca();
                break;

            case 2:
                jogo.JogoDaForcaMedio();
                break;

            case 3:
                jogo.JogoDaForcaDificil();
                break;

            case 4:
                jogo.JogoDaForcaCavaleiroDeOuro();
                break;
        }

        jogo.iniciarJogo(); // Apenas uma chamada do método iniciarJogo() aqui

        System.out.println("\nDeseja jogar novamente? (S/N)");
        char jogarNovamente = ler.next().toUpperCase().charAt(0);
        while (jogarNovamente == 'S') {
            jogo.reiniciarJogo();
            jogo.iniciarJogo();
            System.out.println("\nDeseja jogar novamente? (S/N)");
            jogarNovamente = ler.next().toUpperCase().charAt(0);
        }

        System.out.println("Obrigado por jogar!");
        ler.close();
    }
}
