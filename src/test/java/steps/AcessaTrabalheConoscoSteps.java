package steps;

import common.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.PaginaInicial;
import pages.TrabalheConosco;
import util.Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaTrabalheConoscoSteps extends Base {

    private Base base;
    private TrabalheConosco trabalheConosco;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaTrabalheConoscoSteps(Base base) {
        this.base = base;
        screenshot = new Screenshot(this.base);
        homePage = new PaginaInicial(this.base);
        trabalheConosco = new TrabalheConosco(this.base);
    }

    @Dado("que estou na pagina trabalhe conosco")
    public void que_estou_na_pagina_trabalhe_conosco() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        trabalheConosco.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        trabalheConosco.clicarBotaoMenuTrabalheConosco();;
        assertEquals(trabalheConosco.verificarSeEstaNaPaginaTrabalheConosco().toUpperCase(), ("//TRABALHE\n" +
                "CONOSCO"));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_trabalhe_conosco");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina trabalhe conosco")
    public void eu_navego_pela_pagina_trabalhe_conosco() {
        assertEquals(trabalheConosco.obterTextoPaginaTrabalheConosco(), ("Venha fazer parte da empresa referência em qualidade de software.\n" +
                "Cadastre o seu currículo e aguarde oportunidades."));
        assertEquals(trabalheConosco.obterTituloCampoNomeTrabalheConosco(), ("NOME"));
        assertEquals(trabalheConosco.verificarSeCampoNomeTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoEmailTrabalheConosco(), ("EMAIL"));
        assertEquals(trabalheConosco.verificarSeCampoEmailTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoTelefoneTrabalheConosco(), ("TELEFONE"));
        assertEquals(trabalheConosco.verificarSeCampoTelefoneTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoEnderecoTrabalheConosco(), ("ENDEREÇO"));
        assertEquals(trabalheConosco.verificarSeCampoEnderecoTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoCidadeTrabalheConosco(), ("ESCREVA O NOME DA SUA CIDADE"));
        assertEquals(trabalheConosco.verificarSeCampoCidadeTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoObjetivoProfissionalTrabalheConosco(), ("OBJETIVO PROFISSIONAL"));
        assertEquals(trabalheConosco.verificarSeCampoObjetivoProfissionalTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoAreaAtuacaoTrabalheConosco(), ("ÁREA"));
        assertEquals(trabalheConosco.verificarSeCampoAreaAtuacaoTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoMensagemTrabalheConosco(), ("MENSAGEM"));
        assertEquals(trabalheConosco.verificarSeCampoMensagemTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoAnexarTrabalheConosco(), ("ANEXAR CURRICULUM"));
        assertEquals(trabalheConosco.verificarSeCampoAnexarTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTextoTiposDeArquivosAceitosTrabalheConosco(), ("Arquivos aceitos: PDF, DOC, DOCX e TXT"));
        assertEquals(trabalheConosco.verificarSeBotaoEnviarFormularioTrabalheConosco(), (true));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_trabalhe_conosco");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}