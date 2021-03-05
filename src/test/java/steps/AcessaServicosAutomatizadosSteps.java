package steps;

import common.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import pages.PaginaInicial;
import pages.Servicos;
import util.Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaServicosAutomatizadosSteps extends Base {

    private Base base;
    private Servicos servicos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaServicosAutomatizadosSteps(Base base) {
        this.base = base;
        servicos = new Servicos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina servicos testes automatizados")
    public void que_estou_na_pagina_servicos_testes_automatizados() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        servicos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        servicos.clicarMenuItemServicos();
        servicos.clicarMenuBotaoMenuTestesAutomatizados();
        assertEquals(servicos.verificarSeEstaEmServicos().toUpperCase(), ("//TESTES AUTOMATIZADOS"));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_servicos_testes_automatizados");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("eu navego pela pagina servicos testes automatizados")
    public void eu_navego_pela_pagina_servicos_testes_automatizados() {
        assertEquals(servicos.obterTextoTestesAutomatizados(), ("Com o avanço tecnológico o quesito automação vem tomando novas proporções, sendo um grande e principal aliado no ganho de qualidade, no aumento de produção e principalmente na redução de custo. Nós da Auditeste sabemos e utilizamos da melhor maneira este segmento de testes, afinal a tecnologia pode ser maravilhosa, se tivermos o conhecimento necessário para utilizá-la ao nosso favor."));
        assertEquals(servicos.obterTituloHistoricoTestes(), ("HISTÓRICO DE SUCESSO"));
        assertEquals(servicos.obterHistoricoTestes(), ("Possuímos uma gama de soluções completas e personalizadas conforme as necessidades de nossos clientes e no quesito automação, temos uma abordagem de sucesso em diferentes setores:"));

        assertEquals(servicos.verificarImgHistoricoTestes(), (true));

        assertEquals(servicos.obterTituloPrincipaisBeneficios(), ("PRINCIPAIS BENEFÍCIOS"));
        assertEquals(servicos.obterTextoPrimeiroBeneficio(), ("Redução de erros humanos"));
        assertEquals(servicos.obterTextoSegundoBeneficio(), ("Aumento de produtividade"));
        assertEquals(servicos.obterTextoTerceiroBeneficio(), ("Otimização de Mão de Obra"));
        assertEquals(servicos.obterTextoQuartoBeneficio(), ("Otimização de custos"));
        assertEquals(servicos.obterTextoQuintoBeneficio(), ("Prazo menor para certificação"));
        assertEquals(servicos.obterTextoSextoBeneficio(), ("Integrações de sistemas sem modificação de código"));
        assertEquals(servicos.obterTextoSetimoBeneficio(), ("Maior quantidade de testes por 24h"));
        assertEquals(servicos.obterTextoOitavoBeneficio(), ("Garantia de armazenamento de dados utilizados, testes realizados e evidências"));
        assertEquals(servicos.obterTextoNonoBeneficio(), ("maior tempo para foco em projetos relevantes"));

        assertEquals(servicos.verificarImgTiposDeTeste(), (true));
        assertEquals(servicos.obterTituloTiposDeTeste(), ("TIPOS DE TESTE"));
        assertEquals(servicos.obterTextoTipoDeTesteRegressivoEProgressivo(), ("REGRESSIVOS E PROGRESSIVOS"));
        assertEquals(servicos.obterTextoTipoDeTesteFuncionais(), ("FUNCIONAIS"));
        assertEquals(servicos.obterTextoTipoDeTesteCarga(), ("CARGA"));
        assertEquals(servicos.obterTextoTipoDeTesteMonitoracao(), ("MONITORAÇÃO"));

        assertEquals(servicos.verificarImgFerramentasUtilizadas(), (true));
        assertEquals(servicos.obterTituloFerramentasUtilizadas(), ("FERRAMENTAS UTILIZADAS"));
        assertEquals(servicos.obterTextoFerramentaQuickTest(), ("QUICK TEST (HP)"));
        assertEquals(servicos.obterTextoFerramentaTestComplete(), ("TEST COMPLETE (SMARTBEAR)"));
        assertEquals(servicos.obterTextoFerramentaSilk4net(), ("SILK4NET"));
        assertEquals(servicos.obterTextoFerramentaRational(), ("RATIONAL (IBM)"));
        assertEquals(servicos.obterTextoFerramentaJmeter(), ("JMETER"));
        assertEquals(servicos.obterTextoFerramentaHPAlm(), ("HP-ALM (QUALITY CENTER)"));
        assertEquals(servicos.obterTextoFerramentaHOUtf(), ("HO UFT (HP QTP)"));
        assertEquals(servicos.obterTextoFerramentaSelenium(), ("SELENIUM WEBDRIVER"));
        assertEquals(servicos.obterTextoFerramentaTestLink(), ("TESTLINK"));
        assertEquals(servicos.obterTextoFerramentaMantisRuby(), ("MANTIS, RUBY (CUNCUMBER)"));
        assertEquals(servicos.obterTextoFerramentaMicrofocus(), ("MICROFOCUS (SILK CENTRAL)"));
        assertEquals(servicos.obterTextoFerramentaTestTFS(), ("TFS (TEAM FUNDATION SERVICE)"));
        assertEquals(servicos.obterTextoFerramentaCapybara(), ("CAPYBARA"));

        assertEquals(servicos.verificarImgTecnologiasTestadas(), (true));
        assertEquals(servicos.obterTituloTecnologiasTestadas(), ("TECNOLOGIAS TESTADAS"));
        assertEquals(servicos.obterTextoTipoDeTecnologiaTestadaWeb(), ("WEB"));
        assertEquals(servicos.obterTextoTipoDeTecnologiaTestadaDatabase(), ("DATABASE"));
        assertEquals(servicos.obterTextoTipoDeTecnologiaTestadaWindowsFrom(), ("WINDOWS FROM"));
        assertEquals(servicos.obterTextoTipoDeTecnologiaTestadaWebServices(), ("WEB SERVICES"));

        assertEquals(servicos.obterTituloGerenciadorAuditeste(), ("G.A."));
        assertEquals(servicos.obterTextoGerenciadorAuditeste(), ("O G.A. (Gerenciador Auditeste) é uma ferramenta desenvolvida exclusivamente para extrair o melhor que a automatização pode proporcionar, sendo essencial e principal aliada em alguns segmentos de atuação. Coordenando e direcionando criteriosamente os robôs executores, a ferramenta proporciona aos nossos clientes informações gerenciais em tempo real, tornando possível o acompanhamento e análise dos testes executados ou em andamento."));
        assertEquals(servicos.visualizarPrimeiraImgGerenciadorAuditeste(), (true));
        assertEquals(servicos.visualizarSegundaImgGerenciadorAuditeste(), (true));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_servicos_testes_automatizados");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("visualizo sobre a metodologia dos testes automatizados")
    public void visualizo_sobre_a_metodologia_dos_testes_automatizados() {
        assertEquals(servicos.obterTituloMetodologiaTestes(), ("METODOLOGIA DA REALIZAÇÃO DOS TESTES"));
        assertEquals(servicos.visualizarImgMetodologiaTestesPlanejamento(), (true));
        assertEquals(servicos.obterPrimeiroTextoMetodologiaTestesPlanejamento(), ("ARTEFATOS GERADOS"));
        assertEquals(servicos.obterSegundoTextoMetodologiaTestesPlanejamento(), ("Ata de Reunião"));
        assertEquals(servicos.obterTerceiroTextoMetodologiaTestesPlanejamento(), ("Entregáveis do Projeto"));
        assertEquals(servicos.obterQuartoTextoMetodologiaTestesPlanejamento(), ("Plano de Teste"));
        assertEquals(servicos.obterQuintoTextoMetodologiaTestesPlanejamento(), ("Análise de Impacto"));

        assertEquals(servicos.visualizarImgMetodologiaTestesEspecificacao(), (true));
        assertEquals(servicos.obterPrimeiroTextoMetodologiaTestesEspecificacao(), ("ARTEFATOS GERADOS"));
        assertEquals(servicos.obterSegundoTextoMetodologiaTestesEspecificacao(), ("Roteiro de Testes"));
        assertEquals(servicos.obterTerceiroTextoMetodologiaTestesEspecificacao(), ("Definição de Massa"));
        assertEquals(servicos.obterQuartoTextoMetodologiaTestesEspecificacao(), ("Solicitação de ambiente"));

        assertEquals(servicos.visualizarImgMetodologiaTestesExecucao(), (true));
        assertEquals(servicos.obterPrimeiroTextoMetodologiaTestesExecucao(), ("ARTEFATOS GERADOS"));
        assertEquals(servicos.obterSegundoTextoMetodologiaTestesExecucao(), ("Termo de Finalização"));
        assertEquals(servicos.obterTerceiroTextoMetodologiaTestesExecucao(), ("Status report (Não Funcional)"));
        assertEquals(servicos.obterQuartoTextoMetodologiaTestesExecucao(), ("Revisão"));
        assertEquals(servicos.obterQuintoTextoMetodologiaTestesExecucao(), ("Cenário"));
        assertEquals(servicos.obterSextoTextoMetodologiaTestesExecucao(), ("Relatório de Defeitos"));

        assertEquals(servicos.obterPrimeiroTextoMetodologiaTestes(), ("É importante que as atividades de testes comecem no início do ciclo de vida do desenvolvimento de software."));
        assertEquals(servicos.obterSegundoTextoMetodologiaTestes(), ("REQUISITOS NECESSÁRIOS"));
        assertEquals(servicos.obterTerceiroTextoMetodologiaTestes(), ("Sucesso de acesso aos ambientes"));
        assertEquals(servicos.obterQuartoTextoMetodologiaTestes(), ("Disponibilidade do ambiente de homologação"));
        assertEquals(servicos.obterQuintoTextoMetodologiaTestes(), ("Suporte à regras de negócio"));
        try {
            screenshot.capturarScreenshot("quando_visualizo_sobre_a_metodologia_dos_testes_testes_automatizados");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("visualizo as cases da auditeste servicos testes automatizados")
    public void visualizo_as_cases_da_auditeste_servicos_testes_automatizados() {
        assertEquals(servicos.obterTituloCasesAuditeste(), ("CASES DE SUCESSO"));
        assertEquals(servicos.obterTextoCasesAuditeste(), ("Quer conferir os cases de clientes que tiveram os seus respectivos projetos com qualidade e sucesso garantidos? clique aqui "));
        try {
            screenshot.capturarScreenshot("quando_visualizo_as_cases_da_auditeste_servicos_testes_automatizados");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}