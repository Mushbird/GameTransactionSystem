package kr.or.sinsege.action.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.GActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.forward.GActionForward;

public class GUpdateFormAction implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_05 execute GUpdateFormAction.java");
		String g_code = request.getParameter("send_gCode");
		System.out.println(g_code+"<--g_code execute GUpdateFormAction.java");
		
		Gdao gdao = new Gdao();
		Goods goods = new Goods();
		goods = gdao.gSelectForUpdate(g_code); 
		
		request.setAttribute("goods", goods);
		System.out.println(goods+"<--goods execute GUpdateFormAction.java");
		
		GActionForward gf = new GActionForward();
		gf.setRedirect(false);
		gf.setPath("/goods/gupdate/g_update_form.jsp");
		return gf;
		
	}

}
