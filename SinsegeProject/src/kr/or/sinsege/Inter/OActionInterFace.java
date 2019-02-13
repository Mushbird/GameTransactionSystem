package kr.or.sinsege.Inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.or.sinsege.forward.OActionForward;

public interface OActionInterFace {
	public OActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}