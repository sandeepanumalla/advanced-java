package com.example.addmodule.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Date;

public class MyTagHandler extends TagSupport {
    @Override
    public int doStartTag() throws JspException {

        try {
            JspWriter out = pageContext.getOut();
            out.println("<h1>This is my Custom tag</h1>");
            out.println("<p>This is my custom paragraph</p>");
            out.println("<br>");
            out.println("<script>");
            out.println("function updateTime() {");
            out.println("    var currentTimeSeconds = Math.floor(Date.now() / 1000);");
            out.println("    document.getElementById('currentTimeInSeconds').innerHTML = 'Current Time in Seconds: ' + currentTimeSeconds;");
            out.println("}");
            out.println("setInterval(updateTime, 1000);");
            out.println("</script>");

//            out.println(new Date().toString());
            out.println("</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
