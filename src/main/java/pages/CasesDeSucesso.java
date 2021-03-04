package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CasesDeSucesso {

    private WebDriver driver;

    //Itens Menu Hamburguer
    private By botaoMenu = By.xpath("//button[contains(@class, 'navbar-toggle')]");
    private By botaoMenuCasesDeSucesso = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[4]/a");

    private By tituloPaginaCasesDeSucesso = By.xpath("//h1[contains(@class, 'vc_custom_heading titulo_site')]");

    private By tituloPaginaCasesDeSucessoAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div/div/h2");
    private By textoPaginaCasesDeSucesso = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div/div/div/div/p");
    private By imgPaginaCasesDeSucesso = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div/div[1]/figure/div/img");
    private By legendaImgPaginaCasesDeSucesso = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div/div[2]/div/p");
    private By tituloVideoPaginaCasesDeSucesso = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div/div/h2");
    private By videoPaginaCasesDeSucesso = By.cssSelector("#player_1");

    private By seletorPrimeiroDepoimento = By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[2]/div/div/div/div/div/ul/li[1]");
    private By seletorSegundoDepoimento = By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[2]/div/div/div/div/div/ul/li[2]");
    private By primeiroDepoimentoCases = By.xpath("//*[@id=\"1506917889270-7142d722-e4ae\"]/div/div/div/div/p");
    private By clientePrimeiroDepoimentoCases = By.xpath("//*[@id=\"1506917889270-7142d722-e4ae\"]/div/div/div/p[2]/span[1]");
    private By cargoEmpresaClientePrimeiroDepoimentoCases = By.xpath("//*[@id=\"1506917889270-7142d722-e4ae\"]/div/div/div/p[2]/span[2]");
    private By segundoDepoimentoCasesHome = By.xpath("//*[@id=\"1506917889386-f7b40e2b-efd3\"]/div/div/div/div/p");
    private By clienteSegundoDepoimentoCasesHome = By.xpath("//*[@id=\"1506917889386-f7b40e2b-efd3\"]/div/div/div/p[2]/span[1]");
    private By cargoEmpresaClienteSegundoDepoimentoCases = By.xpath("//*[@id=\"1506917889386-f7b40e2b-efd3\"]/div/div/div/p[2]/span[2]");

    public CasesDeSucesso(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotaoMenuHamburger() {
        driver.findElement(botaoMenu).click();
    }

    public void clicarMenuItemCasesDeSucesso() {
        driver.findElement(botaoMenuCasesDeSucesso).click();
    }

    public String verificarSeEstaNaPaginaCasesDeSucesso() {
        return driver.findElement(tituloPaginaCasesDeSucesso).getText();
    }

    public String obterTituloPaginaCasesDeSucessoAuditeste() {
        return driver.findElement(tituloPaginaCasesDeSucessoAuditeste).getText();
    }

    public String obterTextoPaginaCasesDeSucesso() {
        return driver.findElement(textoPaginaCasesDeSucesso).getText();
    }

    public boolean verificarImgPaginaCasesDeSucessoEstaVisivel() {
        return driver.findElement(imgPaginaCasesDeSucesso).isDisplayed();
    }

    public String obterLegendaImgPaginaCasesDeSucesso() {
        return driver.findElement(legendaImgPaginaCasesDeSucesso).getText();
    }

    public String obterTituloVideoPaginaCasesDeSucesso() {
        return driver.findElement(tituloVideoPaginaCasesDeSucesso).getText();
    }

    public boolean verificarVideoPaginaCasesDeSucessoEstaVisivel() {
        return driver.findElement(videoPaginaCasesDeSucesso).isDisplayed();
    }

    public void clicarSeletorPrimeiroDepoimentoCases() {
        driver.findElement(seletorPrimeiroDepoimento).click();
    }

    public void clicarSeletorSegundoDepoimentoCases() {
        driver.findElement(seletorSegundoDepoimento).click();
    }

    public String obterTextoPrimeiroDepoimentoCases() {
        return driver.findElement(primeiroDepoimentoCases).getText();
    }

    public String obterNomeClientePrimeiroDepoimentoCases() {
        return driver.findElement(clientePrimeiroDepoimentoCases).getText();
    }

    public String obterCargoEmpresaClientePrimeiroDepoimentoCases() {
        return driver.findElement(cargoEmpresaClientePrimeiroDepoimentoCases).getText();
    }

    public String obterTextoSegundoDepoimentoCases() {
        return driver.findElement(segundoDepoimentoCasesHome).getText();
    }

    public String obterNomeClienteSegundoDepoimentoCases() {
        return driver.findElement(clienteSegundoDepoimentoCasesHome).getText();
    }

    public String obterCargoEmpresaClienteSegundoDepoimentoCases() {
        return driver.findElement(cargoEmpresaClienteSegundoDepoimentoCases).getText();
    }

}