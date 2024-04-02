import java.util.Scanner;

public class JogoDaForca {
	
	private String palavraSecreta;
	private StringBuilder palavraAtual;
	private StringBuilder letrasErradas;
	private int tentativasRestantes;
	private Scanner ler;
	
	public void JogoDaForca() {
	        this.palavraSecreta = "banana"; // Palavra a ser adivinhada
	        this.palavraAtual = new StringBuilder("_".repeat(palavraSecreta.length()));
	        this.letrasErradas = new StringBuilder();
	        this.tentativasRestantes = 6;
	        this.ler = new Scanner(System.in);
	 }
	
	
	public  void JogoDaForcaMedio() {
		this.palavraSecreta = "matematica";
		this.palavraAtual = new StringBuilder("_".repeat(palavraSecreta.length()));
		this.letrasErradas = new StringBuilder();
		this.tentativasRestantes = 10;
		this.ler = new Scanner(System.in);
	}  
	
	public  void JogoDaForcaDificil() {
		this.palavraSecreta = "osteoporose";
		this.palavraAtual = new StringBuilder("_".repeat(palavraSecreta.length()));
		this.letrasErradas = new StringBuilder();
		this.tentativasRestantes = 14;
		this.ler = new Scanner(System.in);
	}  
	
	public void JogoDaForcaCavaleiroDeOuro() {
		this.palavraSecreta = "otorringolaringologista";
		this.palavraAtual = new StringBuilder("_".repeat(palavraSecreta.length()));
		this.letrasErradas = new StringBuilder();
		this.tentativasRestantes = 26;
		this.ler = new Scanner(System.in);
	}  
	
	 public void iniciarJogo() {
	        while (tentativasRestantes > 0 && palavraAtual.indexOf("_") != -1) {
	            System.out.println("\n\n	Palavra: " + palavraAtual);
	            System.out.println("	Letras erradas: " + letrasErradas);
	            System.out.println("	Tentativas restantes: " + tentativasRestantes);
	            System.out.print("	Digite uma letra: ");
	            char letra = ler.nextLine().toLowerCase().charAt(0);
	            verificarLetra(letra);
	        }

	        if (tentativasRestantes == 0) {
	            System.out.println("\nVocê perdeu! A palavra era: " + palavraSecreta);
	        } else {
	            System.out.println("\nParabéns, você ganhou! A palavra era: " + palavraSecreta);
	        }
	        
	    }
	 
	 private void verificarLetra(char letra) {
		    boolean letraEncontrada = false;
		    for (int i = 0; i < palavraSecreta.length(); i++) {
		        if (palavraSecreta.charAt(i) == letra) {
		            palavraAtual.setCharAt(i, letra);
		            letraEncontrada = true;
		        }
		    }
		    if (!letraEncontrada) {
		        letrasErradas.append(letra).append(" ");
		        tentativasRestantes--;
		    }
		}

	 
	 public void reiniciarJogo() {
	        this.palavraAtual = new StringBuilder("_".repeat(palavraSecreta.length()));
	        this.letrasErradas = new StringBuilder();
	        this.tentativasRestantes = 6;
	    }
	 
}
