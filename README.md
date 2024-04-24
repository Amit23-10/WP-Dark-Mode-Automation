# WP-Dark-Mode-Automation
### This is a project where a wordpress plugin is automated by writing test suites using selenium-webdriver and TestNg as testing framework.
The following key are automated:
- Log in
- Plugin is Active or not
- Navigate to the WP Dark Mode & continue
- Enable Backend Darkmode
- Floating Switch Style
- Custom Switch size
- Floating Switch Position
- Disable Keyboard Shortcut
- Darkmode Toggle Animation
- Validate Darkmode is working

## Technology :
- Tool: Selenium
- IDE: Intellij
- Build tool: Gradle
- Language: Java
- Testing Framework: TestNG

## Install Wordpress :
-[Install WordPress Using XAMPP](https://elementor.com/academy/install-wordpress-xampp/)

## Prerequisite :
- Need to install jdk 11, gradle and allure
- Configure Environment variable for jdk 11, gradle and allure
- Clone this project and unzip it
- Open the project folder
- Double click on "build.gradle" and open it through IntellIJ IDEA
- Let the project build successfully
- Click on "Terminal" and run the automation scripts

## Run the Automation Script by the following command: 
    gradle clean test -Pusername="Your Username" -Ppassword="Your Password"

- Selenium will open the browser and start automating.
- Gradle Reports :
  ![1](https://github.com/Amit23-10/WP-Dark-Mode-Automation/assets/74063361/9284f9e6-f281-4d59-84c1-3bfa79110d6b)
- After automation to view allure report , give the following commands:
  
       allure generate allure-results --clean -o allure-report
       allure serve allure-results
  
   ### Below is my allure overview report:

  ![2](https://github.com/Amit23-10/WP-Dark-Mode-Automation/assets/74063361/6c804b31-6291-45d2-ae00-ab6389c2c5d3)
