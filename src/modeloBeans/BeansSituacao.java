/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.sql.Date;

/**
 *
 * @author rodri
 */
public class BeansSituacao {

    public int getSituacaoCod() {
        return situacaoCod;
    }

    public void setSituacaoCod(int situacaoCod) {
        this.situacaoCod = situacaoCod;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Date getData1() {
        return data1;
    }

    public void setData1(Date data1) {
        this.data1 = data1;
    }

    public Date getData2() {
        return data2;
    }

    public void setData2(Date data2) {
        this.data2 = data2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private int situacaoCod;
    private String nomeAluno;
    private String nomeLivro;
    private Date data1;
    private Date data2;
    private String status;
}
