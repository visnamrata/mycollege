package hello;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class reverse extends SimpleTagSupport
{
    String input;
    
    public void setInput(String input)
    {
        this.input= input;
    }
    
    public void doTag( ) throws JspException, IOException
    {
        StringBuilder sb=new StringBuilder(input);  
        sb.reverse();  
        input= sb.toString();  
        JspWriter out=  getJspContext().getOut();
        out.print(input);
    }
    
}
