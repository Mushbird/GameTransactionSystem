package kr.or.sinsege.action.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.GActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.forward.GActionForward;

public class GInsertProAction implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_01 execute GInsertProAction.java");
		//ȭ�鿡 �Է��� ���� �޴´�.
		String gl_name = request.getParameter("gl_name");
		String g_cate = request.getParameter("g_cate");
		String g_name = request.getParameter("g_name");
		String g_id = request.getParameter("g_id");
		int g_price = Integer.parseInt(request.getParameter("g_price"));
		String g_detail = request.getParameter("g_detail");
		String g_state = request.getParameter("g_state");
		//ȭ�鿡�� �������� Ȯ���Ѵ�.
		System.out.println(gl_name+"<--gl_name execute GInsertProAction.java");
		System.out.println(g_cate+"<--g_cate execute GInsertProAction.java");
		System.out.println(g_name+"<--g_name execute GInsertProAction.java");
		System.out.println(g_id+"<--g_id execute GInsertProAction.java");
		System.out.println(g_price+"<--g_price execute GInsertProAction.java");
		System.out.println(g_detail+"<--g_detail execute GInsertProAction.java");
		System.out.println(g_state+"<--g_state execute GInsertProAction.java");
		//GoodsŬ���� ���� ������ ��ü���� �����Ѵ�.
		Goods goods = new Goods();
		goods.setGl_name(gl_name);
		goods.setG_cate(g_cate);
		goods.setG_name(g_name);
		goods.setG_id(g_id);
		goods.setG_price(g_price);
		goods.setG_detail(g_detail);
		goods.setG_state(g_state);
		//Gdao ��ü������ ��ǰ�Է�ó���� ���� �޼��� ȣ�� ����.
		Gdao gdao = new Gdao();
		gdao.gInsert(goods);
		//�Է�ó���� redirect���� forward���� �����Ѵ�.
		GActionForward gf = new GActionForward();
		gf.setRedirect(true);
		gf.setPath(request.getContextPath()+"/Gsearch/g_search_list.sinsege");
		System.out.println("---------------GInsertProAction End---------------");
		System.out.println();
		return gf;
	}

}
