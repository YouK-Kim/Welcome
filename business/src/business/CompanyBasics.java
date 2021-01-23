package business;

public class CompanyBasics {
	private String name;
	private String part;
	private String address;
	private String birthday;
	
	public CompanyBasics(String name, String part, String address, String birthday) {
		this.name = name;
		this.part = part;
		this.address = address;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	
}
