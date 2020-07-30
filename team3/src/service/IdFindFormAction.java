package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

public class IdFindFormAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			request.setCharacterEncoding("utf-8");
			String m_name  = request.getParameter("name");
			String m_email = request.getParameter("email");
			MemberDao md = MemberDao.getInstance();
			int result = md.idfind(m_name, m_email);
			
			request.setAttribute("m_name", m_name);
			request.setAttribute("m_email", m_email);
			request.setAttribute("result", result);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "idFindForm.jsp";
	}

}
