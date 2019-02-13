package kr.or.sinsege.action.member;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.dao.Adao;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Member;
import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.forward.MActionForward;

public class MSearchProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("05_07 execute MListProAction");
		request.setCharacterEncoding("euc-kr");
		List list = new ArrayList();
		Mdao mdao = new Mdao();
		
		String sk = request.getParameter("sk");
		String sv = request.getParameter("sv");
		System.out.println(sk + " <- sk");
		System.out.println(sv + " <- sv");
		
		// currentPage
		int page=1;
		// ROW_PER_PAGE
		int limit=10;
		
		if(request.getParameter("page")!=null) {
			page=Integer.parseInt(request.getParameter("page"));
		}
		// totalRow
		int listcount=mdao.selectListPage(); // �� ����Ʈ �� �ޱ�
		System.out.println(listcount + " : listcount");
		
		// ��� �־ ��������
		list = mdao.getList(sk ,sv ,page, limit);
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
		
		MActionForward forward = new MActionForward();
		forward.setRedirect(false);
		forward.setPath("/member/msearch/m_search_list.jsp");
		
		return forward;
		
	}

}
