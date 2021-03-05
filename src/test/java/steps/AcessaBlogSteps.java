package steps;

import common.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.WebDriver;
import pages.Blog;
import pages.PaginaInicial;
import util.Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaBlogSteps extends Base {

    private Base base;
    private Blog blog;
    private PaginaInicial homePage;
    private Screenshot screenshot;

    public AcessaBlogSteps(Base base) {
        this.base = base;
        blog = new Blog(this.base);
        homePage = new PaginaInicial(this.base);
        screenshot = new Screenshot(this.base);
    }

    @Dado("que estou na pagina blog")
    public void que_estou_na_pagina_blog() {
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        blog.clicarbotaoMenu();
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        blog.clicarMenuItemBlog();
        assertEquals(blog.verificarSeEstaNaPaginaBlog().toUpperCase(), ("//BLOG"));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_blog");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("eu navego pela pagina blog")
    public void eu_navego_pela_pagina_blog() {
        assertEquals(blog.obterNumeroPaginaAtualBlog(), ("1"));
        assertEquals(blog.vericarBlocosDePotagensEstaVisivel(), (true));
        assertEquals(blog.obterQuantidadeBlocosDePotagens(), (12));

        assertEquals(blog.vericarBotaoProximaPaginaBlogEstaVisivel(), (true));
        blog.clicarBotaoProximaPaginaBlog();

        assertEquals(blog.obterNumeroPaginaAtualBlog(), ("2"));
        assertEquals(blog.vericarBlocosDePotagensEstaVisivel(), (true));
        assertEquals(blog.obterQuantidadeBlocosDePotagens(), (12));

        assertEquals(blog.vericarBotaoProximaPaginaBlogEstaVisivel(), (true));
        assertEquals(blog.vericarBotaoPaginaAnteriorBlogEstaVisivel(), (true));
        blog.clicarBotaoPaginaAnteriorBlog();

        assertEquals(blog.obterNumeroPaginaAtualBlog(), ("1"));
        assertEquals(blog.vericarBlocosDePotagensEstaVisivel(), (true));
        assertEquals(blog.obterQuantidadeBlocosDePotagens(), (12));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_blog");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}