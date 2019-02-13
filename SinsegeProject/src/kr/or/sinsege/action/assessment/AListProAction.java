package kr.or.sinsege.action.assessment;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.AActionInterFace;
import kr.or.sinsege.dao.Adao;
import kr.or.sinsege.dto.Assessment;
import kr.or.sinsege.forward.AActionForward;

public class AListProAction implements AActionInterFace {

	@Override
	public AActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Adao adao = new Adao();
		List list = new ArrayList();
		System.out.println("04_02 execute AListProAction");
		// currentPage
		int page=1;
		// ROW_PER_PAGE
		int limit=10;
		
		if(request.getParameter("page")!=null) {
			page=Integer.parseInt(request.getParameter("page"));
		}
		// totalRow
		int listcount=adao.selectListPage(); // �� ����Ʈ �� �ޱ�
		System.out.println(listcount + " : listcount");
		
		// ��� �־ ��������
		list = adao.getList(page, limit);
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
		System.out.println(send + " : ������ send�� �� AListProAction");
		String send_tx = request.getParameter("send_tx");
		System.out.println(send_tx + " : ������ send_tx�� �� AListProAction");
		String send_start = request.getParameter("send_start");
		System.out.println(send_start + " : ������ send_start�� �� AListProAction");
		String send_end = request.getParameter("send_end");
		System.out.println(send_end + " : ������ send_end�� �� AListProAction");
		/*int startRow = Integer.parseInt(request.getParameter("startRow"));
		System.out.println(startRow + " : ������ startRow�� �� AListProAction");
		int ROW_PER_PAGE = Integer.parseInt(request.getParameter("ROW_PER_PAGE"));
		System.out.println(ROW_PER_PAGE + " : ������ ROW_PER_PAGE�� �� AListProAction");*/
		
/*		int startRow = 0;
		int ROW_PER_PAGE = 10;
		Adao adao = new Adao();
		ArrayList<Assessment> a = new ArrayList<Assessment>();
		
		a = adao.aList(send, send_tx, send_start, send_end, startRow, ROW_PER_PAGE);
		request.setAttribute("request_assessment", a);
		System.out.println(a + " <-- a ���� ����ֳ���??");
*/
		
		AActionForward af = new AActionForward();
		af.setRedirect(false);
		af.setPath("/assessment/alist/a_list.jsp");
		
		return af;
	}

}
