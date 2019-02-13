package kr.or.sinsege.action.order;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.OActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.dao.Odao;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.dto.Order;
import kr.or.sinsege.forward.GActionForward;
import kr.or.sinsege.forward.OActionForward;

public class OListFormAction implements OActionInterFace {

	@Override
	public OActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("execute OListFormAction.java");
		String m_id = request.getParameter("m_id");
		Odao odao = new Odao();
		ArrayList<Order> order = new ArrayList<Order>();
		
		order = odao.oList(m_id);
		
		request.setAttribute("order", order);
		System.out.println(order + "<--order 세팅 주소값");
		
		OActionForward of = new OActionForward();
		of.setRedirect(false);
		of.setPath("/order/osearch/o_search_list.jsp");
		return of;
	}
}
