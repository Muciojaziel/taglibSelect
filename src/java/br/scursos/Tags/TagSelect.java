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


public class TagSelect extends SimpleTagSupport{
    
    //poderiam ser atributo qntdd onde vc diria a qntdd de opçoes q quer
    //atributo valor onde vc ja passa o valor separado por virgula
    //atributo cor onde vc já diz q a cor das
    public Integer quantidade;
    public String valor;
    
    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }
    
    public void setValor(String valor){
        this.valor = valor;
    }
    @Override
    public void doTag() throws IOException, JspException{
        
       for(int i=0; i<this.quantidade; i++){
           getJspContext().getOut().print(this.valor);
       }
   }
}
