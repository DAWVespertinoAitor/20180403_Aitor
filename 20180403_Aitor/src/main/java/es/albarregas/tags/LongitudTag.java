/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.tags;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 *
 * @author aitor
 */
public class LongitudTag extends BodyTagSupport {
    
    public int doAfterBody() throws JspException {
        try{
            BodyContent bocon = getBodyContent();
            String cuerpo = bocon.getString();
            Writer out = bocon.getEnclosingWriter();
            System.out.println(cuerpo);
            if (cuerpo != null){
                out.write("La longitud de " + cuerpo + "es: " + cuerpo.length() + "<br>");
            }
        } catch (IOException ex){
            ex.getStackTrace();
        }
        return SKIP_BODY;
    }
}
