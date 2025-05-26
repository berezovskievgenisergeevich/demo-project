package web.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class GetDemo {

    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("[id='el-65784fbf']");
    }

}
