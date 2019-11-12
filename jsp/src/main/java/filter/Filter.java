package filter;

import com.sun.org.omg.CORBA.Repository;
import repository.SimpleConnection;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebFilter(urlPatterns = {"/*"})
public class Filter implements javax.servlet.Filter {
    Connection connection = SimpleConnection.getConnection();
        @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        SimpleConnection.getConnection();

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        try {
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {

    }
}
