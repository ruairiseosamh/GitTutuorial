public class Payment {
    private String ccType;
    private int ccNumber;
    private String date;
    private Address address;
    private String ccBankName;
    private Customer customer;
    
    public Payment()
    {
    	this.ccType = ccType;
    	this.ccNumber = ccNumber; 
    	this.date = date;
    	this.address = address;
    	this.ccBankName = ccBankName;
    	this.customer = customer;
    }

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public int getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCcBankName() {
		return ccBankName;
	}

	public void setCcBankName(String ccBankName) {
		this.ccBankName = ccBankName;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}