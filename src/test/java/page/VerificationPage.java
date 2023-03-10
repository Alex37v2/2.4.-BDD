package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {

    SelenideElement codInput = $("[data-test-id=code] input");
    SelenideElement verifyButton = $("[data-test-id=action-verify");

    public VerificationPage() {
        codInput.shouldBe(Condition.visible);
    }

    public DashboardPage codeInput(DataHelper.VerificationCod cod) {
        codInput.setValue(cod.getCode());
        verifyButton.click();
        return new DashboardPage();
    }
}
