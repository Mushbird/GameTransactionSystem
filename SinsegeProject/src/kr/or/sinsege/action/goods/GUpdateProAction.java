package kr.or.sinsege.action.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.GActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.forward.GActionForward;

public class GUpdateProAction implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_06 execute GUpdateProAction.java");
		Goods goods = new Goods();
		goods.setG_code(request.getParameter("g_code"));
		goods.setGl_name(request.getParameter("gl_name"));
		goods.setG_cate(request.getParameter("g_cate"));
		goods.setG_name(request.getParameter("g_name"));
		goods.setG_price(Integer.parseInt(request.getParameter("g_price")));
		goods.setG_detail(request.getParameter("g_detail"));
		goods.setG_state(request.getParameter("g_state"));
		goods.setG_update(request.getParameter("g_update"));
		System.out.println(goods+"<--goods 에 담긴값 execute GUpdateProAction.java");
		Gdao gdao = new Gdao();
		gdao.gUpdate(goods);
		
		GActionForward gf = new GActionForward();
		gf.setRedirect(true);
		gf.setPath(request.getContextPath()+ "/Gsearch/g_search_list.sinsege");
		
		return gf;
	}

}
