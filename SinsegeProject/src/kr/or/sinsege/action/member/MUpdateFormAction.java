package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Member;
import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.forward.MActionForward;

public class MUpdateFormAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("05_03 MUpdateFormAction");
		System.out.println(request.getParameter("m_code") + " <--m_id MUpdateFormAction ");
		String m_code = request.getParameter("m_code");
		Mdao mdao = new Mdao();
		Member member = mdao.mSelectforUpdate(m_code);
		request.setAttribute("member", member);
		MActionForward mactionforward = new MActionForward();
		mactionforward.setRedirect(false);
		mactionforward.setPath("/member/mupdate/m_update_form.jsp");
		
		return mactionforward;
	}

}
