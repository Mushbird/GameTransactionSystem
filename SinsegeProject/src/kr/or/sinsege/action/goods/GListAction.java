package kr.or.sinsege.action.goods;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.GActionInterFace;
import kr.or.sinsege.dao.Gdao;
import kr.or.sinsege.dto.Goods;
import kr.or.sinsege.forward.GActionForward;

public class GListAction implements GActionInterFace {

	@Override
	public GActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_04 execute GSearchProAction.java");
		Gdao gdao = new Gdao();
		ArrayList<Goods> arraylist = new ArrayList<Goods>();
		arraylist = gdao.gilst();
		
		request.setAttribute("arraylist", arraylist);
		System.out.println(arraylist + "<--arraylist 에들어있는 리스트 세팅된 주소값. execute GSearchProAction.java");
		
		GActionForward gf = new GActionForward();
		gf.setRedirect(false);
		gf.setPath("/goods/glist/g_list.jsp");
		System.out.println("---------------GListProAction End---------------");
		System.out.println();
		return gf;
	}
}