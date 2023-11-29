package com.example.tu_dien;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns  = "/loll")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        Map<String ,String> TD = new HashMap<>();
        TD.put("hello","xin chào");
        TD.put("how","thế nào");
        TD.put("book","quyển vở");
        TD.put("computer","máy tính");
        String TT = request.getParameter("x");  //request :thể hiện yêu cầu của máy tính đến máy chủ/getParameter lấy dữ liệu tuwf from
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = TD.get(TT);
        if (result != null){
            writer.println("TT" + " : " + TT);
            writer.println("result"+ " : "+ result);
        }
        else {
            writer.println("not null");
        }
        writer.println("</html>");
    }
}