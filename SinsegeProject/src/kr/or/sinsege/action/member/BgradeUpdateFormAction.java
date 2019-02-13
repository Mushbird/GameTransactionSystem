package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Grade;
import kr.or.sinsege.forward.MActionForward;

public class BgradeUpdateFormAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("execute BgradeUpdateFormAction");
		System.out.println(request.getParameter("b_grade") + " <--m_id MUpdateFormAction ");
		String b_grade = request.getParameter("b_grade");
		Mdao mdao = new Mdao();
		Grade bgrade = mdao.bSelectforUpdate(b_grade);
		request.setAttribute("bgrade", bgrade);
		MActionForward mactionforward = new MActionForward();
		mactionforward.setRedirect(false);
		mactionforward.setPath("/grade/bgrade/b_grade_form.jsp");
		
		return mactionforward;
	}
}