package Handler;

import com.edu.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/12/15.
 */
public class CHandler implements Handler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse resp) {
        System.out.println("c handler----");
    }
}
