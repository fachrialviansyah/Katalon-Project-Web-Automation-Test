import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('saucedemo/01 input_username'), username)

WebUI.setText(findTestObject('saucedemo/02 input_password'), password)

WebUI.click(findTestObject('saucedemo/03 btn_login'))

WebUI.verifyElementText(findTestObject('saucedemo/04 tittle_page'), 'Products')

WebUI.click(findTestObject('saucedemo/09 filter_product'))

WebUI.selectOptionByIndex(findTestObject('saucedemo/09 filter_product'), 0)

WebUI.verifyElementText(findTestObject('saucedemo/18 first_label_product'), 'Sauce Labs Backpack')

WebUI.click(findTestObject('saucedemo/09 filter_product'))

WebUI.selectOptionByIndex(findTestObject('saucedemo/09 filter_product'), 1)

WebUI.verifyElementText(findTestObject('saucedemo/18 first_label_product'), 'Test.allTheThings() T-Shirt (Red)')

WebUI.click(findTestObject('saucedemo/09 filter_product'))

WebUI.selectOptionByIndex(findTestObject('saucedemo/09 filter_product'), 2)

WebUI.verifyElementText(findTestObject('saucedemo/18 first_label_product'), 'Sauce Labs Onesie')

WebUI.click(findTestObject('saucedemo/09 filter_product'))

WebUI.selectOptionByIndex(findTestObject('saucedemo/09 filter_product'), 3)

WebUI.verifyElementText(findTestObject('saucedemo/18 first_label_product'), 'Sauce Labs Fleece Jacket')

WebUI.closeBrowser()

