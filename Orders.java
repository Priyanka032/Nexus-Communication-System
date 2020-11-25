package bean;

public class Orders {
	
	private int orderid;
	private float orderamt;
	private int custid;
	private int retid;
	private int conid;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Orders(int orderid,float orderamt,int custid,int retid,int conid) {
		super();
		this.orderid=orderid;
		this.orderamt=orderamt;
		this.custid=custid;
		this.retid=retid;
		this.conid=conid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public float getOrderamt() {
		return orderamt;
	}

	public void setOrderamt(float orderamt) {
		this.orderamt = orderamt;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getRetid() {
		return retid;
	}

	public void setRetid(int retid) {
		this.retid = retid;
	}

	public int getConid() {
		return conid;
	}

	public void setConid(int conid) {
		this.conid = conid;
	}
	
	@Override
	public String toString() {
		return "Order[orderid=" + orderid + ", orderamt=" + orderamt + ",custid=" + custid + ",retid=" + retid + ", conid=" + conid +"]";
	}

}
