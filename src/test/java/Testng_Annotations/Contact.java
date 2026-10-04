package Testng_Annotations;

import Base_Class.Demo;
import Object_repository.HomePage;
import Object_repository.creatingpage;
import Object_repository.signoutpage;
import generic_Utility.Java_Utility;
import generic_Utility.fileutility;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Contact extends Demo {

    @Test
    public void createContact() throws Exception {

        int randomnumber = Java_Utility.getrandomnumber();
        fileutility futil = new fileutility();

        String firstname = futil.getdatafromexcelfile("Contacts", 1, 0) + randomnumber;
        String Lastname = futil.getdatafromexcelfile("Contacts", 1, 1) + randomnumber;
        String Leadsource = futil.getdatafromexcelfile("Contacts", 1, 2);
        String email = futil.getdatafromexcelfile("Contacts", 1, 3);
        String Assistant = futil.getdatafromexcelfile("Contacts", 1, 4);

        HomePage Hp = new HomePage(driver);
        Hp.getContacts().click();
        Hp.getcreateContact().click();

        creatingpage cp = new creatingpage(driver);
        cp.getfirstnameElement().sendKeys(firstname);
        cp.getlastnameElement().sendKeys(Lastname);
        cp.getleadsourceElement().sendKeys(Leadsource);
        cp.getemailElement().sendKeys(email);
        cp.getassistantElement().sendKeys(Assistant);
        cp.getsaveElement().click();

        signoutpage sp = new signoutpage(driver);
        Actions act = new Actions(driver);
        act.moveToElement(sp.gethowericonElement()).perform();
        sp.getlogoutElement().click();
    }
}