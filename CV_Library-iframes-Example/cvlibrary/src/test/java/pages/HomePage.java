package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BasePage;

import java.util.List;

public class HomePage {

    WebDriver driver;
    public  void  HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    @FindBy(id ="keywords")
    WebElement search;
    @FindBy(id = "location")
    WebElement location ;
    @FindBy(id ="distance")
    WebElement distance  ;
    @FindBy(id = "salarymin")
    WebElement salarymin ;
    @FindBy(id="salarymax")
    WebElement salarymax ;
    @FindBy(id="tempperm")
    WebElement  jobtype;
    @FindBy(id="hp-search-btn")
    WebElement findJobs;
    @FindBy(id="salarytype")
    WebElement salarytype;
    @FindBy(id="toggle-hp-search")
    WebElement moreLink;
    @FindBy(id="gdpr-consent-notice")
    WebElement frameId;
    @FindBy(xpath="//span[@class='mat-button-wrapper']")
    List<WebElement> rollingUpdate;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMoreLink()
    {

        moreLink.click();
    }

    public void setSearch( String JobTitle)
    {
        search.sendKeys(JobTitle);
    }

    public void setLocation(String Location ) throws Exception {
        location.sendKeys(Location);
    }
    public void setDistance(String Distance) throws Exception
    {
          Select s1 = new Select(distance);
          //s1.selectByVisibleText(Distance);
        s1.selectByValue("10");

    }
    public void setSalarymin(String SalaryMin)
    {
        salarymin.sendKeys(SalaryMin);
    }
    public void setSalarymax(String Salarymax){
        salarymax.sendKeys(Salarymax);
    }
    public void setJobtype(String Jobtype){
         Select s1 = new Select(jobtype);
         s1.selectByVisibleText(Jobtype);
    }
    public void setSalarytype(String Salarytype){
        Select s1 = new Select(salarytype);
        s1.selectByVisibleText(Salarytype);
    }
    public void clickFindJobs(){
        findJobs.click();
    }
    public void setAdvancedSearchData(String jobTitle, String location, String distance, String salarymin, String salarymax, String salarytype, String jobtype) throws Exception{
        setSearch(jobTitle);
        setLocation(location);
        setDistance(distance);
        setSalarymin(salarymin);
        setSalarymax(salarymax);
        setSalarytype(salarytype);
        setJobtype(jobtype);

    }
    public void moveToFrame(){
        BasePage basePage = new BasePage();
        basePage.waitForFrames(driver,frameId,30);
        for(WebElement ele:rollingUpdate){
            System.out.println(ele.getText());
            if(ele.getText().equalsIgnoreCase("Accept All")){
                ele.click();
                break;
            }
        }
    }
}
