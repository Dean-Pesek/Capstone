package pesek.dean.capstoneapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = true)
	private String middlenitial;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private Email primaryEmail;
	@Column(nullable = true)
	private Email secondaryEmail;
	@Column(nullable = false)
	private Address privaryAddress;
	@Column(nullable = true)
	private Address secondaryAddress;
	@Column(nullable = false)
	private PhoneNumber primaryPhoneNumber;
	@Column(nullable = true)
	private PhoneNumber secondaryPhoneNumber;
	@Column(nullable = false)
	@ManyToOne
	private Doctor doctor;

	public Patient() {

	}

	public Patient(String firstName, String lastName, Email primaryEmail, Address primaryAddress,
			PhoneNumber primaryPhoneNumber, Doctor doctor) {
		setFirstName(firstName);
		setLastName(lastName);
		setPrimaryEmail(primaryEmail);
		setPrivaryAddress(primaryAddress);
		setPrimaryPhoneNumber(primaryPhoneNumber);
	}

	public Patient(String firstName, String middleInitial, String lastName, Email primaryEmail, Address primaryAddress,
			PhoneNumber primaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setMiddlenitial(middleInitial);
	}

	public Patient(String firstName, String lastName, Email primaryEmail, Email secondaryEmail, Address primaryAddress,
			PhoneNumber primaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setSecondaryEmail(secondaryEmail);
	}

	public Patient(String firstName, String lastName, Email primaryEmail, Address primaryAddress,
			Address secondaryAddress, PhoneNumber primaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setSecondaryAddress(secondaryAddress);
	}

	public Patient(String firstName, String lastName, Email primaryEmail, Address primaryAddress,
			PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
	}

	public Patient(String firstName, String middleInitial, String lastName, Email primaryEmail, Email secondaryEmail,
			Address primaryAddress, PhoneNumber primaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setMiddlenitial(middleInitial);
		setSecondaryEmail(secondaryEmail);
	}

	public Patient(String firstName, String middleInitial, String lastName, Email primaryEmail, Address primaryAddress,
			Address secondaryAddress, PhoneNumber primaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setMiddlenitial(middleInitial);
		setSecondaryAddress(secondaryAddress);
	}

	public Patient(String firstName, String middleInitial, String lastName, Email primaryEmail, Address primaryAddress,
			PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
		setMiddlenitial(middleInitial);
	}

	public Patient(String firstName, String lastName, Email primaryEmail, Email secondaryEmail, Address primaryAddress,
			Address secondaryAddress, PhoneNumber primaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setSecondaryEmail(secondaryEmail);
		setSecondaryAddress(secondaryAddress);
	}

	public Patient(String firstName, String lastName, Email primaryEmail, Email secondaryEmail, Address primaryAddress,
			PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setSecondaryEmail(secondaryEmail);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
	}

	public Patient(String firstName, String lastName, Email primaryEmail, Address primaryAddress,
			Address secondaryAddress, PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setSecondaryAddress(secondaryAddress);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
	}

	public Patient(String firstName, String middleInitial, String lastName, Email primaryEmail, Email secondaryEmail,
			Address primaryAddress, Address secondaryAddress, PhoneNumber primaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setMiddlenitial(middleInitial);
		setSecondaryAddress(secondaryAddress);
		setSecondaryEmail(secondaryEmail);
	}

	public Patient(String firstName, String middleInital, String lastName, Email primaryEmail, Email secondaryEmail,
			Address primaryAddress, PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setMiddlenitial(middleInital);
		setSecondaryEmail(secondaryEmail);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
	}

	public Patient(String firstName, String middleInitial, String lastName, Email primaryEmail, Address primaryAddress,
			Address secondaryAddress, PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setMiddlenitial(middleInitial);
		setSecondaryAddress(secondaryAddress);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
	}

	public Patient(String firstName, String lastName, Email primaryEmail, Email secondaryEmail, Address primaryAddress,
			Address secondaryAddress, PhoneNumber primaryPhoneNumber, PhoneNumber secondaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setSecondaryEmail(secondaryEmail);
		setSecondaryAddress(secondaryAddress);
		setSecondaryPhoneNumber(secondaryPhoneNumber);
	}

	public Patient(String firstName, String middleInitial, String lastName, Email primaryEmail, Email secondaryEmail,
			Address primaryAddress, Address secondaryAddress, PhoneNumber primaryPhoneNumber,
			PhoneNumber secondaryPhoneNumber, Doctor doctor) {
		this(firstName, lastName, primaryEmail, primaryAddress, primaryPhoneNumber, doctor);
		setMiddlenitial(middleInitial);
		setSecondaryEmail(secondaryEmail);
		setSecondaryAddress(secondaryAddress);
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

	public String getMiddlenitial() {
		return middlenitial;
	}

	public void setMiddlenitial(String middlenitial) {
		if (!middlenitial.isEmpty() && middlenitial != null)
			this.middlenitial = middlenitial;
		else {
			// throw input exception
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && lastName != null)
			this.lastName = lastName;
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

	public Address getPrivaryAddress() {
		return privaryAddress;
	}

	public void setPrivaryAddress(Address privaryAddress) {
		if (privaryAddress != null)
			this.privaryAddress = privaryAddress;
		else {
			// throw input exception
		}
	}

	public Address getSecondaryAddress() {
		return secondaryAddress;
	}

	public void setSecondaryAddress(Address secondaryAddress) {
		if (secondaryAddress != null)
			this.secondaryAddress = secondaryAddress;
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		if (doctor != null)
			this.doctor = doctor;
		else {
			// throw input exception
		}
	}
}
