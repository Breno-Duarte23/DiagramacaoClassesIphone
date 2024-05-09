package aparelho.aplicativos.copy;

public class InterfaceGrafica implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {

	@Override
	public void ligar() {
		
		System.out.println("_______________________________\n");
		System.out.println("Ligando");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
	}

	@Override
	public void atender() {
		
		System.out.println("_______________________________\n");
		System.out.println("Atendendo");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("_______________________________\n");
		System.out.println("Iniciando Correio Voz");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("_______________________________\n");
		System.out.println("Exibindo Pagina");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
		
	}

	@Override
	public void adcionarNovaAba() {
		System.out.println("_______________________________\n");
		System.out.println("Adicionando nova aba");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("_______________________________\n");
		System.out.println("Atualizando Pagina");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
	}

	@Override
	public void tocar() {
		System.out.println("_______________________________\n");
		System.out.println("Tocando");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
	}

	@Override
	public void pausar() {
		System.out.println("_______________________________\n");
		System.out.println("Pausando");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("_______________________________\n");
		System.out.println("Selecionando Musica");
		System.out.println("          ( |   | )          ");
		System.out.println("_______________________________");
	}
}
