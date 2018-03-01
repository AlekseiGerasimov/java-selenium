package task4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    private static WebDriver driver;
        LitecartPage page;
    @Before
    public void setUp(){
        page = new LitecartPage();
    }

    @Test
    public void test1(){
        page.findAndSetValue("//input[@name='username']","admin");
        page.findAndSetValue("//input[@name='password']","admin");
        page.findAndClick("//button[@name='login']");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=appearance&doc=template']");
        page.asserted("Template","//h1[contains(text(),'Template')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=appearance&doc=logotype']");
        page.asserted("Logotype","//h1[contains(text(),'Logotype')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=catalog']");
        page.asserted("Catalog","//h1[contains(text(),'Catalog')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=product_groups']");
        page.asserted("Product Groups","//h1[contains(text(),'Product Groups')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=option_groups']");
        page.asserted("Option Groups","//h1[contains(text(),'Option Groups')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=manufacturers']");
        page.asserted("Manufacturers","//h1[contains(text(),'Manufacturers')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=suppliers']");
        page.asserted("Suppliers","//h1[contains(text(),'Suppliers')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=delivery_statuses']");
        page.asserted("Delivery Statuses","//h1[contains(text(),'Delivery Statuses')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=sold_out_statuses']");
        page.asserted("Sold Out Statuses","//h1[contains(text(),'Sold Out Statuses')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=quantity_units']");
        page.asserted("Quantity Units","//h1[contains(text(),'Quantity Units')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=catalog&doc=csv']");
        page.asserted("CSV Import/Export","//h1[contains(text(),'CSV Import/Export')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=countries&doc=countries']");
        page.asserted("Countries","//h1[contains(text(),'Countries')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=currencies&doc=currencies']");
        page.asserted("Currencies","//h1[contains(text(),'Currencies')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=customers&doc=customers']");
        page.asserted("Customers","//h1[contains(text(),'Customers')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=customers&doc=csv']");
        page.asserted("CSV Import/Export","//h1[contains(text(),'CSV Import/Export')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=customers&doc=newsletter']");
        page.asserted("Newsletter","//h1[contains(text(),'Newsletter')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=geo_zones&doc=geo_zones']");
        page.asserted("Geo Zones","//h1[contains(text(),'Geo Zones')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=languages&doc=languages']");
        page.asserted("Languages","//h1[contains(text(),'Languages')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=languages&doc=storage_encoding']");
        page.asserted("Storage Encoding","//h1[contains(text(),'Storage Encoding')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=modules&doc=jobs']");
        page.asserted("Job Modules","//h1[contains(text(),'Job Modules')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=modules&doc=customer']");
        page.asserted("Customer Modules","//h1[contains(text(),'Customer Modules')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=modules&doc=shipping']");
        page.asserted("Shipping Modules","//h1[contains(text(),'Shipping Modules')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=modules&doc=payment']");
        page.asserted("Payment Modules","//h1[contains(text(),'Payment Modules')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=modules&doc=order_total']");
        page.asserted("Order Total Modules","//h1[contains(text(),'Order Total Modules')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=modules&doc=order_success']");
        page.asserted("Order Success Modules","//h1[contains(text(),'Order Success Modules')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=modules&doc=order_action']");
        page.asserted("Order Action Modules","//h1[contains(text(),'Order Action Modules')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=orders&doc=orders']");
        page.asserted("Orders","//h1[contains(text(),'Orders')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=orders&doc=order_statuses']");
        page.asserted("Order Statuses","//h1[contains(text(),'Order Statuses')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=pages&doc=pages']");
        page.asserted("Pages","//h1[contains(text(),'Pages')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=reports&doc=monthly_sales']");
        page.asserted("Monthly Sales","//h1[contains(text(),'Monthly Sales')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=reports&doc=most_sold_products']");
        page.asserted("Most Sold Products","//h1[contains(text(),'Most Sold Products')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=reports&doc=most_shopping_customers']");
        page.asserted("Most Shopping Customers","//h1[contains(text(),'Most Shopping Customers')]");

        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=settings&doc=store_info']");
        page.asserted("Settings","//h1[contains(text(),'Settings')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=settings&doc=defaults']");
        page.asserted("Settings","//h1[contains(text(),'Settings')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=settings&doc=general']");
        page.asserted("Settings","//h1[contains(text(),'Settings')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=settings&doc=listings']");
        page.asserted("Settings","//h1[contains(text(),'Settings')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=settings&doc=images']");
        page.asserted("Settings","//h1[contains(text(),'Settings')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=settings&doc=checkout']");
        page.asserted("Settings","//h1[contains(text(),'Settings')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=settings&doc=advanced']");
        page.asserted("Settings","//h1[contains(text(),'Settings')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=settings&doc=security']");
        page.asserted("Settings","//h1[contains(text(),'Settings')]");

        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=slides&doc=slides']");
        page.asserted("Slides","//h1[contains(text(),'Slides')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=tax&doc=tax_classes']");
        page.asserted("Tax Classes","//h1[contains(text(),'Tax Classes')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=tax&doc=tax_rates']");
        page.asserted("Tax Rates","//h1[contains(text(),'Tax Rates')]");

        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=translations&doc=search']");
        page.asserted("Search Translations","//h1[contains(text(),'Search Translations')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=translations&doc=scan']");
        page.asserted("Scan Files For Translations","//h1[contains(text(),'Scan Files For Translations')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=translations&doc=csv']");
        page.asserted("CSV Import/Export","//h1[contains(text(),'CSV Import/Export')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=users&doc=users']");
        page.asserted("Users","//h1[contains(text(),'Users')]");
        page.findAndClick("//a[@href='http://localhost/litecart/admin/?app=vqmods&doc=vqmods']");
        page.asserted("vQmods","//h1[contains(text(),'vQmods')]");
    }

    @After
    public void tearDown(){
//        page.quit():
    }
}
