package Handler;

import com.edu.ActionContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/18.
 */
public class EHandler {
//abc("ads"，5）；
    public  void abc(String a,int b) throws ServletException, IOException {

        System.out.println("---" + a);
        System.out.println("---" + b);
        HttpServletRequest req = ActionContext.getContext().getRequest();
        HttpServletResponse response = ActionContext.getContext().getResponse();
       req.setAttribute("aa",a);
        req.getRequestDispatcher("/index.jsp").forward(req,response);

    }

}
