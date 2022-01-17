/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculators;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author caelan
 */
@WebServlet(name = "arithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class arithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet arithmeticCalculatorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet arithmeticCalculatorServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setAttribute("result", "Result: ---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*Error checks empty and invalid inputs, then proccesses the calculation
        based off the users inputs.
        */
        try{
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operator = request.getParameter("operator");
        int result = 0;
        String resultString = "";
        
        
        switch(operator){
            case "add": result = num1 + num2;
                        resultString = String.format("Result: %d",result);
                        request.setAttribute("result",resultString);
                        break;
            case "sub": result = num1 - num2;
                        resultString = String.format("Result: %d",result);
                        request.setAttribute("result",resultString);
                        break;
            case "multiply": result = num1 * num2;
                            resultString = String.format("Result: %d",result);
                            request.setAttribute("result",resultString);
                             break;
            case "div": if(num2 == 0){
                request.setAttribute("result","Cannot divide by zero");
                break;
                   
            }
                        result = num1 / num2;
                        resultString = String.format("Result: %d",result);
                        request.setAttribute("result",resultString);
                        break;
        }
        request.setAttribute("num1",num1);
        request.setAttribute("num2",num2);
            
        }catch(NumberFormatException e){
           request.setAttribute("result","Result: invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
