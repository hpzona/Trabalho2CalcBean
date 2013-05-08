package Principal;

import java.awt.Dimension;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class VisaoCalcBean extends javax.swing.JPanel implements java.beans.Customizer {

    private Object bean;
    boolean calcPanelVisible2;
    private boolean calcPanelVisible = false;
    char operador;
    String valor1;
    String resultado;
    boolean pontoInserido;
    boolean jaCalculou;

    public VisaoCalcBean() {
        initComponents();
        this.pontoInserido = false;
        this.jaCalculou = false;
        setCalcPanelVisible(false);
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
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        jPanel1.add(botao7);

        botao8.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao8.setText("8");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });
        jPanel1.add(botao8);

        botao9.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao9.setText("9");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });
        jPanel1.add(botao9);

        botaoDivisao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoDivisao.setForeground(new java.awt.Color(255, 0, 0));
        botaoDivisao.setText("/");
        botaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoDivisao);

        botao4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao4.setText("4");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });
        jPanel1.add(botao4);

        botao5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao5.setText("5");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });
        jPanel1.add(botao5);

        botao6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao6.setText("6");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });
        jPanel1.add(botao6);

        botaoMultiplicacao.setForeground(new java.awt.Color(255, 0, 0));
        botaoMultiplicacao.setText("*");
        botaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoMultiplicacao);

        botao1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao1.setText("1");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        jPanel1.add(botao1);

        botao2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao2.setText("2");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        jPanel1.add(botao2);

        botao3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao3.setText("3");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });
        jPanel1.add(botao3);

        botaoSubtracao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoSubtracao.setForeground(new java.awt.Color(255, 0, 0));
        botaoSubtracao.setText("-");
        botaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtracaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSubtracao);

        botao0.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botao0.setText("0");
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });
        jPanel1.add(botao0);

        botaoPonto.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoPonto.setText(".");
        botaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoPonto);

        botaoIgual.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoIgual.setForeground(new java.awt.Color(0, 153, 0));
        botaoIgual.setText("=");
        botaoIgual.setEnabled(false);
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });
        jPanel1.add(botaoIgual);

        botaoAdicao.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        botaoAdicao.setForeground(new java.awt.Color(255, 0, 0));
        botaoAdicao.setText("+");
        botaoAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoAdicao);

        botaoPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/calcM32.png"))); // NOI18N
        botaoPainel.setBorderPainted(false);
        botaoPainel.setContentAreaFilled(false);
        botaoPainel.setFocusable(false);
        botaoPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPainelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(campoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

   private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("0");
       } else {
           this.campoResultado.setText("");
           atualizarTexto("0");
       }
   }//GEN-LAST:event_botao0ActionPerformed

   private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("1");
       } else {
           campoResultado.setText("");
           this.atualizarTexto("1");
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao1ActionPerformed

   private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("2");
       } else {
           this.campoResultado.setText("");
           atualizarTexto("2");
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao2ActionPerformed

   private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("3");
       } else {
           this.campoResultado.setText("");
           atualizarTexto("3");
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao3ActionPerformed

   private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("4");
       } else {
           this.campoResultado.setText("");
           atualizarTexto("4");
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao4ActionPerformed

   private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("5");
       } else {
           this.campoResultado.setText("");
           atualizarTexto("5");
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao5ActionPerformed

   private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("6");
       } else {
           this.campoResultado.setText("");
           atualizarTexto("6");
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao6ActionPerformed

   private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("7");
       } else {
           this.campoResultado.setText("");
           atualizarTexto("7");
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao7ActionPerformed

   private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("8");
       } else {
           this.campoResultado.setText("");
           valor1 = "8";
           atualizarTexto(valor1);
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao8ActionPerformed

   private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
       if (!isJaCalculou()) {
           atualizarTexto("9");
       } else {
           this.campoResultado.setText("");
           atualizarTexto("9");
           setJaCalculou(false);
       }
   }//GEN-LAST:event_botao9ActionPerformed

   private void botaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivisaoActionPerformed
       try {
           if (this.campoResultado.getText().isEmpty()) {
               throw new IllegalArgumentException();
           } else {
               Float.parseFloat(this.campoResultado.getText());
               operador = '/';  // recebe o operador
               setValor1(this.campoResultado.getText());  // recebe o valor atual do visor
               this.campoResultado.setText("");   // apaga o visor
               setPontoInserido(false);
               setJaCalculou(false);
               atualizarBotoes();
           }
       } catch (NumberFormatException nfe) {
           ValorInvalido();
           this.campoResultado.setText("");   // apaga o visor
       } catch (IllegalArgumentException iae) {
           CampoEmBranco();
       }
   }//GEN-LAST:event_botaoDivisaoActionPerformed

   private void botaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicacaoActionPerformed
       try {
           if (this.campoResultado.getText().isEmpty()) {
               throw new IllegalArgumentException();
           } else {
               Float.parseFloat(this.campoResultado.getText());
               operador = '*';  // recebe o operador
               setValor1(this.campoResultado.getText());  // recebe o valor atual do visor
               this.campoResultado.setText("");   // apaga o visor
               setPontoInserido(false);
               setJaCalculou(false);
               atualizarBotoes();
           }
       } catch (NumberFormatException nfe) {
           ValorInvalido();
           this.campoResultado.setText("");   // apaga o visor
       } catch (IllegalArgumentException iae) {
           CampoEmBranco();
       }
   }//GEN-LAST:event_botaoMultiplicacaoActionPerformed

   private void botaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtracaoActionPerformed
       try {
           if (this.campoResultado.getText().isEmpty()) {
               throw new IllegalArgumentException();
           } else {
               Float.parseFloat(this.campoResultado.getText());
               operador = '-';  // recebe o operador
               setValor1(this.campoResultado.getText());  // recebe o valor atual do visor
               this.campoResultado.setText("");   // apaga o visor
               setPontoInserido(false);
               setJaCalculou(false);
               atualizarBotoes();
           }
       } catch (NumberFormatException nfe) {
           ValorInvalido();
           this.campoResultado.setText("");   // apaga o visor
       } catch (IllegalArgumentException iae) {
           CampoEmBranco();
       }
   }//GEN-LAST:event_botaoSubtracaoActionPerformed

   private void botaoAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicaoActionPerformed
       try {
           if (this.campoResultado.getText().isEmpty()) {
               throw new IllegalArgumentException();
           } else {
               Float.parseFloat(this.campoResultado.getText());
               operador = '+';  // recebe o operador
               setValor1(this.campoResultado.getText());  // recebe o valor atual do visor
               this.campoResultado.setText("");   // apaga o visor
               setPontoInserido(false);
               setJaCalculou(false);
               atualizarBotoes();
           }
       } catch (NumberFormatException nfe) {
           ValorInvalido();
           this.campoResultado.setText("");   // apaga o visor
       } catch (IllegalArgumentException iae) {
           CampoEmBranco();
       }
   }//GEN-LAST:event_botaoAdicaoActionPerformed

   private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
       try {
           if (getValor1() == null) {
               SemValorPraCalcular();
           } else {
               String valor2 = this.campoResultado.getText(); // valor2 recebe o valor atual
               float v = Float.parseFloat(valor1); // converte o valor1 em float
               float v2 = Float.parseFloat(valor2); // converte valor2 em float
               resultado = "" + calcular(v, operador, v2);
               this.campoResultado.setText(resultado);
               setPontoInserido(false);
               setJaCalculou(true);
               atualizarBotoes();
               setValor1(resultado);
           }
       } catch (NumberFormatException nfe) {
           ValorInvalido();
           this.campoResultado.setText("");   // apaga o visor
       }
   }//GEN-LAST:event_botaoIgualActionPerformed

   private void botaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontoActionPerformed
       if (!isPontoInserido()) {
           if (!isJaCalculou()) {
               String valor_atual = this.campoResultado.getText(); // pega o texto atual do visor 
               this.campoResultado.setText(valor_atual + ".");
               setPontoInserido(true);
           }
       }
   }//GEN-LAST:event_botaoPontoActionPerformed

   private void botaoPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPainelActionPerformed
       if (isCalcPanelVisible()) {
           setCalcPanelVisible(false);
           setPreferredSize(new Dimension(205, 48));
       } else {
           setCalcPanelVisible(true);
       }
   }//GEN-LAST:event_botaoPainelActionPerformed

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

    private void atualizarTexto(String valor) {
        String valor_atual = this.campoResultado.getText(); // pega o texto atual do visor
        this.campoResultado.setText(valor_atual + valor); // adiciona o texto ao valor atual
    }

    private void atualizarBotoes() {
        botaoAdicao.setEnabled(jaCalculou);
        botaoSubtracao.setEnabled(jaCalculou);
        botaoMultiplicacao.setEnabled(jaCalculou);
        botaoDivisao.setEnabled(jaCalculou);
        botaoIgual.setEnabled(!jaCalculou);
    }

    private boolean isJaCalculou() {
        return this.jaCalculou;
    }

    public void setJaCalculou(boolean jaCalculou) {
        this.jaCalculou = jaCalculou;
    }

    private boolean isPontoInserido() {
        return this.pontoInserido;
    }

    private void setPontoInserido(boolean pontoInserido) {
        this.pontoInserido = pontoInserido;
    }


    private String getText() {
        return this.campoResultado.getText();
    }

    private void setText(String txt) {
        this.campoResultado.setText(txt);
    }

    private String getValor1() {
        return this.valor1;
    }

    private void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    private void ValorInvalido() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "VALOR INVÁLIDO", WIDTH);
    }

    private void CampoEmBranco() {
        JOptionPane.showMessageDialog(null, "Campo em branco", "CAMPO EM BRANCO", WIDTH);
    }

    private void SemValorPraCalcular() {
        JOptionPane.showMessageDialog(null, "Sem valor pra calcular", "SEM VALOR", WIDTH);
    }
    

    public boolean isCalcPanelVisible() {
        return calcPanelVisible;
    }

    public void setCalcPanelVisible(boolean calcPanelVisible) {
        this.calcPanelVisible = calcPanelVisible;
        this.jPanel1.setVisible(calcPanelVisible);
    }

 /*   public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();  // Cria frame
        VisaoCalcBean bean = new VisaoCalcBean(); // Instancia o bean
        frame.add(bean);  // Adiciona bean ao frame
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(202, 294);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  // Exibe o frame

    }*/
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
