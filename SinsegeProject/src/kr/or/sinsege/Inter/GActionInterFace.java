package kr.or.sinsege.Inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.forward.GActionForward;

public interface GActionInterFace {
	public GActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}
