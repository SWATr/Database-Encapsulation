package db;

// Generated Apr 7, 2015 10:37:15 PM by Hibernate Tools 4.3.1

/**
 * Departments generated by hbm2java
 */
public class Departments implements java.io.Serializable {

	private String deptNo;
	private String deptName;

	public Departments() {
	}

	public Departments(String deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}