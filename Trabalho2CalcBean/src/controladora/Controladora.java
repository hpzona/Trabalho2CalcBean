
package controladora;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Logica;
import visao.CalcBean;

public class Controladora {
    
    CalcBean calculadora;
    Logica logica; 
    String primeirovalor;
    String segundovalor;
    boolean operacao; 
    BotaoIgualButtonListener igual;
    
    public Controladora(CalcBean calc, Logica log){
        this.calculadora = calc;
        this.logica = log;
        this.primeirovalor = "";
        this.segundovalor = "";
        this.operacao = false;
        this.igual = new BotaoIgualButtonListener();
        calculadora.addBotao0ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao1ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao2ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao3ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao4ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao5ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao6ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao7ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao8ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotao9ButtonListener(new BotaoNumerosButtonListener());
        calculadora.addBotaoIgualButtonListener(igual);
        calculadora.addBotaoAdicaoButtonListener(new BotaoAdicaoButtonListener());
        calculadora.addBotaoPainelButtonListener(new BotaoPainelButtonListener());
    }

//////////////////////////// Aqui encontra-se todas as InnerClass com os ActionListener da classe CalcBean
    private class BotaoNumerosButtonListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
          String num = calculadora.getValor(e.getSource());
          if(!operacao)
              {
               primeirovalor += num;
               calculadora.setTexto(primeirovalor);
              }
          else{
              segundovalor += num;
              calculadora.setTexto(primeirovalor + segundovalor);
          }
      }   
    }
    
    private class BotaoPainelButtonListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
            if(calculadora.getVisibilidadePainel()){
                  calculadora.setVisibilidadePainel(false);
                  calculadora.setPreferredSize(new Dimension(205,48));
            }
            else{
                 calculadora.setVisibilidadePainel(true);;
            }
      }   
    }
    
    private class BotaoAdicaoButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            if (!primeirovalor.equals("")){
                if(!operacao){
                    logica.setValor(primeirovalor);
                    primeirovalor += " + ";
                    calculadora.setTexto(primeirovalor);
                    operacao = true;
                }
                else{
                    ///////// CHAMA BOTAO IGUAL
                }
            }
        }
    }
    
    private class BotaoIgualButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            
        }
    }
}
