package steps;

import common.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

import pages.Contato;
import pages.PaginaInicial;
import util.Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaContatoSteps extends Base {

    private Base base;
    private Contato contato;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaContatoSteps(Base base) {
        this.base = base;
        screenshot = new Screenshot(this.base);
        homePage = new PaginaInicial(this.base);
        contato = new Contato(this.base);
    }

    @Dado("que estou na pagina contato")
    public void que_estou_na_pagina_contato() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        contato.clicarBotaoMenu();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        contato.clicarBotaoMenuContato();
        assertEquals(contato.verificarSeEstaNaPaginaContato().toUpperCase(), ("//CONTATO"));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_contato");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina contato")
    public void eu_navego_pela_pagina_contato() {
        assertEquals(contato.obterTituloTelefoneContato(), ("TELEFONE"));
        assertEquals(contato.obterTextoTelefoneContato(), ("+55 11 3236-6600"));
        assertEquals(contato.obterTituloUnidadeCentroContato(), ("UNIDADE CENTRO"));
        assertEquals(contato.obterTextoUnidadeCentroContato(), ("Av. Ipiranga, 344 - 9º andar\n" +
                "República, São Paulo - SP\n" +
                "CEP: 01046-000"));
        assertEquals(contato.obterTituloUnidadeBarueriContato(), ("UNIDADE BARUERI"));
        assertEquals(contato.obterTextoUnidadeBarueriContato(), ("Av. Anápolis, 100\n" +
                "Sala 705 - Jd. dos Camargos,\n" +
                "Barueri - SP\n" +
                "CEP: 06404-250"));
        assertEquals(contato.obterTituloFormularioContato(), ("CONTATE-NOS"));
        assertEquals(contato.obterTituloNomeFormContato(), ("NOME"));
        assertEquals(contato.verificarCampoNomeFormContatoEstaVisivel(), (true));
        assertEquals(contato.obterTituloEmailFormContato(), ("EMAIL"));
        assertEquals(contato.verificarCampoEmailFormContatoEstaVisivel(), (true));
        assertEquals(contato.obterTituloTelefoneFormContato(), ("TELEFONE"));
        assertEquals(contato.verificarTelefoneFormContatoEstaVisivel(), (true));
        assertEquals(contato.obterTituloEmpresaFormContato(), ("EMPRESA"));
        assertEquals(contato.verificarEmpresaFormContatoEstaVisivel(), (true));
        assertEquals(contato.obterTituloFalarComFormContato(), ("FALAR COM"));
        assertEquals(contato.verificarFalarComFormContatoEstaVisivel(), (true));
        assertEquals(contato.obterTituloMensagemFormContato(), ("MENSAGEM"));
        assertEquals(contato.verificarMensagemFormContatoEstaVisivel(), (true));
        assertEquals(contato.verificarBotaoEnviarFormularioContatoEstaVisivel(), (true));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_contato");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}