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

Mobile.startApplication('/Users/softwareclub/Dev/ezactivevn/sgb/client/platforms/ios/build/device/SG Basketball.ipa', false)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/academy'), 0)

Mobile.tap(findTestObject('SGB/AcademyForm/NguyenQuangUpdate'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('SGB/AcademyForm/NRIC'), 0)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/uploadImageNRIC'), 3000)

Mobile.callTestCase(findTestCase('BugJira/AcademyUploadImage/Upload Photo Toan'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('BugJira/AcademyUploadImage/CropImage'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 500, 500, 200)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/uploadImageBackOfNRIC'), 0)

Mobile.callTestCase(findTestCase('BugJira/AcademyUploadImage/Upload Photo'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('BugJira/AcademyUploadImage/CropImage'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 500, 500, 200)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegisterAdult/uploadTraineePhoto'), 0)

Mobile.callTestCase(findTestCase('BugJira/AcademyUploadImage/Upload Photo Toan'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('BugJira/AcademyUploadImage/CropImage'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(9, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('BugJira/AcademyUploadImage/ChangeMobileArea'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.swipe(500, 500, 500, 100)

Mobile.callTestCase(findTestCase('BugJira/AcademyUploadImage/ChangeEcMobileArea'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/AcademyForm/UpdateRegister your child as trainee'), 0)

