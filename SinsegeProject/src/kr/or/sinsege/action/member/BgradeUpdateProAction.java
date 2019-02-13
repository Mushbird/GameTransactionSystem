package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Grade;
import kr.or.sinsege.forward.MActionForward;

public class BgradeUpdateProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("05_04 execute BgradeUpdateProAction");
		Grade bgrade = new Grade();
		request.setCharacterEncoding("euc-kr");
		bgrade.setB_grade(request.getParameter("b_grade"));
		bgrade.setB_name(request.getParameter("b_name"));
		bgrade.setB_count(Integer.parseInt(request.getParameter("b_count")));
		bgrade.setB_per(Integer.parseInt(request.getParameter("b_per")));
		bgrade.setB_id(request.getParameter("b_id"));
		bgrade.setB_date(request.getParameter("b_date"));
		HttpSession session=request.getSession();
		String m_id = (String)session.getAttribute("m_id");
		Mdao mdao = new Mdao();
		mdao.bUpdate(bgrade, m_id);
		
		MActionForward mf = new MActionForward();
		mf.setRedirect(true);
		mf.setPath(request.getContextPath()+ "/Bgrade/b_grade_list.sinsege_m");
		
		return mf;
		
	}

}
