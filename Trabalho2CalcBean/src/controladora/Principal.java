package controladora;

import java.awt.Dimension;
import modelo.Logica;
import visao.CalcBean;

public class Principal {

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();  // Cria frame
        CalcBean bean;
        Controladora controladora;
        Logica logica;
        
        bean = new CalcBean();
        logica = new Logica();
        controladora = new Controladora(bean, logica);
        
        frame.add(bean);  // Adiciona bean ao frame
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);  // Exibe o frame
        frame.setLocationRelativeTo(null);
    }
}
