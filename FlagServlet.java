import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class FlagServlet extends HttpServlet {

    private int likes = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("likes", likes);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        likes++;
        resp.sendRedirect("/");
    }
}