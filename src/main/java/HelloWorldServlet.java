import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        //the string para "name" can be anything

        if (name == null) {
            response.getWriter().println("Hello World!");
        } else {
            response.getWriter().println("Hello, " + name);
        }

//        response.getWriter().println("Hello, " + name);




    }

}
