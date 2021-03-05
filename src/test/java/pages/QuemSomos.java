package pages;

import common.Base;
import org.openqa.selenium.By;

public class QuemSomos extends Base {

    private Base base;

    //Itens Menu Hamburger
    private By botaoMenu = By.xpath("//button[contains(@class, 'navbar-toggle')]");
    private By botaoMenuQuemSomos = By.xpath("//*[@id=\"menu-menu-topo-1\"]/li[2]/a");

    public By tituloPagina = By.xpath("//*[@id=\"TITULO-SITE\"]/div[1]/div/div/div/h1");

    private By tituloBugMilenio = By.cssSelector("div:nth-child(3) > div > div.wpb_column.vc_column_container.vc_col-sm-6 > div > div > h2:nth-child(1)");
    private By texto1BugMilenio = By.cssSelector("div:nth-child(3) > div > div.wpb_column.vc_column_container.vc_col-sm-6 > div > div > div:nth-child(2) > div > p:nth-child(1)");
    private By texto2BugMilenio = By.cssSelector("div:nth-child(3) > div > div.wpb_column.vc_column_container.vc_col-sm-6 > div > div > div:nth-child(2) > div > p:nth-child(2)");
    private By texto3BugMilenio = By.cssSelector("div:nth-child(3) > div > div.wpb_column.vc_column_container.vc_col-sm-6 > div > div > div:nth-child(2) > div > p:nth-child(3)");
    private By tituloBumTestesSoftware = By.cssSelector("div:nth-child(3) > div > div.wpb_column.vc_column_container.vc_col-sm-6 > div > div > h2:nth-child(3) > b");
    private By texto1BumTestesSoftware = By.cssSelector("div:nth-child(3) > div > div.wpb_column.vc_column_container.vc_col-sm-6 > div > div > div:nth-child(4) > div > p:nth-child(1)");
    private By texto2BumTestesSoftware = By.cssSelector("div:nth-child(3) > div > div.wpb_column.vc_column_container.vc_col-sm-6 > div > div > div:nth-child(4) > div > p:nth-child(2)");
    private By texto3BumTestesSoftware = By.cssSelector("div:nth-child(3) > div > div.wpb_column.vc_column_container.vc_col-sm-6 > div > div > div:nth-child(4) > div > p:nth-child(3)");
    private By tituloSobreAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[2]/div/div/h2/b");
    private By texto1SobreAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[2]/div/div/div/div/p[1]");
    private By texto2SobreAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[2]/div/div/div/div/p[2]");
    private By texto3SobreAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[2]/div/div/div/div/p[3]");
    private By texto4SobreAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[2]/div/div/div/div/p[4]");
    private By imgTituloMissaoAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[1]/div/div/div[1]/figure/div/img");
    private By textoMissaoAuditeste = By.cssSelector("div:nth-child(5) > div > div:nth-child(1) > div > div > div.wpb_text_column.wpb_content_element > div > p");
    private By imgTituloVisaoAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[2]/div/div/div[1]/figure/div/img");
    private By textoVisaoAuditeste = By.cssSelector("div:nth-child(5) > div > div:nth-child(2) > div > div > div.wpb_text_column.wpb_content_element > div > p");
    private By imgTituloValoresAuditeste = By.xpath("//*[@id=\"wrapper\"]/div[4]/div/div[3]/div/div/div[1]/figure/div/img");
    private By textoValoresAuditesteEtica = By.cssSelector("p.vc_custom_heading.vc_custom_1506173551538");
    private By textoValoresAuditesteAgilidade = By.cssSelector("p.vc_custom_heading.vc_custom_1506173604592");
    private By textoValoresAuditesteComprometimento = By.cssSelector("p.vc_custom_heading.vc_custom_1506173614623");
    private By textoValoresAuditesteRespeito = By.cssSelector("p.vc_custom_heading.vc_custom_1506173623817");
    private By textoValoresAuditesteQualidade = By.cssSelector("p.vc_custom_heading.vc_custom_1506173634756");

    //Serviços
    private By tituloServicos = By.cssSelector("div:nth-child(6) > div > div > div > div > h2 > b");
    private By textoServicos = By.xpath("//*[@id=\"LINHA-MOBILE\"]/div/div[2]/div/div/div[4]");
    private By testesAutomatizados = By.xpath("//*[@id=\"LINHA-MOBILE\"]/div/div[1]/div/div/div[1]/a");
    private By fabricaTestes = By.xpath("//*[@id=\"LINHA-MOBILE\"]/div/div[2]/div/div/div[1]/a");
    private By testesManuais = By.xpath("//*[@id=\"LINHA-MOBILE\"]/div/div[1]/div/div/div[2]/a");
    private By consultoriaTestes = By.xpath("//*[@id=\"LINHA-MOBILE\"]/div/div[2]/div/div/div[2]/a");
    private By testesMobile = By.xpath("//*[@id=\"LINHA-MOBILE\"]/div/div[1]/div/div/div[4]/a");
    private By testesFuncionaisENaoFuncionais = By.xpath("//*[@id=\"LINHA-MOBILE\"]/div/div[1]/div/div/div[3]/a");
    private By alocacaoProfissionaisEspecializados = By.xpath("//*[@id=\"LINHA-MOBILE\"]/div/div[2]/div/div/div[3]/a");

    private By tituloCasesAuditeste = By.cssSelector("div.vc_row.wpb_row.vc_row-fluid.vc_custom_1507644726866 > div > div > div > div > h2 > b");
    private By textoCasesAuditeste = By.cssSelector("div.vc_row.wpb_row.vc_row-fluid.vc_custom_1507644726866 > div > div > div > div > div > div > p");

    public QuemSomos(Base base) {
        this.base = base;
    }

    public void clicarBotaoMenuHamburger() {
        base.driver.findElement(botaoMenu).click();
    }

    public void clicarMenuItemQuemSomos() {
        base.driver.findElement(botaoMenuQuemSomos).click();
    }

    public String verificarSeEstaNaPaginaQuemSomos() {
        return base.driver.findElement(tituloPagina).getText();
    }

    public String obterTituloBugMilenio() {
        return base.driver.findElement(tituloBugMilenio).getText();
    }

    public String obterTexto1BugMilenio() {
        return base.driver.findElement(texto1BugMilenio).getText();
    }

    public String obterTexto2BugMilenio() {
        return base.driver.findElement(texto2BugMilenio).getText();
    }

    public String obterTexto3BugMilenio() {
        return base.driver.findElement(texto3BugMilenio).getText();
    }

    public String obterTituloBumTestesSoftware() {
        return base.driver.findElement(tituloBumTestesSoftware).getText();
    }

    public String obterTexto1BumTestesSoftware() {
        return base.driver.findElement(texto1BumTestesSoftware).getText();
    }

    public String obterTexto2BumTestesSoftware() {
        return base.driver.findElement(texto2BumTestesSoftware).getText();
    }

    public String obterTexto3BumTestesSoftware() {
        return base.driver.findElement(texto3BumTestesSoftware).getText();
    }

    public String obterTextoSobreAuditeste() {
        return base.driver.findElement(tituloSobreAuditeste).getText();
    }

    public String obterTexto1SobreAuditeste() {
        return base.driver.findElement(texto1SobreAuditeste).getText();
    }

    public String obterTexto2SobreAuditeste() {
        return base.driver.findElement(texto2SobreAuditeste).getText();
    }

    public String obterTexto3SobreAuditeste() {
        return base.driver.findElement(texto3SobreAuditeste).getText();
    }

    public String obterTexto4SobreAuditeste() {
        return base.driver.findElement(texto4SobreAuditeste).getText();
    }

    public boolean imgTituloMissaoAuditesteEstavisivel() {
        return base.driver.findElement(imgTituloMissaoAuditeste).isDisplayed();
    }

    public String obterTextoMissaoAuditeste() {
        return base.driver.findElement(textoMissaoAuditeste).getText();
    }

    public boolean imgTituloVisaoAuditesteEstavisivel() {
        return base.driver.findElement(imgTituloVisaoAuditeste).isDisplayed();
    }

    public String obterTextoVisaoAuditeste() {
        return base.driver.findElement(textoVisaoAuditeste).getText();
    }

    public boolean imgTituloValoresAuditesteEstavisivel() {
        return base.driver.findElement(imgTituloValoresAuditeste).isDisplayed();
    }

    public String obterTextoValoresAuditesteEtica() {
        return base.driver.findElement(textoValoresAuditesteEtica).getText();
    }

    public String obterTextoValoresAuditesteAgilidade() {
        return base.driver.findElement(textoValoresAuditesteAgilidade).getText();
    }

    public String obterTextoValoresAuditesteComprometimento() {
        return base.driver.findElement(textoValoresAuditesteComprometimento).getText();
    }

    public String obterTextoValoresAuditesteRespeito() {
        return base.driver.findElement(textoValoresAuditesteRespeito).getText();
    }

    public String obterTextoValoresAuditesteQualidade() {
        return base.driver.findElement(textoValoresAuditesteQualidade).getText();
    }

    public String obterTituloServicos() {
        return base.driver.findElement(tituloServicos).getText();
    }

    public String obterTextoServicos() {
        return base.driver.findElement(textoServicos).getText();
    }

    public String obterTextoServicosTestesAutomatizados() {
        return base.driver.findElement(testesAutomatizados).getText();
    }

    public String obterTextoServicosFabricaTestes() {
        return base.driver.findElement(fabricaTestes).getText();
    }

    public String obterTextoServicosTestesManuais() {
        return base.driver.findElement(testesManuais).getText();
    }

    public String obterTextoServicosConsultoriaTestes() {
        return base.driver.findElement(consultoriaTestes).getText();
    }

    public String obterTextoServicosTestesMobile() {
        return base.driver.findElement(testesMobile).getText();
    }

    public String obterTextoServicosTestesFuncionaisENaoFuncionais() {
        return base.driver.findElement(testesFuncionaisENaoFuncionais).getText();
    }

    public String obterTextoServicosAlocacaoProfissionaisEspecializados() {
        return base.driver.findElement(alocacaoProfissionaisEspecializados).getText();
    }

    public String obterTituloCasesAuditeste() {
        return base.driver.findElement(tituloCasesAuditeste).getText();
    }

    public String obterTextoCasesAuditeste() {
        return base.driver.findElement(textoCasesAuditeste).getText();
    }

}