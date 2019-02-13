package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Grade;
import kr.or.sinsege.forward.MActionForward;

public class GgradeUpdateProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("execute GgradeUpdateProAction");
		Grade grade = new Grade();
		request.setCharacterEncoding("euc-kr");
		grade.setG_grade(request.getParameter("g_grade"));
		grade.setGl_name(request.getParameter("gl_name"));
		grade.setGl_price(Integer.parseInt(request.getParameter("gl_price")));
		grade.setGl_id(request.getParameter("gl_id"));
		grade.setGl_date(request.getParameter("gl_date"));
		HttpSession session=request.getSession();
		String m_id = (String)session.getAttribute("m_id");
		Mdao mdao = new Mdao();
		mdao.gUpdate(grade, m_id);
		
		MActionForward mf = new MActionForward();
		mf.setRedirect(true);
		mf.setPath(request.getContextPath()+ "/Ggrade/g_grade_list.sinsege_m");
		
		return mf;
	}

}
