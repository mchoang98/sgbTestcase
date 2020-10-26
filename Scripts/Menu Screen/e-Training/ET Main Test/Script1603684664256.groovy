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

Mobile.tap(findTestObject('SGB/E-Training/Outside Menu/eTrainingButton'), 0)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/back button'), 0)

Mobile.tap(findTestObject('SGB/E-Training/Outside Menu/eTrainingButton'), 0)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/Term and Condition'), 0, FailureHandling.OPTIONAL)

Mobile.doubleTap(findTestObject('SGB/E-Training/Term and Condition Screen/Term On Off'), 0)

Mobile.tap(findTestObject('SGB/E-Training/Term and Condition Screen/AGREE AND CONTINUE'), 0)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/level0 obj 1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/softwareclub/Pictures/img1.jpg', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/level0 obj 2'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/softwareclub/Pictures/img2.jpg', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/level0 obj 3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/softwareclub/Pictures/img3.jpg', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/level0 obj 4'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/softwareclub/Pictures/img4.jpg', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/level1 obj 1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/softwareclub/Pictures/img5.jpg', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/level1 obj 2'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/softwareclub/Pictures/img6.jpg', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

