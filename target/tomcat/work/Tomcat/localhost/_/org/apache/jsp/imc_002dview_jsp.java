/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-07 00:41:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imc_002dview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>Exemplo JSP (Java Server Pages) - Maior Menor</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"\n");
      out.write("    integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Cinzel&display=swap\" rel=\"stylesheet\">\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    body {\n");
      out.write("      background-image: url(\"https://c.wallhere.com/photos/22/c1/1600x900_px_General-547992.jpg!d\");\n");
      out.write("      background-size: cover;\n");
      out.write("      font-family: 'Cinzel', serif;\n");
      out.write("      display: flex;\n");
      out.write("      flex-direction: row;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .block {\n");
      out.write("      display: flex;\n");
      out.write("      flex-direction: column;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      text-align: center;\n");
      out.write("\n");
      out.write("      background: rgb(134, 59, 5);\n");
      out.write("      color: white;\n");
      out.write("      width: 700px;\n");
      out.write("      padding: 10px;\n");
      out.write("      margin: 50px;\n");
      out.write("      border:30px ridge #6b3a09;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    hr.style {\n");
      out.write("    overflow: visible;\n");
      out.write("    padding: 0;\n");
      out.write("    border: none;\n");
      out.write("    border-top: medium double #333;\n");
      out.write("    color: #333;\n");
      out.write("    text-align: center;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("    hr.style:after {\n");
      out.write("    content: \"X\";\n");
      out.write("    display: inline-block;\n");
      out.write("    position: relative;\n");
      out.write("    top: -0.7em;\n");
      out.write("    font-size: 1.5em;\n");
      out.write("    padding: 0 0.25em;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<div class=\"block\">\n");
      out.write("  <h1>Qual o seu IMC?</h1>\n");
      out.write("  <h2>Informe seus dados para Vossa Majestade</h2><br>\n");
      out.write("  <form>\n");
      out.write("    <fieldset>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Informe sua altura (cm)</label>\n");
      out.write("          <input class=\"form-control\" placeholder=\"altura\" name=\"altura\" type=\"text\" value=\"167\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Informe so seu peso (Kg)</label>\n");
      out.write("          <input class=\"form-control\" placeholder=\"peso\" name=\"peso\" type=\"text\" value=\"54\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <button class=\"btn btn-warning\" style=\"color: black\">Calcular</button>\n");
      out.write("    </fieldset>\n");
      out.write("  </form>\n");
      out.write("  <hr class=\"style\">\n");
      out.write("  <h3>\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imcNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("  </h3>\n");
      out.write("  <h3>\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imcText}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("  </h3>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
