package com.companyname.UIconstants;


public class LoginPageUI {
	
	
	public LoginPageUI() {	
	}
	// Locators
	public String btn_close_ads = "/html/body/div[7]/div[2]/article/div/div[2]/button/svg";
	public String btn_first_login_xpath = "//button[contains(text(),'Masuk')]";
	public String txtbox_usrnm_xpath = "//input[@id='email-phone']";
	public String btn_next_id = "email-phone-submit";
	public String txtbox_pwd_xpath = "//input[@id='password-input']";
	public String btn_login_xpath = "//span[contains(text(),'Masuk')]";
	public String profile_header_xpath = "//div[@id='my-profile-header']";
	public String pop_up_xpath = "//div[contains(text(),'Pilih Metode Verifikasi')]";
	public String pop_up_btn_close_xpath = "body/div[@id='zeus-root']/div[1]/div[2]/section[1]/div[1]/a[1]";
	public String unregistered_email_xpath = "//h5[contains(text(),'Email belum terdaftar')]";
	public String btn_other_method_xpath = "//span[contains(text(),'Metode Lain')]";
	public String pop_up_choose_account_xpath = "//div[contains(text(),'Pilih Akun Untuk Masuk')]";
}
