package kr.or.sinsege.action.goods;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.sinsege.Inter.GActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.dto.Grade;
import kr.or.sinsege.forward.GActionForward;

public class GListAction2 implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_04 execute GSearchProAction.java");
		
		String g_id = request.getParameter("m_id");
		System.out.println(g_id + " : �α��� �Ǿ� �ִ� id");
		
		Gdao gdao = new Gdao();
		List list = new ArrayList();
		int page=1;
		// ROW_PER_PAGE
		int limit=10;
		
		if(request.getParameter("page")!=null) {
			page=Integer.parseInt(request.getParameter("page"));
		}
		// totalRow
		int listcount=gdao.selectListPage2(g_id); // �� ����Ʈ �� �ޱ�
		System.out.println(listcount + " : listcount");
		
		// ��� �־ ��������
		list = gdao.getList(page, limit);
		System.out.println(list + " : list ��");
		// �� ������ ��
		int maxpage=(int)((double)listcount/limit+0.95); // 0.95�� ���ؼ� �ø�ó��
		// ���� �������� ������ ���� ������ �� (1, 11, 21 ...)
		int startpage = (((int) ((double)page / 10 + 0.9)) -1) * 10 + 1;
		// ���� �������� ������ ������ ������ �� (10, 20, 30 ...)
		int endpage = startpage+10-1;
		
		if (endpage> maxpage) endpage= maxpage;
		
		request.setAttribute("page", page); //���� ������ ��
 		request.setAttribute("maxpage", maxpage); //�ִ� ������ ��
 		request.setAttribute("startpage", startpage); //���� �������� ǥ���� ù ������ ��
 		request.setAttribute("endpage", endpage); //���� �������� ǥ���� �� ������ ��
		request.setAttribute("listcount",listcount); //�� ��
		request.setAttribute("list", list);
		
		list = gdao.gList(g_id, page, limit);
		
		request.setAttribute("list", list);
		System.out.println(list + "<--list ������ִ� ����Ʈ ���õ� �ּҰ�. execute GListAction2.java");
		
		ArrayList<Goods> arraylist2 = new ArrayList<Goods>();
		arraylist2 = gdao.gaddprice();
		Grade grade = gdao.gaddper(g_id);
		request.setAttribute("arraylist2", arraylist2);
		request.setAttribute("grade", grade);
		
		GActionForward gf = new GActionForward();
		gf.setRedirect(false);
		gf.setPath("/goods/glist/g_list.jsp");

		return gf;
	}
}