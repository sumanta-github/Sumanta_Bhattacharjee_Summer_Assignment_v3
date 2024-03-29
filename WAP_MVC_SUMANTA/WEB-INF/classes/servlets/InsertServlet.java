package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import beans.*;
import DAO.*;

public class InsertServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

          HttpSession session = request.getSession(false);
          if(session==null)
          {
                RequestDispatcher rd = request.getRequestDispatcher("/homepage.jsp");
                rd.forward(request, response);
          }

          String userName = (String)session.getAttribute("User");
          String comment = request.getParameter("comment");

          InsertCommentBean insertBean=new InsertCommentBean();
          insertBean.setComment(comment);
          insertBean.setUserName(userName);
          MvcJDBCDAO dao=new MvcJDBCDAO();
          dao.add(insertBean);

          request.setAttribute("messages",new DAO.MvcJDBCDAO().findAll());

          RequestDispatcher rd = request.getRequestDispatcher("/homepage.jsp");
          rd.forward(request, response);

    }

}