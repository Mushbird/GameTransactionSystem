package kr.or.sinsege.action.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Member;
import kr.or.sinsege.forward.MActionForward;

public class MloginProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("04_02 execute MloginProAction");
		String m_id = request.getParameter("m_id");
		String m_pw = request.getParameter("m_pw");
		System.out.println(m_id + "<-m_id execute MloginProAction");
		Mdao mdao = new Mdao();
		String re = mdao.mLoginCheck(m_id, m_pw);
		HttpSession session=request.getSession();
		if(re=="비밀번호 불일치"){
   			response.setContentType("text/html;charset=euc-kr");
	   		PrintWriter out=response.getWriter();
	   		out.println("<script>");
	   		out.println("alert('비밀번호가 일치하지 않습니다.');");
	   		out.println("location.href='../index.jsp';");
	   		out.println("</script>");
	   		out.close();
	   		return null;
   		}else if(re=="아이디 불일치"){
   			response.setContentType("text/html;charset=euc-kr");
	   		PrintWriter out=response.getWriter();
	   		out.println("<script>");
	   		out.println("alert('아이디가 존재하지 않습니다.');");
	   		out.println("location.href='../index.jsp';");
	   		out.println("</script>");
	   		out.close();
	   		return null;
	   	}
 
   		Member member = mdao.mGetForSession(m_id);
   		session.setAttribute("m_id", member.getM_id());
   		session.setAttribute("m_name", member.getM_name());
   		session.setAttribute("m_level", member.getM_level());
   		session.setAttribute("m_code", member.getM_code());
   		session.setAttribute("gl_name", member.getGl_name());
   		
   		MActionForward forward = new MActionForward();
   		forward.setRedirect(true);
   		forward.setPath(request.getContextPath() + "/main.sinsege_m");
   		return forward;
	}

}
