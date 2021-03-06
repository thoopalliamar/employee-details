package com.capgemini.customer.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Customer {

	@Id
	private Long accountID;
	private Long empID;
	@JsonInclude(Include.NON_EMPTY)
	private String type;
	@JsonInclude(Include.NON_EMPTY)
	private String classType;
	@JsonInclude(Include.NON_EMPTY)
	private String holderName;
	@JsonInclude(Include.NON_EMPTY)
	private String token;
	@JsonInclude(Include.NON_EMPTY)
	private String cardType;
	@JsonInclude(Include.NON_EMPTY)
	private String cardExpiry;
	@JsonInclude(Include.NON_EMPTY)
	private String bankType;
	@JsonInclude(Include.NON_EMPTY)
	private String bankRouting;
	@JsonInclude(Include.NON_EMPTY)
	private int deletePending;

	// Getters and Setters for all the fields
	
	
	public Long getEmpID() {
		return empID;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public void setEmpID(Long empID) {
		this.empID = empID;
	}

	public Long getAccountID() {
		return accountID;
	}

	public void setAccountID(Long accountID) {
		this.accountID = accountID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getBankRouting() {
		return bankRouting;
	}

	public void setBankRouting(String bankRouting) {
		this.bankRouting = bankRouting;
	}

	public int getDeletePending() {
		return deletePending;
	}

	public void setDeletePending(int deletePending) {
		this.deletePending = deletePending;
	}

	// All Args Constructer
	public Customer(Long empID, Long accountID, String type, String classType, String holderName, String token,
			String cardType, String cardExpiry, String bankType, String bankRouting, int deletePending) {
		super();
		this.empID = empID;
		this.accountID = accountID;
		this.type = type;
		this.classType = classType;
		this.holderName = holderName;
		this.token = token;
		this.cardType = cardType;
		this.cardExpiry = cardExpiry;
		this.bankType = bankType;
		this.bankRouting = bankRouting;
		this.deletePending = deletePending;
	}

	// No Args Constructer
	public Customer() {
		super();
	}

}
