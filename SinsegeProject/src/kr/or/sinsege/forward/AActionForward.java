package kr.or.sinsege.forward;

public class AActionForward {
	private boolean isRedirect=false;
	private String path=null;
	
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		System.out.println(isRedirect + "<- isRedirect setRedirect AActionForward.java");
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		System.out.println(path + "<- path setPath AActionForward.java");
		this.path = path;
	}
	
	
}
