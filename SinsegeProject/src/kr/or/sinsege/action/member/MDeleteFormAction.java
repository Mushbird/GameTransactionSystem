package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Member;
import kr.or.sinsege.forward.MActionForward;

public class MDeleteFormAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("execute MDeleteFormAction");
		System.out.println(request.getParameter("m_code") + " <-- a_code ADeleteFormAction");
		String m_code = request.getParameter("m_code");
		
		Mdao mdao = new Mdao();
		Member member = mdao.mDeleteforUpdate(m_code);
		
		request.setAttribute("member", member);
		MActionForward forward = new MActionForward();
		forward.setRedirect(false);
		forward.setPath("/member/mdelete/m_delete_form.jsp");
		
		return forward;
		
	}

}
