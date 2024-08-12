package com.mtz.emp.db.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eId;
	private String eName;
	private String eAddress;
	private int eSalary;
	private String orgName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName, String eAddress, int eSalary, String orgName) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAddress = eAddress;
		this.eSalary = eSalary;
		this.orgName = orgName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	
	
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", eSalary=" + eSalary
				+ ", orgName=" + orgName + "]";
	}
	
	
	
}
