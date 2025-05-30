package web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Home extends Page{
    public Home() {
        step("Open page: " + Configuration.baseUrl,
                () -> open("/"));
        acceptCookie();
    }



    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("h1.title");
    }

    @Step("get menu Element")
    public SelenideElement getMenuElement() {
        return $("[id='menu-primary-menu']");
    }

    @Step("click to 'Explore our Games' button")
    public Games clickToExploreOurGames() {
        $("a.btn-primary").click();
        return new Games(false);
    }

    @Step("click to 'More' button in 'Provably fair' block")
    public ProvablyFair clickToMoreInProvablyFair() {
        $("[routerlink='/provably-fair']").click();
        return new ProvablyFair(false);
    }

    @Step("click to 'Contact' button")
    public Contact clickToContactUs() {
        $("[routerlink='/contact'].nav-link").click();
        return new Contact(false);
    }


}
