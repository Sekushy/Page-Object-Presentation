import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends PageObject {

    public SecondPage(WebDriver driver) { super(driver);}

    @FindBy(xpath = "//*[@id=\'card_grid\']/div[2]/div/div/div[2]/h2/a")
    private WebElement gameToBuy;

    public void clickOnGame() {
        this.gameToBuy.click();
    }
}
