package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Grade;
import kr.or.sinsege.forward.MActionForward;

public class GgradeUpdateFormAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("execute GgradeUpdateFormAction");
		System.out.println(request.getParameter("g_grade") + " <--m_id MUpdateFormAction ");
		String g_grade = request.getParameter("g_grade");
		Mdao mdao = new Mdao();
		Grade ggrade = mdao.gSelectforUpdate(g_grade);
		request.setAttribute("ggrade", ggrade);
		MActionForward mactionforward = new MActionForward();
		mactionforward.setRedirect(false);
		mactionforward.setPath("/grade/ggrade/g_grade_form.jsp");
		
		return mactionforward;
		
		
	}

}
