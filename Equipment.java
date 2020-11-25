package bean;

public class Equipment {
	
	private int equipid;
	private String equipname;
	private int equipstock;

	public Equipment() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Equipment(int equipid,String equipname,int equipstock) {
		super();
		this.equipid=equipid;
		this.equipname=equipname;
		this.equipstock=equipstock;
	}

	public int getEquipid() {
		return equipid;
	}

	public void setEquipid(int equipid) {
		this.equipid = equipid;
	}

	public String getEquipname() {
		return equipname;
	}

	public void setEquipname(String equipname) {
		this.equipname = equipname;
	}

	public int getEquipstock() {
		return equipstock;
	}

	public void setEquipstock(int equipstock) {
		this.equipstock = equipstock;
	}
	
	@Override
	public String toString() {
		return "Equipmment[equipid=" + equipid + ", equipname=" + equipname + ",equipstock=" + equipstock +"]"; 
	}
}
