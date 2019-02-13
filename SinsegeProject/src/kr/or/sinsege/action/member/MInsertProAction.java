package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Member;
import kr.or.sinsege.forward.MActionForward;

public class MInsertProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_01 execute MInsertProAction");
		request.setCharacterEncoding("euc-kr");
		String m_id = request.getParameter("m_id");
		String m_pw = request.getParameter("m_pw");
		String m_name = request.getParameter("m_name");
		Member member = new Member();
		member.setM_id(m_id);
		member.setM_pw(m_pw);
		member.setM_name(m_name);
		Mdao mdao = new Mdao();
		mdao.mInsert(member);
		MActionForward mactionforward = new MActionForward();
		mactionforward.setRedirect(true);
		mactionforward.setPath(request.getContextPath() + "/index.sinsege_m");
		
		return mactionforward;
	}

}
