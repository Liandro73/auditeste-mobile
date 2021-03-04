package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrabalheConosco {

    private WebDriver driver;

    //Itens Menu Hamburger
    private By botaoMenu = By.xpath("//button[contains(@class, 'navbar-toggle')]");
    private By botaoMenuTrabalheConosco = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[5]/a");

    private By tituloPaginaTrabalheConosco = By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div/div/h1");

    private By textoPaginaTrabalheConosco = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]");
    private By tituloCampoNomeTrabalheConosco = By.xpath("/html/body/div/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[1]/div/div/div[1]/div/div[1]/label/span");
    private By campoNomeTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[1]/div/div/div/div/div[2]/input");
    private By tituloCampoEmailTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[2]/div/div/div/div/div[1]/label/span");
    private By campoEmailTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[2]/div/div/div/div/div[2]/input");
    private By tituloCampoTelefoneTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[3]/div/div/div/div/div[1]/label/span");
    private By campoTelefoneTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[3]/div/div/div/div/div[2]/input");
    private By tituloCampoEnderecoTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[1]/div/div/div/div/div[1]/label/span");
    private By campoEnderecoTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[1]/div/div/div/div/div[2]/input");
    private By tituloCidadeTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[2]/div/div/div/div/div[1]/label/span");
    private By campoCidadeTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[2]/div/div/div/div/div[2]/input");
    private By tituloCampoObjetivoProfissionalTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[4]/div/div[1]/div/div/div/div/div[1]/label/span");
    private By campoObjetivoProfissionalTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[4]/div/div[1]/div/div/div/div/div[2]/input");
    private By tituloCampoAreaAtuacaoTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[4]/div/div[2]/div/div/div/div/div[1]/label");
    private By campoAreaAtuacaoTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[4]/div/div[2]/div/div/div/div/div[2]/input");
    private By tituloCampoMensagemTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[5]/div/div/div/div[1]");
    private By campoMensagemTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[5]/div/div/div/div[2]/textarea");
    private By tituloCampoAnexarTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[6]/div/div[1]/div[1]/div/div/div/div[1]/label/span");
    private By campoAnexarTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[6]/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]");
    private By textoTiposDeArquivosAceitosTrabalheConosco = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[6]/div/div[1]/div[2]/div/div/div/div/div[1]");
    private By botaoEnviarFormularioTrabalheConosco = By.xpath("//*[@id=\"field_container\"]/div/div/button");

    public TrabalheConosco(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotaoMenuHamburger() {
        driver.findElement(botaoMenu).click();
    }

    public void clicarBotaoMenuTrabalheConosco() {
        driver.findElement(botaoMenuTrabalheConosco).click();
    }

    public String verificarSeEstaNaPaginaTrabalheConosco() {
        return driver.findElement(tituloPaginaTrabalheConosco).getText();
    }

    public String obterTextoPaginaTrabalheConosco() {
        return driver.findElement(textoPaginaTrabalheConosco).getText();
    }

    public String obterTituloCampoNomeTrabalheConosco() {
        return driver.findElement(tituloCampoNomeTrabalheConosco).getText();
    }

    public boolean verificarSeCampoNomeTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoNomeTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoEmailTrabalheConosco() {
        return driver.findElement(tituloCampoEmailTrabalheConosco).getText();
    }

    public boolean verificarSeCampoEmailTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoEmailTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoTelefoneTrabalheConosco() {
        return driver.findElement(tituloCampoTelefoneTrabalheConosco).getText();
    }

    public boolean verificarSeCampoTelefoneTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoTelefoneTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoEnderecoTrabalheConosco() {
        return driver.findElement(tituloCampoEnderecoTrabalheConosco).getText();
    }

    public boolean verificarSeCampoEnderecoTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoEnderecoTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoCidadeTrabalheConosco() {
        return driver.findElement(tituloCidadeTrabalheConosco).getText();
    }

    public boolean verificarSeCampoCidadeTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoCidadeTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoObjetivoProfissionalTrabalheConosco() {
        return driver.findElement(tituloCampoObjetivoProfissionalTrabalheConosco).getText();
    }

    public boolean verificarSeCampoObjetivoProfissionalTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoObjetivoProfissionalTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoAreaAtuacaoTrabalheConosco() {
        return driver.findElement(tituloCampoAreaAtuacaoTrabalheConosco).getText();
    }

    public boolean verificarSeCampoAreaAtuacaoTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoAreaAtuacaoTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoMensagemTrabalheConosco() {
        return driver.findElement(tituloCampoMensagemTrabalheConosco).getText();
    }

    public boolean verificarSeCampoMensagemTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoMensagemTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoAnexarTrabalheConosco() {
        return driver.findElement(tituloCampoAnexarTrabalheConosco).getText();
    }

    public boolean verificarSeCampoAnexarTrabalheConoscoEstaVisivel() {
        return driver.findElement(campoAnexarTrabalheConosco).isDisplayed();
    }

    public String obterTextoTiposDeArquivosAceitosTrabalheConosco() {
        return driver.findElement(textoTiposDeArquivosAceitosTrabalheConosco).getText();
    }

    public boolean verificarSeBotaoEnviarFormularioTrabalheConosco() {
        return driver.findElement(botaoEnviarFormularioTrabalheConosco).isDisplayed();
    }

}