package controladora;

import java.awt.Dimension;
import modelo.Modelo;
import visao.CalcBean;

public class Principal {

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();  // Cria frame
        CalcBean bean;
        Controladora controladora;
        Modelo logica;
        
        bean = new CalcBean();
        logica = new Modelo();
        controladora = new Controladora(bean, logica);
        
        frame.add(bean);  // Adiciona bean ao frame
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setVisible(true);  // Exibe o frame
        frame.setLocationRelativeTo(null);
    }
}
