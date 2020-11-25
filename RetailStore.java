package bean;

public class RetailStore {
	
	private int retid;
	private String retname;
	private String retarea;
	private String retcity;
	private int retpincode;
	
	public RetailStore() {
		super();
	}
	
	public RetailStore(int retid,String retname,String retarea,String retcity,int retpincode) {
		super();
		this.retid=retid;
		this.retname=retname;
		this.retarea=retarea;
		this.retcity=retcity;
		this.retpincode=retpincode;
			}


	public int getRetid() {
		return retid;
	}

	public void setRetid(int retid) {
		this.retid = retid;
	}

	public String getRetname() {
		return retname;
	}

	public void setRetname(String retname) {
		this.retname = retname;
	}

	public String getRetarea() {
		return retarea;
	}

	public void setRetarea(String retarea) {
		this.retarea = retarea;
	}

	public String getRetcity() {
		return retcity;
	}

	public void setRetcity(String retcity) {
		this.retcity = retcity;
	}

	public int getRetpincode() {
		return retpincode;
	}

	public void setRetpincode(int retpincode) {
		this.retpincode = retpincode;
	}

	@Override
	public String toString() {
		return "RetailStore[retid=" + retid + " , + retname=" + retname + " , + retarea=" + retarea + " , + retcity=" + retcity + " , + retpincode=" + retpincode + "]"; 
	}
	
}
