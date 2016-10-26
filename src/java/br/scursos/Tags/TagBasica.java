package br.scursos.Tags;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mucio
 */
public class TagBasica extends SimpleTagSupport {
    
    @Override
    public void doTag() throws IOException, JspException{  
        StringWriter writer = new StringWriter();
        
        getJspBody().invoke(writer);
        
        getJspContext().getOut().write("<h3>"+writer.toString()+"</h3>");
    }
}
