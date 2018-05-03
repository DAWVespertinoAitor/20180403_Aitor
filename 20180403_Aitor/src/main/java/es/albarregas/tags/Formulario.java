/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.tags;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.jsp.JspException;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author aitor
 */
public class Formulario extends TagSupport {
    
    private String tipo;
    
    public int doStartTag() throws JspException {

        Writer out = pageContext.getOut();
        try {
            if(tipo == "personal"){
                out.write("<label for='nombre'>Nombre: </label><br>");
                out.write("<input type='text' id='nombre' name='nombre'/><br><br>");
                out.write("<label for='apellidos'>Apellidos: </label><br>");
                out.write("<input type='text' id='apellidos' name='apellidos'/><br><br>");
                out.write("<label for='edad'>Edad: </label><br>");
                out.write("<input type='text' id='edad' name='edad'/><br><br>");
                out.write("<label for='fecha'>Fecha de Nacimiento: </label><br>");
                out.write("<input type='date' id='fecha' name='fecha'/><br><br>");
            }
            
            if(tipo == "usuario"){
                out.write("<label for='usuario'>Usuario: </label><br>");
                out.write("<input type='text' id='usuario' name='usuario'/><br><br>");
                out.write("<label for='passwd'>Contraseña: </label><br>");
                out.write("<input type='password' id='passwd' name='passwd'/><br><br>");
                out.write("<label for='email'>Email: </label><br>");
                out.write("<input type='email' id='email' name='email'/><br><br>");
            }
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return SKIP_BODY;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
