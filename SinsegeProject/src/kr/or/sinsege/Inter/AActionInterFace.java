package kr.or.sinsege.Inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.or.sinsege.forward.AActionForward;

public interface AActionInterFace {
	public AActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}