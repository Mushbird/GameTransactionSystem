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

public class Adao {
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	PreparedStatement pstmt_insert;
	ResultSet rs;
	Assessment a = null;
	ArrayList<Assessment> alg = null;
	
	public Adao() {
		System.out.println("05_Adao 생성자 메서드 실행");
		try {
			Context init = new InitialContext();
			System.out.println(init + " <- init Adao()");
			ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		} catch(Exception ex) {
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
	// 리스트 가져오기
	public List getList(int page, int limit) throws SQLException {
		
		String board_list_sql="select * from (select * from (select rownum rnum,A_CODE,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE from D_SSG_ASSESSMENT) D_SSG_ASSESSMENT where rnum<=?) where rnum>=?";
		
		List list = new ArrayList();
		
		int startrow=(page-1)*10+1; // 읽기 시작할 row번호
		int endrow=startrow+limit-1; // 읽을 마지막 row번호
		System.out.println(page + " : page");
		System.out.println(limit + " : limit");
		System.out.println(startrow + " : 읽기 시작할 row번호");
		System.out.println(endrow + " : 읽을 마지막 row번호");
		
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM (SELECT * FROM (SELECT ROWNUM RNUM,A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE FROM D_SSG_ASSESSMENT) D_SSG_ASSESSMENT WHERE RNUM >= ? ) WHERE RNUM <= ? ");
		pstmt.setInt(1, startrow);
		pstmt.setInt(2, endrow);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Assessment a = new Assessment();
			a.setA_code(rs.getString("A_CODE"));
			a.setA_goods(rs.getString("A_GOODS"));
			a.setA_title(rs.getString("A_TITLE"));
			a.setA_text(rs.getString("A_TEXT"));
			a.setA_id(rs.getString("A_ID"));
			a.setA_score(rs.getInt("A_SCORE"));
			a.setA_date(rs.getString("A_DATE"));
			a.setA_update(rs.getString("A_UPDATE"));
			a.setA_cate(rs.getString("A_CATE"));
			list.add(a);
		}

		return list;
	}
	
	// 항목 삭제
	public void aDelete(String a_code) throws SQLException {
		System.out.println("05_06 aDelete Adao.java");
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("DELETE FROM D_SSG_ASSESSMENT WHERE a_code = ?");
		pstmt.setString(1, a_code);
		pstmt.executeQuery();
		
		pstmt.close();
		conn.close();
	}
	// 삭제 항목 조회
	public Assessment aDeleteforUpdate(String a_code) throws SQLException {
		System.out.println("05_05 aDeleteforUpdate Adao.java");
		a = new Assessment();
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_ASSESSMENT WHERE a_code = ?");
		pstmt.setString(1, a_code);
		System.out.println(pstmt + " <-- pstmt Adao");
		rs = pstmt.executeQuery();
		System.out.println(rs + " <-- rs Gdao");
		if(rs.next()) {
			a.setA_code(rs.getString("a_code"));
			a.setA_title(rs.getString("a_title"));
			a.setA_id(rs.getString("a_id"));
		}
		rs.close();
		pstmt.close();
		conn.close();
		
		return a;
	}
	// 리스트 검색
	public ArrayList<Assessment> aList(String send, String send_tx, String send_start, String send_end, int startRow, int ROW_PER_PAGE) throws SQLException {
		System.out.println("05_02 aList Adao.java");
		
		conn = ds.getConnection();
		
		if((send != null & send_tx == "" & send_start != null & send_end == "")
				|| (send != null & send_tx == "" & send_start == "" & send_end != null)
				|| (send != null & send_tx == "" & send_start == "" & send_end == "")
				|| (send == null & send_tx == null & send_start == null & send_end == null)
				|| (send != null & send_tx == null & send_start == null & send_end == null)) {
			pstmt = conn.prepareStatement("SELECT * FROM (SELECT A.*, ROWNUM AS RNUM FROM (SELECT * FROM D_SSG_ASSESSMENT ORDER BY a_code desc)  A WHERE ROWNUM <= ?) WHERE RNUM > ?");
			pstmt.setInt(1, ROW_PER_PAGE);
			pstmt.setInt(2, startRow);
			}else if(send.equals("a_date") & send_tx == "" & send_start != null & send_end != null) {
				pstmt = conn.prepareStatement("SELECT * FROM (SELECT A.*, ROWNUM AS RNUM FROM (SELECT * FROM D_SSG_ASSESSMENT ORDER BY a_code desc) A WHERE ROWNUM <= ?) WHERE RNUM > ? and a_date between ? and ?");
				pstmt.setInt(1, ROW_PER_PAGE);
				pstmt.setInt(2, startRow);
				pstmt.setString(3, send_start);
				pstmt.setString(4, send_end);
			}else if(send_start == "" & send_end == "") {
				pstmt = conn.prepareStatement("SELECT * FROM (SELECT A.*, ROWNUM AS RNUM FROM (SELECT * FROM D_SSG_ASSESSMENT WHERE ? = ? ORDER BY a_code desc) A WHERE ROWNUM <= ?) WHERE RNUM > ?");
				pstmt.setString(1, send);
				pstmt.setString(2, send_tx);
				pstmt.setInt(3, ROW_PER_PAGE);
				pstmt.setInt(4, startRow);
			}else if(send != null & send_tx != null & send_start != null & send_end != null){
				pstmt = conn.prepareStatement("SELECT * FROM (SELECT A.*, ROWNUM AS RNUM FROM (SELECT * FROM D_SSG_ASSESSMENT WHERE ? = ? ORDER BY a_code desc) A WHERE ROWNUM <= ?) WHERE RNUM > ? and a_date between ? and ?");
				pstmt.setString(1, send);
				pstmt.setString(2, send_tx);
				pstmt.setInt(3, ROW_PER_PAGE);
				pstmt.setInt(4, startRow);
				pstmt.setString(5, send_start);
				pstmt.setString(6, send_end);

			}
		System.out.println(pstmt + " <-- pstmt End");
		rs = pstmt.executeQuery();
		System.out.println(rs + " <-- rs");
		alg = new ArrayList<Assessment>();
		
		while(rs.next()) {
			a = new Assessment();
			a.setA_code(rs.getString("a_code"));
			a.setA_goods(rs.getString("a_goods"));
			a.setA_title(rs.getString("a_title"));
			a.setA_text(rs.getString("a_text"));
			a.setA_id(rs.getString("a_id"));
			a.setA_score(rs.getInt("a_score"));
			a.setA_date(rs.getString("a_date"));
			a.setA_update(rs.getString("a_update"));
			a.setA_cate(rs.getString("a_cate"));
			alg.add(a);
		}
		System.out.println(alg + " <- alg");
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return alg;
	}
	// 리스트 항목 수정 처리
	public void aUpdate(Assessment a) throws SQLException {
		System.out.println("05_04 aUpdate Adao.java");
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("UPDATE D_SSG_ASSESSMENT SET a_goods = ?, a_title = ?, a_cate = ?, a_text = ?, a_score = ?, a_update = sysdate WHERE a_code = ?");
		pstmt.setString(1, a.getA_goods());
		pstmt.setString(2, a.getA_title());
		pstmt.setString(3, a.getA_cate());
		pstmt.setString(4, a.getA_text());
		pstmt.setInt(5, a.getA_score());
		pstmt.setString(6, a.getA_code());
		
		int result = pstmt.executeUpdate();
		System.out.println(result + " <-- result Gdao.java");
		
		pstmt.close();
		conn.close();
	}
	// 리스트 항목 수정 화면
	public Assessment aSelectforUpdate(String a_code) throws SQLException {
		System.out.println("05_03 aSelectforUpdate Adao.java");
		
		a = new Assessment();
		conn = ds.getConnection();
		pstmt = conn.prepareStatement("SELECT * FROM D_SSG_ASSESSMENT WHERE a_code = ?");
		pstmt.setString(1, a_code);
		System.out.println(pstmt + " <-- pstmt Gdao.java");
		rs = pstmt.executeQuery();
		System.out.println(rs + " <-- rs");
		if(rs.next()) {
			a.setA_code(rs.getString("a_code"));
			a.setA_goods(rs.getString("a_goods"));
			a.setA_title(rs.getString("a_title"));
			a.setA_id(rs.getString("a_id"));
			a.setA_cate(rs.getString("a_cate"));
			a.setA_text(rs.getString("a_text"));
			a.setA_score(rs.getInt("a_score"));
			a.setA_date(rs.getString("a_date"));
			a.setA_update(rs.getString("a_update"));
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return a;
	}
	
	// 항목 추가
	public void aInsert(Assessment a) throws SQLException {
		System.out.println("05_01 aInsert Adao.java");
		conn=ds.getConnection();
		pstmt = conn.prepareStatement("SELECT max(CAST(substr(A_CODE, 1) AS DECIMAL)) as maxcol FROM D_SSG_ASSESSMENT");
		rs = pstmt.executeQuery();
		System.out.println(rs + " <- rs aInsert.java");
		
		int max = 0;
		String tempCode = "";
		String a_code = "1";
		if(rs.next()){
			max = rs.getInt(1);
			System.out.println(max + "<-- max 1");
			max = max + 1;
			System.out.println(max + "<-- max 2");
			a_code = tempCode + max;
		}
		System.out.println(a_code + " <-- a_code");
		
		pstmt_insert = conn.prepareStatement("INSERT INTO D_SSG_ASSESSMENT VALUES (?, ?, ?, ?, ?, ?, sysdate, sysdate, ?)");
		pstmt_insert.setString(1, a_code);
		pstmt_insert.setString(2, a.getA_goods());
		pstmt_insert.setString(3, a.getA_title());
		pstmt_insert.setString(4, a.getA_text());
		pstmt_insert.setString(5, a.getA_id());
		pstmt_insert.setInt(6, a.getA_score());
		pstmt_insert.setString(7, a.getA_cate());
		
		int insertResult = pstmt_insert.executeUpdate();
		System.out.println(insertResult + " <-- insertResult 상품등록결과");
		
		rs.close();
		pstmt.close();
		conn.close();
	}
}
