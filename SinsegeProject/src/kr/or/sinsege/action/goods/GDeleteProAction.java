package kr.or.sinsege.action.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.GActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.forward.GActionForward;

public class GDeleteProAction implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_07 execute GDeleteProAction.java");
		String g_code = request.getParameter("g_code");
		System.out.println(g_code+"<--g_code execute GDeleteProAction.java");
		Gdao gdao = new Gdao();
		gdao.gDelete(g_code);
		
		GActionForward gf = new GActionForward();
		gf.setRedirect(false);
		gf.setPath("/Gsearch/g_search_list.sinsege");
		return gf;
	}

}
