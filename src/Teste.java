/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Teste {
     public static void main(String[] args) {
    
        Pessoa p = new Pessoa();
        p.setNome("Carla");
        
        Data d = new Data();
        d.setDia(30);
        d.setMes(4);
        d.setAno(2019);
        p.setDataDeNascimento(d);
        
        Veiculo v = new Veiculo();
        v.setPropietario(p);
        
        Data d1 = new Data();
        d1.setDia(2);
        d1.setMes(5);
        d1.setAno(2009);
        v.setDataAquisicao(d1);
        
        p.mostrar();
        v.informarFinalidade("Passeio");
        v.mostrar();
    }
    
}
