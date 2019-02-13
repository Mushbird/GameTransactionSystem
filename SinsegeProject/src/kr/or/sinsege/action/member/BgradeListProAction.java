package kr.or.sinsege.action.member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.sinsege.Inter.MActionInterFace;
import kr.or.sinsege.dao.Mdao;
import kr.or.sinsege.dto.Grade;

import kr.or.sinsege.forward.MActionForward;

public class BgradeListProAction implements MActionInterFace {

	@Override
	public MActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("05_03 MUpdateFormAction");
		
		Mdao mdao = new Mdao();
		ArrayList<Grade> arraylistbgrade = mdao.bselect();
		request.setAttribute("arraylistbgrade", arraylistbgrade);
		MActionForward mactionforward = new MActionForward();
		mactionforward.setRedirect(false);
		mactionforward.setPath("/grade/bgrade/b_grade_list.jsp");
		
		return mactionforward;
	
	}

}
