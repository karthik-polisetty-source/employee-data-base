package com.mtz.emp.db.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	private String eaddress;
	private int esalary;
	private String eorgName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String eaddress, int esalary, String eorgName) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalary = esalary;
		this.eorgName = eorgName;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public int getEsalary() {
		return esalary;
<<<<<<< HEAD

	}
=======
        }
	
>>>>>>> ab0e5b5451de41d1c4f3d0f0326262a5be4aa0c2
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public String getEorgName() {
		return eorgName;
	}
	public void setEorgName(String eorgName) {
		this.eorgName = eorgName;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", esalary=" + esalary
				+ ", eorgName=" + eorgName + "]";
	}
	
	
	
	
	
	
	
}
