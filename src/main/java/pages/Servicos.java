package pages;

import org.openqa.selenium.*;

public class Servicos {

    private WebDriver driver;

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
    public By tituloPaginaAutomacaoDeProcessos = By.cssSelector("//h1[contains(@class, 'vc_custom_heading titulo_site')]");

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

    public Servicos(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotaoMenuHamburger() {
        driver.findElement(botaoMenu).click();
    }

    public void clicarMenuItemServicos() {
        driver.findElement(botaoMenuServicos).click();
    }

    public void clicarMenuBotaoMenuTestesAutomatizados() {
        driver.findElement(botaoMenuTestesAutomatizados).click();
    }

    public void clicarMenuBotaoMenuTestesFuncionaisNaoFuncionais() {
        driver.findElement(botaoMenuTestesFuncionaisNaoFuncionais).click();
    }

    public void clicarMenuBotaoMenuTestesManuais() {
        driver.findElement(botaoMenuTestesManuais).click();
    }

    public void clicarMenuBotaoMenuTestesMobile() {
        driver.findElement(botaoMenuTestesMobile).click();
    }

    public void clicarMenuBotaoMenuFabricaDeTestes() {
        driver.findElement(botaoMenuTestesFabricaDeTestes).click();
    }

    public void clicarMenuBotaoMenuTestesConsultoria() {
        driver.findElement(botaoMenuTestesConsultoria).click();
    }

    public void clicarMenuBotaoMenuTestesCrowdsourced() {
        driver.findElement(botaoMenuTestesCrowdsourced).click();
    }

    public void clicarMenuBotaoMenuTestesAlocacaoDeProfissionais() {
        driver.findElement(botaoMenuTestesAlocacaoDeProfissionais).click();
    }

    public void clicarMenuBotaoMenuTestesAutomacaoDeProcessos() {
        driver.findElement(botaoMenuTestesAutomacaoDeProcessos).click();
    }

    public String verificarSeEstaEmServicos() {
        return driver.findElement(tituloPagina).getText();
    }

    public String verificarSeEstaEmAutomacaoDeProcessos() {
        return driver.findElement(tituloPaginaAutomacaoDeProcessos).getText();
    }

    public String obterTextoTestesAutomatizados() {
        return driver.findElement(textoTestesAutomatizados).getText();
    }

    public String obterTituloHistoricoTestes() {
        return driver.findElement(tituloHistoricoTestes).getText();
    }

    public String obterHistoricoTestes() {
        return driver.findElement(textoHistoricoTestes).getText();
    }

    public boolean verificarImgHistoricoTestes() {
        return driver.findElement(imgHistoricoTestes).isDisplayed();
    }

    public String obterTituloPrincipaisBeneficios() {
        return driver.findElement(tituloPrincipaisBeneficios).getText();
    }

    public String obterTextoPrimeiroBeneficio() {
        return driver.findElement(textoPrimeiroBeneficio).getText();
    }

    public String obterTextoSegundoBeneficio() {
        return driver.findElement(textoSegundoBeneficio).getText();
    }

    public String obterTextoTerceiroBeneficio() {
        return driver.findElement(textoTerceiroBeneficio).getText();
    }

    public String obterTextoQuartoBeneficio() {
        return driver.findElement(textoQuartoBeneficio).getText();
    }

    public String obterTextoQuintoBeneficio() {
        return driver.findElement(textoQuintoBeneficio).getText();
    }

    public String obterTextoSextoBeneficio() {
        return driver.findElement(textoSextoBeneficio).getText();
    }

    public String obterTextoSetimoBeneficio() {
        return driver.findElement(textoSetimoBeneficio).getText();
    }

    public String obterTextoOitavoBeneficio() {
        return driver.findElement(textoOitavoBeneficio).getText();
    }

    public String obterTextoNonoBeneficio() {
        return driver.findElement(textoNonoBeneficio).getText();
    }

    public boolean verificarImgTiposDeTeste() {
        return driver.findElement(imgTiposDeTeste).isDisplayed();
    }

    public String obterTituloTiposDeTeste() {
        return driver.findElement(tituloTiposDeTeste).getText();
    }

    public String obterTextoTipoDeTesteRegressivoEProgressivo() {
        return driver.findElement(tipoDeTesteRegressivoEProgressivo).getText();
    }

    public String obterTextoTipoDeTesteFuncionais() {
        return driver.findElement(tipoDeTesteFuncionais).getText();
    }

    public String obterTextoTipoDeTesteCarga() {
        return driver.findElement(tipoDeTesteCarga).getText();
    }

    public String obterTextoTipoDeTesteMonitoracao() {
        return driver.findElement(tipoDeTesteMonitoracao).getText();
    }

    public boolean verificarImgFerramentasUtilizadas() {
        return driver.findElement(imgFerramentasUtilizadas).isDisplayed();
    }

    public String obterTituloFerramentasUtilizadas() {
        return driver.findElement(tituloFerramentasUtilizadas).getText();
    }

    public String obterTextoFerramentaQuickTest() {
        return driver.findElement(textoFerramentaQuickTest).getText();
    }

    public String obterTextoFerramentaTestComplete() {
        return driver.findElement(textoFerramentaTestComplete).getText();
    }

    public String obterTextoFerramentaSilk4net() {
        return driver.findElement(textoFerramentaSilk4net).getText();
    }

    public String obterTextoFerramentaRational() {
        return driver.findElement(textoFerramentaRational).getText();
    }

    public String obterTextoFerramentaJmeter() {
        return driver.findElement(textoFerramentaJmeter).getText();
    }

    public String obterTextoFerramentaHPAlm() {
        return driver.findElement(textoFerramentaHPAlm).getText();
    }

    public String obterTextoFerramentaHOUtf() {
        return driver.findElement(textoFerramentaHOUtf).getText();
    }

    public String obterTextoFerramentaSelenium() {
        return driver.findElement(textoFerramentaSelenium).getText();
    }

    public String obterTextoFerramentaTestLink() {
        return driver.findElement(textoFerramentaTestLink).getText();
    }

    public String obterTextoFerramentaMantisRuby() {
        return driver.findElement(textoFerramentaMantisRuby).getText();
    }

    public String obterTextoFerramentaMicrofocus() {
        return driver.findElement(textoFerramentaMicrofocus).getText();
    }

    public String obterTextoFerramentaTestTFS() {
        return driver.findElement(textoFerramentaTFS).getText();
    }

    public String obterTextoFerramentaCapybara() {
        return driver.findElement(textoFerramentaCapybara).getText();
    }

    public boolean verificarImgTecnologiasTestadas() {
        return driver.findElement(imgTecnologiasTestadas).isDisplayed();
    }

    public String obterTituloTecnologiasTestadas() {
        return driver.findElement(tituloTecnologiasTestadas).getText();
    }

    public String obterTextoTipoDeTecnologiaTestadaWeb() {
        return driver.findElement(tipoDeTecnologiaTestadaWeb).getText();
    }

    public String obterTextoTipoDeTecnologiaTestadaDatabase() {
        return driver.findElement(tipoDeTecnologiaTestadaDatabase).getText();
    }

    public String obterTextoTipoDeTecnologiaTestadaWindowsFrom() {
        return driver.findElement(tipoDeTecnologiaTestadaWindowsFrom).getText();
    }

    public String obterTextoTipoDeTecnologiaTestadaWebServices() {
        return driver.findElement(tipoDeTecnologiaTestadaWebServices).getText();
    }

    public String obterTituloGerenciadorAuditeste() {
        return driver.findElement(tituloGerenciadorAuditeste).getText();
    }

    public String obterTextoGerenciadorAuditeste() {
        return driver.findElement(textoGerenciadorAuditeste).getText();
    }

    public boolean visualizarPrimeiraImgGerenciadorAuditeste() {
        return driver.findElement(primeiraImgGerenciadorAuditeste).isDisplayed();
    }

    public boolean visualizarSegundaImgGerenciadorAuditeste() {
        return driver.findElement(segundaImgGerenciadorAuditeste).isDisplayed();
    }

    public String obterTituloMetodologiaTestes() {
        return driver.findElement(tituloMetodologiaTestes).getText();
    }

    public boolean visualizarImgMetodologiaTestesPlanejamento() {
        return driver.findElement(imgMetodologiaTestesPlanejamento).isDisplayed();
    }

    public String obterPrimeiroTextoMetodologiaTestesPlanejamento() {
        return driver.findElement(primeiroTextoMetodologiaTestesPlanejamento).getText();
    }

    public String obterSegundoTextoMetodologiaTestesPlanejamento() {
        return driver.findElement(segundoTextoMetodologiaTestesPlanejamento).getText();
    }

    public String obterTerceiroTextoMetodologiaTestesPlanejamento() {
        return driver.findElement(terceiroTextoMetodologiaTestesPlanejamento).getText();
    }

    public String obterQuartoTextoMetodologiaTestesPlanejamento() {
        return driver.findElement(quartoTextoMetodologiaTestesPlanejamento).getText();
    }

    public String obterQuintoTextoMetodologiaTestesPlanejamento() {
        return driver.findElement(quintoTextoMetodologiaTestesPlanejamento).getText();
    }

    public boolean visualizarImgMetodologiaTestesEspecificacao() {
        return driver.findElement(imgMetodologiaTestesEspecificacao).isDisplayed();
    }

    public String obterPrimeiroTextoMetodologiaTestesEspecificacao() {
        return driver.findElement(primeiroTextoMetodologiaTestesEspecificacao).getText();
    }

    public String obterSegundoTextoMetodologiaTestesEspecificacao() {
        return driver.findElement(segundoTextoMetodologiaTestesEspecificacao).getText();
    }

    public String obterTerceiroTextoMetodologiaTestesEspecificacao() {
        return driver.findElement(terceiroTextoMetodologiaTestesEspecificacao).getText();
    }

    public String obterQuartoTextoMetodologiaTestesEspecificacao() {
        return driver.findElement(quartoTextoMetodologiaTestesEspecificacao).getText();
    }

    public boolean visualizarImgMetodologiaTestesExecucao() {
        return driver.findElement(imgMetodologiaTestesExecucao).isDisplayed();
    }

    public String obterPrimeiroTextoMetodologiaTestesExecucao() {
        return driver.findElement(primeiroTextoMetodologiaTestesExecucao).getText();
    }

    public String obterSegundoTextoMetodologiaTestesExecucao() {
        return driver.findElement(segundoTextoMetodologiaTestesExecucao).getText();
    }

    public String obterTerceiroTextoMetodologiaTestesExecucao() {
        return driver.findElement(terceiroTextoMetodologiaTestesExecucao).getText();
    }

    public String obterQuartoTextoMetodologiaTestesExecucao() {
        return driver.findElement(quartoTextoMetodologiaTestesExecucao).getText();
    }

    public String obterQuintoTextoMetodologiaTestesExecucao() {
        return driver.findElement(quintoTextoMetodologiaTestesExecucao).getText();
    }

    public String obterSextoTextoMetodologiaTestesExecucao() {
        return driver.findElement(sextoTextoMetodologiaTestesExecucao).getText();
    }

    public String obterPrimeiroTextoMetodologiaTestes() {
        return driver.findElement(primeiroTextoMetodologiaTestes).getText();
    }

    public String obterSegundoTextoMetodologiaTestes() {
        return driver.findElement(segundoTextoMetodologiaTestes).getText();
    }

    public String obterTerceiroTextoMetodologiaTestes() {
        return driver.findElement(terceiroTextoMetodologiaTestes).getText();
    }

    public String obterQuartoTextoMetodologiaTestes() {
        return driver.findElement(quartoTextoMetodologiaTestes).getText();
    }

    public String obterQuintoTextoMetodologiaTestes() {
        return driver.findElement(quintoTextoMetodologiaTestes).getText();
    }

    public String obterTituloCasesAuditeste() {
        return driver.findElement(tituloCasesAuditeste).getText();
    }

    public String obterTextoCasesAuditeste() {
        return driver.findElement(textoCasesAuditeste).getText();
    }

    public String obterTituloTestesFuncionais() {
        return driver.findElement(tituloTestesFuncionais).getText();
    }

    public String obterTextoTestesFuncionais() {
        return driver.findElement(textoTestesFuncionais).getText();
    }

    public String obterTituloTestesNaoFuncionais() {
        return driver.findElement(tituloTestesNaoFuncionais).getText();
    }

    public String obterTextoTestesNaoFuncionais() {
        return driver.findElement(textoTestesNaoFuncionais).getText();
    }

    public String obterTextoTestesManuais() {
        return driver.findElement(textoTestesManuais).getText();
    }

    public String obterSegundoTextoTestesManuais() {
        return driver.findElement(segundoTextoTestesManuais).getText();
    }

    public String obterTextoTestesMobile() {
        return driver.findElement(textoTestesMobile).getText();
    }

    public String obterTituloTestesMobile() {
        return driver.findElement(tituloTestesMobile).getText();
    }

    public String obterPrimeiroTextoTestesMobile() {
        return driver.findElement(primeiroTextoTestesMobile).getText();
    }

    public String obterSegundoTextoTestesMobile() {
        return driver.findElement(segundoTextoTestesMobile).getText();
    }

    public String obterTituloTestesFabricaTestes() {
        return driver.findElement(tituloTestesFabricaTestes).getText();
    }

    public String obterPrimeiroTextoFabricaTestes() {
        return driver.findElement(primeiroTextoFabricaTestes).getText();
    }

    public String obterSegundoTextoFabricaTestes() {
        return driver.findElement(segundoTextoFabricaTestes).getText();
    }

    public String obterTerceiroTextoFabricaTestes() {
        return driver.findElement(terceiroTextoFabricaTestes).getText();
    }

    public String obterPrimeiroTextoConsultoria() {
        return driver.findElement(primeiroTextoConsultoria).getText();
    }

    public String obterSegundoTextoConsultoria() {
        return driver.findElement(segundoTextoConsultoria).getText();
    }

    public String obterTextoBotaoAcesseJaCrowdsourced() {
        return driver.findElement(botaoAcesseJaCrowdsourced).getText();
    }

    public String obterTextoBotaoCadastreSeCrowdsourced() {
        return driver.findElement(botaoCadastreSeCrowdsourced).getText();
    }

    public String obterPrimeiroTextoCrowdsourced() {
        return driver.findElement(primeiroTextoCrowdsourced).getText();
    }

    public String obterSegundoTextoCrowdsourced() {
        return driver.findElement(segundoTextoCrowdsourced).getText();
    }

    public String obterTerceiroTextoCrowdsourced() {
        return driver.findElement(terceiroTextoCrowdsourced).getText();
    }

    public String obterQuartoTextoCrowdsourced() {
        return driver.findElement(quartoTextoCrowdsourced).getText();
    }

    public String obterTituloCrowdsourced() {
        return driver.findElement(tituloCrowdsourced).getText();
    }

    public String obterQuintoTextoCrowdsourced() {
        return driver.findElement(quintoTextoCrowdsourced).getText();
    }

    public String obterSextoTextoCrowdsourced() {
        return driver.findElement(sextoTextoCrowdsourced).getText();
    }

    public String obterSetimoTextoCrowdsourced() {
        return driver.findElement(setimoTextoCrowdsourced).getText();
    }

    public String obterPrimeiroTextoAlocacaoProfissionais() {
        return driver.findElement(primeiroTextoAlocacaoProfissionais).getText();
    }

    public String obterTituloBeneficioAlocacaoProfissionais() {
        return driver.findElement(tituloBeneficioAlocacaoProfissionais).getText();
    }

    public String obterTextoPrimeiroBeneficioAlocacaoProfissionais() {
        return driver.findElement(textoPrimeiroBeneficioAlocacaoProfissionais).getText();
    }

    public String obterTextoSegundoBeneficioAlocacaoProfissionais() {
        return driver.findElement(textoSegundoBeneficioAlocacaoProfissionais).getText();
    }

    public String obterTextoTerceiroBeneficioAlocacaoProfissionais() {
        return driver.findElement(textoTerceiroBeneficioAlocacaoProfissionais).getText();
    }

    public String obterPrimeiroTextoAutomacaoProcessos() {
        return driver.findElement(primeiroTextoAutomacaoProcessos).getText();
    }

    public String obterSegundoTextoAutomacaoProcessos() {
        return driver.findElement(segundoTextoAutomacaoProcessos).getText();
    }

    public String obterTerceiroTextoAutomacaoProcessos() {
        return driver.findElement(terceiroTextoAutomacaoProcessos).getText();
    }

}