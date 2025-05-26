package web.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.Home;

import static com.codeborne.selenide.Condition.text;

public class HomeTest extends BaseTest {

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking title text on Home page")
    void checkHomePageTitle() {
        new Home().getPageTitleElement().shouldHave(text("Simplify Claims. Streamline Appraisals. Scale Payments."));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'Harness the full power of digital' button")
    void checkGetStartedButton() {
        new Home().clickToGetDemo()
                .getPageTitleElement().shouldHave(text("Simplify Claims. Streamline Appraisals. Scale Payments."));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'Discover Virtual Appraisals' button")
    void checkDiscoverVirtualAppraisalsButton() {
        new Home().clickToDiscoverVirtualAppraisals()
                .getPageTitleElement().shouldHave(text("The original insurance appraisal software that started the revolution"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'Contact Us' button")
    void checkContactUsButton() {
        new Home().clickToContactUs().getPageTitleElement().shouldHave(text("Contact Us"));
    }


}
