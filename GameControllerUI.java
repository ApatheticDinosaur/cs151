import javax.swing.JOptionPane;

                                                                     
                                                                     
                                                                     
                                             
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GameControllerUI.java
 *
 * Created on Nov 10, 2013, 10:20:45 PM
 */


/**
 *
 * @author STEPHEN
 */
public class GameControllerUI extends javax.swing.JFrame {

    private int numberOfThrows;
    private String difficulty;
    private GameController g;
    private int currentRound;
	
	/** Creates new form GameControllerUI */
    public GameControllerUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        this.setResizable(false);
    	jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter in Number of Throws:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Random", "Smart" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Difficulty:");

        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("3");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Rock");
        jButton2.setVisible(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Paper");
        jButton3.setVisible(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Scissors");
        jButton4.setVisible(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Start");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("");
        jLabel3.setVisible(false);

        jLabel4.setText("Score:");
        jLabel4.setVisible(false);

        jLabel5.setText("Computer's Prediction: ");
        jLabel5.setVisible(false);

        jLabel6.setText("");
        jLabel6.setVisible(false);

        jLabel7.setText("");
        jLabel7.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel7)
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        setSize(500, 400);
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	JOptionPane.showMessageDialog(this, "Choose difficulty with the difficulty drop down menu.\nChoose the number of rounds you will partake in in the number of throws.\nAfter the game starts, choose your choice against the computer.\nThe computer will makes its choice and the score will be displayed above.\nThe computer's prediction of your next move will also be displayed.");
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    	difficulty = (String)jComboBox1.getSelectedItem();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    	jButton2.setVisible(true);
    	jButton3.setVisible(true);
    	jButton4.setVisible(true);
    	jComboBox1.setEnabled(false);
    	jTextField1.setEnabled(false);
    	jButton5.setEnabled(false);
    	jLabel3.setVisible(true);
    	jLabel4.setVisible(true);
    	jLabel5.setVisible(true);
    	jLabel6.setVisible(true);
    	jLabel7.setVisible(true);
    	currentRound = 0;
    	try{
    		numberOfThrows = Integer.parseInt(jTextField1.getText());
    	}
    	catch (NumberFormatException nfe)
    	{
    		JOptionPane.showMessageDialog(this, "WTF DAT AINT NO NUMBER","Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
    	}
    	if(numberOfThrows == 0)
    	{
    		JOptionPane.showMessageDialog(this, "Okay fine, don't play our game...","Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
    	}
    	difficulty = (String)jComboBox1.getSelectedItem();
    	g = new GameController(difficulty, numberOfThrows);
    	jLabel3.setText(g.getScore());
    	
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        currentRound++;
    	jLabel7.setText(g.makeThrow(0));
        jLabel3.setText(g.getScore());
        jLabel6.setText(g.getPredictedThrow());
        if(currentRound == numberOfThrows) {
        	JOptionPane.showMessageDialog(this, "Final Score: " + g.getScore());
        	System.exit(1);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	currentRound++;
    	jLabel7.setText(g.makeThrow(1));
    	jLabel3.setText(g.getScore());
        jLabel6.setText(g.getPredictedThrow());
    	if(currentRound == numberOfThrows) {
        	JOptionPane.showMessageDialog(this, "Final Score: " + g.getScore());
        	System.exit(1);
        }
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    	jButton5ActionPerformed(evt);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    	currentRound++;
    	jLabel7.setText(g.makeThrow(2));
    	jLabel3.setText(g.getScore());
        jLabel6.setText(g.getPredictedThrow());
    	if(currentRound == numberOfThrows) {
        	JOptionPane.showMessageDialog(this, "Final Score: " + g.getScore());
        	System.exit(1);
        }
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameControllerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3; //Current Score
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6; //Computer's prediction
    private javax.swing.JLabel jLabel7; //Win or lose
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration

}