import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;

import driver.Driver;

    public class StepImplementation {

        public static WebDriver driver;

    @Step("Navigate to Xenonstack page") 
        public void NavigatetoXenonstackpage() throws InterruptedException {

            Driver.webDriver.get("https://careers.xenonstack.com/onboarding/login");
            // driver.manage().window().maximize();
         
        }  

    @Step("Enter valid username and valid password") 
        public void Entervalidusernameandvalidpassword() throws InterruptedException { 
            
            Driver.webDriver.findElement(By.id("email")).sendKeys("sayakk1998@gmail.com");
            Driver.webDriver.findElement(By.id("password")).sendKeys("####");    //password has been hidden :)
            Gauge.writeMessage("Logged in with Valid username and password");
            Thread.sleep(2000);
        }

    @Step("Click on login")
        public void Clickonlogin() throws InterruptedException {
            Driver.webDriver.findElement(By.id("send-invite")).click();
            Gauge.writeMessage("Clicked on Login!");
            Thread.sleep(2000);
        }


    @Step("Validate accountDetails")
        public void ValidateaccountDetails() throws InterruptedException {

            Driver.webDriver.findElement(By.className("user-auth-name")).click();
            Thread.sleep(2000);
            Driver.webDriver.findElement(By.className("user-auth-name")).click();
            Driver.webDriver.findElement(By.linkText("Profile")).click();
            
            String expected_word = "Account Details";
            String actualword = Driver.webDriver.findElement(By.linkText("Account Details")).getText();

            if(expected_word.equals(actualword)) {
                Gauge.writeMessage("Validated Account Details!");
            }
            Thread.sleep(3000);
        }

        @Step("Validate personalDetails")
            public void ValidatepersonalDetails() throws InterruptedException {

            Driver.webDriver.findElement(By.linkText("Personal Details")).click();

            String expected_word = "Personal Details";
            String actualword = Driver.webDriver.findElement(By.linkText("Personal Details")).getText();
            if(expected_word.equals(actualword)) {
                Gauge.writeMessage("Validated Personal Details!");
            }
            Thread.sleep(3000);
            }

        @Step("Validate educationDetails")
            public void ValidateeducationDetails() throws InterruptedException {

            Driver.webDriver.findElement(By.linkText("Education Details")).click();

            String expected_word = "Education Details";
            String actualword = Driver.webDriver.findElement(By.linkText("Education Details")).getText();
            if(expected_word.equals(actualword)) {
                Gauge.writeMessage("Validated Education Details!");
            }
            Thread.sleep(3000);
            }

        @Step("Validate otherDetails")
            public void ValidateotherDetails() throws InterruptedException {

            Driver.webDriver.findElement(By.linkText("Other Details")).click();

            String expected_word = "Other Details";
            String actualword = Driver.webDriver.findElement(By.linkText("Other Details")).getText();
            if(expected_word.equals(actualword)) {
                Gauge.writeMessage("Validated Other Details!");
            }
            Thread.sleep(3000);
            }    
            
        @Step("Go to training page")
        public void Gototrainingpage() throws InterruptedException {

            Driver.webDriver.findElement(By.className("user-auth-name")).click();
            Thread.sleep(2000);
            Driver.webDriver.findElement(By.className("user-auth-name")).click();
            Driver.webDriver.findElement(By.linkText("Training")).click();
            Thread.sleep(2000);
        }

        @Step("Go to module4")
        public void Gotomodule4() throws InterruptedException {

            Driver.webDriver.navigate().to("https://careers.xenonstack.com/onboarding/employee/modules/2516");
            Thread.sleep(2000);
            Driver.webDriver.navigate().back();
            Thread.sleep(1000);

            Gauge.writeMessage("Module 4 checked!");
        }
        
        @Step("Go to module3")
         public void Gotomodule3() throws InterruptedException {

            Driver.webDriver.navigate().to("https://careers.xenonstack.com/onboarding/employee/modules/2468");
            Thread.sleep(2000);
            Driver.webDriver.navigate().back();
            Thread.sleep(1000);
            
            
          //  JavascriptExecutor jse = (JavascriptExecutor)driver;
          //  WebElement element = Driver.webDriver.findElement(By.xpath("//button[@class='btn btn-compact box-shadow module-completed']"));
         //   jse.executeScript("arguments[0].scrollIntoView();", element);
         //   jse.executeScript("window.scrollBy(0,250)");
         //   Thread.sleep(1000);

            Gauge.writeMessage("Module 3 checked!");
         }

         @Step("Go to module2")
            public void Gotomodule2() throws InterruptedException {

                Driver.webDriver.navigate().to("https://careers.xenonstack.com/onboarding/employee/modules/2382");
                Thread.sleep(2000);
                Driver.webDriver.navigate().back();
                Thread.sleep(1000);

                Thread.sleep(1000);

                Gauge.writeMessage("Module 2 checked!");
            }

        @Step("Go to module1")
            public void Gotomodule1() throws InterruptedException {

                Driver.webDriver.navigate().to("https://careers.xenonstack.com/onboarding/employee/modules/2216");
                Thread.sleep(2000);
                Driver.webDriver.navigate().back();
                Thread.sleep(1000);

                Gauge.writeMessage("Module 1 checked!");
            }

        @Step("Logging out")
         public void Loggingout() throws InterruptedException {

            Driver.webDriver.findElement(By.className("user-auth-name")).click();
            Thread.sleep(1000);
            Driver.webDriver.findElement(By.xpath("//button[@class='logout-link']")).click();
            Driver.webDriver.findElement(By.xpath("//button[@class='btn']")).click();
            Thread.sleep(1000);

            Gauge.writeMessage("Logged out!");
            Driver.webDriver.close();
         } 
}
