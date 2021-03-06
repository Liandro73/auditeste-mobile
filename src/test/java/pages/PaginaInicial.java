package pages;

import common.Base;
import org.openqa.selenium.By;

public class PaginaInicial extends Base {

    private Base base;

    //Itens Menu Hamburguer
    private By botaoMenu = By.xpath("//button[contains(@class, 'navbar-toggle')]");
    private By botaoMenuQuemSomos = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[2]/a");
    private By botaoMenuServicos = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/span/i[1]");
    private By botaoMenuTestesAutomatizados = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[1]/a");
    private By botaoMenuTestesFuncionaisNaoFuncionais = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[2]/a");
    private By botaoMenuTestesManuais = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[3]/a");
    private By botaoMenuTestesMobile = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[4]/a");
    private By botaoMenuTestesFabricaDeTestes = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[5]/a");
    private By botaoMenuTestesConsultoria = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[6]/a");
    private By botaoMenuTestesCrowdsourced = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[7]/a");
    private By botaoMenuTestesAlocacaoDeProfissionais = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[8]/a");
    private By botaoMenuTestesAutomacaoDeProcessos = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[3]/ul/li[9]/a");
    private By botaoMenuCasesDeSucesso = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[4]/a");
    private By botaoMenuTrabalheConosco = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[5]/a");
    private By botaoMenuBlog = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[6]/a");
    private By botaoMenuContato = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[7]/a");

    private By popupHomeOffice = By.cssSelector("#sg-popup-content-wrapper-1546");
    private By botaoFecharPopupHomeOffice = By.cssSelector("#sgpb-popup-dialog-main-div-wrapper > div > img");
    private By tituloContainerSolidezDeMercado = By.cssSelector("div:nth-child(5) > div > div:nth-child(1) > div > div > h2 > b");
    private By textoContainerSolidezDeMercado = By.cssSelector("div:nth-child(5) > div > div:nth-child(1) > div > div > p");
    private By tituloContainerTecnologia = By.cssSelector("div:nth-child(5) > div > div:nth-child(2) > div > div > h2 > b");
    private By textoContainerTecnologia = By.cssSelector("div:nth-child(5) > div > div:nth-child(2) > div > div > p");
    private By tituloContainerResultado = By.cssSelector("div:nth-child(5) > div > div:nth-child(3) > div > div > h2 > b");
    private By textoContainerResultado = By.cssSelector("div:nth-child(5) > div > div:nth-child(3) > div > div > p");

    //Tipos de Testes Disponibilizados
    private By testesAutomatizados = By.cssSelector("div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(1) > a");
    private By fabricaTestes = By.cssSelector("div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(2) > a");
    private By crowdsourcedAuditeste = By.cssSelector("div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(3) > a");
    private By testesManuais = By.cssSelector("div:nth-child(8) > div > div:nth-child(2) > div > div > div:nth-child(1) > a");
    private By consultoriaTestes = By.cssSelector("div:nth-child(8) > div > div:nth-child(2) > div > div > div:nth-child(2) > a");
    private By testesMobile = By.cssSelector("div:nth-child(8) > div > div:nth-child(3) > div > div > div:nth-child(1) > a");
    private By testesFuncionaisENaoFuncionais = By.cssSelector("div:nth-child(8) > div > div:nth-child(3) > div > div > div:nth-child(2) > a");
    private By automacaoDeProcessos = By.cssSelector("div:nth-child(8) > div > div:nth-child(4) > div > div > div:nth-child(1) > a");
    private By alocacaoProfissionaisEspecializados = By.cssSelector("div:nth-child(8) > div > div:nth-child(4) > div > div > div:nth-child(2) > a");

    //Dados das Cases
    private By tituloCasesHome = By.cssSelector("div.vc_row.wpb_row.vc_row-fluid.vc_custom_1507130405021 > div > div > div > div > h3 > b");
    private By subtituloCasesHome = By.cssSelector("div.vc_row.wpb_row.vc_row-fluid.vc_custom_1507130405021 > div > div > div > div > p");

    private By seletorPrimeiroDepoimento = By.xpath("//*[@id=\"wrapper\"]/div[12]/div/div[2]/div/div/div/div/div/ul/li[1]");
    private By seletorSegundoDepoimento = By.xpath("//*[@id=\"wrapper\"]/div[12]/div/div[2]/div/div/div/div/div/ul/li[2]");
    //Dados do depoimento primeiro
    private By primeiroDepoimentoCasesHome = By.xpath("//*[@id=\"1506917889270-7142d722-e4ae\"]/div/div/div/div/p");
    private By clientePrimeiroDepoimentoCasesHome = By.xpath("//*[@id=\"1506917889270-7142d722-e4ae\"]/div/div/div/p[2]/span[1]");
    private By cargoEmpresaClientePrimeiroDepoimentoCasesHome = By.xpath("//*[@id=\"1506917889270-7142d722-e4ae\"]/div/div/div/p[2]/span[2]");
    //Dados do depoimento segundo
    private By segundoDepoimentoCasesHome = By.xpath("//*[@id=\"1506917889386-f7b40e2b-efd3\"]/div/div/div/div/p");
    private By clienteSegundoDepoimentoCasesHome = By.xpath("//*[@id=\"1506917889386-f7b40e2b-efd3\"]/div/div/div/p[2]/span[1]");
    private By cargoEmpresaClienteSegundoDepoimentoCasesHome = By.xpath("//*[@id=\"1506917889386-f7b40e2b-efd3\"]/div/div/div/p[2]/span[2]");

    ///ChatBot
    private By iconeAbrirChatBot = By.xpath("//*[@id=\"blip-chat-icon\"]");
    private By iconeFecharChatBot = By.xpath("//*[@id=\"path-1\"]");

    public PaginaInicial(Base base) {
        this.base = base;
    }

    public String obterTituloPagina() {
        return base.driver.getTitle().toUpperCase();
    }

    public boolean visualizarPopupHomeOffice() {
        return base.driver.findElement(popupHomeOffice).isDisplayed();
    }

    public void clicarBotaoFecharPopupHomeOffice() {
        base.driver.findElement(botaoFecharPopupHomeOffice).click();
    }

    public String obterTituloContainerCimaHome() {
        return base.driver.findElement(tituloContainerSolidezDeMercado).getText();
    }

    public String obterTextoContainerCimaHome() {
        return base.driver.findElement(textoContainerSolidezDeMercado).getText();
    }

    public String obterTituloContainerBaixoHome() {
        return base.driver.findElement(tituloContainerTecnologia).getText();
    }

    public String obterTextoContainerBaixoHome() {
        return base.driver.findElement(textoContainerTecnologia).getText();
    }

    public String obterTituloContainerCentralHome() {
        return base.driver.findElement(tituloContainerResultado).getText();
    }

    public String obterTextoContainerCentralHome() {
        return base.driver.findElement(textoContainerResultado).getText();
    }

    public String obterTituloCasesHome() {
        return base.driver.findElement(tituloCasesHome).getText();
    }

    public String obterSubtituloCasesHome() {
        return base.driver.findElement(subtituloCasesHome).getText();
    }

    public void clicarSeletorPrimeiroDepoimentoCases() {
        base.driver.findElement(seletorPrimeiroDepoimento).click();
    }

    public void clicarSeletorSegundoDepoimentoCases() {
        base.driver.findElement(seletorSegundoDepoimento).click();
    }

    public String obterTextoPrimeiroDepoimentoCasesHome() {
        return base.driver.findElement(primeiroDepoimentoCasesHome).getText();
    }

    public String obterNomeClientePrimeiroDepoimentoCasesHome() {
        return base.driver.findElement(clientePrimeiroDepoimentoCasesHome).getText();
    }

    public String obterCargoEmpresaClientePrimeiroDepoimentoCasesHome() {
        return base.driver.findElement(cargoEmpresaClientePrimeiroDepoimentoCasesHome).getText();
    }

    public String obterTextoSegundoDepoimentoCasesHome() {
        return base.driver.findElement(segundoDepoimentoCasesHome).getText();
    }

    public String obterNomeClienteSegundoDepoimentoCasesHome() {
        return base.driver.findElement(clienteSegundoDepoimentoCasesHome).getText();
    }

    public String obterCargoEmpresaClienteSegundoDepoimentoCasesHome() {
        return base.driver.findElement(cargoEmpresaClienteSegundoDepoimentoCasesHome).getText();
    }

    public String obterTextoTestesAutomatizados() {
        return base.driver.findElement(testesAutomatizados).getText();
    }

    public String obterTextoFabricaTestes() {
        return base.driver.findElement(fabricaTestes).getText();
    }

    public String obterTextoCrowdsourcedAuditeste() {
        return base.driver.findElement(crowdsourcedAuditeste).getText();
    }

    public String obterTextoTestesManuais() {
        return base.driver.findElement(testesManuais).getText();
    }

    public String obterTextoConsultoriaTestes() {
        return base.driver.findElement(consultoriaTestes).getText();
    }

    public String obterTextoTestesMobile() {
        return base.driver.findElement(testesMobile).getText();
    }

    public String obterTextoTestesFuncionaisENaoFuncionais() {
        return base.driver.findElement(testesFuncionaisENaoFuncionais).getText();
    }

    public String obterTextoAlocacaoProfissionaisEspecializados() {
        return base.driver.findElement(alocacaoProfissionaisEspecializados).getText();
    }

    public String obterTextoAutomacaoDeProcessos() {
        return base.driver.findElement(automacaoDeProcessos).getText();
    }

    public void clicarBotaoIniciarChatBot() {
        base.driver.findElement(iconeAbrirChatBot).click();
    }

    public void clicarBotaoFecharChatBot() {
        base.driver.findElement(iconeFecharChatBot).click();
    }

}
