package pages;

import common.Base;
import org.openqa.selenium.By;

public class TrabalheConosco extends Base {

    private Base base;

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

    public TrabalheConosco(Base base) {
        this.base = base;
    }

    public void clicarBotaoMenuHamburger() {
        base.driver.findElement(botaoMenu).click();
    }

    public void clicarBotaoMenuTrabalheConosco() {
        base.driver.findElement(botaoMenuTrabalheConosco).click();
    }

    public String verificarSeEstaNaPaginaTrabalheConosco() {
        return base.driver.findElement(tituloPaginaTrabalheConosco).getText();
    }

    public String obterTextoPaginaTrabalheConosco() {
        return base.driver.findElement(textoPaginaTrabalheConosco).getText();
    }

    public String obterTituloCampoNomeTrabalheConosco() {
        return base.driver.findElement(tituloCampoNomeTrabalheConosco).getText();
    }

    public boolean verificarSeCampoNomeTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoNomeTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoEmailTrabalheConosco() {
        return base.driver.findElement(tituloCampoEmailTrabalheConosco).getText();
    }

    public boolean verificarSeCampoEmailTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoEmailTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoTelefoneTrabalheConosco() {
        return base.driver.findElement(tituloCampoTelefoneTrabalheConosco).getText();
    }

    public boolean verificarSeCampoTelefoneTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoTelefoneTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoEnderecoTrabalheConosco() {
        return base.driver.findElement(tituloCampoEnderecoTrabalheConosco).getText();
    }

    public boolean verificarSeCampoEnderecoTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoEnderecoTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoCidadeTrabalheConosco() {
        return base.driver.findElement(tituloCidadeTrabalheConosco).getText();
    }

    public boolean verificarSeCampoCidadeTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoCidadeTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoObjetivoProfissionalTrabalheConosco() {
        return base.driver.findElement(tituloCampoObjetivoProfissionalTrabalheConosco).getText();
    }

    public boolean verificarSeCampoObjetivoProfissionalTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoObjetivoProfissionalTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoAreaAtuacaoTrabalheConosco() {
        return base.driver.findElement(tituloCampoAreaAtuacaoTrabalheConosco).getText();
    }

    public boolean verificarSeCampoAreaAtuacaoTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoAreaAtuacaoTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoMensagemTrabalheConosco() {
        return base.driver.findElement(tituloCampoMensagemTrabalheConosco).getText();
    }

    public boolean verificarSeCampoMensagemTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoMensagemTrabalheConosco).isDisplayed();
    }

    public String obterTituloCampoAnexarTrabalheConosco() {
        return base.driver.findElement(tituloCampoAnexarTrabalheConosco).getText();
    }

    public boolean verificarSeCampoAnexarTrabalheConoscoEstaVisivel() {
        return base.driver.findElement(campoAnexarTrabalheConosco).isDisplayed();
    }

    public String obterTextoTiposDeArquivosAceitosTrabalheConosco() {
        return base.driver.findElement(textoTiposDeArquivosAceitosTrabalheConosco).getText();
    }

    public boolean verificarSeBotaoEnviarFormularioTrabalheConosco() {
        return base.driver.findElement(botaoEnviarFormularioTrabalheConosco).isDisplayed();
    }

}