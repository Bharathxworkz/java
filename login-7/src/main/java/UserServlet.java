import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String date = req.getParameter("date");
        String time = req.getParameter("time");
        String guest = req.getParameter("guest");

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("you reserving now");
    }
}
