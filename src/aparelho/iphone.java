package aparelho;

import java.util.Scanner;

import aparelho.aplicativos.InterfaceGrafica;

public class iphone {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	InterfaceGrafica interfaceG = new InterfaceGrafica();
	int opcaoApp = 1;
	int opcaoFuncao = 1;

	do {
		System.out.println("_______________________________");
		System.out.println("Qual app deseja utilizar? ");
		System.out.println("1- Reprodutor Musical");
		System.out.println("2- Aparelho Telefonico");
		System.out.println("3- Navegador");
		System.out.println("0- Bloquear iphone ");
		
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
		opcaoApp = sc.nextInt();
		 
		switch (opcaoApp) {
			case 0:
				System.out.println("Iphone bloqueado");
				opcaoApp = 0;
				break;
			case 1:
				do {
				System.out.println("_______________________________");
				System.out.println("Qual funcao Deseja utilizar?");
				System.out.println("1- Tocar");
				System.out.println("2- Pausar");
				System.out.println("3- Selecionar Musica");
				System.out.println("0- Voltar");
				System.out.println("          ( |   | )          ");
				System.out.println("_______________________________");
				opcaoFuncao = sc.nextInt();
				
				switch(opcaoFuncao) {
					case 0:
						opcaoFuncao = 0;
						break;
					case 1: 
						interfaceG.tocar();
						break;
					case 2:
						interfaceG.pausar();
						break;
					case 3:
						interfaceG.selecionarMusica();
						break;
					default:
						System.out.println("Opcao Invalida");
				}
				
				} while (opcaoFuncao != 0);
				break;
			case 2:
				do {
					System.out.println("_______________________________");
					System.out.println("Qual funcao Deseja utilizar?");
					System.out.println("1- Ligar");
					System.out.println("2- Atender");
					System.out.println("3- Inicar Correio de Voz");
					System.out.println("0- Voltar");
					System.out.println("          ( |   | )          ");
					System.out.println("_______________________________");
					opcaoFuncao = sc.nextInt();
					switch(opcaoFuncao) {
						case 0:
							opcaoFuncao = 0;
							break;
						case 1:
							interfaceG.ligar();
							break;
						case 2:
							interfaceG.atender();
							break;
						case 3: 
							interfaceG.iniciarCorreioVoz();
							break;
						default:
							System.out.println("Opcao Invalida");	
					}
				}while(opcaoFuncao != 0);
				break;
			case 3:
				do {
					System.out.println("_______________________________");
					System.out.println("Qual funcao Deseja utilizar?");
					System.out.println("1- Exibir Pagina");
					System.out.println("2- Adicionar Nova Aba");
					System.out.println("3- Atualizar Pagina");
					System.out.println("0- Voltar");
					System.out.println("          ( |   | )          ");
					System.out.println("_______________________________");
					opcaoFuncao = sc.nextInt();
					switch(opcaoFuncao) {
						case 0:
							opcaoFuncao = 0;
							break;
						case 1:
							interfaceG.exibirPagina();;
							break;
						case 2:
							interfaceG.adcionarNovaAba();;
							break;
						case 3: 
							interfaceG.atualizarPagina();
							break;
						default:
							System.out.println("Opcao Invalida");	
					}
				}while(opcaoFuncao != 0);
				break;
			default:
				System.out.println("Digite uma opcao valida");
		}
		
	}	while(opcaoApp != 0);
	sc.close();
	}
}
	


