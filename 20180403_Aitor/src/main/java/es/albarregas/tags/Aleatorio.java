/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.tags;

import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author aitor
 */
public class Aleatorio extends TagSupport {

    private int rango;

    public int doStartTag() throws JspException {

        Random rnd = new Random();
        Writer out = pageContext.getOut();
        int numero = rnd.nextInt(rango);
        try {
            out.write(String.valueOf(numero)+"<br>");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return SKIP_BODY;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }
}
