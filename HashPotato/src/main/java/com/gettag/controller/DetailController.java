package com.gettag.controller;

//  import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gettag.dao.NoticeDAO;
//import com.gettag.vo.NoticeVO;


public class DetailController implements Controller{
	public String handleRequest(HttpServletRequest request
			  , HttpServletResponse response
			  ) throws Exception {

		
		int no = Integer.parseInt(request.getParameter("no"));
		String type = request.getParameter("type");

		NoticeDAO dao = new NoticeDAO();
		
		
				if(type != null && type.equals("list")) {
					dao.updateViewCnt(no);
				}
				


		return "/WEB-INF/views/notice/noticeWriteView.jsp";
	}
}
