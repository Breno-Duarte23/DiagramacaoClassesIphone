package aparelho.aplicativos;

public class InterfaceGrafica implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("IniciandoCorreioVoz");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
		
	}

	@Override
	public void adcionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");
	}
}
