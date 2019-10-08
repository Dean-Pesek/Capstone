package pesek.dean.capstoneapi.models;

public class Doctor {
	private int id;
	private String firstName;
	private String lastName;
	private PhoneNumber primaryPhoneNumber;
	private PhoneNumber secondaryPhoneNumber;
	private Email primaryEmail;
	private Email secondaryEmail;

	public Doctor() {

	}

	public Doctor(String firstName, String lastName, PhoneNumber primaryPhoneNumber, Email primaryEmail) {

	}

	public Doctor(String firstName, String lastName, PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber,
			Email primaryEmail) {
		this(firstName, lastName, primaryPhoneNumber, primaryEmail);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
	}

	public Doctor(String firstName, String lastName, PhoneNumber primaryPhoneNumber, Email primaryEmail,
			Email secondaryEmail) {
		this(firstName, lastName, primaryPhoneNumber, primaryEmail);
		setSecondaryEmail(secondaryEmail);
	}

	public Doctor(String firstName, String lastName, PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber,
			Email primaryEmail, Email secondaryEmail) {
		this(firstName, lastName, primaryPhoneNumber, primaryEmail);
		setSecondaryEmail(secondaryEmail);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && firstName != null)
			this.firstName = firstName;
		else {
			// throw input exception
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (!firstName.isEmpty() && firstName != null)
			this.lastName = lastName;
		else {
			// throw input exception
		}
	}

	public PhoneNumber getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}

	public void setPrimaryPhoneNumber(PhoneNumber primaryPhoneNumber) {
		if (primaryPhoneNumber != null)
			this.primaryPhoneNumber = primaryPhoneNumber;
		else {
			// throw input exception
		}
	}

	public PhoneNumber getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}

	public void setSecondaryPhoneNumber(PhoneNumber secondaryPhoneNumber) {
		if (secondaryPhoneNumber != null)
			this.secondaryPhoneNumber = secondaryPhoneNumber;
		else {
			// throw input exception
		}
	}

	public Email getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(Email primaryEmail) {
		if (primaryEmail != null)
			this.primaryEmail = primaryEmail;
		else {
			// throw input exception
		}
	}

	public Email getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(Email secondaryEmail) {
		if (secondaryEmail != null)
			this.secondaryEmail = secondaryEmail;
		else {
			// throw input exception
		}
	}
}
