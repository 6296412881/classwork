package collectionex;

public class Employee {
	private int empId;
	private String EmpName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		EmpName = empName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Emp id: "+ getEmpId()+" Emp Name: "+ getEmpName());
	}
	

}
