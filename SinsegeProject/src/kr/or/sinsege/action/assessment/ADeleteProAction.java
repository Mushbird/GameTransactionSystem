package kr.or.sinsege.action.assessment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.AActionInterFace;
import kr.or.sinsege.dao.Adao;
import kr.or.sinsege.forward.AActionForward;

public class ADeleteProAction implements AActionInterFace {

	@Override
	public AActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_06 execute AActionForward");
		String a_code = request.getParameter("a_code");
		System.out.println(a_code + " <-- ¹Þ¾Ò³ª¿è ^^?");
		
		Adao adao = new Adao();
		adao.aDelete(a_code);
		
		AActionForward af = new AActionForward();
		af.setRedirect(false);
		af.setPath("/Alist/a_list.sinsege_a");
		
		return af;
	}

}
