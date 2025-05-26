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
        acceptCookie();
    }

    @Step("accept cookie")
    public void acceptCookie() {
        $("[id='hs-eu-confirmation-button']").click();
    }

    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("[id='el-f539174e']");
    }

    @Step("get menu Element")
    public SelenideElement getMenuElement() {
        return $("[id='menu-primary-menu']");
    }

    @Step("click to 'Harness the full power of digital' button")
    public GetDemo clickToGetDemo() {
        $("[id='el-c22202d7'] a").click();
        return new GetDemo();
    }

    @Step("click to 'Contact Us' button")
    public ContactUs clickToContactUs() {
        $("[id='mega-menu-item-169877045']").click();
        return new ContactUs();
    }

    @Step("click to 'Discover Virtual Appraisals' button")
    public InsuranceAppraisals clickToDiscoverVirtualAppraisals() {
        $("[id='el-68c10d18'] a").click();
        return new InsuranceAppraisals();
    }

    @Step("click to 'Learn More' button")
    public Home clickLearnMore() {
        $("[href='/what-we-do/']").click();
        return this;
    }



}
