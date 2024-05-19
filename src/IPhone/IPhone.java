package IPhone;

import Dispositivos.AparelhoTelefonico;
import Dispositivos.NavegadorInternet;
import Dispositivos.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void inicarIPhone() {
        System.out.println("INICIANDO IPHONE");
    }

    public void ligar() {
        System.out.println("LIGANDO");
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }
    public void pausar() {
        System.out.println("PAUSANDO");
    }
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }
}
