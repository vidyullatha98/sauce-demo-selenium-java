Sauce Demo – Selenium + TestNG (Java)

![Java](https://img.shields.io/badge/Java-17+-orange)
![Build](https://img.shields.io/badge/Build-Maven-blue)
![Framework](https://img.shields.io/badge/Test-TESTNG-1f6feb)
![Selenium](https://img.shields.io/badge/Selenium-4.x-43b02a)

UI test automation framework for the **SauceDemo** site using **Selenium 4**, **TestNG**, and **Maven**.  
Includes Page Object Model structure and a sample **Login** test. Designed to be extended with more tests,
reporting, and CI.

---

## Quick Start

### Prerequisites
- JDK **17+**
- Maven **3.9+**
- Google Chrome installed (Selenium Manager will auto-manage drivers)

### Run locally
```bash
# clone and enter the project
git clone https://github.com/vidyullatha98/sauce-demo-selenium-java.git
cd sauce-demo-selenium-java

# run the sample login test
mvn -Dtest=com.saucedemo.tests.LoginTest clean test
Tip: You can also right-click LoginTest in IntelliJ and choose Run.
Project Structure
src
└─ test
   ├─ java
   │  └─ com/saucedemo
   │     ├─ base
   │     │  └─ BaseTest.java
   │     ├─ pages
   │     │  ├─ LoginPage.java
   │     │  └─ InventoryPage.java
   │     └─ tests
   │        └─ LoginTest.java
   └─ resources   (add testng.xml or config files here later)
BaseTest – WebDriver setup/teardown (Selenium Manager auto-downloads drivers)
pages/ – Page Objects with locators and actions
tests/ – TestNG test classes
