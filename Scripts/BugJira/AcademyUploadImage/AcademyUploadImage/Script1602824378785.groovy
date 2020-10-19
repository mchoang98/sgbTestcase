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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.ezactive.sgb', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/academy'), 0)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/registerUpdated'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/uploadImageNRIC'), 3000)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/ResetDone/Done'), 5000)

Mobile.delay(9, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 500, 500, 200)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/uploadImageBackOfNRIC'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/ResetDone/Done'), 5000)

Mobile.delay(9, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 500, 500, 200)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/uploadTraineePhoto'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/ResetDone/Done'), 5000)

Mobile.delay(9, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 500, 500, 300)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/UpdateButton'), 0)

