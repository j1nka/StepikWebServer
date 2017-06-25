import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by j1nka on 25.06.17.
 */
public class Frontend extends HttpServlet {

    //private String login = "";

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

        Map<String, String[]> par = request.getParameterMap();

        response.setContentType("text/html;charset=utf-8");

        if (par == null) {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        } else {

            response.setStatus(HttpServletResponse.SC_OK);

            for (String p : par.get("key")) {
                response.getWriter().println(p);
            }

        }

    }

}
