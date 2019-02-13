package kr.or.sinsege.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;

import kr.or.sinsege.dto.Assessment;
import kr.or.sinsege.dto.Grade;
import kr.or.sinsege.dto.Member;

public class Mdao {
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	PreparedStatement pstmt2;
	ResultSet rs;
	Member member = null;
	ArrayList<Member> arraylistmember = null;
	
	
	
	public Mdao() {
		System.out.println("05_Mdao 생성자 메서드 실행");
		try{
			Context init = new InitialContext();
			System.out.println(init + " <-- init Mdao() ");
	  	    ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
	  		
		}catch(Exception ex){
			System.out.println("DB 연결 실패 : " + ex);
			return;
		}
	}
	// 글의 갯수 가져오기
	public int selectListPage() throws SQLException {
		System.out.println("05_07 selectListPage Adao.java");
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("SELECT COUNT(*) FROM D_SSG_ASSESSMENT");
		rs = pstmt.executeQuery();
		int listPage = 0;
		
		if(rs.next()) {
			listPage = rs.getInt("COUNT(*)");
		}
		
		return listPage;
	}
		
	// 글의 갯수
	public List getList(String sk, String sv, int page, int limit) throws SQLException {
		
		List list = new ArrayList();
		
		int startrow=(page-1)*10+1; // 읽기 시작할 row번호
		int endrow=startrow+limit-1; // 읽을 마지막 row번호
		System.out.println(page + " : page");
		System.out.println(limit + " : limit");
		System.out.println(startrow + " : 읽기 시작할 row번호");
		System.out.println(endrow + " : 읽을 마지막 row번호");
		
		conn = ds.getConnection();
		if((sk == null && sv == null)||( sk != null && sv.equals(""))) {
		pstmt = conn.prepareStatement("SELECT * FROM (SELECT * FROM (SELECT ROWNUM RNUM,M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE FROM D_SSG_MEMBER ) D_SSG_MEMBER WHERE RNUM >= ? ) WHERE RNUM <= ? ");
		pstmt.setInt(1, startrow);
		pstmt.setInt(2, endrow);
		} else if ( sk != null && sv != null ) {
		pstmt = conn.prepareStatement("SELECT * FROM (SELECT * FROM (SELECT ROWNUM RNUM,M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE FROM D_SSG_MEMBER WHERE " + sk + "=?) D_SSG_MEMBER WHERE RNUM >= ? ) WHERE RNUM <= ? ");
		pstmt.setString(1, sv);
		pstmt.setInt(2, startrow);
		pstmt.setInt(3, endrow);
		}
		rs = pstmt.executeQuery();
			
		while(rs.next()) {
			Member a = new Member();
			a.setM_code(rs.getString("M_CODE"));
			a.setB_name(rs.getString("B_NAME"));
			a.setGl_name(rs.getString("GL_NAME"));
			a.setM_id(rs.getString("M_ID"));
			a.setM_pw(rs.getString("M_PW"));
			a.setM_level(rs.getString("M_LEVEL"));
			a.setM_name(rs.getString("M_NAME"));
			a.setM_gold(rs.getInt("M_GOLD"));
			a.setM_point(rs.getInt("M_POINT"));
			a.setM_count(rs.getInt("M_COUNT"));
			a.setM_in(rs.getString("M_IN"));
			a.setM_date(rs.getString("M_DATE"));
			list.add(a);
		}

		return list;
	}
	// 상품 등급 수정화면
	public Grade gSelectforUpdate(String g_grade) throws SQLException {
		System.out.println("05_11 gSelectforUpdate Mdao.java");
		conn =ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_GOODS_LEVEL WHERE g_grade=?");
		pstmt.setString(1, g_grade);
		rs = pstmt.executeQuery();
		Grade grade = new Grade();
		if(rs.next()){
			//수정화면을 뿌려준다 (1번 방법 가능)
			grade = new Grade();
			grade.setG_grade(rs.getString("g_grade"));
			grade.setGl_name(rs.getString("gl_name"));
			grade.setGl_price(rs.getInt("gl_price"));
			grade.setGl_id(rs.getString("gl_id"));
			grade.setGl_date(rs.getString("gl_date"));
			
		}
		return grade;
		
	}
	// 상품 등급 수정처리
	public void gUpdate(Grade grade, String m_id) throws SQLException {
		System.out.println("05_12 bUpdate Mdao.java");
		conn =ds.getConnection();
		
		pstmt = conn.prepareStatement("UPDATE D_SSG_GOODS_LEVEL SET gl_name=?,gl_price=?,gl_id=?,gl_date=sysdate WHERE g_grade =?");
		pstmt.setString(1, grade.getGl_name());
		pstmt.setInt(2, grade.getGl_price());
		pstmt.setString(3, grade.getGl_id());
		pstmt.setString(4, grade.getG_grade());
				
		System.out.println(pstmt + " <-- pstmt");
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
	}
	// 상품 등급 확인
	public ArrayList<Grade> gselect() throws SQLException {
		System.out.println("05_11 gselect Mdao.java");
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_GOODS_LEVEL");
		rs = pstmt.executeQuery();
		ArrayList<Grade> arraylistgrade = new ArrayList<Grade>();
		Grade grade  = null;
		while(rs.next()) {
			grade = new Grade();
			grade.setG_grade(rs.getString("g_grade"));
			grade.setGl_name(rs.getString("gl_name"));
			grade.setGl_price(rs.getInt("gl_price"));
			grade.setGl_id(rs.getString("gl_id"));
			grade.setGl_date(rs.getString("gl_date"));
			arraylistgrade.add(grade);
		}
		return arraylistgrade;
	}
	// 구매자 등급 수정처리
	public void bUpdate(Grade grade, String m_id) throws SQLException {
		System.out.println("05_10 bUpdate Mdao.java");
		conn =ds.getConnection();
		
		pstmt = conn.prepareStatement("UPDATE D_SSG_MEMBER_LEVEL SET b_name=?,b_count=?,b_per=?,b_id=?,b_date=sysdate WHERE b_grade =?");
		pstmt.setString(1, grade.getB_name());
		pstmt.setInt(2, grade.getB_count());
		pstmt.setInt(3, grade.getB_per());
		pstmt.setString(4, m_id);
		pstmt.setString(5, grade.getB_grade());
				
		System.out.println(pstmt + " <-- pstmt");
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
	}
	// 구매자 등급 수정화면
	public Grade bSelectforUpdate(String b_grade) throws SQLException {
		System.out.println("05_09 bSelectforUpdate Mdao.java");
		conn =ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_MEMBER_LEVEL WHERE b_grade=?");
		pstmt.setString(1, b_grade);
		rs = pstmt.executeQuery();
		Grade grade = new Grade();
		if(rs.next()){
			//수정화면을 뿌려준다 (1번 방법 가능)
			grade = new Grade();
			grade.setB_count(rs.getInt("b_count"));
			grade.setB_date(rs.getString("b_date"));
			grade.setB_grade(rs.getString("b_grade"));
			grade.setB_name(rs.getString("b_name"));
			grade.setB_per(rs.getInt("b_per"));
			grade.setB_id(rs.getString("b_id"));
		}
		rs.close();
		pstmt.close();
		conn.close();
		
		return grade;
		
	}
	// 구매자 등급 화면
	public ArrayList<Grade> bselect() throws SQLException {
		System.out.println("05_08 bselect Mdao.java");
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_MEMBER_LEVEL");
		rs = pstmt.executeQuery();
		ArrayList<Grade> arraylistgrade = new ArrayList<Grade>();
		Grade grade  = null;
		while(rs.next()) {
			grade = new Grade();
			grade.setB_count(rs.getInt("b_count"));
			grade.setB_date(rs.getString("b_date"));
			grade.setB_grade(rs.getString("b_grade"));
			grade.setB_name(rs.getString("b_name"));
			grade.setB_per(rs.getInt("b_per"));
			grade.setB_id(rs.getString("b_id"));
			arraylistgrade.add(grade);
		}
		return arraylistgrade;
	}
	// 회원 삭제
	public void mdelete(String m_code) throws SQLException {
		System.out.println("05_06 delete Mdao.java");
		conn=ds.getConnection();
		pstmt = conn.prepareStatement("DELETE FROM D_SSG_MEMBER WHERE m_code = ?");
		pstmt.setString(1, m_code);
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
	}
	
	//회원 탈퇴/삭제 화면 처리
	public Member mDeleteforUpdate(String m_code) throws SQLException {
		System.out.println("05_05 aDeleteforUpdate Adao.java");
		member = new Member();
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_MEMBER WHERE m_code=?");
		pstmt.setString(1, m_code);
		System.out.println(pstmt + " <-- pstmt Mdao");
		rs = pstmt.executeQuery();
		System.out.println(rs + " <-- rs Mdao");
		if(rs.next()) {
			member.setM_code(rs.getString("m_code"));
			member.setM_id(rs.getString("m_id"));
			member.setM_name(rs.getString("m_name"));
		}
		rs.close();
		pstmt.close();
		conn.close();
		
		return member;
		
	}
	// 회원 수정처리
	public Member mUpdate(Member member) throws SQLException {
		System.out.println("05_07 mUpdate Mdao.java");
		System.out.println(member.getGl_name() + " : Gl_name 값");
		conn =ds.getConnection();
		pstmt = conn.prepareStatement("UPDATE D_SSG_MEMBER SET b_name=?,gl_name=?,m_id=?,m_pw=?,m_level=?,m_name=?,m_gold=?,m_point=?,m_count=?,m_date=sysdate WHERE m_code =?");
		pstmt.setString(1, member.getB_name());
		pstmt.setString(2, member.getGl_name());
		pstmt.setString(3, member.getM_id());
		pstmt.setString(4, member.getM_pw());
		pstmt.setString(5, member.getM_level());
		pstmt.setString(6, member.getM_name());
		pstmt.setInt(7, member.getM_gold());
		pstmt.setInt(8, member.getM_point());
		pstmt.setInt(9, member.getM_count());
		pstmt.setString(10, member.getM_code());
		
		System.out.println(pstmt + " <-- pstmt");
		pstmt.executeUpdate();
		
		pstmt2 = conn.prepareStatement("SELECT m_date FROM d_ssg_member where m_code=?");
		pstmt2.setString(1, member.getM_code());
		rs = pstmt2.executeQuery();
		
		if(rs.next()) {
			member.setM_date(rs.getString("m_date"));
		}
		rs.close();
		pstmt.close();
		pstmt2.close();
		conn.close();
		return member;
	}
	// 회원 수정화면 및 회원 정보 확인
	public Member mSelectforUpdate(String m_code) throws SQLException {
		System.out.println("05_05 mSelectforUpdate Mdao.java");
		conn =ds.getConnection();
		pstmt = conn.prepareStatement("SELECT m_code,b_name,gl_name,m_id,m_pw,m_level,m_name,m_gold,m_point,m_count,m_in,m_date FROM D_SSG_MEMBER WHERE m_code= ? ");
		pstmt.setString(1, m_code);
		rs = pstmt.executeQuery();
		System.out.println(rs + " : 쿼리 결과");
		if(rs.next()){
			member = new Member();
			member.setM_code(rs.getString("m_code"));
			member.setB_name(rs.getString("b_name"));
			member.setGl_name(rs.getString("gl_name"));
			member.setM_id(rs.getString("m_id"));
			member.setM_pw(rs.getString("m_pw"));
			member.setM_level(rs.getString("m_level"));
			member.setM_name(rs.getString("m_name"));
			member.setM_gold(rs.getInt("m_gold"));
			member.setM_point(rs.getInt("m_point"));
			member.setM_count(rs.getInt("m_count"));
			member.setM_in(rs.getString("m_in"));
			member.setM_date(rs.getString("m_date"));
			
		}
		
		return member;
	}
	// 회원 정보 확인 (id로 검색)
	public Member mSelectForId(String m_id) throws SQLException {
		System.out.println("05_05 mSelectforUpdate Mdao.java");
		conn =ds.getConnection();
		pstmt = conn.prepareStatement("SELECT m_code,b_name,gl_name,m_pw,m_level,m_name,m_gold,m_point,m_count,m_in,m_date FROM D_SSG_MEMBER WHERE m_id= ? ");
		pstmt.setString(1, m_id);
		rs = pstmt.executeQuery();
		System.out.println(rs + " : 쿼리 결과");
		if(rs.next()){
			member = new Member();
			member.setM_code(rs.getString("m_code"));
			member.setB_name(rs.getString("b_name"));
			member.setGl_name(rs.getString("gl_name"));
			member.setM_pw(rs.getString("m_pw"));
			member.setM_level(rs.getString("m_level"));
			member.setM_name(rs.getString("m_name"));
			member.setM_gold(rs.getInt("m_gold"));
			member.setM_point(rs.getInt("m_point"));
			member.setM_count(rs.getInt("m_count"));
			member.setM_in(rs.getString("m_in"));
			member.setM_date(rs.getString("m_date"));
			
		}
		
		return member;
	}
	// 회원 검색리스트
	public ArrayList<Member> mSearch(String sk, String sv) throws SQLException {
		System.out.println("05_04 mSearch Mdao.java");
		conn=ds.getConnection();
		if(sk == null && sv == null) {
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_MEMBER");
		} else if ( sk != null && sv.equals("")) {
			pstmt = conn.prepareStatement("SELECT * FROM D_SSG_MEMBER");	
		} else if ( sk != null && sv != null ) {
			pstmt = conn.prepareStatement("SELECT * FROM D_SSG_MEMBER WHERE " + sk + "= ?");
			pstmt.setString(1, sv);
		}
		rs = pstmt.executeQuery();
		arraylistmember = new ArrayList<Member>();
		while(rs.next()) {
			member = new Member();
			member.setM_code(rs.getString("m_code"));
			member.setB_name(rs.getString("b_name"));
			member.setGl_name(rs.getString("gl_name"));
			member.setM_id(rs.getString("m_id"));
			member.setM_pw(rs.getString("m_pw"));
			member.setM_level(rs.getString("m_level"));
			member.setM_name(rs.getString("m_name"));
			member.setM_gold(rs.getInt("m_gold"));
			member.setM_point(rs.getInt("m_point"));
			member.setM_count(rs.getInt("m_count"));
			member.setM_in(rs.getString("m_in"));
			member.setM_date(rs.getString("m_date"));
			
			arraylistmember.add(member);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		return arraylistmember;
		
	}
	// 회원 세션처리
	public Member mGetForSession(String m_id) throws SQLException {
		System.out.println("05_03 mGetForSession Mdao.java");
		conn=ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_MEMBER WHERE m_id=?");
		pstmt.setString(1, m_id);
		rs = pstmt.executeQuery();
		Member m = new Member();
		
		if(rs.next()) {
			m.setM_id(rs.getString("m_id"));
			m.setM_pw(rs.getString("m_pw"));
			m.setGl_name(rs.getString("gl_name"));
			m.setM_level(rs.getString("m_level"));
			m.setM_name(rs.getString("m_name"));
			m.setM_code(rs.getString("m_code"));
		}
		rs.close();
		pstmt.close();
		conn.close();
		return m;
		
	}
	// 로그인 체크
	public String mLoginCheck(String m_id, String m_pw) throws SQLException {
		System.out.println("05_02 mInsert Mdao");
		conn=ds.getConnection();
		String re = null;
		pstmt = conn.prepareStatement("SELECT m_pw FROM D_SSG_MEMBER where m_id=?");
		pstmt.setString(1, m_id);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			re = "아이디 일치";
			if(m_pw.equals(rs.getString("m_pw"))) {
				re = "로그인 성공";
			} else {
				re = "비밀번호 불일치";
			}
		} else {
			re = "아이디 불일치";
		}
		rs.close();
		pstmt.close();
		conn.close();	
		return re;
	}
	
	// 회원 등록
	public void mInsert(Member member) throws SQLException {
		System.out.println("05_01 mInsert Mdao");
		conn = ds.getConnection();
		PreparedStatement pstmt_count = null;
		pstmt_count = conn.prepareStatement("SELECT MAX(CAST(substr(m_code,5) AS DECIMAL)) AS MAXCOL FROM D_SSG_MEMBER");
		rs = pstmt_count.executeQuery();
		
		int max = 0;
		String code = "mem_";
		String m_code = "mem_1";
		if(rs.next()) {
			max = rs.getInt(1);
			max = max + 1;
			m_code = code + max;
		}
		System.out.println(m_code + "<-m_code mInsert Mdao");
		
		pstmt = conn.prepareStatement("INSERT INTO D_SSG_MEMBER VALUES(?,?,?,?,?,?,?,?,?,?,sysdate,sysdate)");
		pstmt.setString(1, m_code);
		pstmt.setString(2, "브론즈");
		pstmt.setString(3, "노멀");
		pstmt.setString(4, member.getM_id());
		pstmt.setString(5, member.getM_pw());
		pstmt.setString(6, "회원");
		pstmt.setString(7, member.getM_name());
		pstmt.setInt(8, 0);
		pstmt.setInt(9, 0);
		pstmt.setInt(10, 0);
		pstmt.executeUpdate();

		rs.close();
		pstmt_count.close();
		pstmt.close();
		conn.close();
	
		
	}
}