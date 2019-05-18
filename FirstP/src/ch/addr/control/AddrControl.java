package ch.addr.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch.addr.model.AddrDTO;
import ch.addr.model.AddrService;

@WebServlet("/addr.do")
public class AddrControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String m = request.getParameter("m");
		if(m != null) {
			m = m.trim();
			if(m.equals("in")) {	
			}else if(m.equals("del")){
			}else {
				list(request, response);
			}
		}else {
			list(request, response);
		}
	}
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AddrService service = AddrService.getInstance();
		ArrayList<AddrDTO> list = service.selectS();
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("addr/list.jsp");
		rd.forward(request, response);
	}
}
