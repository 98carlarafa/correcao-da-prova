/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Veiculo {
    
    private Pessoa proprietario;
    private Data dataAquisicao;
    private String finalidade;
    
    public Pessoa getProprietario(){  
        
        return this.proprietario;
    }
    
    public Data getDataAquisicao(){
        
        return this.dataAquisicao;
    }
    
    public String getFinalidade(){
        
        return this.finalidade;
    }
    
    public void mostrar(){
        
        System.out.println("Proprietario: ");
        this.getProprietario().mostrar();
        System.out.println("Data Aquisicao: ");
        this.getDataAquisicao().mostrar();
        System.out.println("Finalidade: " + this.getFinalidade());
    }
    
    
    public boolean informarFinalidade (String s){        
    
        if ((s == "Passeio") || (s == "Diplomacia") || (s == "Aluguel")){
            this.finalidade = s;
            return true;
        }
        else{
            return false;
        }
    }
    
    public void setPropietario(Pessoa p ){
        this.proprietario = p;
    }
    
    public void setDataAquisicao(Data d){
        this.dataAquisicao = d;
    }
    
    public void setFinalidade(String f){
        this.finalidade = f;
    }
}
