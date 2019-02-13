package kr.or.sinsege.action.order;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.sinsege.Inter.OActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dao.Odao;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.dto.Member;
import kr.or.sinsege.dto.Order;
import kr.or.sinsege.forward.OActionForward;

public class OListProAction implements OActionInterFace {

	@Override
	public OActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("주문 처리");
		String g_code = request.getParameter("g_code"); // 상품코드
		System.out.println(g_code + " : 받아온 g_code");
		String g_name = request.getParameter("g_name"); // 상품 이름
		System.out.println(g_name + " : 받아온 g_name");
		String g_id = request.getParameter("g_id"); // 판매자 이름
		System.out.println(g_id + " : 받아온 g_id");
		int g_price = Integer.parseInt(request.getParameter("g_price")); // 원래 가격
		System.out.println(g_price + " : 받아온 g_price");
		int o_total = Integer.parseInt(request.getParameter("o_total")); // 총 가격
		System.out.println(o_total + " : 받아온 o_total");
		String g_state = request.getParameter("g_state"); // 상품 상태
		System.out.println(g_state + " : 받아온 g_state");
		HttpSession session=request.getSession();
		String m_code = (String)session.getAttribute("m_code");
		System.out.println(m_code + " : 가져온 m_code"); // 구매자 코드
		String m_id = (String)session.getAttribute("m_id");
		System.out.println(m_id + " : 가져온 m_id"); // 구매자 이름
		Order o = new Order();
		o.setG_code(g_code);
		o.setG_state(g_state);
		o.setG_name(g_name);
		o.setM_id(m_id);
		o.setO_total(o_total);
		
		OActionForward of = new OActionForward();
		
		Odao odao = new Odao();
		Mdao mdao = new Mdao();
		Member mem = new Member();
		Member mem2 = new Member();
		// 구매자에 대한 정보 수정을 위한 구매자 정보 가져오기
		mem = mdao.mSelectforUpdate(m_code);
		int m_gold = mem.getM_gold();
		int m_count = mem.getM_count();
		int m_point = mem.getM_point();
		// 판매자에 대한 정보 수정을 위한 판매자 정보 가져오기
		mem2 = mdao.mSelectForId(g_id);
		String m_code2 = mem2.getM_code();
		int m_gold2 = mem2.getM_gold();
		// 구매자의 소지금이 부족하면 다시 리스트로
		if(m_gold < o_total) {
			of.setRedirect(false);
			of.setPath("/order/popup2.jsp");
		}else {
			// 소지금이 있다면 구매자 소지금 감소, 포인트 증가 그리고 구매횟수 증가 
			odao.oMAddDiscount(m_code, m_id, m_gold, o_total, m_point, m_count);
			// 그리고 판매자 소지금 증가
			odao.oGLAddNotify(m_code2, g_price, m_gold2);
			// 판매자에게 판매 알림
			
			// 주문 테이블에 넣기 (Insert)
			odao.oInsert(o);
			// 상품 상태를 판매중 -> 판매완료로 바꾸기
			Gdao gdao = new Gdao();
			Goods goods = new Goods();
			goods.setG_code(g_code);
			goods.setG_state("판매완료");
			gdao.gUpdate2(goods);
	
			of.setRedirect(false);
			of.setPath("/order/popup.jsp");
		}
		return of;
	}

}
