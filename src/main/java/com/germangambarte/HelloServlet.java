package com.germangambarte;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    System.out.println("In service.");
    res.setContentType("text/html");
    res.getWriter().println("<h1>Holiiss</h1>");
  }
}
