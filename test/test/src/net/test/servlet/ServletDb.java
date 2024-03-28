package net.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebServlet(name = "ServletDb",urlPatterns = "/db")
public class ServletDb extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //用ServletContext对象获取资源流
        InputStream resourceAsStream = this.getServletContext().getResourceAsStream("/dbinfo.properties");
        //创建属性对象，将资源流放入属性对象
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        //获取属性值
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        //输出到控制台
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
    }
}

