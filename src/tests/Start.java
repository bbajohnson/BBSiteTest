package tests;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;


public class Start {

	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { 
											NavToHomepage.class
											,AccessibilityTestingPage.class
											,AutomatedTestingPage.class
											,BlogHeaderLink.class
											,BlogPage.class
											,CareerCompanyPage.class
											,CompanyHeaderLink.class
											,CompanyPage.class
											,CompanyPullDown.class
											,CompatibilityTestingPage.class
											,ContactHeaderLink.class
											,ContactPage.class
											,contactusBodyLink.class
											,FAQ.class
											,FollowOurBlog.class
											,FunctionalityTestingPage.class
											,GetStartedContactUs.class
											,HomeLinks.class
											,LaptopLabPage.class
											,LoadPerformanceTestingPage.class
											,LocalizationTestPage.class
											,MacSystemsLabPage.class
											,MobileDeviceLabPage.class
											,MobileDeviceTestingPage.class
											,NextProjectLink.class
											,PCSystemsLabPage.class
											,PrivacyPolicy.class
											,ServicesBodyLinks.class
											,ServicesFooterLinks.class
											,ServicesHeaderLink.class
											,ServicesPage.class
											,ServicesPullDown.class
											,SocialFooterLinks.class
											,TeamCompanyPage.class
											,TestimonialLinks.class
											,TestPlanWritingPage.class
											,TheCompany.class
											,TheLabsFooterLinks.class
											,TheLabsHeaderLink.class
											,TheLabsPage.class
											,TheLabsPullDown.class
											,TheProcessPage.class
											,UsabilityTestingPage.class
											,VideoCardsLabPage.class
											,WebsiteTestingPage.class
											,WhyHireBB.class
											,WhyOutsource.class
											,WhyTestHeaderLink.class
											,WhyTestPage.class
											,WhyTestPullDown.class
											});
		testng.addListener(tla);
		testng.run();
		
	}

}


























