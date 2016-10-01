/**
 * This is the personal contact class, this class holds the details for personal
 * contacts.
 * 
 * @author Kamalpreetsingh
 *
 */

public class PersonalContact extends Contact {

	private String address;
	private String city;
	private String state;
	private int zip;

	public PersonalContact(String name, int age, String address, String city, String state, int zip) {
		super(name, age);
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	/**
	 * Setting up toString method for personal contacts and formatting them.
	 */
	public String toString() {

		return super.toString() + address + ", " + city + " " + state + " " + zip;
	}

	@Override
	public void validate() {
		if (super.getName().equals("")) {
			throw new NullPointerException("The name cannot be left empty.");
		}
		if (super.getAge() > 100 || super.getAge() < 1) {
			throw new IllegalStateException("Age must be within 1-100");
		}
		if (address.equals(null) || city.equals(null)) {
			throw new IllegalStateException("Address or city is required.");
		}

		if (state.length() != 2) {
			throw new IllegalStateException("State length must be 2");
		}

		if (this.zip != 5) {
			throw new IllegalStateException("Zip code length must be 5");
		}

	}

}
