import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", value = "/PizzaOrderServlet")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("crust-select"));
        System.out.println(request.getParameter("sauce-select"));
        System.out.println(request.getParameter("size-select"));
        String[] toppings = request.getParameterValues("toppings");
        for (String topping : toppings) {
            System.out.println(topping);
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(request.getParameter("address"));

        response.sendRedirect("/hello");
    }
}
