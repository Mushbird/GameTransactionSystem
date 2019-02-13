package kr.or.sinsege.action.assessment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.AActionInterFace;
import kr.or.sinsege.dao.Adao;
import kr.or.sinsege.dto.Assessment;
import kr.or.sinsege.forward.AActionForward;

public class AUpdateFormAction implements AActionInterFace {

	@Override
	public AActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_03 AUpdateFormAction");
		System.out.println(request.getParameter("a_code") + " a_code AUpdateFormAction");
		String a_code = request.getParameter("a_code");
		
		Adao adao = new Adao();
		Assessment a = adao.aSelectforUpdate(a_code);
		
		request.setAttribute("a", a);
		AActionForward af = new AActionForward();
		af.setRedirect(false);
		af.setPath("/assessment/aupdate/a_update_form.jsp");
		
		return af;
	}

}
