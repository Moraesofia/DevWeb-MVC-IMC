package imcmvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/")
public class ImcController extends HttpServlet {

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String resultado[] = new String[2];

        String alturaStr = request.getParameter("altura");
        String pesoStr = request.getParameter("peso");
        if (alturaStr != null && alturaStr != null) {
            float altura = Float.parseFloat(alturaStr);
            float peso = Float.parseFloat(pesoStr);
            resultado = ImcModel.imc(altura,peso);
        }

        request.setAttribute("imcNum", resultado[0]);
        request.setAttribute("imcText", resultado[1]);

        request.getRequestDispatcher("/imc-view.jsp").forward(request, response);
    }
}
