package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;

import kr.or.sinsege.forward.MActionForward;

public class MDeleteProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("05_05 execute MDeleteProAction");
		String m_code = request.getParameter("m_code");
		System.out.println(m_code + "<-m_code execute MDeleteProAction");
		Mdao mdao = new Mdao();
		mdao.mdelete(m_code);
		MActionForward mf = new MActionForward();
		HttpSession session=request.getSession();
		
		if(session.getAttribute("m_level").equals("관리자")) {
			mf.setRedirect(true);
			mf.setPath(request.getContextPath() + "/Msearch/m_search_list.sinsege_m");
			
		} else if(session.getAttribute("m_level").equals("회원")) {
				session.invalidate();	
				mf.setRedirect(true);
				mf.setPath(request.getContextPath() + "/index.jsp");
				
		}
		return mf;
	}

}