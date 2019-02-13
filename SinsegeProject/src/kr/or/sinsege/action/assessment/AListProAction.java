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
		int listcount=adao.selectListPage(); // 총 리스트 수 받기
		System.out.println(listcount + " : listcount");
		
		// 모두 넣어서 가져오기
		list = adao.getList(page, limit);
		System.out.println(list + " : list 값");
		// 총 페이지 수
		int maxpage=(int)((double)listcount/limit+0.95); // 0.95를 더해서 올림처리
		// 현재 페이지에 보여줄 시작 페이지 수 (1, 11, 21 ...)
		int startpage = (((int) ((double)page / 10 + 0.9)) -1) * 10 + 1;
		// 현재 페이지에 보여줄 마지막 페이지 수 (10, 20, 30 ...)
		int endpage = startpage+10-1;
		
		if (endpage> maxpage) endpage= maxpage;
		
		request.setAttribute("page", page); //현재 페이지 수
 		request.setAttribute("maxpage", maxpage); //최대 페이지 수
 		request.setAttribute("startpage", startpage); //현재 페이지에 표시할 첫 페이지 수
 		request.setAttribute("endpage", endpage); //현재 페이지에 표시할 끝 페이지 수
		request.setAttribute("listcount",listcount); //글 수
		request.setAttribute("list", list);
		
		String send = request.getParameter("send");
		System.out.println(send + " : 가져온 send의 값 AListProAction");
		String send_tx = request.getParameter("send_tx");
		System.out.println(send_tx + " : 가져온 send_tx의 값 AListProAction");
		String send_start = request.getParameter("send_start");
		System.out.println(send_start + " : 가져온 send_start의 값 AListProAction");
		String send_end = request.getParameter("send_end");
		System.out.println(send_end + " : 가져온 send_end의 값 AListProAction");
		/*int startRow = Integer.parseInt(request.getParameter("startRow"));
		System.out.println(startRow + " : 가져온 startRow의 값 AListProAction");
		int ROW_PER_PAGE = Integer.parseInt(request.getParameter("ROW_PER_PAGE"));
		System.out.println(ROW_PER_PAGE + " : 가져온 ROW_PER_PAGE의 값 AListProAction");*/
		
/*		int startRow = 0;
		int ROW_PER_PAGE = 10;
		Adao adao = new Adao();
		ArrayList<Assessment> a = new ArrayList<Assessment>();
		
		a = adao.aList(send, send_tx, send_start, send_end, startRow, ROW_PER_PAGE);
		request.setAttribute("request_assessment", a);
		System.out.println(a + " <-- a 뭐가 들어있나욤??");
*/
		
		AActionForward af = new AActionForward();
		af.setRedirect(false);
		af.setPath("/assessment/alist/a_list.jsp");
		
		return af;
	}

}
