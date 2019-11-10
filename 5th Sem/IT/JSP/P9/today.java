package hello;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.Calendar;

public class today extends SimpleTagSupport {
    public void doTag() throws JspException, IOException 
   {
       JspWriter out = getJspContext().getOut(); 
        out.print("<br>Today's Date: ");  
        out.print(Calendar.getInstance().getTime());
   }
    
}
