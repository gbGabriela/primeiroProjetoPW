package controleEx3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilitariosEx3.VerificaPlaca;

/**
 * Servlet implementation class ConsultaPlaca
 */
@WebServlet("/ConsultaPlaca")
public class ConsultaPlaca extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaPlaca() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String placa = request.getParameter("placa");
		
		VerificaPlaca vp = new VerificaPlaca();
		
		request.setAttribute("verificar", vp.verificarPlaca(placa));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/verificarPlaca.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
