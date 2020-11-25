package bean;

public class Employee {
	
	private int empid;
	private String empname;
	private int empphno;
	private String empaddr;
	private String empemail;
	private String usertype;
	private int retid;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid,String empname,int empphno,String empaddr,String empemail,String usertype,int retid) {
		super();
		this.empid=empid;
		this.empname=empname;
		this.empphno=empphno;
		this.empaddr=empaddr;
		this.empemail=empemail;
		this.usertype=usertype;
		this.retid=retid;
				
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpphno() {
		return empphno;
	}

	public void setEmpphno(int empphno) {
		this.empphno = empphno;
	}

	public String getEmpaddr() {
		return empaddr;
	}

	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public int getRetid() {
		return retid;
	}

	public void setRetid(int retid) {
		this.retid = retid;
	}
	
	@Override
	public String toString() {
		return "Employee[empid=" + empid + ",empname=" + empname + ",empphno=" + empphno + ",empaddr=" + empaddr + ",empemail=" + empemail + ",usertype=" + usertype + ",retid=" + retid +"]";
	}
	
}
