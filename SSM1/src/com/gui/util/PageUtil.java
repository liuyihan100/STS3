package com.gui.util;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageInfo;
import com.gui.bean.Employee;

public class PageUtil {
	
	public static String toPage(HttpServletRequest request,PageInfo<Employee> pageInfo) {
		StringBuilder builder = new StringBuilder();
		String path = request.getContextPath();
		
		builder.append("<a href='" + path + "/emps/1'>首页</a>");
		builder.append("&nbsp;&nbsp;");
		
		if(pageInfo.isHasPreviousPage()) {
			builder.append("<a href='" + path + "/emps/" + pageInfo.getPrePage() + "'>上一页</a>");
			builder.append("&nbsp;&nbsp;");
		} else {
			builder.append("上一页");
			builder.append("&nbsp;&nbsp;");
		}
		
		int[] nums = pageInfo.getNavigatepageNums();
		for(int num : nums) {
			if(num == pageInfo.getPageNum()) {
				builder.append("<a style='color:red' href='" + path + "/emps/" + num + "'>" + num + "</a>");
				builder.append("&nbsp;&nbsp;");
			} else {
				builder.append("<a href='" + path + "/emps/" + num + "'>" + num + "</a>");
				builder.append("&nbsp;&nbsp;");
			}
		}
		
		if(pageInfo.isHasNextPage()) {
			builder.append("<a href='" + path + "/emps/" + pageInfo.getNextPage() + "'>下一页</a>");
			builder.append("&nbsp;&nbsp;");
		} else {
			builder.append("下一页");
			builder.append("&nbsp;&nbsp;");
		}
		
		builder.append("<a href='" + path + "/emps/" + pageInfo.getPages() + "'>末页</a>");
		
		return builder.toString();
	}
}
