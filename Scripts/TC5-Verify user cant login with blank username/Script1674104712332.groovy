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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Login page'), 0)

WebUI.takeScreenshotAsCheckpoint('Login Page', [])

WebUI.verifyElementPresent(findTestObject('Username text field'), 0)

WebUI.setText(findTestObject('Username text field'), '')

WebUI.verifyElementPresent(findTestObject('Password text field'), 0)

WebUI.setText(findTestObject('Password text field'), GlobalVariable.password)

WebUI.takeScreenshotAsCheckpoint('User submit blank username', [])

WebUI.click(findTestObject('Button login'))

WebUI.verifyElementPresent(findTestObject('Invalid blank username notification'), 0)

WebUI.takeScreenshotAsCheckpoint('Invalid Username', [])

WebUI.closeBrowser()

