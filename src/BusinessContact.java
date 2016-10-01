/**
 * This is the business contact class, this class holds the details for personal contacts.
 * @author Kamalpreetsingh
 *
 */
public class BusinessContact extends Contact{
	
	private String businessPhone;
	private String cellPhone;
	
	
	public BusinessContact(String name, int age, String businessPhone, String cellPhone) {
		super(name, age);
		this.businessPhone=businessPhone;
		this.cellPhone=cellPhone;
	}


	public String getBusinessPhone() {
		return businessPhone;
	}


	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}


	public String getCellPhone() {
		return cellPhone;
	}


	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	/**
	 * Setting up toString method for business contacts and formatting them.
	 */
	public String toString(){
		return super.toString()+businessPhone+", "+cellPhone;
	}


	@Override
	public void validate() {
		
		if (super.getName().equals("")){
			throw new NullPointerException("A Null Pointer Exception occured.");
		}
		if(super.getAge()>100||super.getAge()<1){
			throw new IllegalStateException("An Illegal State Exception occured");
		}
		if(businessPhone.length()!=12){
			throw new IllegalStateException("An Illegal State Exception occured");
		}
	}

}
