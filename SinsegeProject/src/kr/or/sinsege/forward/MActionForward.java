package kr.or.sinsege.forward;

public class MActionForward {
//첫번째 변수 : forward 할것인가? redirect 할것인가?
//두번째 변수 : 경로 셋팅
	private boolean isRedirect=false;
	private String path=null;
	
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		System.out.println(isRedirect + "<- isRedirect setRedirect MActionForward.java");
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		System.out.println(path + "<- path setPath MActionForward.java");
		this.path = path;
	}
	
	
}
