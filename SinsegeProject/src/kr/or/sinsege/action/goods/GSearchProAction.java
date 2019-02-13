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
		int listcount=gdao.selectListPage(); // 총 리스트 수 받기
		System.out.println(listcount + " : listcount");
		
		// 모두 넣어서 가져오기
		list = gdao.getList(page, limit);
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
		String sendTx = request.getParameter("send_tx");
		String sendStart = request.getParameter("send_start");
		String sendEnd = request.getParameter("send_end");
		System.out.println(send + " : 가져온 send의 값 GSearchProAction");
		System.out.println(sendTx + " : 가져온 send_tx의 값 GSearchProAction");
		System.out.println(sendStart + " : 가져온 send_start의 값 GSearchProAction");
		System.out.println(sendEnd + " : 가져온 send_end의 값 GSearchProAction");
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
		System.out.println(join + " : join로 set한 리턴 값");
		
		GActionForward gf = new GActionForward();
		gf.setRedirect(false);
		gf.setPath("/goods/gsearch/g_search_list.jsp");
		return gf;
	}

}

