package Handler;

import com.edu.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hzq on 2017/12/14.
 */
public class AHandler implements Handler {
    @Override
    public void Handler(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print("AHandler");
    }
}
