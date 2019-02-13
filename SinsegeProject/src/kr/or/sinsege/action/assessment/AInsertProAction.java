package kr.or.sinsege.action.assessment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.AActionInterFace;
import kr.or.sinsege.dao.Adao;
import kr.or.sinsege.dto.Assessment;
import kr.or.sinsege.forward.AActionForward;

public class AInsertProAction implements AActionInterFace {

	@Override
	public AActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_01 execute AInsertProAction.java");
		String a_goods = request.getParameter("a_goods");
		String a_title = request.getParameter("a_title");
		String a_cate = request.getParameter("a_cate");
		String a_text = request.getParameter("a_text");
		String a_id = request.getParameter("a_id");
		int a_score = Integer.parseInt(request.getParameter("a_score"));
		System.out.println(a_goods + "<- a_goods");
		System.out.println(a_title + "<- a_title");
		System.out.println(a_cate + "<- a_cate");
		System.out.println(a_text + "<- a_text");
		System.out.println(a_id + "<- a_id");
		System.out.println(a_score + "<- a_score");
		
		Assessment a = new Assessment();
		a.setA_goods(a_goods);
		a.setA_title(a_title);
		a.setA_cate(a_cate);
		a.setA_text(a_text);
		a.setA_id(a_id);
		a.setA_score(a_score);
		
		Adao adao = new Adao();
		adao.aInsert(a);
		
		AActionForward af = new AActionForward();
		af.setRedirect(true);
		af.setPath(request.getContextPath() + "/Alist/a_list.sinsege_a");
		
		return af;
	}

}
