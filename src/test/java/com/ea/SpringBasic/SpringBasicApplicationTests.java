package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.HomePage;
import com.ea.SpringBasic.pages.LoginPage;
import com.ea.SpringBasic.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest
@Profile("qa")
class SpringBasicApplicationTests {

	@Autowired
	private MainPage mainPage;

	//@Value("testing")
	@Value("${app.url}")
	private String environment;

	@Value("chrome, firefox, edge")
	private List<String> browsers;

	@Test
	void contextLoads() {
		System.out.println(environment);
		browsers.forEach(System.out::println);
		/*System.out.println("Hello Friends");
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();

		MainPage mainPage = new MainPage(loginPage, homePage);

		 */
		mainPage.performLogin();

	}

	@Test
	void performLoginTest(){
		//mainPage.navigate();
		mainPage.performLogin();
	}

}
