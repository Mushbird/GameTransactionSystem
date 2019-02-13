package kr.or.sinsege.action.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.GActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.forward.GActionForward;

public class GDetailAction implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_08 execute GDetailAction.java");
		String g_code = request.getParameter("g_code");
		String o_total = request.getParameter("o_total");
		System.out.println(g_code+"<--g_code execute GDetailAction.java");
		Goods goods = new Goods();
		Gdao gdao = new Gdao();
		goods = gdao.gSelectForUpdate(g_code);
		
		request.setAttribute("goods", goods);
		request.setAttribute("o_total", o_total);
		System.out.println(goods+"<--goods execute GDetailAction.java");
		
		GActionForward gf = new GActionForward();
		gf.setRedirect(false);
		gf.setPath("/goods/gsearch/g_detail.jsp");
		
		return gf;
	}

}
