package pages;

import common.Base;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Servicos extends Base {

    private Base base;

    //Itens Menu Hamburger
    private By botaoMenu = By.xpath("//button[contains(@class, 'navbar-toggle')]");
    private By botaoMenuServicos = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/span/i[2]");
    private By botaoMenuTestesAutomatizados = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[1]/a");
    private By botaoMenuTestesFuncionaisNaoFuncionais = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[2]/a");
    private By botaoMenuTestesManuais = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[3]/a");
    private By botaoMenuTestesMobile = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[4]/a");
    private By botaoMenuTestesFabricaDeTestes = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[5]/a");
    private By botaoMenuTestesConsultoria = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[6]/a");
    private By botaoMenuTestesCrowdsourced = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[7]/a");
    private By botaoMenuTestesAlocacaoDeProfissionais = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[8]/a");
    private By botaoMenuTestesAutomacaoDeProcessos = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[9]/a");

    public By tituloPagina = By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/h1");
    public By tituloPaginaAutomacaoDeProcessos = By.xpath("//h1[contains(@class, 'vc_custom_heading titulo_site')]");

    private By textoTestesAutomatizados = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/div/p");
    private By tituloHistoricoTestes = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/h2/b");
    private By textoHistoricoTestes = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[1]/div/p");
    private By imgHistoricoTestes = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[2]/div/p/img");
    private By tituloPrincipaisBeneficios = By.cssSelector("div.vc_row.wpb_row.vc_row-fluid.vc_custom_1506539402022 > div > div > div > div > h2 > b");
    private By textoPrimeiroBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[1]/div/div/div[1]/b");
    private By textoSegundoBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[1]/div/div/div[2]/b");
    private By textoTerceiroBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[1]/div/div/div[3]/b");
    private By textoQuartoBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[2]/div/div/div[1]/b");
    private By textoQuintoBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[2]/div/div/div[2]/b");
    private By textoSextoBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[2]/div/div/div[3]/b");
    private By textoSetimoBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[3]/div/div/div[1]/b");
    private By textoOitavoBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[3]/div/div/div[2]/b");
    private By textoNonoBeneficio = By.xpath("//*[@id=\"wrapper\"]/div[5]/div/div[3]/div/div/div[3]/b");

    //Tipos de Testes
    private By imgTiposDeTeste = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[1]/div/div/b/div[1]/figure/div/img");
    private By tituloTiposDeTeste = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[1]/div/div/b/h2/b");
    private By tipoDeTesteRegressivoEProgressivo = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[1]/div/div/b/div[2]");
    private By tipoDeTesteFuncionais = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[1]/div/div/b/div[3]");
    private By tipoDeTesteCarga = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[1]/div/div/b/div[4]");
    private By tipoDeTesteMonitoracao = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[1]/div/div/b/div[5]");
    //Ferramentas
    private By imgFerramentasUtilizadas = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[1]/figure/div/img");
    private By tituloFerramentasUtilizadas = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/h2/b");
    private By textoFerramentaQuickTest = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[2]");
    private By textoFerramentaTestComplete = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[3]");
    private By textoFerramentaSilk4net = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[4]");
    private By textoFerramentaRational = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[5]");
    private By textoFerramentaJmeter = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[6]");
    private By textoFerramentaHPAlm = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[7]");
    private By textoFerramentaHOUtf = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[8]");
    private By textoFerramentaSelenium = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[9]");
    private By textoFerramentaTestLink = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[10]");
    private By textoFerramentaMantisRuby = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[11]");
    private By textoFerramentaMicrofocus = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[12]");
    private By textoFerramentaTFS = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[13]");
    private By textoFerramentaCapybara = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[2]/div/div/b/div[14]");
    //Tecnologias Testadas
    private By imgTecnologiasTestadas = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[3]/div/div/b/div[1]/figure/div/img");
    private By tituloTecnologiasTestadas = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[3]/div/div/b/h2/b");
    private By tipoDeTecnologiaTestadaWeb = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[3]/div/div/b/div[2]");
    private By tipoDeTecnologiaTestadaDatabase = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[3]/div/div/b/div[3]");
    private By tipoDeTecnologiaTestadaWindowsFrom = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[3]/div/div/b/div[4]");
    private By tipoDeTecnologiaTestadaWebServices = By.xpath("//*[@id=\"wrapper\"]/div[7]/div/div[3]/div/div/b/div[5]");
    //Gerenciador Auditeste
    private By tituloGerenciadorAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[8]/div/div/div/div/h2/b");
    private By textoGerenciadorAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[8]/div/div/div/div/div[2]/div/p[2]");
    private By primeiraImgGerenciadorAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[9]/div/div[1]/div/div/div/div/p/img");
    private By segundaImgGerenciadorAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[9]/div/div[2]/div/div/div/div/p/img");
    //Metodologia da Realização dos Testes
    private By tituloMetodologiaTestes = By.xpath("//*[@id=\"wrapper\"]/div[10]/div/div[2]/div/div/h2/b");
    private By imgMetodologiaTestesPlanejamento = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[1]/div/div/div[1]/div/p/img");
    private By primeiroTextoMetodologiaTestesPlanejamento = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[1]/div/div/h2/b");
    private By segundoTextoMetodologiaTestesPlanejamento = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[1]/div/div/div[2]");
    private By terceiroTextoMetodologiaTestesPlanejamento = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[1]/div/div/div[3]");
    private By quartoTextoMetodologiaTestesPlanejamento = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[1]/div/div/div[4]");
    private By quintoTextoMetodologiaTestesPlanejamento = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[1]/div/div/div[5]");
    private By imgMetodologiaTestesEspecificacao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[2]/div/div/div[1]/div/p/img");
    private By primeiroTextoMetodologiaTestesEspecificacao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[2]/div/div/h2/b");
    private By segundoTextoMetodologiaTestesEspecificacao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[2]/div/div/div[2]");
    private By terceiroTextoMetodologiaTestesEspecificacao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[2]/div/div/div[3]");
    private By quartoTextoMetodologiaTestesEspecificacao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[2]/div/div/div[4]");
    private By imgMetodologiaTestesExecucao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[3]/div/div/div[1]/div/p/img");
    private By primeiroTextoMetodologiaTestesExecucao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[3]/div/div/h2/b");
    private By segundoTextoMetodologiaTestesExecucao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[3]/div/div/div[2]");
    private By terceiroTextoMetodologiaTestesExecucao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[3]/div/div/div[3]");
    private By quartoTextoMetodologiaTestesExecucao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[3]/div/div/div[4]");
    private By quintoTextoMetodologiaTestesExecucao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[3]/div/div/div[5]");
    private By sextoTextoMetodologiaTestesExecucao = By.xpath("//*[@id=\"wrapper\"]/div[11]/div/div[3]/div/div/div[6]");
    private By primeiroTextoMetodologiaTestes = By.xpath("//*[@id=\"wrapper\"]/div[12]/div/div/div/div/div[2]/div/p");
    private By segundoTextoMetodologiaTestes = By.xpath("//*[@id=\"wrapper\"]/div[12]/div/div/div/div/h2/b");
    private By terceiroTextoMetodologiaTestes = By.xpath("//*[@id=\"wrapper\"]/div[13]/div/div[1]/div/div/h3");
    private By quartoTextoMetodologiaTestes = By.xpath("//*[@id=\"wrapper\"]/div[13]/div/div[2]/div/div/h3");
    private By quintoTextoMetodologiaTestes = By.xpath("//*[@id=\"wrapper\"]/div[13]/div/div[3]/div/div/h3");

    //Serviços
    private By linkRodapeFabricaDeTestes = By.cssSelector("#links-rodape > div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(1)");
    private By linkRodapeTestesMobile = By.cssSelector("#links-rodape > div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(5)");
    private By linkRodapeTestesManuais = By.cssSelector("#links-rodape > div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(7)");
    private By linkRodapeTestesFuncionaisENaoFuncionais = By.xpath("//*[@id=\"links-rodape\"]/div/div[3]/div/div/div[3]/div/p/a[7]");
    private By linkRodapeAlocacaoDeProfissionais = By.cssSelector("#links-rodape > div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(11)");
    private By linkRodapeAutomacaoDeProcessos = By.cssSelector("#links-rodape > div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(13)");
    private By linkRodapeCrowdsourcedAuditeste = By.cssSelector("#links-rodape > div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(15)");
    private By linkRodapeConsultoria = By.cssSelector("#links-rodape > div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(17)");
    //Cases Auditeste
    private By tituloCasesAuditeste = By.cssSelector("div.vc_row.wpb_row.vc_row-fluid.vc_custom_1506639848877 > div > div > div > div > h2 > b");
    private By textoCasesAuditeste = By.cssSelector("div.vc_row.wpb_row.vc_row-fluid.vc_custom_1506639848877 > div > div > div > div > div > div > p");

    //Funcionais e Não Funcionais
    private By tituloTestesFuncionais = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/h2[1]/b");
    private By textoTestesFuncionais = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/div/p");
    private By tituloTestesNaoFuncionais = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/h2[2]/b");
    private By textoTestesNaoFuncionais = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[4]/div/p");

    //Manuais
    private By textoTestesManuais = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/div/p[1]");
    private By segundoTextoTestesManuais = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/div/p[2]");

    //Mobile
    private By textoTestesMobile = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/div/p");
    private By tituloTestesMobile = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/h2/b");
    private By primeiroTextoTestesMobile = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[2]/div/p[1]");
    private By segundoTextoTestesMobile = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[2]/div/p[2]");

    //Fábrica de Testes
    private By tituloTestesFabricaTestes = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/h2/b");
    private By primeiroTextoFabricaTestes = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div/div/p[1]");
    private By segundoTextoFabricaTestes = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div/div/p[2]");
    private By terceiroTextoFabricaTestes = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div/div/p[3]");

    //Consultoria
    private By primeiroTextoConsultoria = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/div/p[1]");
    private By segundoTextoConsultoria = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/div/p[2]");

    //Crowdsourced Auditeste
    private By botaoAcesseJaCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[1]/div[3]/div/div/div/a");
    private By botaoCadastreSeCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[1]/div[4]/div/div/div/a");
    private By primeiroTextoCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[3]/div/p[1]");
    private By segundoTextoCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[3]/div/p[2]");
    private By terceiroTextoCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[3]/div/p[3]");
    private By quartoTextoCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[3]/div/p[4]");
    private By tituloCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/h2/b");
    private By quintoTextoCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[1]/div/p");
    private By sextoTextoCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[2]");
    private By setimoTextoCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[3]");

    //Alocação de profissionais
    private By primeiroTextoAlocacaoProfissionais = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]/div/p");
    private By tituloBeneficioAlocacaoProfissionais = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div/strong");
    private By textoPrimeiroBeneficioAlocacaoProfissionais = By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[1]/div/div/div");
    private By textoSegundoBeneficioAlocacaoProfissionais = By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[2]/div/div/div");
    private By textoTerceiroBeneficioAlocacaoProfissionais = By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[3]/div/div/div[1]");

    //Automação de processos
    private By primeiroTextoAutomacaoProcessos = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/p[1]");
    private By segundoTextoAutomacaoProcessos = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/p[2]");
    private By terceiroTextoAutomacaoProcessos = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/p[3]");

    public Servicos(Base base) {
        this.base = base;
    }

    public void clicarBotaoMenuHamburger() {
        base.driver.findElement(botaoMenu).click();
    }

    public void clicarMenuItemServicos() {
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        base.driver.findElement(botaoMenuServicos).click();
    }

    public void clicarMenuBotaoMenuTestesAutomatizados() {
        base.driver.findElement(botaoMenuTestesAutomatizados).click();
    }

    public void clicarMenuBotaoMenuTestesFuncionaisNaoFuncionais() {
        base.driver.findElement(botaoMenuTestesFuncionaisNaoFuncionais).click();
    }

    public void clicarMenuBotaoMenuTestesManuais() {
        base.driver.findElement(botaoMenuTestesManuais).click();
    }

    public void clicarMenuBotaoMenuTestesMobile() {
        base.driver.findElement(botaoMenuTestesMobile).click();
    }

    public void clicarMenuBotaoMenuFabricaDeTestes() {
        base.driver.findElement(botaoMenuTestesFabricaDeTestes).click();
    }

    public void clicarMenuBotaoMenuTestesConsultoria() {
        base.driver.findElement(botaoMenuTestesConsultoria).click();
    }

    public void clicarMenuBotaoMenuTestesCrowdsourced() {
        base.driver.findElement(botaoMenuTestesCrowdsourced).click();
    }

    public void clicarMenuBotaoMenuTestesAlocacaoDeProfissionais() {
        base.driver.findElement(botaoMenuTestesAlocacaoDeProfissionais).click();
    }

    public void clicarMenuBotaoMenuTestesAutomacaoDeProcessos() {
        base.driver.findElement(botaoMenuTestesAutomacaoDeProcessos).click();
    }

    public String verificarSeEstaEmServicos() {
        return base.driver.findElement(tituloPagina).getText();
    }

    public String verificarSeEstaEmAutomacaoDeProcessos() {
        return base.driver.findElement(tituloPaginaAutomacaoDeProcessos).getText();
    }

    public String obterTextoTestesAutomatizados() {
        return base.driver.findElement(textoTestesAutomatizados).getText();
    }

    public String obterTituloHistoricoTestes() {
        return base.driver.findElement(tituloHistoricoTestes).getText();
    }

    public String obterHistoricoTestes() {
        return base.driver.findElement(textoHistoricoTestes).getText();
    }

    public boolean verificarImgHistoricoTestes() {
        return base.driver.findElement(imgHistoricoTestes).isDisplayed();
    }

    public String obterTituloPrincipaisBeneficios() {
        return base.driver.findElement(tituloPrincipaisBeneficios).getText();
    }

    public String obterTextoPrimeiroBeneficio() {
        return base.driver.findElement(textoPrimeiroBeneficio).getText();
    }

    public String obterTextoSegundoBeneficio() {
        return base.driver.findElement(textoSegundoBeneficio).getText();
    }

    public String obterTextoTerceiroBeneficio() {
        return base.driver.findElement(textoTerceiroBeneficio).getText();
    }

    public String obterTextoQuartoBeneficio() {
        return base.driver.findElement(textoQuartoBeneficio).getText();
    }

    public String obterTextoQuintoBeneficio() {
        return base.driver.findElement(textoQuintoBeneficio).getText();
    }

    public String obterTextoSextoBeneficio() {
        return base.driver.findElement(textoSextoBeneficio).getText();
    }

    public String obterTextoSetimoBeneficio() {
        return base.driver.findElement(textoSetimoBeneficio).getText();
    }

    public String obterTextoOitavoBeneficio() {
        return base.driver.findElement(textoOitavoBeneficio).getText();
    }

    public String obterTextoNonoBeneficio() {
        return base.driver.findElement(textoNonoBeneficio).getText();
    }

    public boolean verificarImgTiposDeTeste() {
        return base.driver.findElement(imgTiposDeTeste).isDisplayed();
    }

    public String obterTituloTiposDeTeste() {
        return base.driver.findElement(tituloTiposDeTeste).getText();
    }

    public String obterTextoTipoDeTesteRegressivoEProgressivo() {
        return base.driver.findElement(tipoDeTesteRegressivoEProgressivo).getText();
    }

    public String obterTextoTipoDeTesteFuncionais() {
        return base.driver.findElement(tipoDeTesteFuncionais).getText();
    }

    public String obterTextoTipoDeTesteCarga() {
        return base.driver.findElement(tipoDeTesteCarga).getText();
    }

    public String obterTextoTipoDeTesteMonitoracao() {
        return base.driver.findElement(tipoDeTesteMonitoracao).getText();
    }

    public boolean verificarImgFerramentasUtilizadas() {
        return base.driver.findElement(imgFerramentasUtilizadas).isDisplayed();
    }

    public String obterTituloFerramentasUtilizadas() {
        return base.driver.findElement(tituloFerramentasUtilizadas).getText();
    }

    public String obterTextoFerramentaQuickTest() {
        return base.driver.findElement(textoFerramentaQuickTest).getText();
    }

    public String obterTextoFerramentaTestComplete() {
        return base.driver.findElement(textoFerramentaTestComplete).getText();
    }

    public String obterTextoFerramentaSilk4net() {
        return base.driver.findElement(textoFerramentaSilk4net).getText();
    }

    public String obterTextoFerramentaRational() {
        return base.driver.findElement(textoFerramentaRational).getText();
    }

    public String obterTextoFerramentaJmeter() {
        return base.driver.findElement(textoFerramentaJmeter).getText();
    }

    public String obterTextoFerramentaHPAlm() {
        return base.driver.findElement(textoFerramentaHPAlm).getText();
    }

    public String obterTextoFerramentaHOUtf() {
        return base.driver.findElement(textoFerramentaHOUtf).getText();
    }

    public String obterTextoFerramentaSelenium() {
        return base.driver.findElement(textoFerramentaSelenium).getText();
    }

    public String obterTextoFerramentaTestLink() {
        return base.driver.findElement(textoFerramentaTestLink).getText();
    }

    public String obterTextoFerramentaMantisRuby() {
        return base.driver.findElement(textoFerramentaMantisRuby).getText();
    }

    public String obterTextoFerramentaMicrofocus() {
        return base.driver.findElement(textoFerramentaMicrofocus).getText();
    }

    public String obterTextoFerramentaTestTFS() {
        return base.driver.findElement(textoFerramentaTFS).getText();
    }

    public String obterTextoFerramentaCapybara() {
        return base.driver.findElement(textoFerramentaCapybara).getText();
    }

    public boolean verificarImgTecnologiasTestadas() {
        return base.driver.findElement(imgTecnologiasTestadas).isDisplayed();
    }

    public String obterTituloTecnologiasTestadas() {
        return base.driver.findElement(tituloTecnologiasTestadas).getText();
    }

    public String obterTextoTipoDeTecnologiaTestadaWeb() {
        return base.driver.findElement(tipoDeTecnologiaTestadaWeb).getText();
    }

    public String obterTextoTipoDeTecnologiaTestadaDatabase() {
        return base.driver.findElement(tipoDeTecnologiaTestadaDatabase).getText();
    }

    public String obterTextoTipoDeTecnologiaTestadaWindowsFrom() {
        return base.driver.findElement(tipoDeTecnologiaTestadaWindowsFrom).getText();
    }

    public String obterTextoTipoDeTecnologiaTestadaWebServices() {
        return base.driver.findElement(tipoDeTecnologiaTestadaWebServices).getText();
    }

    public String obterTituloGerenciadorAuditeste() {
        return base.driver.findElement(tituloGerenciadorAuditeste).getText();
    }

    public String obterTextoGerenciadorAuditeste() {
        return base.driver.findElement(textoGerenciadorAuditeste).getText();
    }

    public boolean visualizarPrimeiraImgGerenciadorAuditeste() {
        return base.driver.findElement(primeiraImgGerenciadorAuditeste).isDisplayed();
    }

    public boolean visualizarSegundaImgGerenciadorAuditeste() {
        return base.driver.findElement(segundaImgGerenciadorAuditeste).isDisplayed();
    }

    public String obterTituloMetodologiaTestes() {
        return base.driver.findElement(tituloMetodologiaTestes).getText();
    }

    public boolean visualizarImgMetodologiaTestesPlanejamento() {
        return base.driver.findElement(imgMetodologiaTestesPlanejamento).isDisplayed();
    }

    public String obterPrimeiroTextoMetodologiaTestesPlanejamento() {
        return base.driver.findElement(primeiroTextoMetodologiaTestesPlanejamento).getText();
    }

    public String obterSegundoTextoMetodologiaTestesPlanejamento() {
        return base.driver.findElement(segundoTextoMetodologiaTestesPlanejamento).getText();
    }

    public String obterTerceiroTextoMetodologiaTestesPlanejamento() {
        return base.driver.findElement(terceiroTextoMetodologiaTestesPlanejamento).getText();
    }

    public String obterQuartoTextoMetodologiaTestesPlanejamento() {
        return base.driver.findElement(quartoTextoMetodologiaTestesPlanejamento).getText();
    }

    public String obterQuintoTextoMetodologiaTestesPlanejamento() {
        return base.driver.findElement(quintoTextoMetodologiaTestesPlanejamento).getText();
    }

    public boolean visualizarImgMetodologiaTestesEspecificacao() {
        return base.driver.findElement(imgMetodologiaTestesEspecificacao).isDisplayed();
    }

    public String obterPrimeiroTextoMetodologiaTestesEspecificacao() {
        return base.driver.findElement(primeiroTextoMetodologiaTestesEspecificacao).getText();
    }

    public String obterSegundoTextoMetodologiaTestesEspecificacao() {
        return base.driver.findElement(segundoTextoMetodologiaTestesEspecificacao).getText();
    }

    public String obterTerceiroTextoMetodologiaTestesEspecificacao() {
        return base.driver.findElement(terceiroTextoMetodologiaTestesEspecificacao).getText();
    }

    public String obterQuartoTextoMetodologiaTestesEspecificacao() {
        return base.driver.findElement(quartoTextoMetodologiaTestesEspecificacao).getText();
    }

    public boolean visualizarImgMetodologiaTestesExecucao() {
        return base.driver.findElement(imgMetodologiaTestesExecucao).isDisplayed();
    }

    public String obterPrimeiroTextoMetodologiaTestesExecucao() {
        return base.driver.findElement(primeiroTextoMetodologiaTestesExecucao).getText();
    }

    public String obterSegundoTextoMetodologiaTestesExecucao() {
        return base.driver.findElement(segundoTextoMetodologiaTestesExecucao).getText();
    }

    public String obterTerceiroTextoMetodologiaTestesExecucao() {
        return base.driver.findElement(terceiroTextoMetodologiaTestesExecucao).getText();
    }

    public String obterQuartoTextoMetodologiaTestesExecucao() {
        return base.driver.findElement(quartoTextoMetodologiaTestesExecucao).getText();
    }

    public String obterQuintoTextoMetodologiaTestesExecucao() {
        return base.driver.findElement(quintoTextoMetodologiaTestesExecucao).getText();
    }

    public String obterSextoTextoMetodologiaTestesExecucao() {
        return base.driver.findElement(sextoTextoMetodologiaTestesExecucao).getText();
    }

    public String obterPrimeiroTextoMetodologiaTestes() {
        return base.driver.findElement(primeiroTextoMetodologiaTestes).getText();
    }

    public String obterSegundoTextoMetodologiaTestes() {
        return base.driver.findElement(segundoTextoMetodologiaTestes).getText();
    }

    public String obterTerceiroTextoMetodologiaTestes() {
        return base.driver.findElement(terceiroTextoMetodologiaTestes).getText();
    }

    public String obterQuartoTextoMetodologiaTestes() {
        return base.driver.findElement(quartoTextoMetodologiaTestes).getText();
    }

    public String obterQuintoTextoMetodologiaTestes() {
        return base.driver.findElement(quintoTextoMetodologiaTestes).getText();
    }

    public String obterTituloCasesAuditeste() {
        return base.driver.findElement(tituloCasesAuditeste).getText();
    }

    public String obterTextoCasesAuditeste() {
        return base.driver.findElement(textoCasesAuditeste).getText();
    }

    public String obterTituloTestesFuncionais() {
        return base.driver.findElement(tituloTestesFuncionais).getText();
    }

    public String obterTextoTestesFuncionais() {
        return base.driver.findElement(textoTestesFuncionais).getText();
    }

    public String obterTituloTestesNaoFuncionais() {
        return base.driver.findElement(tituloTestesNaoFuncionais).getText();
    }

    public String obterTextoTestesNaoFuncionais() {
        return base.driver.findElement(textoTestesNaoFuncionais).getText();
    }

    public String obterTextoTestesManuais() {
        return base.driver.findElement(textoTestesManuais).getText();
    }

    public String obterSegundoTextoTestesManuais() {
        return base.driver.findElement(segundoTextoTestesManuais).getText();
    }

    public String obterTextoTestesMobile() {
        return base.driver.findElement(textoTestesMobile).getText();
    }

    public String obterTituloTestesMobile() {
        return base.driver.findElement(tituloTestesMobile).getText();
    }

    public String obterPrimeiroTextoTestesMobile() {
        return base.driver.findElement(primeiroTextoTestesMobile).getText();
    }

    public String obterSegundoTextoTestesMobile() {
        return base.driver.findElement(segundoTextoTestesMobile).getText();
    }

    public String obterTituloTestesFabricaTestes() {
        return base.driver.findElement(tituloTestesFabricaTestes).getText();
    }

    public String obterPrimeiroTextoFabricaTestes() {
        return base.driver.findElement(primeiroTextoFabricaTestes).getText();
    }

    public String obterSegundoTextoFabricaTestes() {
        return base.driver.findElement(segundoTextoFabricaTestes).getText();
    }

    public String obterTerceiroTextoFabricaTestes() {
        return base.driver.findElement(terceiroTextoFabricaTestes).getText();
    }

    public String obterPrimeiroTextoConsultoria() {
        return base.driver.findElement(primeiroTextoConsultoria).getText();
    }

    public String obterSegundoTextoConsultoria() {
        return base.driver.findElement(segundoTextoConsultoria).getText();
    }

    public String obterTextoBotaoAcesseJaCrowdsourced() {
        return base.driver.findElement(botaoAcesseJaCrowdsourced).getText();
    }

    public String obterTextoBotaoCadastreSeCrowdsourced() {
        return base.driver.findElement(botaoCadastreSeCrowdsourced).getText();
    }

    public String obterPrimeiroTextoCrowdsourced() {
        return base.driver.findElement(primeiroTextoCrowdsourced).getText();
    }

    public String obterSegundoTextoCrowdsourced() {
        return base.driver.findElement(segundoTextoCrowdsourced).getText();
    }

    public String obterTerceiroTextoCrowdsourced() {
        return base.driver.findElement(terceiroTextoCrowdsourced).getText();
    }

    public String obterQuartoTextoCrowdsourced() {
        return base.driver.findElement(quartoTextoCrowdsourced).getText();
    }

    public String obterTituloCrowdsourced() {
        return base.driver.findElement(tituloCrowdsourced).getText();
    }

    public String obterQuintoTextoCrowdsourced() {
        return base.driver.findElement(quintoTextoCrowdsourced).getText();
    }

    public String obterSextoTextoCrowdsourced() {
        return base.driver.findElement(sextoTextoCrowdsourced).getText();
    }

    public String obterSetimoTextoCrowdsourced() {
        return base.driver.findElement(setimoTextoCrowdsourced).getText();
    }

    public String obterPrimeiroTextoAlocacaoProfissionais() {
        return base.driver.findElement(primeiroTextoAlocacaoProfissionais).getText();
    }

    public String obterTituloBeneficioAlocacaoProfissionais() {
        return base.driver.findElement(tituloBeneficioAlocacaoProfissionais).getText();
    }

    public String obterTextoPrimeiroBeneficioAlocacaoProfissionais() {
        return base.driver.findElement(textoPrimeiroBeneficioAlocacaoProfissionais).getText();
    }

    public String obterTextoSegundoBeneficioAlocacaoProfissionais() {
        return base.driver.findElement(textoSegundoBeneficioAlocacaoProfissionais).getText();
    }

    public String obterTextoTerceiroBeneficioAlocacaoProfissionais() {
        return base.driver.findElement(textoTerceiroBeneficioAlocacaoProfissionais).getText();
    }

    public String obterPrimeiroTextoAutomacaoProcessos() {
        return base.driver.findElement(primeiroTextoAutomacaoProcessos).getText();
    }

    public String obterSegundoTextoAutomacaoProcessos() {
        return base.driver.findElement(segundoTextoAutomacaoProcessos).getText();
    }

    public String obterTerceiroTextoAutomacaoProcessos() {
        return base.driver.findElement(terceiroTextoAutomacaoProcessos).getText();
    }

}