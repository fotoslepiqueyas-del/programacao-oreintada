package gustavo;
    	  import java.util.Random;
    	  import java.util.Scanner;

    	  public class Dia02 {

    	      public static void mostrarMenu() {
    	          System.out.println("\n--- RPG: BATALHA ---");
    	          System.out.println("1 - Atacar");
    	          System.out.println("2 - Curar");
    	          System.out.println("3 - Ver status");
    	          System.out.print("Escolha uma ação: ");
    	      }

    	      public static int atacar(Random random) {
    	          return random.nextInt(16) + 5; 
    	      }

    	      public static int receberDano(Random random) {
    	          return random.nextInt(11) + 5; 
    	      }

    	      public static int curar(int vida) {
    	          vida += 15;
    	          return (vida > 100) ? 100 : vida;
    	      }

    	      public static void main(String[] args) {
    	          Scanner scanner = new Scanner(System.in);
    	          Random random = new Random();

    	          int vidaJogador = 100;
    	          int vidaMonstro = 80;

    	          System.out.print("Digite o nome do seu personagem: ");
    	          String nome = scanner.nextLine();

    	          while (vidaJogador > 0 && vidaMonstro > 0) {
    	              mostrarMenu();
    	              int opcao = scanner.nextInt();

    	              if (opcao == 1) {
    	                  int danoCausado = atacar(random);
    	                  vidaMonstro -= danoCausado;
    	                  System.out.println("\nVocê causou " + danoCausado + " de dano!");

    	                  if (vidaMonstro <= 0) break;

    	                  int danoRecebido = receberDano(random);
    	                  vidaJogador -= danoRecebido;
    	                  System.out.println("O monstro causou " + danoRecebido + " de dano!");

    	              } else if (opcao == 2) {
    	                  vidaJogador = curar(vidaJogador);
    	                  System.out.println("\nVocê se curou!");

    	                  int danoRecebido = receberDano(random);
    	                  vidaJogador -= danoRecebido;
    	                  System.out.println("O monstro atacou e causou " + danoRecebido + " de dano!");

    	              } else if (opcao == 3) {
    	                  System.out.println("\n--- Status ---");
    	                  System.out.println(nome + ": " + (vidaJogador < 0 ? 0 : vidaJogador) + " HP");
    	                  System.out.println("Monstro: " + (vidaMonstro < 0 ? 0 : vidaMonstro) + " HP");
    	              } else {
    	                  System.out.println("Opção inválida!");
    	              }
    	          }

    	          if (vidaMonstro <= 0) {
    	              System.out.println("\nParabéns! Você venceu!");
    	          } else {
    	              System.out.println("\nVocê foi derrotado!");
    	          }

    	          scanner.close();
    	      }
    	  
      }
	
	

