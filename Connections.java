package bean;

public class Connections {
	
	private int conid;
	private String conname;
	private int equipid;
	private float conprice;

	
	public Connections() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Connections(int conid,String conname,float conprice,int equipid) {
		super();
		this.conid=conid;
		this.conname=conname;
		this.conprice=conprice;
		this.equipid=equipid;
	}

	public int getConid() {
		return conid;
	}

	public void setConid(int conid) {
		this.conid = conid;
	}

	public String getConname() {
		return conname;
	}

	public void setConname(String conname) {
		this.conname = conname;
	}
	
	public float getConprice() {
		return conprice;
	}

	public void setConprice(float conprice) {
		this.conprice = conprice;
	}

	public int getEquipid() {
		return equipid;
	}

	public void setEquipid(int equipid) {
		this.equipid = equipid;
	}
	
	
@Override
public String toString() {
	return "Connection[conid=" + conid + ",conname=" + conname + ",conprice=" + conprice + ",equipid=" + equipid + "]";
}
}
