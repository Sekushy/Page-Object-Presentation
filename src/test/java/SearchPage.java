import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject{
    private final String SEARCH_STRING = "Playstation 5";

    @FindBy(xpath = "//*[@id=\'searchboxTrigger\']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\'masthead\']/div/div/div[2]/div/form/div[1]/div[2]/button[2]")
    private WebElement searchButton;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void populateSearchField() { this.searchField.sendKeys(SEARCH_STRING); }

    public void searchItemUsingButton() {
        this.searchButton.click();
    }
}
