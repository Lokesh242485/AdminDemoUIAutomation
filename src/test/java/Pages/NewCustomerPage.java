package Pages;

import Framework.Browser;
import Framework.Util.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCustomerPage extends BasePage{

    private WebElement newCustEmailID = DriverManager.getInstance().Driver.findElement(By.xpath("//input[@class='form-control text-box single-line' and @id='Email']"));
    private WebElement newCustPassword = DriverManager.getInstance().Driver.findElement(By.id("Password"));
    private WebElement newCustFirstName = DriverManager.getInstance().Driver.findElement(By.id("FirstName"));
    private WebElement newCustLastName = DriverManager.getInstance().Driver.findElement(By.id("LastName"));
    private WebElement newCustGenderMale = DriverManager.getInstance().Driver.findElement(By.id("Gender_Male"));
    private WebElement newCustGenderFemale= DriverManager.getInstance().Driver.findElement(By.id("Gender_Female"));
    private WebElement newCustDOB = DriverManager.getInstance().Driver.findElement(By.id("DateOfBirth"));
    private WebElement newCustCompany = DriverManager.getInstance().Driver.findElement(By.id("Company"));
    private WebElement newCustIsTexExampt = DriverManager.getInstance().Driver.findElement(By.id("IsTaxExempt"));
    private WebElement newNewsLetter = DriverManager.getInstance().Driver.findElement(By.xpath("//ul[@class='k-reset' and @id='SelectedNewsletterSubscriptionStoreIds_taglist']/parent::div[@class='k-multiselect-wrap k-floatwrap']"));
    private WebElement newCustRoles = DriverManager.getInstance().Driver.findElement(By.xpath("//ul[@class='k-reset' and @id='SelectedCustomerRoleIds_taglist']/parent::div[@class='k-multiselect-wrap k-floatwrap']"));
    private WebElement newCustManagerOfVendor = DriverManager.getInstance().Driver.findElement(By.id("VendorId"));
    private WebElement AdminComment = DriverManager.getInstance().Driver.findElement(By.id("AdminComment"));
    private WebElement saveBtn = DriverManager.getInstance().Driver.findElement(By.name("save"));

    public NewCustomerPage(String title) {
        super(title);
        Browser.WaitForReady();
    }



   public void enterNewCustEmail(String emailID) {
        Browser.enterValue(newCustEmailID,emailID);
    }

    public void enterNewCustPassword(String str){

        Browser.enterValue(newCustPassword,str);
    }

    public void enterNewCustFirstName(String str){

        Browser.enterValue(newCustFirstName,str);
    }

    public void enterNewCustLastName(String str){

        Browser.enterValue(newCustLastName,str);
    }
    public void entnewCustGender(String str){

        if(str.equals("Male")) {

            Browser.clickOnElement(newCustGenderMale);
        }
        else {
            Browser.clickOnElement(newCustGenderFemale);
        }
    }



    public void enternewCustDOB(String str){

        Browser.enterValue(newCustDOB,str);
    }
    public void enternewCustCompany(String str){

        Browser.enterValue(newCustCompany,str);
    }
    public void enternewCustIsTexExampt(String str){

        Browser.clickOnElement(newCustIsTexExampt);
    }
    public void enternewNewsLetter(String str){

        Browser.enterValue(newNewsLetter,str);
    }
    public void enternewCustRoles(String str){

        Browser.selectByIndex(newCustRoles,2);
    }
    public void enterNewCustManagerOfVendor(String str){

        Browser.selectByIndex(newCustManagerOfVendor,2);
    }
    public void enterAdminComment(String str){

        Browser.enterValue(AdminComment,str);
    }
    public void clickOnSaveBtn(){

        Browser.clickOnElement(saveBtn);
    }
}
