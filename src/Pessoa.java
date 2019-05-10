/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    
    private String nome;
    private Data dataDeNascimento;
    
    public String getNome(){  
        
        return this.nome;
    }
    
    public Data getDataDeNascimento(){        
        
        return this.dataDeNascimento;
    }
    
    public void mostrar(){
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: ");
        this.getDataDeNascimento().mostrar();
        
    }
    
    public void setNome(String n ){
        this.nome = n;
    }
    
    public void setDataDeNascimento(Data d){
        this.dataDeNascimento = d;
    }
}
