package web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Home {
    public Home() {
        step("Open page: " + Configuration.baseUrl,
                () -> open("/"));
    }

    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("h1[data-animation='titleFadeIn']");
    }

    @Step("get menu Element")
    public SelenideElement getMenuElement() {
        return $("[id='menu-primary-menu']");
    }

    @Step("click to 'What We Do Best' button")
    public Home clickWhatWeDo() {
        $("[href='#what-we-do']");
        return this;
    }

    @Step("click to 'Learn More' button")
    public Home clickLearnMore() {
        $("[href='/what-we-do/']").click();
        return this;
    }

    @Step("click to 'Contact Us' button")
    public ContactUs clickContactUs() {
        $("[href='/contact-us/']").click();
        return new ContactUs();
    }


}
