# Ahmed Sobhy
### This Challenge covers the following :
* Automating Facebook Registration and Login.
* Automating Best Buy APIs using Rest Assured.
* Creating a test plan for Yalla Kora App.
* Reporting defects on Yalla Kora.

# Facebook-automation-testing

This part is covering the registration and login automation test cases for Facebook using selenium.

## Installation
I used Selenium
### Preconditions for selenium: 
* Java.
* intellij.
* Maven.
* TestNG.


### Code Snippet

```
    public void fillRegistrationForm(String firstname,String lastname, String mail,String pass)
        { driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(firstName).sendKeys(firstname);
            driver.findElement(lastName).sendKeys(lastname);
            driver.findElement(email).sendKeys(mail);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(confirmEmail).sendKeys(mail);
            driver.findElement(password).sendKeys(pass);
            Select selectDay = new Select(driver.findElement(By.id("day")));
            selectDay.selectByIndex(0);
            Select selectMonth = new Select(driver.findElement(By.id("month")));
            selectMonth.selectByIndex(0);
            Select selectYear = new Select(driver.findElement(By.id("year")));
            selectYear.selectByIndex(20);
            driver.findElement(gender).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(register).click();
        }
        public void fillWithLoginCredentials() throws IOException, CsvValidationException {
        String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/userData.csv";
        reader = new CSVReader(new FileReader(CSV_file));
        String[] csvCell;
        //while loop will be executed till the last value in csv file
        while ((csvCell = reader.readNext() ) != null )
        {
            String mail = csvCell[0];
            String pass = csvCell[1];
            driver.findElement(email).sendKeys(mail);
            driver.findElement(password).sendKeys(pass);
            driver.findElement(loginBttn).click();


        }
        
        
```

# Best-Buy-APIs-Automation

This part is covering a list of automated test cases for the best buy APIs.

## Installation
I used [REST Assured](http://rest-assured.io/).
### Preconditions for REST Assured: 
* Java.
* intellij.
* Maven.
* TestNG.
* JSON

### Maven Dependency
```
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>3.0.2</version>
        </dependency>

        <dependency>
            <groupId>com.googlecode.json-simple</groupId>
            <artifactId>json-simple</artifactId>
            <version>1.1.1</version>
        </dependency>
```
Check the pom file.

### Code Snippet

```Java
       @Test
    public void create() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("name", "Iphone 14 promax");
        json.put("type", "Mobile Phone");
        json.put("upc", "12345679");
        json.put("price", 50000);
        json.put("description", "Black iphone 128G");
        json.put("model", "DC345");
        request.body(json.toJSONString());
        Response response = (Response)request.post("http://localhost:3030/products");
        int code = response.getStatusCode();
        Assert.assertEquals(code, 201);
    }
```
