package org.hibernate.Vend.DAL;

public class VendorDAL {

	//TODO: Everything!
	
	
	/*
	 * Account Creation Logic:
	 * 		BLL:
	 * 			User fills out a UI form that is stored in 'vend'
	 * 				*Ensure the email is well formed
	 * 			request 'vendal' to lookup the email to ensure it is not already bound to a GUID
	 * 		DAL:
	 * 			Lookup and ensure the provided email is not already bound to a GUID in the table
	 * 			If okay, perform create user account, return success/errorcode
	 * 			else, return failure code: EMAIL_IN_USE
	 * 		BLL:
	 * 			Inform user of success/failure
	 * 				On success, send verification email I guess
	 * 				On failure, laugh at them mercilessly/try again if appropriate
	 * 
	 * 
	 */
}
