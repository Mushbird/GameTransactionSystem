package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Member;
import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.forward.MActionForward;

public class MUpdateProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("05_04 execute MUpdateProAction.java");
		
		request.setCharacterEncoding("euc-kr");
		HttpSession session=request.getSession();
		MActionForward forward = null;
		Member member = new Member();
		
	
		
		if(session.getAttribute("m_level").equals("관리자")) {
			member.setM_code(request.getParameter("m_code"));
			member.setB_name(request.getParameter("b_name"));
			member.setGl_name(request.getParameter("gl_name"));
			member.setM_id(request.getParameter("m_id"));
			member.setM_pw(request.getParameter("m_pw"));
			member.setM_level(request.getParameter("m_level"));
			member.setM_name(request.getParameter("m_name"));
			System.out.println(request.getParameter("m_name") + "<-m_name execute MUpdateProAction");
			member.setM_gold(Integer.parseInt(request.getParameter("m_gold")));
			member.setM_point(Integer.parseInt(request.getParameter("m_point")));
			member.setM_count(Integer.parseInt(request.getParameter("m_count")));
			member.setM_in(request.getParameter("m_in"));
			member.setM_date(request.getParameter("m_date"));
			Mdao mdao = new Mdao();
			mdao.mUpdate(member);	
			forward = new MActionForward();
			forward.setRedirect(true);
			forward.setPath(request.getContextPath() + "/Msearch/m_search_list.sinsege_m");
		
		} else if(session.getAttribute("m_level").equals("회원")) {
			member.setM_code(request.getParameter("m_code"));
			member.setB_name(request.getParameter("b_name"));
			member.setGl_name(request.getParameter("gl_name"));
			member.setM_id((String)session.getAttribute("m_id"));
			member.setM_pw(request.getParameter("m_pw"));
			member.setM_level(request.getParameter("m_level"));
			member.setM_name(request.getParameter("m_name"));
			System.out.println(request.getParameter("m_name") + "<-m_name execute MUpdateProAction");
			member.setM_gold(Integer.parseInt(request.getParameter("m_gold")));
			member.setM_point(Integer.parseInt(request.getParameter("m_point")));
			member.setM_count(Integer.parseInt(request.getParameter("m_count")));
			member.setM_in(request.getParameter("m_in"));
			member.setM_date(request.getParameter("m_date"));
			Mdao mdao = new Mdao();
			mdao.mUpdate(member);	
			forward = new MActionForward();
			forward.setRedirect(true);
	   		forward.setPath(request.getContextPath() + "/main.sinsege_m");
		}
		
	return forward;
	
	}

}
