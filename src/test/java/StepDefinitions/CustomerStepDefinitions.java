package StepDefinitions;

import Framework.Browser;
import Framework.Data.DataManager;
import Framework.Root.AdminDemoUIApp;
import Framework.Util.ConfigurationManager;
import io.cucumber.java.en.And;

import java.io.IOException;

public class CustomerStepDefinitions {
    @And("I enter Customer Email id")
    public void iEnterCustomerEmailId() {
        AdminDemoUIApp.customersPage().enterCustEmail(Browser.generateRandomString());
    }

    @And("I enter Customer First Name")
    public void iEnterCustomerFirstName() throws IOException {
        AdminDemoUIApp.customersPage().enterCustFirstName(DataManager.excelReader("FirstName",1));
    }

    @And("I enter Customer Last Name")
    public void iEnterCustomerLastName() throws IOException {
        AdminDemoUIApp.customersPage().enterCustLastName(DataManager.excelReader("LastName",1));
    }

    @And("I enter Customer Birth Month")
    public void iEnterCustomerBirthMonth() throws IOException {

        AdminDemoUIApp.customersPage().enterBrithMonth(DataManager.excelReader("BirthMonth",1));
    }

    @And("I enter Customer Birth Date")
    public void iEnterCustomerBirthDate() throws IOException {

        AdminDemoUIApp.customersPage().enterBirthDate(DataManager.excelReader("BirthDate",1));
    }

    @And("I enter Customer Registration Date From")
    public void iEnterCustomerRegistrationDateFrom() throws IOException {
        AdminDemoUIApp.customersPage().enterRegDateFrom(DataManager.excelReader("RegistrationDateFrom",1));
    }

    @And("I enter Customer Registration Date To")
    public void iEnterCustomerRegistrationDateTo() throws IOException {
        AdminDemoUIApp.customersPage().enterRegDateTo(DataManager.excelReader("RegistrationDateTo",1));
    }

    @And("I enter Customer Last Activity Date From")
    public void iEnterCustomerLastActivityDateFrom() throws IOException {
        AdminDemoUIApp.customersPage().enterLastActivityFrom(DataManager.excelReader("LastActivityDateFrom",1));
    }

    @And("I enter Customer Last Activity To")
    public void iEnterCustomerLastActivityTo() throws IOException {
        AdminDemoUIApp.customersPage().enterLastActivityTo(DataManager.excelReader("LastActivityDateTo",1));
    }

    @And("I enter Customer Company Name")
    public void iEnterCustomerCompanyName() throws IOException {
        AdminDemoUIApp.customersPage().enterCompanyName(DataManager.excelReader("CompanyName",1));
    }

    @And("I enter Customer IP Address")
    public void iEnterCustomerIPAddress() throws IOException {
        AdminDemoUIApp.customersPage().enterIpAddress(DataManager.excelReader("IPAddress",1));
    }

    @And("I enter Customer Role")
    public void iEnterCustomerRole() throws IOException {

        AdminDemoUIApp.customersPage().entercustomerRole(DataManager.excelReader("CustomerRole",1));
    }

    @And("I click on Add New Button")
    public void iClickOnAddNewButton() {
        AdminDemoUIApp.customersPage().clickOnAddNewButton();
    }
}