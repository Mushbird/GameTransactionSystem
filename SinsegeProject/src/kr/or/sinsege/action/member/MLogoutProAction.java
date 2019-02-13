package kr.or.sinsege.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.forward.MActionForward;

public class MLogoutProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("execute MLogoutProAction");
		HttpSession session = request.getSession();
		session.invalidate();
		
		MActionForward mactionforward = new MActionForward();
		mactionforward.setRedirect(true);
		mactionforward.setPath(request.getContextPath() + "/index.sinsege_m");
		return mactionforward;
	}

}
