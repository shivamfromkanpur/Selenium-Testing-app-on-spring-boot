package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selenium.model.CompanyDetails;
import com.selenium.model.InputFile;

@RestController
public class SeleniumController {
	
	@RequestMapping("/selenium")
	public String seleniumCheck(@RequestBody InputFile inputFile) {
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\Shivam Mishra\\Desktop\\ProjectDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://companies.govmu.org:4343/MNSOnlineSearch/");
		// Actions actions =new Actions(driver);
		WebElement searchByNameObj = driver.findElement(By.id("searchByName"));
		searchByNameObj.sendKeys(inputFile.getBankName());

		WebElement submit = driver.findElement(By.id("submitCompanies"));
		submit.click();

		System.out.println("enter a file number");
		// Scanner sc = new Scanner(System.in);
		// String inputFile = sc.nextLine();

		List banksColCount = driver.findElements(By.xpath("//*[@id=\"companies\"]/div/div/table/tbody/tr"));

		System.out.println(banksColCount.size());

		String printCol;
		String bankNametoClick = "";
		String xpath = "";
		int i = 0;

		for (i = 1; i <= banksColCount.size(); i++) {
			xpath = "//*[@id=\"companies\"]/div/div/table/tbody/tr[" + i + "]/td[3]";
			WebElement banksCol = driver.findElement(By.xpath(xpath));
			printCol = banksCol.getText();
			//System.out.println(printCol);
			if ((inputFile.getFileNo()).equals(printCol)) {

				WebElement getBankName = driver
						.findElement(By.xpath("//*[@id=\"companies\"]/div/div/table/tbody/tr[" + i + "]/td[2]"));
				bankNametoClick = getBankName.getText();
				break;
			} else
				System.out.println("file name not found");
		}

		System.out.println(bankNametoClick);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			System.out.println("exception");

		}
		driver.findElement(By.linkText(bankNametoClick)).click();
		
		System.out.println(i);
		driver.switchTo().frame(driver.findElement(By.className("iziModal-iframe")));
		
		
		// we.click();
		// String url =we.getAttribute("href");

//		PopUpService popUpService=new PopUpService(url);

//		popUpService.getPopupData();

		
		WebElement fileNoWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[1]/td[1]"));

		WebElement nameWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[2]/td[1]"));

		WebElement categoryWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[3]/td[1]"));

		WebElement typeWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[4]/td[1]"));

		WebElement registerOfficeAddressWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[5]/td[1]"));

		WebElement natureWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[2]/td[2]"));

		WebElement subCategoryWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[3]/td[2]"));

		WebElement statusWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[4]/td[2]"));

		WebElement dataIncorporatedWeb = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[1]/td[2]"));

		String fileNo = fileNoWeb.getText();
		String name = nameWeb.getText();
		String category = categoryWeb.getText();
		String type = typeWeb.getText();
		String registerOfficeAddress = registerOfficeAddressWeb.getText();
		String dataIncorporated = dataIncorporatedWeb.getText();
		String nature = natureWeb.getText();
		String subCategory = subCategoryWeb.getText();
		String status = statusWeb.getText();

		CompanyDetails companyDetails = new CompanyDetails();

		companyDetails.setCategory(category);
		companyDetails.setDataIncorporated(dataIncorporated);
		companyDetails.setFileNo(fileNo);
		companyDetails.setName(name);

		companyDetails.setNature(nature);
		companyDetails.setRegisterOfficeAddress(registerOfficeAddress);
		companyDetails.setStatus(status);
		companyDetails.setSubCategory(subCategory);
		companyDetails.setType(type);

	//	System.out.println(companyDetails);
//		String compnayDetailString = companyDetail;
		return companyDetails.toString();
		
	    
        
		// pojo class declare
//
//		PopUpService popUpService = new PopUpService();
//
//		WebElement fileElement = driver
//				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[1]/td[2]"));
//
//		String fileNo = fileElement.getText();
//		String name = "";
//		String category = "";
//		String type = "";
//		String registerOfficeAddress = "";
//		String dataIncorporated = "";
//		String nature = "";
//		String subCategory = "";
//		String status = "";
//
//		CompanyDetails companyDetails = new CompanyDetails();
//
//		companyDetails.setFileNo(fileNo);
//		System.out.println(companyDetails.getFileNo());
	}

}
