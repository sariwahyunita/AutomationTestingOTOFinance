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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.callTestCase(findTestCase('PageBulkUpload/viewDetail'), [('addData') : 'addtest'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PageDetailBulkUpload/aAddData'))

WebUI.verifyElementPresent(findTestObject('PageDetailBulkUpload/popUpTambahData/h5TambahData'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('PageDetailBulkUpload/popUpTambahData/buttonAddData'))

WebUI.verifyElementText(findTestObject('PageDetailBulkUpload/popUpTambahData/pupUpFailed/divFailed'), 'Semua data harus diisi.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('PageDetailBulkUpload/popUpTambahData/popUpSuccess/buttonOK'))

