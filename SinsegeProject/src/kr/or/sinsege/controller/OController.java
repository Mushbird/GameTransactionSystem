package kr.or.sinsege.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.OActionInterFace;
import kr.or.sinsege.action.order.OListFormAction;
import kr.or.sinsege.action.order.OListProAction;
import kr.or.sinsege.forward.OActionForward;

public class OController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public OController() {
        super();
        System.out.println("00 OController 생성자 OController.java");
    }
    
    protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
    	System.out.println("02 doPro OController.java");
    	request.setCharacterEncoding("euc-kr");
		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		System.out.println(RequestURI + "<-- RequestURI OController.java");
		System.out.println(contextPath + "<-- contextPath OController.java");
		System.out.println(contextPath.length() + "<-- contextPath.length() OController.java");
		System.out.println(command + "<-- command OController.java");
		System.out.println("----------OController.java----------------");
		System.out.println();
		OActionForward forward = null;
		OActionInterFace action = null;
		// 처리 및 경로 설정
		
		// 주문 리스트 (select)
		if(command.equals("/Oin/o_list_form.sinsege_o")) {
			System.out.println("03_01 /Oin/o_insert_form.sinsege_o");
			action = new OListFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		// 주문 처리 (insert)
		}else if(command.equals("/Oin/o_list_pro.sinsege_o")) {
			System.out.println("03_02 /Oin/o_list_pro.sinsege_o");
			action = new OListProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 주문 수정 화면
		// 주문 수정 처리
		// 주문 삭제
		// 주문 검색
		
	
		// 경로 이동
		if(forward != null){
			if(forward.isRedirect()){
				response.sendRedirect(forward.getPath());
			}else{
				RequestDispatcher dispatcher=request.getRequestDispatcher(forward.getPath());
				System.out.println(dispatcher + "<- dispatcher");
				System.out.println(forward.getPath() + "<--- forward.getPath()[jsp 이동경로]  OController.java");
				System.out.println();
				dispatcher.forward(request, response);
			}
		}
			
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("01 doGet OController.java");
		doPro(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("02 doPost OController.java");
		doPro(request,response);
	}

}
