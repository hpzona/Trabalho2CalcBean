package controladora;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Modelo;
import visao.CalcBean;

public class Controladora {

    CalcBean calculadora;
    Modelo logica;
    String primeirovalor;
    String segundovalor;
    boolean operacao;
    BotaoIgualButtonListener igual;
    char operador;
    String valor1;

    public Controladora(CalcBean calc, Modelo log) {
        this.calculadora = calc;
        this.logica = log;
        this.primeirovalor = "";
        this.segundovalor = "";
        this.operacao = false;
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
        calculadora.addBotaoAdicaoButtonListener(new BotaoAdicaoButtonListener());
        calculadora.addBotaoSubtracaoButtonListener(new BotaoSubtracaoButtonListener());
        calculadora.addBotaoMultiplicacaoButtonListener(new BotaoMultiplicacaoButtonListener());
        calculadora.addBotaoDivisaoButtonListener(new BotaoDivisaoButtonListener());
        calculadora.addBotaoPainelButtonListener(new BotaoPainelButtonListener());
        calculadora.addBotaoIgualButtonListener(new BotaoIgualButtonListener());
        calculadora.addBotaoPontoButtonListener(new BotaoPontoButtonListener());
    }

    //////////////////////////// Aqui encontra-se todas as InnerClass com os ActionListener da classe CalcBean
    private class BotaoNumerosButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String valor_atual = calculadora.getText(); // pega o texto atual do visor 
            String valor = calculadora.getValor(e.getSource());
            calculadora.setText(valor_atual + valor);
        }
    }

    private class BotaoPainelButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (calculadora.getVisibilidadePainel()) {
                calculadora.setVisibilidadePainel(false);
                calculadora.setPreferredSize(new Dimension(205, 48));
            } else {
                calculadora.setVisibilidadePainel(true);;
            }
        }
    }

    private class BotaoAdicaoButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            operador = '+';
            valor1 = calculadora.getText();  // recebe o valor atual  
            calculadora.setText("");   // apaga o campo de texto
        }
    }

    private class BotaoSubtracaoButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            operador = '-';
            valor1 = calculadora.getText();  // recebe o valor atual  
            calculadora.setText("");   // apaga o campo de texto   
        }
    }

    private class BotaoMultiplicacaoButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            operador = '*';
            valor1 = calculadora.getText();  // recebe o valor atual  
            calculadora.setText("");   // apaga o campo de texto   
        }
    }

    private class BotaoDivisaoButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            operador = '/';
            valor1 = calculadora.getText();  // recebe o valor atual  
            calculadora.setText("");   // apaga o campo de texto 
        }
    }
    
    private class BotaoPontoButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String valor_atual = calculadora.getText(); // pega o texto atual do visor 
            calculadora.setText(valor_atual + ".");
            String valor = calculadora.getValor(e.getSource());
           
        }
    }

    private class BotaoIgualButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String valor2 = calculadora.getText(); // valor2 recebe o valor atual
            float v = Float.parseFloat(valor1); // converte o valor1 em inteiro
            float v2 = Float.parseFloat(valor2); // converte valor2 em inteiro
            calculadora.setText("" + calcular(v, operador, v2)); 

        }
    }

    private float calcular(float numero1, char opcao, float numero2) {

        float resultado = 0;

        if (opcao == '+') {
            resultado = numero1 + numero2;
        } else if (opcao == '-') {
            resultado = numero1 - numero2;
        } else if (opcao == '*') {
            resultado = numero1 * numero2;
        } else if (opcao == '/') {
            resultado = numero1 / numero2;
        }

        return resultado;
    }
}
