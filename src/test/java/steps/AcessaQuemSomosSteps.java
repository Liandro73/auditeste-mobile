package steps;

import common.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.PaginaInicial;
import pages.QuemSomos;
import util.Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaQuemSomosSteps extends Base {

    private Base base;
    private QuemSomos quemSomos;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaQuemSomosSteps(Base base) {
        this.base = base;
        quemSomos = new QuemSomos(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina quem somos")
    public void que_estou_na_pagina_quem_somos() {
        if (homePage.visualizarPopupHomeOffice() == true) {
            assertEquals(homePage.visualizarPopupHomeOffice(), true);
            homePage.clicarBotaoFecharPopupHomeOffice();
        }
        quemSomos.clicarBotaoMenuHamburger();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        quemSomos.clicarMenuItemQuemSomos();
        assertEquals(quemSomos.verificarSeEstaNaPaginaQuemSomos(), ("//QUEM SOMOS"));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_quem_somos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("eu navego pela pagina quem somos")
    public void eu_navego_pela_pagina_quem_somos() {
        assertEquals(quemSomos.obterTituloBugMilenio(), ("“BUG” DO MILÊNIO"));
        assertEquals(quemSomos.obterTexto1BugMilenio(), ("Com a chegada do século XX, o mundo enfrentava um momento de pânico, pois a entrada deste novo milênio representava uma grande ameaça em todos os cantos do planeta terra, pois traria a falência de empresas, queda de aviões, processos judiciais, pane em sistemas, enfim um grande caos e tudo isso devido a uma simples data abreviada."));
        assertEquals(quemSomos.obterTexto2BugMilenio(), ("Melhor explicando, os desenvolvedores dos anos 60 encontraram uma ótima solução para economizar bytes, que na época era extremamente caro e a solução era abreviar a data, mais especificamente o ano, ou seja, de 01/01/1900, passaria a ser interpretado como 01/01/00."));
        assertEquals(quemSomos.obterTexto3BugMilenio(), ("Porém os anos se passaram a tecnologia evoluiu e isso não era mais motivo de preocupação e principal fator de economia, passando a ser temido não só pelos próprios profissionais de T.I, mas também por empresários e toda população, simplesmente pelo fato do conflito entre os anos 1900 e 2000 em todos os sistemas que tivessem a tal data abreviada."));
        assertEquals(quemSomos.obterTituloBumTestesSoftware(), ("O “BUM” DOS TESTES DE SOFTWARE"));
        assertEquals(quemSomos.obterTexto1BumTestesSoftware(), ("Anos antes da chegada do novo milênio, o setor da tecnologia precisava estar preparado e certificado de que esta mudança não impactaria negativamente os sistemas e empresas do mundo."));
        assertEquals(quemSomos.obterTexto2BumTestesSoftware(), ("E isso só poderia ser garantido com os testes de software, que simularia os cenários futuros, buscando neutralizar riscos e certificar a qualidade de todos os sistemas e funcionalidades envolvidas."));
        assertEquals(quemSomos.obterTexto3BumTestesSoftware(), ("O que auxiliou e muito os desenvolvedores da época e fez com que a transição de um milênio para outro fosse totalmente o oposto das previsões."));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_quem_somos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("visualizo sobre a auditeste")
    public void visualizo_sobre_a_auditeste() {
        assertEquals(quemSomos.obterTextoSobreAuditeste(), ("A AUDITESTE"));
        assertEquals(quemSomos.obterTexto1SobreAuditeste(), ("Durante esta transição, José Antônio Gomes Ramos, que na época era um dos especialistas na área de testes de software de uma grande instituição financeira, contribuiu para que a passagem do milênio fosse um sucesso."));
        assertEquals(quemSomos.obterTexto2SobreAuditeste(), ("E por volta dos anos 2000, mais especificamente 07/05/2001, fundou a Auditeste, uma empresa totalmente focada em promover a qualidade de software, que até hoje se mantém como referência neste segmento."));
        assertEquals(quemSomos.obterTexto3SobreAuditeste(), ("Afinal conta com profissionais capacitados e certificados, com ferramentas customizadas conforme a necessidade do cliente, além de uma expertise que só a experiência, ética, parceria e amor pelo que faz podem oferecer."));
        assertEquals(quemSomos.obterTexto4SobreAuditeste(), ("CONHEÇA A AUDITESTE, A EMPRESA QUE NÃO SÓ ENTREGA QUALIDADE, MAS GARANTE O SUCESSO DO SEU PROJETO E A SATISFAÇÃO DE SEUS CLIENTES."));

        assertEquals(quemSomos.imgTituloMissaoAuditesteEstavisivel(), (true));
        assertEquals(quemSomos.obterTextoMissaoAuditeste(), ("Oferecer aos nossos clientes as melhores e mais modernas soluções no segmento de testes e certificação de software e demais aplicações, garantindo assim a qualidade, segurança e sucesso de seu projeto."));
        assertEquals(quemSomos.imgTituloVisaoAuditesteEstavisivel(), (true));
        assertEquals(quemSomos.obterTextoVisaoAuditeste(), ("Aliados à profissionais altamente capacitados e os mais modernos recursos tecnológicos, almejamos ser reconhecidos como preferência de nossos clientes e referência no mercado em nosso segmento de atuação."));
        assertEquals(quemSomos.imgTituloValoresAuditesteEstavisivel(), (true));
        assertEquals(quemSomos.obterTextoValoresAuditesteEtica(), ("Ética;"));
        assertEquals(quemSomos.obterTextoValoresAuditesteAgilidade(), ("Agilidade;"));
        assertEquals(quemSomos.obterTextoValoresAuditesteComprometimento(), ("Comprometimento;"));
        assertEquals(quemSomos.obterTextoValoresAuditesteRespeito(), ("Respeito;"));
        assertEquals(quemSomos.obterTextoValoresAuditesteQualidade(), ("Qualidade."));
        try {
            screenshot.capturarScreenshot("quando_visualizo_sobre_a_auditeste");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("visualizo os tipos de servicos")
    public void visualizo_os_tipos_de_servicos() {
        assertEquals(quemSomos.obterTituloServicos(), ("NOSSOS SERVIÇOS"));
        assertEquals(quemSomos.obterTextoServicosTestesAutomatizados(), ("Testes Automatizados"));
        assertEquals(quemSomos.obterTextoServicosFabricaTestes(), ("Fábrica de Testes"));
        assertEquals(quemSomos.obterTextoServicosTestesManuais(), ("Testes Manuais"));
        assertEquals(quemSomos.obterTextoServicosConsultoriaTestes(), ("Consultoria"));
        assertEquals(quemSomos.obterTextoServicosTestesMobile(), ("Testes Mobile"));
        assertEquals(quemSomos.obterTextoServicosTestesFuncionaisENaoFuncionais(), ("Testes Funcionais e Não Funcionais"));
        assertEquals(quemSomos.obterTextoServicosAlocacaoProfissionaisEspecializados(), ("Alocação de Profissionais Especializados"));
        assertEquals(quemSomos.obterTextoServicos(), ("Clique e entenda melhor cada serviço."));
        try {
            screenshot.capturarScreenshot("quando_visualizo_os_tipos_de_servicos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("visualizo as cases da auditeste quem somos")
    public void visualizo_as_cases_da_auditeste_quem_somos() {
        assertEquals(quemSomos.obterTituloCasesAuditeste(), ("CASES DE SUCESSO"));
        assertEquals(quemSomos.obterTextoCasesAuditeste(), ("Quer conferir os cases de clientes que tiveram os seus respectivos projetos com qualidade e sucesso garantidos? clique aqui"));
        try {
            screenshot.capturarScreenshot("entao_visualizo_as_cases_da_auditeste_quem_somos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}