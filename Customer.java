package bean;

public class Customer {
	
	private int custid;
	private String custname;
	private int custphno;
	private String custaddr;
	private String custemail;
	private int retid;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int custid, String custname,int custphno,String custaddr,String custemail,int retid) {
		super();
		this.custid=custid;
		this.custname=custname;
		this.custphno=custphno;
		this.custaddr=custaddr;
		this.custemail=custemail;
		this.retid=retid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getCustphno() {
		return custphno;
	}

	public void setCustphno(int custphno) {
		this.custphno = custphno;
	}

	public String getCustaddr() {
		return custaddr;
	}

	public void setCustaddr(String custaddr) {
		this.custaddr = custaddr;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

	public int getRetid() {
		return retid;
	}

	public void setRetid(int retid) {
		this.retid = retid;
	}
	
	@Override
	public String toString() {
		return "Customer[custid=" + custid+ ", custname=" + custname + ", custphno=" + custphno + ", custaddr=" + custaddr + ", custemail=" + custemail + ", retid" + retid +"]";
	}
	
	

}
