/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.domainJPA;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author Morato
 */
public class ProficienciaJPA {
    
    @Id
    @Column(name="Cod_Proficiencia", nullable = false)    
    private int Cod_Proficiencia;
    
    @Column(name="Nivel_Proficiencia)", nullable = false)
    private String Nivel_Proficiencia;
    
    public ProficienciaJPA(){}
    
    public ProficienciaJPA(int Cod_Proficiencia, String Nivel_Proficiencia){
        this.Cod_Proficiencia = Cod_Proficiencia;
        this.Nivel_Proficiencia = Nivel_Proficiencia;
    }

    public int getCod_Proficiencia() {
        return Cod_Proficiencia;
    }

    public void setCod_Proficiencia(int Cod_Proficiencia) {
        this.Cod_Proficiencia = Cod_Proficiencia;
    }

    public String getNivel_Proficiencia() {
        return Nivel_Proficiencia;
    }

    public void setNivel_Proficiencia(String Nivel_Proficiencia) {
        this.Nivel_Proficiencia = Nivel_Proficiencia;
    }
}
