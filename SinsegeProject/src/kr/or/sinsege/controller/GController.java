package kr.or.sinsege.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.GActionInterFace;
import kr.or.sinsege.action.goods.GDeleteProAction;
import kr.or.sinsege.action.goods.GDetailAction;
import kr.or.sinsege.action.goods.GInsertProAction;
import kr.or.sinsege.action.goods.GListAction2;
import kr.or.sinsege.action.goods.GSearchProAction;
import kr.or.sinsege.action.goods.GSearchProAction2;
import kr.or.sinsege.action.goods.GUpdateFormAction;
import kr.or.sinsege.action.goods.GUpdateProAction;
import kr.or.sinsege.forward.GActionForward;

public class GController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GController() {
        super();
        System.out.println("00 GController 생성자 GController.java");
    }

    protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("02 doPro GController.java");
    	request.setCharacterEncoding("euc-kr");	//post한글처리
		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		System.out.println(RequestURI + "<-- RequestURI GController.java");
		System.out.println(contextPath + "<-- contextPath GController.java");
		System.out.println(contextPath.length() + "<-- contextPath.length() GController.java");
		System.out.println(command + "<-- command GController.java");
		System.out.println("---------------GController---------------");
		System.out.println();
		GActionForward forward = null;
		GActionInterFace action = null;
		
		// 상품 등록화면
		if(command.equals("/Gin/g_insert_form.sinsege")) {
			System.out.println("03_01 /Gin/g_insert_form.sinsege");
			forward = new GActionForward();
			forward.setRedirect(false);
			forward.setPath("/goods/ginsert/g_insert_form.jsp");
			
		// 상품 등록처리
		}else if(command.equals("/Gin/g_insert_pro.sinsege")) {
			System.out.println("03_02 /Gin/g_insert_pro.sinsege");
			action = new GInsertProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		// 검색 리스트(페이징)
		}else if(command.equals("/Gsearch/g_search_list.sinsege")) {
			System.out.println("03_03 /Gsearch/g_search_list.sinsege");
			action = new GSearchProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		// 검색 리스트 (일반)
		}else if(command.equals("/Gsearch/g_search_list2.sinsege")) {
			System.out.println("03_03 /Gsearch/g_search_list2.sinsege");
			action = new GSearchProAction2();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		// 상품 리스트(마이페이지)
		}else if(command.equals("/Glist/g_list.sinsege")) {
			System.out.println("03_04 /Glist/g_list.sinsege");
			action = new GListAction2();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		// 상품 상세보기
		}else if(command.equals("/Glist/g_detail.sinsege")) {
			System.out.println("03_04_1 /Glist/g_detail.sinsege");
			action = new GDetailAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		// 상품 수정화면
		}else if(command.equals("/Gup/g_update_form.sinsege")) {
			System.out.println("03_05 /Gup/g_update_form.sinsege");
			action = new GUpdateFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// 상품 수정처리
		}else if(command.equals("/Gup/g_update_pro.sinsege")) {
			System.out.println("03_06 /Gup/g_update_pro.sinsege");
			action = new GUpdateProAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// 상품 삭제화면
		}else if(command.equals("/Gdel/g_delete_form.sinsege")) {
			System.out.println("03_07 /Gdel/g_delete_form.sinsege");
			forward = new GActionForward();
			forward.setRedirect(false);
			forward.setPath("/goods/gdelete/g_delete_form.jsp");
		
		// 상품 삭제처리
		}else if(command.equals("/Gdel/g_delete_pro.sinsege")) {
			System.out.println("03_08 /Gdel/g_delete_pro.sinsege");
			action = new GDeleteProAction();
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
				System.out.println(forward.getPath() + "<--- forward.getPath()[jsp 이동경로]  GController.java");
				System.out.println();
				dispatcher.forward(request, response);
			}
		}
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("01 doGet GController.java");
		doPro(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("01 doPost GController.java");
		doPro(request,response);
	}
	

}
