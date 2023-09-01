package com.example.WebPageExample.pojoClass;



import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/*@Entity
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String address;
    private String email;
    private String phoneNumber;
  
    private Date dateUpdated;
    public Customer() {
        // Set dateUpdated to the current date by default
        this.dateUpdated = new Date();
    }

    @Lob
    private byte[] image;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String sj) {
		this.phoneNumber = sj;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
    
}*/
import javax.persistence.*;


@Entity
@Table(name = "customer",uniqueConstraints = @UniqueConstraint(columnNames = "UserMail"))
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int userId;

    @Column(name = "Username", length = 20,nullable = false)
    private String username;

    @Column(name = "UserAddress", length = 30,nullable = false)
    private String userAddress;

    @Column(name = "UserPhone", length = 25,nullable = false)
    private String userPhone;

    @Column(name = "UserMail", length = 20,nullable = false)
    private String userMail;

    @Lob
    @Column(name = "UserProfileImg")
    private byte[] userProfileImg;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DateUpdated",nullable = false)
    private Date dateUpdated;
    @Transient
    private String image;
    @Transient
    private Long phone1;
    @Transient
    private Long phone2;

    public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getPhone1() {
		return phone1;
	}

	public void setPhone1(Long phone1) {
		this.phone1 = phone1;
	}

	public Long getPhone2() {
		return phone2;
	}

	public void setphone2(Long phone2) {
		this.phone2 = phone2;
	}

	public Customer() {
        // Set dateUpdated to the current date by default
        this.dateUpdated = new Date();
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public byte[] getUserProfileImg() {
		return userProfileImg;
	}

	public void setUserProfileImg(byte[] userProfileImg) {
		this.userProfileImg = userProfileImg;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	
    

}



