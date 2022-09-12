package com.zhang.job.servelet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhang.job.entity.ExampleCoordinates;
import com.zhang.job.entity.ExampleJob;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ExampleJobServlet", urlPatterns = {"/example_job"})
public class ExampleJobServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("application/json");

        //db
        ObjectMapper mapper = new ObjectMapper();
        ExampleCoordinates coordinates = new ExampleCoordinates(37.485130, -122.148316);
        ExampleJob job = new ExampleJob("Software Engineer", 123456, "Aug 1, 2020", false, coordinates);

        //String jsonResponse = mapper.writeValueAsString(job);
        //System.out.println(jsonResponse);
        //response.getWriter().print(jsonResponse);

        response.getWriter().print(mapper.writeValueAsString(job));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //current user id
    request.getSession(false).getAttribute("user_id");

    }
}
