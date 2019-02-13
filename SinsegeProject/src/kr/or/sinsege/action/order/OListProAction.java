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
		System.out.println("�ֹ� ó��");
		String g_code = request.getParameter("g_code"); // ��ǰ�ڵ�
		System.out.println(g_code + " : �޾ƿ� g_code");
		String g_name = request.getParameter("g_name"); // ��ǰ �̸�
		System.out.println(g_name + " : �޾ƿ� g_name");
		String g_id = request.getParameter("g_id"); // �Ǹ��� �̸�
		System.out.println(g_id + " : �޾ƿ� g_id");
		int g_price = Integer.parseInt(request.getParameter("g_price")); // ���� ����
		System.out.println(g_price + " : �޾ƿ� g_price");
		int o_total = Integer.parseInt(request.getParameter("o_total")); // �� ����
		System.out.println(o_total + " : �޾ƿ� o_total");
		String g_state = request.getParameter("g_state"); // ��ǰ ����
		System.out.println(g_state + " : �޾ƿ� g_state");
		HttpSession session=request.getSession();
		String m_code = (String)session.getAttribute("m_code");
		System.out.println(m_code + " : ������ m_code"); // ������ �ڵ�
		String m_id = (String)session.getAttribute("m_id");
		System.out.println(m_id + " : ������ m_id"); // ������ �̸�
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
		// �����ڿ� ���� ���� ������ ���� ������ ���� ��������
		mem = mdao.mSelectforUpdate(m_code);
		int m_gold = mem.getM_gold();
		int m_count = mem.getM_count();
		int m_point = mem.getM_point();
		// �Ǹ��ڿ� ���� ���� ������ ���� �Ǹ��� ���� ��������
		mem2 = mdao.mSelectForId(g_id);
		String m_code2 = mem2.getM_code();
		int m_gold2 = mem2.getM_gold();
		// �������� �������� �����ϸ� �ٽ� ����Ʈ��
		if(m_gold < o_total) {
			of.setRedirect(false);
			of.setPath("/order/popup2.jsp");
		}else {
			// �������� �ִٸ� ������ ������ ����, ����Ʈ ���� �׸��� ����Ƚ�� ���� 
			odao.oMAddDiscount(m_code, m_id, m_gold, o_total, m_point, m_count);
			// �׸��� �Ǹ��� ������ ����
			odao.oGLAddNotify(m_code2, g_price, m_gold2);
			// �Ǹ��ڿ��� �Ǹ� �˸�
			
			// �ֹ� ���̺� �ֱ� (Insert)
			odao.oInsert(o);
			// ��ǰ ���¸� �Ǹ��� -> �ǸſϷ�� �ٲٱ�
			Gdao gdao = new Gdao();
			Goods goods = new Goods();
			goods.setG_code(g_code);
			goods.setG_state("�ǸſϷ�");
			gdao.gUpdate2(goods);
	
			of.setRedirect(false);
			of.setPath("/order/popup.jsp");
		}
		return of;
	}

}
