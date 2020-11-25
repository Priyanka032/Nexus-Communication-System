package bean;

public class Vendor {

	private int vendid;
	private String vendname;
	private int equipid;
	
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vendor(int vendid,String vendname,int equipid) {
		super();
		this.vendid=vendid;
		this.vendname=vendname;
		this.equipid=equipid;
	}

	public int getVendid() {
		return vendid;
	}

	public void setVendid(int vendid) {
		this.vendid = vendid;
	}

	public String getVendname() {
		return vendname;
	}

	public void setVendname(String vendname) {
		this.vendname = vendname;
	}

	public int getEquipid() {
		return equipid;
	}

	public void setEquipid(int equipid) {
		this.equipid = equipid;
	}

	@Override
	public String toString() {
		return "Vendor[vendid=" + vendid + ", vendname=" + vendname + ", equipid=" + equipid +"]";
	}
}
