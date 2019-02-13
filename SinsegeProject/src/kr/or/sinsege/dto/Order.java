package kr.or.sinsege.dto;

public class Order {
	private String o_code;
	private String g_code;
	private String g_name;
	private String m_id;
	private String g_state;
	private int o_total;
	private String o_date;
	
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		System.out.println(g_name + " : setG_name Setting / Order.java");
		this.g_name = g_name;
	}
	public String getO_code() {
		return o_code;
	}
	public void setO_code(String o_code) {
		System.out.println(o_total + " : setO_total Setting / Order.java");
		this.o_code = o_code;
	}
	public String getG_code() {
		return g_code;
	}
	public void setG_code(String g_code) {
		System.out.println(g_code + " : setG_code Setting / Order.java");
		this.g_code = g_code;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		System.out.println(m_id + " : setM_id Setting / Order.java");
		this.m_id = m_id;
	}
	public String getG_state() {
		return g_state;
	}
	public void setG_state(String g_state) {
		System.out.println(g_state + " : setG_state Setting / Order.java");
		this.g_state = g_state;
	}
	public int getO_total() {
		return o_total;
	}
	public void setO_total(int o_total) {
		System.out.println(o_total + " : setO_total Setting / Order.java");
		this.o_total = o_total;
	}
	public String getO_date() {
		return o_date;
	}
	public void setO_date(String o_date) {
		System.out.println(o_date + " : setO_date Setting / Order.java");
		this.o_date = o_date;
	}
}