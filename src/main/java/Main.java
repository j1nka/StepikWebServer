import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by j1nka on 25.06.17.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Frontend frontend = new Frontend();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(frontend), "/mirror");

        Server server = new Server (8080);
        server.setHandler(context);

        server.start();
        java.util.logging.Logger.getLogger("MyLogger").info("Server started");
        server.join();

    }
}
