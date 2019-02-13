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

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import kr.or.sinsege.dto.Assessment;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.dto.Grade;

public class Gdao {
	DataSource datasource = null;
	Connection connection = null;
	PreparedStatement preparedstatement = null;
	PreparedStatement preparedstatement2 = null;
	ResultSet resultset = null;
	ArrayList<Goods> arraylist = null;
	ArrayList<Grade> arraylistgrade = null;
	Goods goods = null;

	public Gdao() {
		System.out.println("05_Gdao ������ �޼��� ����");
		try{
			Context init = new InitialContext();
			System.out.println(init + " <-- init Mdao() ");
			datasource = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
	  	    System.out.println("DB ���� ����");
		}catch(Exception ex){
			System.out.println("DB ���� ���� : " + ex);
			return;
		}
	}
	// ���η�
	public Grade gaddper(String m_id) throws SQLException{
		System.out.println("05_03 gaddper Gdao.java");
		connection = datasource.getConnection();
		Grade grade = null;
		preparedstatement = connection.prepareStatement("SELECT b_per FROM D_SSG_MEMBER, D_SSG_MEMBER_LEVEL WHERE D_SSG_MEMBER.b_name=D_SSG_MEMBER_LEVEL.b_name AND D_SSG_MEMBER.m_id=?");
		preparedstatement.setString(1, m_id);
		resultset = preparedstatement.executeQuery();
		arraylistgrade = new ArrayList<Grade>();
		if(resultset.next()) {
			grade = new Grade();
			grade.setB_per(resultset.getInt("b_per"));
			
		}
		resultset.close();
		preparedstatement.close();
		connection.close();
		return grade;
		
	}
	// ��޺� �߰� ����
	public ArrayList<Goods> gaddprice() throws SQLException{
		System.out.println("05_03 gaddprice Gdao.java");
		connection = datasource.getConnection();
		
		preparedstatement = connection.prepareStatement("SELECT gl_price FROM D_SSG_GOODS, D_SSG_GOODS_LEVEL WHERE D_SSG_GOODS.gl_name=D_SSG_GOODS_LEVEL.gl_name");
		
		resultset = preparedstatement.executeQuery();
		arraylist = new ArrayList<Goods>();
		while(resultset.next()) {
			goods = new Goods();
			goods.setG_price(resultset.getInt("gl_price"));
			arraylist.add(goods);
		}
		resultset.close();
		preparedstatement.close();
		connection.close();
		return arraylist;
	}
	// ��ǰ ���
	public void gInsert(Goods goods) throws SQLException {
		System.out.println("05_01 gInsert Gdao.java");
		connection = datasource.getConnection();
		
		preparedstatement = connection.prepareStatement("SELECT MAX(CAST(substr(g_code,7) AS DECIMAL)) AS MAXCOL FROM D_SSG_GOODS");
		resultset = preparedstatement.executeQuery();
		
		int max = 0;
		String tempCode = "goods_";
		String g_code = "goods_1";
		if(resultset.next()){
			max = resultset.getInt(1);
			
			max = max + 1;
			g_code = tempCode + max;
		}
		System.out.println(g_code + " : ���õ� g_code Gdao.java");
		
		preparedstatement2 = connection.prepareStatement("INSERT INTO D_SSG_GOODS VALUES(?, ?, ?, ?, ?, ?, ?, ?, sysdate ,sysdate)");
		preparedstatement2.setString(1, g_code);
		preparedstatement2.setString(2, goods.getGl_name());
		preparedstatement2.setString(3, goods.getG_cate());
		preparedstatement2.setString(4, goods.getG_name());
		preparedstatement2.setString(5, goods.getG_id());
		preparedstatement2.setInt(6, goods.getG_price());
		preparedstatement2.setString(7, goods.getG_detail());
		preparedstatement2.setString(8, goods.getG_state());
		
		int Result = preparedstatement2.executeUpdate();
		System.out.println(Result+" : ��ǰ��� ���");
		
		resultset.close();
		preparedstatement2.close();
		preparedstatement.close();
		connection.close();
	}
	// ��ǰ ����Ʈ(�⺻)
	public ArrayList<Goods> gilst() throws SQLException{
		System.out.println("05_03 gilst Gdao.java");
		connection = datasource.getConnection();
		
		preparedstatement = connection.prepareStatement("SELECT * FROM D_SSG_GOODS");
		
		resultset = preparedstatement.executeQuery();
		
		arraylist = new ArrayList<Goods>();
		
		
		while(resultset.next()) {
			goods = new Goods();
			goods.setG_code(resultset.getString("g_code"));
			goods.setGl_name(resultset.getString("gl_name"));
			goods.setG_cate(resultset.getString("g_cate"));
			goods.setG_name(resultset.getString("g_name"));
			goods.setG_id(resultset.getString("g_id"));
			goods.setG_price(resultset.getInt("g_price"));
			goods.setG_detail(resultset.getString("g_detail"));
			goods.setG_state(resultset.getString("g_state"));
			goods.setG_date(resultset.getString("g_date"));
			goods.setG_update(resultset.getString("g_update"));
			arraylist.add(goods);
		
			}
		resultset.close();
		preparedstatement.close();
		connection.close();
		return arraylist;
	}
	// ��ǰ ����Ʈ (�˻�)
	public ArrayList<Goods> gSearchJoin(String send, String sendTx, String sendStart, String sendEnd) throws SQLException{
		System.out.println("05_02 gSearchJoin Gdao.java");
		connection = datasource.getConnection();
		
		arraylist = new ArrayList<Goods>();
		
		String simple = "SELECT * FROM D_SSG_GOODS";
		// �ƹ��͵� �Է°��� �������� ���� ���
		if((send != null & sendTx == "" & sendStart != null & sendEnd == "")
			|| (send != null & sendTx == "" & sendStart == "" & sendEnd != null)
			|| (send != null & sendTx == "" & sendStart == "" & sendEnd == "")
			|| (send == null & sendTx == null & sendStart == null & sendEnd == null)
			|| (send != null & sendTx == null & sendStart == null & sendEnd == null)) {
		preparedstatement = connection.prepareStatement(simple + ", D_SSG_MEMBER WHERE D_SSG_GOODS.G_ID = D_SSG_MEMBER.M_ID");
		// ī�װ��� ��¥�̸� ���۰� ���� �Ⱓ�� �ְ� �˻���� ��ĭ�� ���
		}else if(send.equals("g_date") & sendTx == "" & sendStart != null & sendEnd != null) {
			preparedstatement = connection.prepareStatement(simple + " WHERE D_SSG_GOODS." + send + " between ? and ?");
			preparedstatement.setString(1, sendStart);
			preparedstatement.setString(2, sendEnd);
		// ī�װ��� ��¥�̸� ���۰� ���� �Ⱓ �ְ� �˻�� �ִ� ���
		}else if(send.equals("g_date") & sendTx != null & sendStart != null & sendEnd != null) {
			preparedstatement = connection.prepareStatement(simple + ", D_SSG_MEMBER WHERE D_SSG_GOODS.G_ID = D_SSG_MEMBER.M_ID");
		// ���۰� �� �Ⱓ�� ��ĭ�� ���
		}else if(sendStart == "" & sendEnd == "") {
			preparedstatement = connection.prepareStatement(simple + " WHERE D_SSG_GOODS." + send + "=?");
			preparedstatement.setString(1, sendTx);
		// ī�װ�(�Ⱓ ����)�� �˻��� �׸��� ���۰� ���� �Ⱓ�� ��� �ִ� ���
		}else if(send != null & sendTx != null & sendStart != null & sendEnd != null){
			preparedstatement = connection.prepareStatement(simple + " WHERE D_SSG_GOODS.G_DATE between ? and ? and "+ send + "=?");
			preparedstatement.setString(1, sendStart);
			preparedstatement.setString(2, sendEnd);
			preparedstatement.setString(3, sendTx);
		}
		System.out.println(preparedstatement + " <-- preparedstatement end");
		resultset = preparedstatement.executeQuery();
		System.out.println(resultset + "<-- resultset gSearchJoin.jsp");
		
		while(resultset.next()) {
			goods = new Goods();
			goods.setG_code(resultset.getString("g_code"));
			goods.setGl_name(resultset.getString("gl_name"));
			goods.setG_cate(resultset.getString("g_cate"));
			goods.setG_name(resultset.getString("g_name"));
			goods.setG_id(resultset.getString("g_id"));
			goods.setG_price(resultset.getInt("g_price"));
			goods.setG_detail(resultset.getString("g_detail"));
			goods.setG_state(resultset.getString("g_state"));
			goods.setG_date(resultset.getString("g_date"));
			goods.setG_update(resultset.getString("g_update"));
			arraylist.add(goods);
			}
		resultset.close();
		preparedstatement.close();
		connection.close();
		
		return arraylist;
	}
	// ��ǰ ����ȭ�� ("��ǰ �󼼺���"������ ���)
	public Goods gSelectForUpdate(String g_code) throws SQLException {
		System.out.println("05_04 gSelectForUpdate Gdao.java");
		connection=datasource.getConnection();
		preparedstatement = connection.prepareStatement("SELECT * FROM D_SSG_GOODS WHERE g_code=?");
		preparedstatement.setString(1, g_code);
		resultset = preparedstatement.executeQuery();
		System.out.println(resultset + " : ���� �Ǵ� ��ȭ�� ���� ���");
		if(resultset.next()) {
			goods = new Goods();
			goods.setG_code(resultset.getString("g_code"));
			goods.setGl_name(resultset.getString("gl_name"));
			goods.setG_cate(resultset.getString("g_cate"));
			goods.setG_name(resultset.getString("g_name"));
			goods.setG_id(resultset.getString("g_id"));
			goods.setG_price(resultset.getInt("g_price"));
			goods.setG_detail(resultset.getString("g_detail"));
			goods.setG_state(resultset.getString("g_state"));
			goods.setG_date(resultset.getString("g_date"));
			goods.setG_update(resultset.getString("g_update"));
		}
		resultset.close();
		preparedstatement.close();
		connection.close();
		
		return goods;
	}
	// ��ǰ ���źҰ� ó��
	public void gUpdate2(Goods goods) throws SQLException {
		System.out.println("05_06 gUpdate Gdao.java");
		connection = datasource.getConnection();
		preparedstatement = connection.prepareStatement("UPDATE D_SSG_GOODS SET g_state= ?, g_update= sysdate WHERE g_code= ? ");
		preparedstatement.setString(1, goods.getG_state());
		preparedstatement.setString(2, goods.getG_code());
		int result = preparedstatement.executeUpdate();
		System.out.println(result + " : ��ǰ ���� �������");
		preparedstatement.close();
		connection.close();
	}
	// ��ǰ ����ó��
	public void gUpdate(Goods goods) throws SQLException {
		System.out.println("05_06 gUpdate Gdao.java");
		connection = datasource.getConnection();
		preparedstatement = connection.prepareStatement("UPDATE D_SSG_GOODS SET gl_name= ?, g_cate= ?, g_name= ?, g_price= ?, g_detail= ?, g_state= ?, g_update= sysdate WHERE g_code= ? ");
		preparedstatement.setString(1, goods.getGl_name());
		preparedstatement.setString(2, goods.getG_cate());
		preparedstatement.setString(3, goods.getG_name());
		preparedstatement.setInt(4, goods.getG_price());
		preparedstatement.setString(5, goods.getG_detail());
		preparedstatement.setString(6, goods.getG_state());
		preparedstatement.setString(7, goods.getG_code());
		System.out.println(preparedstatement+"<-- preparedstatement gUpdate Mdao.java");
		preparedstatement.executeUpdate();
		preparedstatement.close();
		connection.close();
	}
	// ��ǰ ����
	public void gDelete(String g_code) throws SQLException {
		System.out.println("05_07 gDelete Gdao.java");
		connection = datasource.getConnection();
		preparedstatement = connection.prepareStatement("DELETE FROM D_SSG_GOODS WHERE g_code = ?");
		preparedstatement.setString(1, g_code);
		preparedstatement.executeUpdate();
		
		preparedstatement.close();
		connection.close();
	}
	//���ǰ�����������(���)
	public int selectListPage() throws SQLException {
		System.out.println("05_07 selectListPage Adao.java");
		connection = datasource.getConnection();
		preparedstatement = connection.prepareStatement("SELECT COUNT(*) FROM D_SSG_GOODS");
		resultset = preparedstatement.executeQuery();
		int listPage = 0;
		
		if(resultset.next()) {
			listPage = resultset.getInt("COUNT(*)");
		}
		
		return listPage;
	}
	//���ǰ�����������(�ش��ϴ� �۸�)
	public int selectListPage2(String g_id) throws SQLException {
		System.out.println("05_07 selectListPage Adao.java");
		connection = datasource.getConnection();
		preparedstatement = connection.prepareStatement("SELECT COUNT(*) FROM D_SSG_GOODS WHERE g_id=?");
		preparedstatement.setString(1, g_id);
		resultset = preparedstatement.executeQuery();
		int listPage = 0;
		
		if(resultset.next()) {
			listPage = resultset.getInt("COUNT(*)");
		}
		
		return listPage;
	}
	//����Ʈ ��������
	public List getList(int page, int limit) throws SQLException {
				
		List list = new ArrayList();
		
		int startrow=(page-1)*10+1; // �б� ������ row��ȣ
		int endrow=startrow+limit-1; // ���� ������ row��ȣ
		System.out.println(page + " : page");
		System.out.println(limit + " : limit");
		System.out.println(startrow + " : �б� ������ row��ȣ");
		System.out.println(endrow + " : ���� ������ row��ȣ");
		
		connection = datasource.getConnection();
		preparedstatement = connection.prepareStatement("SELECT * FROM (SELECT * FROM (SELECT ROWNUM RNUM,g_code,gl_name,g_cate,g_name,g_id,g_price,g_detail,g_state,g_date,g_update FROM D_SSG_GOODS) D_SSG_GOODS WHERE RNUM >= ? ) WHERE RNUM <= ? ");
		preparedstatement.setInt(1, startrow);
		preparedstatement.setInt(2, endrow);
		resultset = preparedstatement.executeQuery();
		
		while(resultset.next()) {
			Goods a = new Goods();
			a.setG_code(resultset.getString("g_CODE"));
			a.setGl_name(resultset.getString("gl_name"));
			a.setG_cate(resultset.getString("g_cate"));
			a.setG_name(resultset.getString("g_name"));
			a.setG_id(resultset.getString("g_id"));
			a.setG_price(resultset.getInt("g_price"));
			a.setG_detail(resultset.getString("g_detail"));
			a.setG_state(resultset.getString("g_state"));
			a.setG_date(resultset.getString("g_date"));
			a.setG_update(resultset.getString("g_update"));
			list.add(a);
		}
		return list;
	}
	//��ϵ� ��ǰ ��Ȳ
		public List gList(String g_id, int page, int limit) throws SQLException {
					
			List list = new ArrayList();
			
			int startrow=(page-1)*10+1; // �б� ������ row��ȣ
			int endrow=startrow+limit-1; // ���� ������ row��ȣ
			System.out.println(page + " : page");
			System.out.println(limit + " : limit");
			System.out.println(startrow + " : �б� ������ row��ȣ");
			System.out.println(endrow + " : ���� ������ row��ȣ");
			
			connection = datasource.getConnection();
			preparedstatement = connection.prepareStatement("SELECT * FROM (SELECT * FROM (SELECT ROWNUM RNUM,g_code,gl_name,g_cate,g_name,g_id,g_price,g_detail,g_state,g_date,g_update FROM D_SSG_GOODS WHERE g_id=?) D_SSG_GOODS WHERE RNUM >= ? ) WHERE RNUM <= ? ");
			preparedstatement.setString(1, g_id);
			preparedstatement.setInt(2, startrow);
			preparedstatement.setInt(3, endrow);
			resultset = preparedstatement.executeQuery();
			
			while(resultset.next()) {
				Goods a = new Goods();
				a.setG_code(resultset.getString("g_CODE"));
				a.setGl_name(resultset.getString("gl_name"));
				a.setG_cate(resultset.getString("g_cate"));
				a.setG_name(resultset.getString("g_name"));
				a.setG_id(resultset.getString("g_id"));
				a.setG_price(resultset.getInt("g_price"));
				a.setG_detail(resultset.getString("g_detail"));
				a.setG_state(resultset.getString("g_state"));
				a.setG_date(resultset.getString("g_date"));
				a.setG_update(resultset.getString("g_update"));
				list.add(a);
			}
			return list;
		}	
}