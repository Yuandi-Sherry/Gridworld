import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
final class Calculator {
    private Calculator() {

    }
    private static void createAndShowGUI() {
       
        JFrame frame = new JFrame("Easy Calculator");

        frame.setLayout(new GridLayout(2,5,5,5));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField operand1 = new JTextField();
        JTextField operand2 = new JTextField();
        JLabel operator = new JLabel("");
        JLabel equal = new JLabel("=");
        JLabel result = new JLabel("");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiple = new JButton("*");
        JButton divide = new JButton("/");
        JButton ok = new JButton("OK");
        
        frame.getContentPane().add(operand1);
        frame.getContentPane().add(operator);
        frame.getContentPane().add(operand2);
        frame.getContentPane().add(equal);
        frame.getContentPane().add(result);
        frame.getContentPane().add(plus);
        frame.getContentPane().add(minus);
        frame.getContentPane().add(multiple);
        frame.getContentPane().add(divide);
        frame.getContentPane().add(ok);

        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator.setText("+");
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator.setText("-");
            }
        });

        multiple.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator.setText("*");
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator.setText("/");
            }
        });
        
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int operand1Int;
                int operand2Int;
                double resultInt = 0;
                if(operand1.getText().length() != 0 && operand2.getText().length() != 0 && operator.getText().length() != 0) {
                    operand1Int = Integer.parseInt(operand1.getText());
                    operand2Int = Integer.parseInt(operand2.getText());
                    switch (operator.getText().charAt(0)) {
                        case '+':
                        {
                            resultInt = operand1Int + operand2Int;
                            break;
                        }
                        case '-':
                        {
                            resultInt = operand1Int - operand2Int;
                            break;
                        }
                        case '*':
                        {
                            resultInt = operand1Int * operand2Int;
                            break;
                        }
                        case '/':
                        {
                            if(operand2Int == 0) {
                                resultInt = Double.NaN;
                            }
                            else {
                                resultInt = (double)operand1Int / (double)operand2Int;
                            }
                            break;
                        }
                    }
                    result.setText(resultInt+"");
                }
                
            }
        });

        operand1.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if(keyChar < KeyEvent.VK_0 || keyChar > KeyEvent.VK_9){  
                    //关键，屏蔽掉非法输入  
                    e.consume(); 
                }
            }  
        });  
        operand2.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if(keyChar < KeyEvent.VK_0 || keyChar > KeyEvent.VK_9){  
                      e.consume(); 
                }
            }  
        });  
        
        frame.pack();
        frame.setVisible(true);        
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}