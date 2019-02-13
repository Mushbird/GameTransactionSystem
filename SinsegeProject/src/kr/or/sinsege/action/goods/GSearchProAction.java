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

public class GSearchProAction implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_06 execute GSearchProAction");
		Gdao gdao = new Gdao();
		List list = new ArrayList();
		int page=1;
		// ROW_PER_PAGE
		int limit=10;
		
		if(request.getParameter("page")!=null) {
			page=Integer.parseInt(request.getParameter("page"));
		}
		// totalRow
		int listcount=gdao.selectListPage(); // �� ����Ʈ �� �ޱ�
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
		
		
		String send = request.getParameter("send");
		String sendTx = request.getParameter("send_tx");
		String sendStart = request.getParameter("send_start");
		String sendEnd = request.getParameter("send_end");
		System.out.println(send + " : ������ send�� �� GSearchProAction");
		System.out.println(sendTx + " : ������ send_tx�� �� GSearchProAction");
		System.out.println(sendStart + " : ������ send_start�� �� GSearchProAction");
		System.out.println(sendEnd + " : ������ send_end�� �� GSearchProAction");
		HttpSession session=request.getSession();
		String m_id = (String)session.getAttribute("m_id");
	
		ArrayList<Goods> join = new ArrayList<Goods>();
		ArrayList<Goods> arraylist2 = new ArrayList<Goods>();
		join = gdao.gSearchJoin(send, sendTx, sendStart, sendEnd);
		arraylist2 = gdao.gaddprice();
		Grade grade = gdao.gaddper(m_id);
		request.setAttribute("join", join);
		request.setAttribute("arraylist2", arraylist2);
		request.setAttribute("grade", grade);
		System.out.println(join + " : join�� set�� ���� ��");
		
		GActionForward gf = new GActionForward();
		gf.setRedirect(false);
		gf.setPath("/goods/gsearch/g_search_list.jsp");
		return gf;
	}

}

