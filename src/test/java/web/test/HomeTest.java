package web.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.Home;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomeTest extends BaseTest {

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking title text on Home page")
    void checkHomePageTitle() {
        new Home().getPageTitleElement().shouldHave(text("An agency fueled by purpose, with impact you can certify"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'What we do Best' button")
    void checkGetStartedButton() {
        new Home().clickWhatWeDo();
        $("[id='what-we-do']").shouldBe(visible);
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'Learn More' button")
    void checkLearnMoreButton() {
        new Home().clickLearnMore();
        $("body").shouldHave(text("Results-driven marketing built differently"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'Contact Us ' button")
    void checkContactUsButton() {
        new Home().clickContactUs();
        $("body").shouldHave(text("Let’s get closer-TEST-ERROR"));
        $("body").shouldHave(text("+1 (585) 274-5100"));
    }


}
