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
        botao4 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botaoAdicao = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoMultiplicacao = new javax.swing.JButton();
        botaoDivisao = new javax.swing.JButton();
        botaoPonto = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botaoPainel = new javax.swing.JButton();

        botao4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao4.setText("4");

        botao9.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao9.setText("9");

        botao6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao6.setText("6");

        botaoAdicao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoAdicao.setForeground(new java.awt.Color(255, 0, 0));
        botaoAdicao.setText("+");

        botao1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao1.setText("1");

        botaoSubtracao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoSubtracao.setForeground(new java.awt.Color(255, 0, 0));
        botaoSubtracao.setText("-");

        botao5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao5.setText("5");

        botao8.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao8.setText("8");

        botao0.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao0.setText("0");

        botaoMultiplicacao.setForeground(new java.awt.Color(255, 0, 0));
        botaoMultiplicacao.setText("*");

        botaoDivisao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoDivisao.setForeground(new java.awt.Color(255, 0, 0));
        botaoDivisao.setText("/");

        botaoPonto.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoPonto.setText(".");

        botaoIgual.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoIgual.setForeground(new java.awt.Color(0, 153, 0));
        botaoIgual.setText("=");

        botao2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao2.setText("2");

        botao7.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao7.setText("7");

        botao3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao3.setText("3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoPainel.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
