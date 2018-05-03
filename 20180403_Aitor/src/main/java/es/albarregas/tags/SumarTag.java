/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author aitor
 */
public class SumarTag extends TagSupport {

    private int num1, num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().print("Resultado suma = " + (num1 + num2));
        } catch (IOException ex) {
            ex.getStackTrace();
        }
        return SKIP_BODY;
    }

    public int doEndTag() throws JspException {
        return SKIP_PAGE;
    }
}
