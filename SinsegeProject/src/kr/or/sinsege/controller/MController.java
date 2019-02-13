package kr.or.sinsege.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.action.member.BgradeListProAction;
import kr.or.sinsege.action.member.BgradeUpdateFormAction;
import kr.or.sinsege.action.member.BgradeUpdateProAction;
import kr.or.sinsege.action.member.GgradeListProAction;
import kr.or.sinsege.action.member.GgradeUpdateFormAction;
import kr.or.sinsege.action.member.GgradeUpdateProAction;
import kr.or.sinsege.action.member.MDeleteFormAction;
import kr.or.sinsege.action.member.MDeleteProAction;
import kr.or.sinsege.action.member.MInsertProAction;
import kr.or.sinsege.action.member.MLogoutProAction;
import kr.or.sinsege.action.member.MSearchProAction;
import kr.or.sinsege.action.member.MUpdateFormAction;
import kr.or.sinsege.action.member.MUpdateProAction;
import kr.or.sinsege.action.member.MloginProAction;
import kr.or.sinsege.forward.MActionForward;

public class MController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MController() {
        super();
        System.out.println("00 MController생성자 MController.java");
    }
    
    protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("02 doPro MController.java");
    	request.setCharacterEncoding("euc-kr");
		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		System.out.println(RequestURI + "<-- RequestURI MController.java");
		System.out.println(contextPath + "<-- contextPath MController.java");
		System.out.println(contextPath.length() + "<-- contextPath.length() MController.java");
		System.out.println(command + "<-- command MController.java");
		System.out.println("----------MController.java----------------");
		System.out.println();
		MActionForward forward = null;
		MActionInterFace action = null;
		
		// 가입 화면
		if(command.equals("/Min/m_insert_form.sinsege_m")) {
			System.out.println("03_01 /Min/m_insert_form.sinsege_m");
			forward = new MActionForward();
			forward.setRedirect(false);
			forward.setPath("/member/minsert/m_insert_form.jsp");
		
		// 가입 처리
		} else if(command.equals("/Min/m_insert_pro.sinsege_m")) {
			System.out.println("03_02 /Min/m_insert_pro.sinsege_m");
			action = new MInsertProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 로그인 화면 (인덱스) 
		} else if(command.equals("/index.sinsege_m")) {
			System.out.println("03_03 /index.sinsege_m");
			forward = new MActionForward();
			forward.setRedirect(false); 
			forward.setPath("/index.jsp");
		
		// 메인 화면
		} else if(command.equals("/main.sinsege_m")) {
			System.out.println("03_04 /main.sinsege_m");
			forward = new MActionForward();
			forward.setRedirect(false); 
			forward.setPath("/main.jsp");
		
		// 로그인 화면
		} else if(command.equals("/Mlogin/m_login_form.sinsege_m")) {
			System.out.println("03_05 /main.sinsege_m");
			forward = new MActionForward();
			forward.setRedirect(false);
			forward.setPath("/member/mlogin/m_login_form.jsp");
		
		// 로그인 처리
		} else if(command.equals("/Mlogin/m_login_pro.sinsege_m")) {
			System.out.println("03_06 /Mlogin/m_login_pro.sinsege_m");
			action = new MloginProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 회원 검색 리스트
		} else if(command.equals("/Msearch/m_search_list.sinsege_m")) {
			System.out.println("03_07 /Msearch/m_search_list.sinsege_m");
			action = new MSearchProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// 회원 수정 화면
		} else if(command.equals("/Mup/m_update_form.sinsege_m")) {
			System.out.println("03_08 /Mup/m_update_form.sinsege_m");
			action = new MUpdateFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// 회원 수정 처리
		} else if(command.equals("/Mup/m_update_pro.sinsege_m")) {
			System.out.println("03_09 /Mup/m_update_pro.sinsege_m");
			action = new MUpdateProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 회원 삭제 처리
		} else if(command.equals("/Mdel/m_delete_pro.sinsege_m")) {
			System.out.println("03_10 /Mdel/m_delete_pro.sinsege_m");
			action = new MDeleteProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 로그인 아웃
		} else if(command.equals("/Mlogout/m_logout.sinsege_m")) {
			System.out.println("03_11 /Mlogout/m_logout.sinsege_m");
			action = new MLogoutProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 구매자 등급 리스트
		} else if(command.equals("/Bgrade/b_grade_list.sinsege_m")) {
			System.out.println("03_12 /Bgrade/b_grade_list.sinsege_m");
			action = new BgradeListProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 구매자 등급 수정 화면
		} else if(command.equals("/Bgrade/b_grade_update_form.sinsege_m")) {
			System.out.println("03_13 /Bgrade/b_grade_update_form.sinsege_m");
			action = new BgradeUpdateFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 구매자 등급 수정 처리
		} else if(command.equals("/Bgrade/b_grade_update_pro.sinsege_m")) {
			System.out.println("03_14 /Bgrade/b_grade_update_pro.sinsege_m");
			action = new BgradeUpdateProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 판매자 등급 리스트
		} else if(command.equals("/Ggrade/g_grade_list.sinsege_m")) {
			System.out.println("03_15 /Ggrade/g_grade_list.sinsege_m");
			action = new GgradeListProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 판매자 등급 수정 화면
		} else if(command.equals("/Ggrade/g_grade_update_form.sinsege_m")) {
			System.out.println("03_16 /Ggrade/g_grade_update_form.sinsege_m");
			action = new GgradeUpdateFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 판매자 등급 수정 처리
		} else if(command.equals("/Ggrade/g_grade_update_pro.sinsege_m")) {
			System.out.println("03_17 /Ggrade/g_grade_update_pro.sinsege_m");
			action = new GgradeUpdateProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// 회원 삭제/탈퇴 처리
		} else if(command.equals("/Mdel/m_delete_form.sinsege_m")) {
			action = new MDeleteFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 경로 이동
		if(forward != null){
			if(forward.isRedirect()){
				response.sendRedirect(forward.getPath());
			}else{
				RequestDispatcher dispatcher=request.getRequestDispatcher(forward.getPath());
				System.out.println(dispatcher + "<- dispatcher");
				System.out.println(forward.getPath() + "<--- forward.getPath()[jsp 이동경로]  MController.java");
				System.out.println();
				dispatcher.forward(request, response);
			}
				
		}
    }
 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("01 doGet MController.java");
		doPro(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("02 doPost MController.java");
		doPro(request,response);
	}

}
