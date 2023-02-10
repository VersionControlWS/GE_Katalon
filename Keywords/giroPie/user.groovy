package giroPie

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class user {

	//Global variables
	//	String url = 'https://staging.peppertree.ai/'
	//	String username = 'uthukpnt@gmail.com'
	//	String password = 'Peppertree@123'

	@Keyword
	def lauchBrowser(url) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(url)
		WebUI.maximizeWindow()
	}

	@Keyword
	def userLogin(user_obj,username, pass_obj, password, submit_btn_obj) {
		WebUI.setText(findTestObject(user_obj), username)
		WebUI.setText(findTestObject(pass_obj),password)
		WebUI.click(findTestObject(submit_btn_obj))
	}

	@Keyword
	def userLogout() {
		WebUI.click(findTestObject('Object Repository/Page_NachPay/img_Invite_MuiAvatar-img css-1hy9t21'))
		WebUI.click(findTestObject('Object Repository/Page_NachPay/p_Sign Out'))
		WebUI.click(findTestObject('Object Repository/Page_NachPay/button_Yes'))
	}

	@Keyword
	def closeBrowser() {
		WebUI.closeBrowser()
	}

	@Keyword
	def LoginwithUsernamePwd() {

		//Local variables
		String url = 'https://staging.peppertree.ai/'
		String username = 'ajay@uth-uk.com'
		String password = 'Tree@2023'

		WebUI.callTestCase(findTestCase('Common_TestCases/TC0001_GP_PT_Login'), [('url') : url, ('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def ClickonDeleteAndYes() {
		WebUI.click(findTestObject('Object Repository/DeleteBranch/svg_Branches_MuiSvgIcon-root MuiSvgIcon-fon_148d01'))
		WebUI.click(findTestObject('Object Repository/DeleteBranch/button_Yes'))
	}

	@Keyword
	def ClickonDeleteAndYesinBankPage() {
		WebUI.click(findTestObject('Object Repository/Delete_Trial/Page_GIROPie/svg_Create Physical-Mandate_MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-101fpco'))
		WebUI.click(findTestObject('Object Repository/Delete_Trial/Page_GIROPie/button_Yes'))
	}

	@Keyword
	def NavigatetoBankPage() {
		WebUI.click(findTestObject('Object Repository/Bank/dashboardPage_companySetting_dropdown'))
		WebUI.click(findTestObject('Object Repository/Bank/li_Bank Profile'))
	}

	@Keyword
	def NavigatetoCompanyProfilePage() {
		WebUI.click(findTestObject('Object Repository/DeleteBranch/div_UTH'))
		WebUI.click(findTestObject('Object Repository/DeleteBranch/div_UTH_1'))
	}


	@Keyword
	def NavigatetoManageSubscriptionPage() {
		WebUI.click(findTestObject('Object Repository/Page_Mng_Subscription/UTH_Account_name'))
		WebUI.click(findTestObject('Object Repository/Page_Mng_Subscription/Manage Subscriptions dropdown'))
	}
	@Keyword
	def ClickOnInviteButtonPresentOnHomePage() {
		WebUI.click(findTestObject('Object Repository/Companyinvite/Invite_Button'))
		'Verfiy the text "Invite Individuals" below here which is not working as of now'
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Companyinvite/Invite_individual/invite_Individual_button'))
	}

	@Keyword
	def EnterBuyerDetails(String CompanyName='', String PAN_GSTIN='', String Email='', String Phone='') {
		WebUI.click(findTestObject('Object Repository/Companyinvite/inviteBuyer/checkbox Buyer'))
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Company name'), CompanyName)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter PANGSTIN'), PAN_GSTIN)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Email ID'), Email)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Contact Number'), Phone)
		WebUI.click(findTestObject('Object Repository/Companyinvite/Submit_Invite_Button'))

	}
	@Keyword
	def EnterSellerDetails(String CompanyName='', String PAN_GSTIN='', String Email='', String Phone='') {
		WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input_As Buyer_PrivateSwitchBase-input css-1m9pwf3'))
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Company name'), CompanyName)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter PANGSTIN'), PAN_GSTIN)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Email ID'), Email)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Contact Number'), Phone)
		WebUI.click(findTestObject('Object Repository/Companyinvite/Submit_Invite_Button'))

	}
	@Keyword
	def EnterBuyerSellerDetails(String CompanyName='', String PAN_GSTIN='', String Email='', String Phone='') {
		WebUI.click(findTestObject('Object Repository/Companyinvite/inviteBuyer/checkbox Buyer'))
		WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input_As Buyer_PrivateSwitchBase-input css-1m9pwf3'))
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Company name'), CompanyName)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter PANGSTIN'), PAN_GSTIN)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Email ID'), Email)
		WebUI.setText(findTestObject('Object Repository/Companyinvite/Invite_individual/Enter Contact Number'), Phone)
		WebUI.click(findTestObject('Object Repository/Companyinvite/Submit_Invite_Button'))

	}

	@Keyword
	def NavigatetoUserManagementPage() {
		WebUI.click(findTestObject('Object Repository/InviteUser/img_Invite_MuiAvatar-img css-1hy9t21'))
		WebUI.click(findTestObject('Object Repository/InviteUser/li_User Management'))
	}

	@Keyword
	def ClickOnInviteUserButtonPresentOnUserMgntPage() {
		WebUI.click(findTestObject('Object Repository/InviteUser/button_Invite User'))
		'Verfiy the text "Invite Individuals" below here which is not working as of now'
		//WebUI.verifyElementPresent(findTestObject('Object Repository/InviteUser/button_Invite User_1'))
	}

	@Keyword
	def EnterUserDetails(String User_Name,String Email_ID,String Mobile_No,String Designation ) {
		WebUI.setText(findTestObject('Giropie/input_Invite User Bulk_MuiInputBase-input M_bcd2f6'), User_Name)
		WebUI.setText(findTestObject('Object Repository/InviteUser/input_Invite User Bulk_MuiInputBase-input M_bcd2f6'), Email_ID)
		WebUI.click(findTestObject('Object Repository/InviteUser/li_Main Branch'))
		WebUI.setText(findTestObject('Object Repository/InviteUser/input__ra'),  Mobile_No)
		WebUI.setText(findTestObject('Object Repository/InviteUser/input_Invite User Bulk_MuiInputBase-input M_bcd2f6'),  Designation )
		WebUI.click(findTestObject('Object Repository/InviteUser/button_Invite User_1_2'))
	}

	def EnterBankDetails(String Branch_Name, String Account_Number, String IFSC, String MICR, String accountHolderName) {
		WebUI.click(findTestObject('Object Repository/Bank/AddBankButton_bankProfilePage'))
		WebUI.click(findTestObject('Object Repository/Bank/mainBranch_dropdown_bankProfile'))
		WebUI.click(findTestObject('Object Repository/Bank/dropdown_selection_mainBranch'))
		//WebUI.waitForElementVisible(findTestObject('Object Repository/Bank/svg_Add as Beneficiary_MuiSvgIcon-root MuiS_73e4e0'), 2)
		//WebUI.click(findTestObject('Object Repository/Bank/svg_Add as Beneficiary_MuiSvgIcon-root MuiS_73e4e0'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Bank/NewAddedObjects_HK/BankName_dropdown'), 2)
		WebUI.click(findTestObject('Object Repository/Bank/NewAddedObjects_HK/BankName_dropdown'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Bank/NewAddedObjects_HK/li_YES BANK'), 2)
		WebUI.click(findTestObject('Object Repository/Bank/NewAddedObjects_HK/li_YES BANK'))
		WebUI.setText(findTestObject('Object Repository/Bank/NewAddedObjects_HK/input__branchName'), Branch_Name)
		WebUI.setText(findTestObject('Object Repository/Bank/NewAddedObjects_HK/input__accountNumber'), Account_Number)
		WebUI.click(findTestObject('Object Repository/Bank/input__ifsc'))
		WebUI.setText(findTestObject('Object Repository/Bank/input__ifsc'), IFSC)
		WebUI.click(findTestObject('Object Repository/Bank/accountType_dropdown'))
		WebUI.click(findTestObject('Object Repository/Bank/li_Savings account'))
		WebUI.setText(findTestObject('Object Repository/Bank/NewAddedObjects_HK/input__micr'), MICR)
		WebUI.setText(findTestObject('Object Repository/Bank/NewAddedObjects_HK/input__accountHolderName'), accountHolderName)
		//WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Bank/NewAddedObjects_HK/button_Submit'))
		WebUI.verifyElementText(findTestObject('Object Repository/Bank/NewAddedObjects_HK/PopUp_BankProfileAddedSuccessfully'),
				('Bank Profile Added Successfully'))
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Bank/NewAddedObjects_HK/PopUp_BankProfileAddedSuccessfully'))

	}
	
	
	@Keyword
	def DeleteBankAccountWithoutBeneficiary() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/DeleteBankWithoutBeneficiary/Page_GIROPie/Bank_profile_deleteicon'), 3)

		WebUI.clickImage(findTestObject('Object Repository/DeleteBankWithoutBeneficiary/Page_GIROPie/Bank_profile_deleteicon'))

		WebUI.waitForElementClickable(findTestObject('Object Repository/DeleteBankWithoutBeneficiary/Page_GIROPie/delete_button_Yes'),3)

		WebUI.clickImage(findTestObject('Object Repository/DeleteBankWithoutBeneficiary/Page_GIROPie/delete_button_Yes'))

		WebUI.verifyElementText(findTestObject('Object Repository/DeleteBankWithoutBeneficiary/Page_GIROPie/Pop_Up_Bank Deleted Successfully'),
				'Bank Deleted Successfully')
		WebUI.takeElementScreenshot(findTestObject('Object Repository/DeleteBankWithoutBeneficiary/Page_GIROPie/Pop_Up_Bank Deleted Successfully'))

	}

}
