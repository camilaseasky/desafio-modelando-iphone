import IPhone.IPhone;

public class Main {
    public static void main(String[] args) {

        IPhone meuTelefone = new IPhone();
        meuTelefone.inicarIPhone();
        meuTelefone.ligar();
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();
        meuTelefone.selecionarMusica();
        meuTelefone.tocar();
        meuTelefone.pausar();
        meuTelefone.exibirPagina();
        meuTelefone.atualizarPagina();
        meuTelefone.adicionarNovaAba();
    }
}