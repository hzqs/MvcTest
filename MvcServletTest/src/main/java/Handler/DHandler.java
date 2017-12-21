package Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/12/15.
 */
//@RequestMapping("/first")
public class DHandler {
    public  void handle(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("d handler----");
    }
//:/first/myxx

//RequestMapping("/myxx")    []
    public  void xx(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("d handler xxx----");
    }

    ///first/yy
    public  void yy(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("d handler xxx----");
    }
}
