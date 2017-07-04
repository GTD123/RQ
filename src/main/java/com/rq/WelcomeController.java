package com.rq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by RQ on 2017/6/28.
 */
@Controller
public class WelcomeController {
    @ModelAttribute
    public void getData(HttpServletResponse response)throws IOException{
        response.getWriter().write("diyigechuli");
    }
    @RequestMapping("/we")
    public void welcome(HttpServletResponse response)throws IOException{
        response.getWriter().write("liming");
    }
}
