package com.acc_selenium_demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class TestNG_demo1 {
  @Test
  public void login() { System.out.println("I want to do Login");
  }
  @BeforeMethod
  public void beforeMethod() {System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {System.out.println("@AfterMehtod");
  }

  @BeforeClass
  public void beforeClass() {System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {System.out.println("@AfterClass");
  }

  @BeforeTest
  public void beforeTest() {System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {System.out.println("@AfterTest");
  }

  @AfterSuite
  public void afterSuite() {System.out.println("@AfterSuite");
  }
  @BeforeSuite
  public void beforeSuite(){System.out.println("@BeforeSuite");
  }
}
