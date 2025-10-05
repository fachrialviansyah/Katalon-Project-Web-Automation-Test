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

WebUI.click(findTestObject('saucedemo/05 add_to_cart Backpack'))

WebUI.click(findTestObject('saucedemo/06 add_to_cart Tshirt'))

WebUI.verifyElementPresent(findTestObject('saucedemo/07 total_shopping_basket'), 0)

WebUI.click(findTestObject('saucedemo/08 shopping_basket'))

WebUI.verifyElementText(findTestObject('saucedemo/04 tittle_page'), 'Your Cart')

WebUI.click(findTestObject('saucedemo/10 btn_checkout'))

WebUI.verifyElementText(findTestObject('saucedemo/04 tittle_page'), 'Checkout: Your Information')

WebUI.setText(findTestObject('saucedemo/11 input_firstName'), 'Fachri')

WebUI.setText(findTestObject('saucedemo/12 input_lastName'), 'Alviansyah')

WebUI.setText(findTestObject('saucedemo/13 input_postalCode'), '14045')

WebUI.click(findTestObject('saucedemo/14 btn_continue'))

WebUI.verifyElementText(findTestObject('saucedemo/04 tittle_page'), 'Checkout: Overview')

WebUI.verifyElementPresent(findTestObject('saucedemo/15 price_total'), 0)

WebUI.click(findTestObject('saucedemo/16 btn_finis'))

WebUI.verifyElementText(findTestObject('saucedemo/04 tittle_page'), 'Checkout: Complete!')

WebUI.verifyElementPresent(findTestObject('saucedemo/17 thankyourorder'), 0)

WebUI.closeBrowser()

