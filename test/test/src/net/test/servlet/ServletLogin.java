package net.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletLogin",urlPatterns = "/login")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //用户列表
        String user="user123";
        String pass="pass123";
        //获取客户端传来的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(!user.equals(username)){
            /*用户名不存在*/
            //request携带数据到web资源
            request.setAttribute("errorMessage","用户名不存在");
            //请求转发
            request.getRequestDispatcher("/loginError.jsp").forward(request,response);
        }else if(!pass.equals(password)){
            /*密码错误*/
            //request携带数据到web资源
            request.setAttribute("errorMessage","密码错误");
            //请求转发
            request.getRequestDispatcher("/loginError.jsp").forward(request,response);
        }else{
            //必须加项目地址，这里加hello
            response.sendRedirect("/test/home.html");
        }
    }
}

