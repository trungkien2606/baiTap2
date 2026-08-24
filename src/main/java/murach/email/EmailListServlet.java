package murach.email;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import murach.business.User;
import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        String action = request.getParameter("action");

        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {

            url = "/index.html";

        } else if (action.equals("add")) {

            // Lấy thông tin từ form
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            String birthDate = request.getParameter("birthDate");
            String source = request.getParameter("source");

            // Checkbox
            String announcements =
                    request.getParameter("offers") != null
                    ? "Yes" : "No";

            String emailUpdates =
                    request.getParameter("emailAnnouncements") != null
                    ? "Yes" : "No";

            String contact = request.getParameter("contact");

            // Tạo User
            User user = new User(
                    firstName,
                    lastName,
                    email,
                    birthDate,
                    source,
                    announcements,
                    emailUpdates,
                    contact
            );

            // Lưu User
            UserDB.insert(user);

            // Gửi User sang thanks.jsp
            request.setAttribute("user", user);

            url = "/thanks.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
}