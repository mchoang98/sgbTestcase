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
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.ezactive.sgb')

Mobile.tap(findTestObject('SGB/Court/Court Button'), 0)

Mobile.tap(findTestObject('SGB/E-Training/Inside ET Screen/back button'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Button'), 0)

Mobile.tap(findTestObject('SGB/Court/CourtBooking 1/Term and Conditions'), 0)

Mobile.tap(findTestObject('SGB/Court/CourtBooking 1/Term OnOff'), 0)

Mobile.tap(findTestObject('SGB/Court/CourtBooking 1/AGREE AND CONTINUE'), 0)

Mobile.tap(findTestObject('SGB/Court/CourtBooking 1/Book court 1 button'), 0)

Mobile.tap(findTestObject('SGB/Court/Court booking 2/Court type select'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/arrow back'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/arrow forward'), 0)

Mobile.tapAndHold(findTestObject('SGB/Court/Court Booking 3/Show Calendar icon'), 0, 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/Months/Choose Month'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/Months/Nov'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/Show Years'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/Years/2020'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/day 29'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/Choosing 5 to 6 am'), 0)

Mobile.swipe(500, 500, 500, 100)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/Choosing 9 to 10 pm'), 0)

Mobile.tap(findTestObject('SGB/Court/Court Booking 3/Button Book now'), 0)

