package ServicoSmartPhone;


import servico.AparelhoTelefonico;
import servico.NavegadorInternet;
import servico.ReprodutorMusical;

public class ServicoSmartPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
	

	@Override
	public void tocar() {
		try {
			System.out.println("Validando tocar");


			
		} catch (Exception e) {
			// TODO Auto-generated method stub

			throw new UnsupportedOperationException("Unimplemented method 'tocar'");
		}
		

		
	}

	@Override
	public void pausar() {
		try {
			System.out.println("Validando pausar");



			
		} catch (Exception e) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'pausar'");
		}

		
	}

	@Override
	public void selecionarMusica() {
		try {
			System.out.println("Validando selecionar musica");



			
		} catch (Exception e) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
		}

		
	}

	@Override
	public void ligar(String numero) {
		try {
			System.out.println("Validando ligar");



			
		} catch (Exception e) {
			/// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'ligar'");
		}

		
	}

	@Override
	public void atender(String numero) {
		try {
			System.out.println("Validando atender");



			
		} catch (Exception e) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'atender'");
		}

		
	}

	@Override
	public void iniciarCorreioVoz(String mensagem, String destinatario) {
		try {
			System.out.println("Validando iniciar correio de voz");
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
		}
		

		
	}

	@Override
	public void exibirPagina(String url) {
		try {
			System.out.println("Validando exibir pagina");

			
		} catch (Exception e) {
			/// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
		}
		

		
	}

	@Override
	public void adicionarNovaAba(String url) {
		
		try {
			System.out.println("Validando Adicionar Nova aba");
			
		} catch (Exception e) {
			// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
		}

		
	}

	@Override
	public void atualizarPagina() {
		try {
			System.out.println("Validando atualizar pagina");


			
		} catch (Exception e) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
		}

		
	}
	
	
}
