package visao;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CalcBean extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private boolean calcPanelVisible; 

    public CalcBean() {
        calcPanelVisible = true;
        initComponents();
    }
    
    @Override
    public void setObject(Object bean) {
        this.bean = bean;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoResultado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botaoDivisao = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botaoMultiplicacao = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoPonto = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botaoAdicao = new javax.swing.JButton();
        botaoPainel = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        botao7.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao7.setText("7");
        jPanel1.add(botao7);

        botao8.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao8.setText("8");
        jPanel1.add(botao8);

        botao9.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao9.setText("9");
        jPanel1.add(botao9);

        botaoDivisao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoDivisao.setForeground(new java.awt.Color(255, 0, 0));
        botaoDivisao.setText("/");
        jPanel1.add(botaoDivisao);

        botao4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao4.setText("4");
        jPanel1.add(botao4);

        botao5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao5.setText("5");
        jPanel1.add(botao5);

        botao6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao6.setText("6");
        jPanel1.add(botao6);

        botaoMultiplicacao.setForeground(new java.awt.Color(255, 0, 0));
        botaoMultiplicacao.setText("*");
        jPanel1.add(botaoMultiplicacao);

        botao1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao1.setText("1");
        jPanel1.add(botao1);

        botao2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao2.setText("2");
        jPanel1.add(botao2);

        botao3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao3.setText("3");
        jPanel1.add(botao3);

        botaoSubtracao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoSubtracao.setForeground(new java.awt.Color(255, 0, 0));
        botaoSubtracao.setText("-");
        jPanel1.add(botaoSubtracao);

        botao0.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao0.setText("0");
        jPanel1.add(botao0);

        botaoPonto.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoPonto.setText(".");
        jPanel1.add(botaoPonto);

        botaoIgual.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoIgual.setForeground(new java.awt.Color(0, 153, 0));
        botaoIgual.setText("=");
        jPanel1.add(botaoIgual);

        botaoAdicao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoAdicao.setForeground(new java.awt.Color(255, 0, 0));
        botaoAdicao.setText("+");
        jPanel1.add(botaoAdicao);

        botaoPainel.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(campoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean getVisibilidadePainel(){
        return calcPanelVisible;
    }
    
    public void setVisibilidadePainel(boolean status){
        jPanel1.setVisible(status);
        calcPanelVisible = status;
    }
    
    public String getValor(Object b){
        JButton botao = (JButton) b; 
        return botao.getText();
    }
    
    public String getText(){
        return campoResultado.getText();
    }
    
    public void setText(String txt){
        campoResultado.setText(txt);
    }
    
    public void addBotao0ButtonListener(ActionListener lis){
        botao0.addActionListener(lis);
    }
    
    public void addBotao1ButtonListener(ActionListener lis){
        botao1.addActionListener(lis);
    }
    
    public void addBotao2ButtonListener(ActionListener lis){
        botao2.addActionListener(lis);
    }
    
    public void addBotao3ButtonListener(ActionListener lis){
        botao3.addActionListener(lis);
    }
    
    public void addBotao4ButtonListener(ActionListener lis){
        botao4.addActionListener(lis);
    }
    
    public void addBotao5ButtonListener(ActionListener lis){
        botao5.addActionListener(lis);
    }
    
    public void addBotao6ButtonListener(ActionListener lis){
        botao6.addActionListener(lis);
    }
    
    public void addBotao7ButtonListener(ActionListener lis){
        botao7.addActionListener(lis);
    }
    
    public void addBotao8ButtonListener(ActionListener lis){
        botao8.addActionListener(lis);
    }
    
    public void addBotao9ButtonListener(ActionListener lis){
        botao9.addActionListener(lis);
    }
    
    public void addBotaoAdicaoButtonListener(ActionListener lis){
        botaoAdicao.addActionListener(lis);
    }
    
    public void addBotaoSubtracaoButtonListener(ActionListener lis){
        botaoSubtracao.addActionListener(lis);
    }
    
    public void addBotaoMultiplicacaoButtonListener(ActionListener lis){
        botaoMultiplicacao.addActionListener(lis);
    }
    
    public void addBotaoDivisaoButtonListener(ActionListener lis){
        botaoDivisao.addActionListener(lis);
    }
    
    public void addBotaoIgualButtonListener(ActionListener lis){
        botaoIgual.addActionListener(lis);
    }
    
    public void addBotaoPontoButtonListener(ActionListener lis){
        botaoPonto.addActionListener(lis);
    }
    
    public void addBotaoPainelButtonListener(ActionListener lis){
        botaoPainel.addActionListener(lis);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoAdicao;
    private javax.swing.JButton botaoDivisao;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMultiplicacao;
    private javax.swing.JButton botaoPainel;
    private javax.swing.JButton botaoPonto;
    private javax.swing.JButton botaoSubtracao;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JTextField campoResultado1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
