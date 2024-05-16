import ServicoSmartPhone.ServicoSmartPhone;
import java.util.Scanner;

public class iphone extends ServicoSmartPhone{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        ServicoSmartPhone cell = new ServicoSmartPhone();
        
        /*
            NÃO SE SABE QUAL APP 
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */
        
        while (true) {
            String servicoEscolhido= scanner.next(); 
            if(servicoEscolhido.equals("internet")) {
                String url =  scanner.next();
    
    
                cell.adicionarNovaAba(url); 
                cell.exibirPagina(url);
                cell.atualizarPagina();
            } else if(servicoEscolhido.equals("musica")) {
                cell.tocar();
                cell.pausar();
                cell.selecionarMusica();
            } else if(servicoEscolhido.equals("telefone")) {
                String numero =  scanner.next();
                String mensagem =  scanner.next();
                String destinatario =  scanner.next();
                
                cell.ligar(numero);
                cell.atender(numero);
                cell.iniciarCorreioVoz(mensagem, destinatario);
            } else 
                System.out.println("Escolher alguma função");
        }
        
            
        
    }
}


