package trabalhop2;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalculadoraWindows extends javax.swing.JFrame {

    private double valor1;
    private double valor2;
    private String sinal;
    
    public static double Bvalor1, Bvalor2, Bresultado;
    
    public CalculadoraWindows() {
        initComponents();
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        btnCinco = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Windows");
        getContentPane().setLayout(null);

        txtResultado.setBackground(new java.awt.Color(173, 207, 217));
        txtResultado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtResultado.setBorder(null);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtResultado);
        txtResultado.setBounds(40, 70, 350, 100);

        btnCinco.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCinco.setText("5");
        btnCinco.setBorder(null);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCinco);
        btnCinco.setBounds(110, 310, 90, 70);

        btnOito.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnOito.setText("8");
        btnOito.setBorder(null);
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });
        getContentPane().add(btnOito);
        btnOito.setBounds(110, 230, 90, 70);

        btnDois.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnDois.setText("2");
        btnDois.setBorder(null);
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });
        getContentPane().add(btnDois);
        btnDois.setBounds(110, 380, 90, 70);

        btnSete.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnSete.setText("7");
        btnSete.setBorder(null);
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSete);
        btnSete.setBounds(20, 230, 90, 70);

        btnQuatro.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnQuatro.setText("4");
        btnQuatro.setBorder(null);
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuatro);
        btnQuatro.setBounds(20, 310, 90, 70);

        btnNove.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnNove.setText("9");
        btnNove.setBorder(null);
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnNove);
        btnNove.setBounds(200, 230, 90, 70);

        btnSeis.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnSeis.setText("6");
        btnSeis.setBorder(null);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeis);
        btnSeis.setBounds(200, 310, 90, 70);

        btnUm.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnUm.setText("1");
        btnUm.setBorder(null);
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });
        getContentPane().add(btnUm);
        btnUm.setBounds(20, 380, 90, 70);

        btnZero.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnZero.setText("0");
        btnZero.setBorder(null);
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        getContentPane().add(btnZero);
        btnZero.setBounds(110, 460, 90, 70);

        btnTres.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnTres.setText("3");
        btnTres.setBorder(null);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        getContentPane().add(btnTres);
        btnTres.setBounds(200, 380, 90, 70);

        btnPonto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPonto.setText(".");
        btnPonto.setBorder(null);
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPonto);
        btnPonto.setBounds(20, 460, 90, 70);

        btnC.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnC.setText("C");
        btnC.setBorder(null);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC);
        btnC.setBounds(20, 200, 90, 30);

        btnCE.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCE.setText("CE");
        btnCE.setBorder(null);
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        getContentPane().add(btnCE);
        btnCE.setBounds(110, 200, 90, 30);

        btnIgual.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(null);
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        getContentPane().add(btnIgual);
        btnIgual.setBounds(200, 460, 90, 70);

        btnVezes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnVezes.setText("X");
        btnVezes.setBorder(null);
        btnVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVezesActionPerformed(evt);
            }
        });
        getContentPane().add(btnVezes);
        btnVezes.setBounds(290, 460, 90, 70);

        btnMenos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnMenos.setText("_");
        btnMenos.setBorder(null);
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenos);
        btnMenos.setBounds(290, 310, 90, 70);

        btnMais.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnMais.setText("+");
        btnMais.setBorder(null);
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });
        getContentPane().add(btnMais);
        btnMais.setBounds(290, 380, 90, 70);

        btnDivisao.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnDivisao.setText("/");
        btnDivisao.setBorder(null);
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivisao);
        btnDivisao.setBounds(290, 230, 90, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/calculator.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 620);

        setSize(new java.awt.Dimension(441, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        
        txtResultado.setText(txtResultado.getText()+ "0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
       txtResultado.setText(txtResultado.getText()+ "1");
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        txtResultado.setText(txtResultado.getText()+ "2");
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        txtResultado.setText(txtResultado.getText()+ "3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        txtResultado.setText(txtResultado.getText()+ "4");
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        txtResultado.setText(txtResultado.getText()+ "5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        txtResultado.setText(txtResultado.getText()+ "6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        txtResultado.setText(txtResultado.getText()+ "7");
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        txtResultado.setText(txtResultado.getText()+ "8");
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
       txtResultado.setText(txtResultado.getText()+ "9");
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        txtResultado.setText(txtResultado.getText()+ ".");
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        setValor1(Double.parseDouble(txtResultado.getText()));
        setSinal("soma");
        txtResultado.setText("");
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        setValor2(Double.parseDouble(txtResultado.getText()));
        
        if(getSinal() == "soma")
        {
            double soma = valor1 + valor2;
            txtResultado.setText(String.valueOf(soma));
            Bvalor1 = getValor1();
            Bvalor2 = getValor2();
            Bresultado = Double.parseDouble(txtResultado.getText());
        }
        
        if(getSinal() == "menos")
        {
            double sub = valor1 - valor2;
            txtResultado.setText(String.valueOf(sub));
            Bvalor1 = getValor1();
            Bvalor2 = getValor2();
            Bresultado = Double.parseDouble(txtResultado.getText());
        }
        
        if(getSinal() == "multiplicar")
        {
            double mult = valor1 * valor2;
            txtResultado.setText(String.valueOf(mult));
            Bvalor1 = getValor1();
            Bvalor2 = getValor2();
            Bresultado = Double.parseDouble(txtResultado.getText());
        }
        
        if(getSinal() == "dividir")
        {
            double div = valor1 / valor2;
            txtResultado.setText(String.valueOf(div));
            Bvalor1 = getValor1();
            Bvalor2 = getValor2();
            Bresultado = Double.parseDouble(txtResultado.getText());
        }
        
        try {
            BancoDadosCalculadora calc = new BancoDadosCalculadora();
            calc.inserir();
            calc.desconectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CalculadoraWindows.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CalculadoraWindows.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txtResultado.setText("");
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        setValor1(Double.parseDouble(txtResultado.getText()));
        setSinal("menos");
        txtResultado.setText("");
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVezesActionPerformed
        setValor1(Double.parseDouble(txtResultado.getText()));
        setSinal("multiplicar");
        txtResultado.setText("");
    }//GEN-LAST:event_btnVezesActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        setValor1(Double.parseDouble(txtResultado.getText()));
        setSinal("dividir");
        txtResultado.setText("");
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        setValor1(0.0);
        setValor2(0.0);
        txtResultado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnVezes;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

}
