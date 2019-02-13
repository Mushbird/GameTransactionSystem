package kr.or.sinsege.action.assessment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.AActionInterFace;
import kr.or.sinsege.dao.Adao;
import kr.or.sinsege.dto.Assessment;
import kr.or.sinsege.forward.AActionForward;

public class AUpdateProAction implements AActionInterFace {

	@Override
	public AActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_04 execute AUpdateProAction.java");
		Assessment a = new Assessment();
		a.setA_code(request.getParameter("a_code"));
		a.setA_goods(request.getParameter("a_goods"));
		a.setA_title(request.getParameter("a_title"));
		a.setA_cate(request.getParameter("a_cate"));
		a.setA_text(request.getParameter("a_text"));
		a.setA_score(Integer.parseInt(request.getParameter("a_score")));
		a.setA_update(request.getParameter("a_update"));
		
		Adao adao = new Adao();
		adao.aUpdate(a);
		
		AActionForward af = new AActionForward();
		af.setRedirect(true);
		af.setPath(request.getContextPath()+ "/Alist/a_list.sinsege_a");
		
		return af;
	}

}
