package controleEx2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilitariosEx2.ValidaCPF;

/**
 * Servlet implementation class ValidarCPF
 */
@WebServlet("/ValidarCPF")
public class ValidarCPF extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarCPF() {
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
		
		String cpf = request.getParameter("cpf");
		String resposta = "";
		
		if(ValidaCPF.isCPF(cpf)) {
			
			resposta = "válido.";
			
		}else{
			
			resposta = "inválido.";
			
		}
		
		request.setAttribute("valida", resposta);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/validarCPF.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
