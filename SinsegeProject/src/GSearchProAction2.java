

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

public class GSearchProAction2 implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_06 execute GSearchProAction");
		Gdao gdao = new Gdao();	
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
		gf.setPath("/goods/gsearch/g_search_list2.jsp");
		return gf;
	}

}

