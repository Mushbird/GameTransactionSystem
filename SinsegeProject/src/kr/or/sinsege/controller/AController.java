package kr.or.sinsege.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.AActionInterFace;
import kr.or.sinsege.forward.AActionForward;
import kr.or.sinsege.action.assessment.ADeleteFormAction;
import kr.or.sinsege.action.assessment.ADeleteProAction;
import kr.or.sinsege.action.assessment.AInsertProAction;
import kr.or.sinsege.action.assessment.AListProAction;
import kr.or.sinsege.action.assessment.AUpdateFormAction;
import kr.or.sinsege.action.assessment.AUpdateProAction;

public class AController extends HttpServlet {
	private static final long serialVersionUID = 1L;     

    public AController() {
        super();
        System.out.println("00 AController 생성자 AController.java");
    }
    
    protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("02 doPro AContoroller.java");
    	request.setCharacterEncoding("euc-kr");
    	String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		System.out.println(RequestURI + "<-- RequestURI AController.java");
		System.out.println(contextPath + "<-- contextPath AController.java");
		System.out.println(contextPath.length() + "<-- contextPath.length() AController.java");
		System.out.println(command + "<-- command AController.java");
		System.out.println("----------AController.java----------------");
		System.out.println();
		AActionForward forward = null;
		AActionInterFace action = null;
		
		// 게시물 등록 화면
		if(command.equals("/Ain/a_insert_form.sinsege_a")) {
			System.out.println("03_01 /Ain/a_insert_form.sinsege_a");
			forward = new AActionForward();
			forward.setRedirect(false);
			forward.setPath("/assessment/ainsert/a_insert_form.jsp");
		// 게시물 등록 처리
		} else if(command.equals("/Ain/a_insert_pro.sinsege_a")) {
			System.out.println("03_02 /Ain/a_insert_pro.sinsege_a");
			action = new AInsertProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		// 리스트 처리
		} else if(command.equals("/Alist/a_list.sinsege_a")) {
			System.out.println("03_03 /Alist/a_list.sinsege_a");
			action = new AListProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		// 게시물 수정 화면
		} else if(command.equals("/Aup/a_update_form.sinsege_a")) {
			System.out.println("03_04 /Aup/a_update_form.sinsege_a");
			action = new AUpdateFormAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		// 게시물 수정 처리
		} else if(command.equals("/Aup/a_update_pro.sinsege_a")) {
			System.out.println("03_05 /Aup/a_update_pro.sinsege_a");
			action = new AUpdateProAction();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		// 게시물 삭제 화면
		} else if(command.equals("/Adel/a_delete_form.sinsege_a")) {
			System.out.println("03_06 /Adel/a_delete_form.sinsege_a");
			action = new ADeleteFormAction();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		// 게시물 삭제 처리
		} else if(command.equals("/Adel/a_delete_pro.sinsege_a")) {
			System.out.println("03_07 /Adel/a_delete_pro.sinsege_a");
			action = new ADeleteProAction();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		// 리스트 검색 처리
		}
		
		// 경로 이동
		if(forward != null) {
	    	if(forward.isRedirect()) {
	    		response.sendRedirect(forward.getPath());
	    	} else {
	    		RequestDispatcher dispatcher=request.getRequestDispatcher(forward.getPath());
				System.out.println(dispatcher + "<- dispatcher");
				System.out.println(forward.getPath() + "<--- forward.getPath()[jsp 이동경로]  AController.java");
				System.out.println();
				dispatcher.forward(request, response);
	    	}
	    }
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("01 doGet AController.java");
		doPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("01 doPost AController.java");
		doPro(request, response);
	}

}
