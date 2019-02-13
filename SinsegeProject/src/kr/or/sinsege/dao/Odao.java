package kr.or.sinsege.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import kr.or.sinsege.dto.Order;

public class Odao {
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt = null;
	PreparedStatement pstmt1 = null;
	ResultSet rs = null;
	PreparedStatement pstmt2 = null;
	PreparedStatement pstmt3 = null;
	PreparedStatement pstmt4 = null;
	
	ArrayList<Order> order;
	Order o;
	
	public Odao() {
		System.out.println("05_Odao 생성자 메서드 실행");
		try{
			Context init = new InitialContext();
			System.out.println(init + " <-- init Odao() ");
	  	    ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
	  	    System.out.println("DB 연결 성공");
		}catch(Exception ex){
			System.out.println("DB 연결 실패 : " + ex);
			return;
		}	
	}
	
	// 구매자 소지금 감소, 포인트 증가 및 구매횟수 증가 
	public void oMAddDiscount(String m_code, String m_id, int m_gold, int o_total, int m_point, int m_count) throws SQLException {
		System.out.println("05 oMAddDiscount Odao");
		conn = ds.getConnection();
		
		// 소지금 감소
		int gold = m_gold - o_total;
		System.out.println(gold + " : 아이템 구매시 남은 소지금");
		// 포인트 적립
		double p = (double)(o_total) * (10 / (double)(o_total));
		
		System.out.println(p + " 추가할 포인트");
		int point = m_point + (int)p;
		System.out.println(point + " : 적립 후 포인트");
		// 구매횟수 증가
		int count = 1 + m_count;
		
		pstmt = conn.prepareStatement("UPDATE D_SSG_MEMBER SET m_id=?, m_gold=?, m_point=?, m_count=? WHERE m_code=?");
		pstmt.setString(1, m_id);
		pstmt.setInt(2, gold);
		pstmt.setInt(3, point);
		pstmt.setInt(4, count);
		pstmt.setString(5, m_code);
		int result1 = pstmt.executeUpdate();
		System.out.println(result1 + " : 구매자 소지금 감소 ,포인트 증가 및 구매 횟수 증가 처리 결과");
		
	}
	// 판매자 소지금 증가
	public void oGLAddNotify(String m_code2, int g_price, int m_gold2) throws SQLException {
		System.out.println("05 oGLAddNotify Odao");
		conn = ds.getConnection();
		
		// 소지금 증가
		int gold = m_gold2 + g_price;
		System.out.println(gold + " : 아이템 판매시 남은 소지금");
		
		pstmt = conn.prepareStatement("UPDATE D_SSG_MEMBER SET m_gold=? WHERE m_code=?");
		pstmt.setInt(1, gold);
		pstmt.setString(2, m_code2);
		int result = pstmt.executeUpdate();
		System.out.println(result + " : 판매자 소지금 증가 처리 결과");
		
	}
	// 판매자 판매 알림
	
	
	
	
	// 판매자 등급 가져오기 (리턴값 : 추가 가격)
	public int gPrice(String g_id) throws SQLException {
		System.out.println("05 gPrice Odao");
		conn = ds.getConnection();
		
		pstmt1 = conn.prepareStatement("SELECT G_GRADE FROM D_SSG_MEMBER WHERE M_ID=?");
		pstmt1.setString(1, g_id);
		rs = pstmt1.executeQuery();
		
		String g_grade = null;
		
		if(rs.next()) {
			g_grade = rs.getString("G_GRADE");
		}
		System.out.println(g_grade + " : 판매자 등급");
		
		
		System.out.println(g_grade + " : g_grade_1");
		
		pstmt2 = conn.prepareStatement("SELECT GL_PRICE FROM D_SSG_GOODS_LEVEL WHERE G_GRADE=?");
		pstmt2.setString(1, g_grade);
		rs = pstmt2.executeQuery();
		
		int gl_price = 0;
		
		if(rs.next()) {
			gl_price = rs.getInt("GL_PRICE");
		}
		System.out.println(gl_price + " : 등급 추가 가격(Gold)");
		
		return gl_price;
	}
	// 구매자 등급 가져오기 (리턴값 : 가격 할인율)
	public int mPercent(String m_id) throws SQLException {
		System.out.println("05 mPercent Odao");
		conn = ds.getConnection();
		
		pstmt3 = conn.prepareStatement("SELECT B_GRADE FROM D_SSG_MEMBER WHERE M_ID=?");
		pstmt3.setString(1, m_id);
		rs = pstmt3.executeQuery();
		
		String b_grade = null;
		
		if(rs.next()) {
			b_grade = rs.getString("B_GRADE");
		}
		System.out.println(b_grade + " : 구매자 등급");
		
		pstmt4 = conn.prepareStatement("SELECT B_PER FROM D_SSG_MEMBER_LEVEL WHERE B_code=?");
		pstmt4.setString(1, b_grade);
		rs = pstmt4.executeQuery();
		
		int b_per = 0;
		
		if(rs.next()) {
			b_per = rs.getInt("B_PER");
		}	
		System.out.println(b_per + " : 등급 할인 해택(%)");
		
		return b_per;
	}
	// 01 주문 등록
	public void oInsert(Order o) throws SQLException {
		System.out.println("05_02 oInsert Odao");	
		conn = ds.getConnection();
		
		PreparedStatement pstmt_count = null;
		pstmt_count = conn.prepareStatement("SELECT MAX(CAST(substr(o_code,7) AS DECIMAL)) AS MAXCOL FROM D_SSG_ORDER");
		rs = pstmt_count.executeQuery();
		
		int max = 0;
		String code = "order_";
		String o_code = "order_1";
		if(rs.next()) {
			max = rs.getInt(1);
			max = max + 1;
			o_code = code + max;
		}
		System.out.println(o_code + "<-m_code mInsert Mdao");
		
		pstmt = conn.prepareStatement("INSERT INTO D_SSG_ORDER VALUES(?,?,?,?,?,sysdate,?)");
		pstmt.setString(1, "o_code");
		pstmt.setString(2, o.getG_code());
		pstmt.setString(3, o.getM_id());
		pstmt.setString(4, "보유중");
		pstmt.setInt(5, o.getO_total());
		pstmt.setString(6, o.getG_name());
		int result = pstmt.executeUpdate();
		System.out.println(result + " 구매 처리 결과");
		
		pstmt_count.close();
	}
	// 02 주문된 화면
	public ArrayList<Order> oList(String m_id) throws SQLException {
		System.out.println("05_01 oList Odao");	
		conn = ds.getConnection();
		order = new ArrayList<Order>();
		System.out.println(m_id + " : 가져온 m_id");
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_ORDER WHERE m_id=?");
		pstmt.setString(1, m_id);
		rs = pstmt.executeQuery();
		System.out.println(rs + " : 주문된 화면 쿼리 실행 결과");
		
		while(rs.next()) {
			o = new Order();
			o.setO_code(rs.getString("o_code"));
			o.setG_code(rs.getString("g_code"));
			o.setG_name(rs.getString("g_name"));
			o.setO_total(rs.getInt("o_total"));
			o.setO_date(rs.getString("o_date"));
			order.add(o);
		}
		return order;
	}
}