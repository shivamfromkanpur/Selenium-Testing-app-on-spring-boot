package com.selenium.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import com.selenium.model.CompanyDetails;


@Service
public class PopUpService {	

	String url;	
	
	public PopUpService(String url) {
	this.url=url;		
	}

	public void getPopupData()
	{
		
//		 pojo class declare
		
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\Shivam Mishra\\Desktop\\ProjectDemo\\chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
	    driver.get(url);
		
			WebElement fileNoWeb = driver
						.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[1]/td[1]"));
		
			WebElement 	nameWeb = driver
					.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[2]/td[1]"));
			

			WebElement 	categoryWeb = driver
					.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[3]/td[1]"));
			

			WebElement 	typeWeb = driver
					.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[4]/td[1]"));
			

			WebElement 	registerOfficeAddressWeb = driver
					.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[5]/td[1]"));
			

			WebElement 	natureWeb = driver
					.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[2]/td[2]"));
			

			WebElement 	subCategoryWeb = driver
					.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[3]/td[2]"));
			

			WebElement 	statusWeb = driver
					.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[4]/td[2]"));

			WebElement 	dataIncorporatedWeb = driver
					.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/fieldset[1]/table/tbody/tr[1]/td[2]"));
			
			
			    String fileNo =  fileNoWeb.getText();
				String name = nameWeb.getText();
				String category = categoryWeb.getText();
				String type =typeWeb.getText();
				String registerOfficeAddress =registerOfficeAddressWeb.getText();
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
				
                
				System.out.println(companyDetails);
		
	}
	
	
	
}
