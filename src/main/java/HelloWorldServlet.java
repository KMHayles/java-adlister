import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//user goes to local host 8080/hell in the browser and sees "Hello World"
@WebServlet("/hello") //this is what tells the below code to run.
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<h1 style='color:red'>Test Hello</h1><br><h3>This is a h3</h3><a href='/login'>Login Page</a>");
//        System.out.println("Hello World");
    }
}
