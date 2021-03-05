package steps;

import common.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.PaginaInicial;
import pages.Rodape;
import util.Screenshot;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaPaginaInicialSteps extends Base {

    private Base base;
    private PaginaInicial homePage;
    private Rodape rodape;
    private Screenshot screenshot;

    public AcessaPaginaInicialSteps(Base base) {
        this.base = base;
        homePage = new PaginaInicial(this.base);
        rodape = new Rodape(this.base);
        screenshot = new Screenshot(this.base);
    }

    private String tituloPagina = "AUDITESTE - ESPECIALISTAS EM QUALIDADE DE SOFTWARE";
    private String telefoneHome = "+55 11 3236-6600";

    @Dado("que estou na pagina inicial")
    public void que_estou_na_pagina_inicial() {
        if (homePage.visualizarPopupHomeOffice() == true) {
            assertEquals(homePage.visualizarPopupHomeOffice(), true);
            homePage.clicarBotaoFecharPopupHomeOffice();
        }
        assertEquals(homePage.obterTituloPagina(), (tituloPagina));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_inicial");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("eu navego pela pagina inicial")
    public void eu_navego_pela_pagina_inicial() {
        assertEquals(homePage.obterTituloContainerCimaHome(), ("Solidez de Mercado"));
        assertEquals(homePage.obterTextoContainerCimaHome(), ("Há mais de 19 anos trazendo as melhores e mais modernas soluções em testes de software."));
        assertEquals(homePage.obterTituloContainerCentralHome(), ("Resultado"));
        assertEquals(homePage.obterTextoContainerCentralHome(), ("Superar expectativas e garantir o sucesso do seu projeto é a nossa principal missão."));
        assertEquals(homePage.obterTituloContainerBaixoHome(), ("Tecnologia"));
        assertEquals(homePage.obterTextoContainerBaixoHome(), ("Extraindo o melhor dos recursos\n" +
                "tecnológicos para entregar um alto nível de qualidade."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_inicial");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("visualizo os tipos de testes")
    public void visualizo_os_tipos_de_testes() {
        assertEquals(homePage.obterTextoTestesAutomatizados(), ("Automatizados"));
        assertEquals(homePage.obterTextoFabricaTestes(), ("Fábrica"));
        assertEquals(homePage.obterTextoCrowdsourcedAuditeste(), ("Crowdsourced Auditeste"));
        assertEquals(homePage.obterTextoTestesManuais(), ("Manuais"));
        assertEquals(homePage.obterTextoConsultoriaTestes(), ("Consultoria"));
        assertEquals(homePage.obterTextoTestesMobile(), ("Mobile"));
        assertEquals(homePage.obterTextoTestesFuncionaisENaoFuncionais(), ("Testes Funcionais e Não Funcionais"));
        assertEquals(homePage.obterTextoAutomacaoDeProcessos(), ("Automação de Processos"));
        assertEquals(homePage.obterTextoAlocacaoProfissionaisEspecializados(), ("Alocação de Profissionais Especializados"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_os_tipos_de_testes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("visualizo as cases da auditeste")
    public void visualizo_as_cases_da_auditeste() {
        assertEquals(homePage.obterTituloCasesHome(), ("CASES"));
        assertEquals(homePage.obterSubtituloCasesHome(), ("Entenda o que fazemos através do sucesso de nossos clientes"));

        homePage.clicarSeletorPrimeiroDepoimentoCases();
        assertEquals(homePage.obterTextoPrimeiroDepoimentoCasesHome(),
                ("Gostaria de agradecer a dedicação e o atendimento prestados nesses 8 anos com a Tarifa Porto Seguro. O time é muito dedicado e ágil, sempre buscando nos atender da melhor forma. Os resultados que temos são muito satisfatórios e a Gestão da Silvia faz toda a diferença neste processo."));
        homePage.clicarSeletorPrimeiroDepoimentoCases();
        assertEquals(homePage.obterNomeClientePrimeiroDepoimentoCasesHome(), ("Vanessa Fiuza"));
        assertEquals(homePage.obterCargoEmpresaClientePrimeiroDepoimentoCasesHome(), ("Projeto Tarifa Auto - Porto Seguro"));

        homePage.clicarSeletorSegundoDepoimentoCases();
        assertEquals(homePage.obterTextoSegundoDepoimentoCasesHome(),
                ("Tivemos algumas experiências anteriores sem sucesso para automatização de testes em nossa aplicação. A Auditeste abraçou o desafio e provou que era possível. Em poucos meses, cobrimos com testes automatizados um parcela substancial dos processos de nosso software."));
        homePage.clicarSeletorSegundoDepoimentoCases();
        assertEquals(homePage.obterNomeClienteSegundoDepoimentoCasesHome(), ("Julio Souza"));
        assertEquals(homePage.obterCargoEmpresaClienteSegundoDepoimentoCasesHome(), ("Gerente de Produtos - Sistemas Seguros"));
        try {
            screenshot.capturarScreenshot("visualizo_quando_as_cases_da_auditeste");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("acesso o chatbot")
    public void acesso_o_chatbot() {
        homePage.clicarBotaoIniciarChatBot();
        homePage.clicarBotaoFecharChatBot();
    }

    @Entao("visualizo o rodape do site")
    public void visualizo_o_rodape_do_site() {
        assertEquals(rodape.obterTextoRodapeContato(), ("Contato"));
        assertEquals(rodape.obterTextoLinkRodapeTelefone(), (telefoneHome));
        assertEquals(rodape.obterTextoLinkRodapeUnidade(), ("Unidade Centro"));
        assertEquals(rodape.obterTextoLinkRodapeEndereco(), ("Av. Ipiranga, 344 – 9º andar República, São Paulo – SP"));
        assertEquals(rodape.obterTextoRodapeQuemSomos(), ("Quem Somos"));
        assertEquals(rodape.obterTextoLinkRodapeHistoria(), ("História"));
        assertEquals(rodape.obterTextoLinkRodapeMissaoVisaoEValores(), ("Missão, Visão e Valores"));
        assertEquals(rodape.obterTextoLinkRodapeNossosClientes(), ("Nossos Clientes"));
        assertEquals(rodape.obterTextoRodapeServicos(), ("Serviços"));
        assertEquals(rodape.obterTextoLinkRodapeFabricaDeTestes(), ("Fábrica de Testes;"));
        assertEquals(rodape.obterTextoLinkRodapeAutomatizacaoDeTestes(), ("Automatização de Testes;"));
        assertEquals(rodape.obterTextoLinkRodapeTestesMobile(), ("Testes Mobile"));
        assertEquals(rodape.obterTextoLinkRodapeTestesManuais(), ("Testes Manuais;"));
        assertEquals(rodape.obterTextoLinkRodapeTestesFuncionaisENaoFuncionais(), ("Testes Funcionais e Não Funcionais;"));
        assertEquals(rodape.obterTextoLinkRodapeAlocacaoDeProfissionais(), ("Alocação de Profissionais"));
        assertEquals(rodape.obterTextoLinkRodapeAutomacaoDeProcessos(), ("Automação de Processos"));
        assertEquals(rodape.obterTextoLinkRodapeCrowdsourcedAuditeste(), ("Crowdsourced Auditeste"));
        assertEquals(rodape.obterTextoLinkRodapeConsultoria(), ("Consultoria."));
        assertEquals(rodape.obterTextoLinkRodapeCasesDeSucesso(), ("Cases de Sucesso"));
        assertEquals(rodape.obterTextoLinkRodapeTrabalheConosco(), ("Trabalhe Conosco"));
        assertEquals(rodape.obterTextoLinkRodapeBlog(), ("Blog"));
        assertEquals(rodape.obterTextoLinkRodapeWebmail(), ("Webmail"));
        assertEquals(rodape.obterTextoRodapeContateNos(), ("Contate-nos"));
        assertEquals(rodape.obterTextoRodapeEmailMarketingAuditeste(), ("marketing@auditeste.com.br"));
        assertEquals(rodape.obterTextoRodapeCopyright(), ("Copyright © 2017 AudiTeste - Todos os direitos reservados."));
        try {
            screenshot.capturarScreenshot("entao_visualizo_o_rodape_do_site");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}