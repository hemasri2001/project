package SCcalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QCALC {

	private JFrame frame;
	private JTextField textField;
	private final JButton btnr = new JButton("R");

	/**
	 * Launch the application.
	 */
	double firstNo;
	double secondNo;
	double result;//store the current result
     String operation;// store which operation need to be done 
     String answer;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QCALC window = new QCALC();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QCALC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 839);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 56));
		lblNewLabel.setBounds(10, 0, 497, 65);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(0, 54, 551, 80);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		btnr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
	
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnr.setBounds(0, 140, 102, 86);
		frame.getContentPane().add(btnr);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnx.setBounds(0, 230, 102, 86);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnXy.setBounds(0, 326, 102, 86);
		frame.getContentPane().add(btnXy);
		
		JButton btnX = new JButton("x^3");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnX.setBounds(0, 421, 102, 86);
		frame.getContentPane().add(btnX);
		
		JButton btnX_1 = new JButton("x^2");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnX_1.setBounds(0, 517, 102, 86);
		frame.getContentPane().add(btnX_1);
		
		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1; 
				while(a!=0) {fact=fact*a;
				a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBounds(0, 613, 102, 86);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEx.setBounds(113, 140, 102, 86);
		frame.getContentPane().add(btnEx);
		
		JButton btnNewButton_6_1 = new JButton("Log");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_1.setBounds(112, 230, 102, 86);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("%");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_6_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_2.setBounds(112, 326, 102, 86);
		frame.getContentPane().add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("7");
		btnNewButton_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_3.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_6_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_3.setBounds(113, 422, 102, 86);
		frame.getContentPane().add(btnNewButton_6_3);
		
		JButton btnNewButton_6_4 = new JButton("4");
		btnNewButton_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_4.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_6_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_4.setBounds(112, 517, 102, 86);
		frame.getContentPane().add(btnNewButton_6_4);
		
		JButton btnsin = new JButton("Sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsin.setBounds(225, 140, 102, 86);
		frame.getContentPane().add(btnsin);
		
		JButton btnNewButton_6_7 = new JButton("Sinh");
		btnNewButton_6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_6_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_7.setBounds(224, 230, 102, 86);
		frame.getContentPane().add(btnNewButton_6_7);
		
		JButton btnNewButton_6_8 = new JButton("C");
		btnNewButton_6_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_6_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_8.setBounds(224, 326, 102, 86);
		frame.getContentPane().add(btnNewButton_6_8);
		
		JButton btnNewButton_6_9 = new JButton("8");
		btnNewButton_6_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_9.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_6_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_9.setBounds(225, 422, 102, 86);
		frame.getContentPane().add(btnNewButton_6_9);
		
		JButton btnNewButton_6_10 = new JButton("5");
		btnNewButton_6_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_10.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_6_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_10.setBounds(225, 517, 102, 86);
		frame.getContentPane().add(btnNewButton_6_10);
		
		JButton btnNewButton_6_11 = new JButton("0");
		btnNewButton_6_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_11.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_6_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_6_11.setBounds(113, 709, 215, 86);
		frame.getContentPane().add(btnNewButton_6_11);
		
		JButton btnNewButton_6_12 = new JButton("Cos");
		btnNewButton_6_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_6_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_12.setBounds(337, 140, 102, 86);
		frame.getContentPane().add(btnNewButton_6_12);
		
		JButton btnNewButton_6_13 = new JButton("Cosh");
		btnNewButton_6_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_6_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_13.setBounds(337, 230, 102, 86);
		frame.getContentPane().add(btnNewButton_6_13);
		
		JButton btnNewButton_6_14 = new JButton("B");
		btnNewButton_6_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					

				
			}
			}});
		btnNewButton_6_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_14.setBounds(336, 326, 102, 86);
		frame.getContentPane().add(btnNewButton_6_14);
		
		JButton btnNewButton_6_15 = new JButton("9");
		btnNewButton_6_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_15.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_6_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_15.setBounds(337, 422, 102, 86);
		frame.getContentPane().add(btnNewButton_6_15);
		
		JButton btnNewButton_6_16 = new JButton("6");
		btnNewButton_6_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_16.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_6_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_16.setBounds(337, 517, 102, 86);
		frame.getContentPane().add(btnNewButton_6_16);
		
		JButton btnNewButton_6_17 = new JButton(".");
		btnNewButton_6_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6_17.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_6_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_17.setBounds(338, 709, 102, 86);
		frame.getContentPane().add(btnNewButton_6_17);
		
		JButton btnNewButton_6_18 = new JButton("Tan");
		btnNewButton_6_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_6_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_18.setBounds(449, 140, 102, 86);
		frame.getContentPane().add(btnNewButton_6_18);
		
		JButton btnNewButton_6_19 = new JButton("Tanh");
		btnNewButton_6_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_6_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_19.setBounds(449, 230, 102, 86);
		frame.getContentPane().add(btnNewButton_6_19);
		
		JButton btnNewButton_6_20 = new JButton("+");
		btnNewButton_6_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNo=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_6_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_20.setBounds(449, 326, 102, 86);
		frame.getContentPane().add(btnNewButton_6_20);
		
		JButton btnNewButton_6_21 = new JButton("-");
		btnNewButton_6_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_6_21.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_21.setBounds(449, 422, 102, 86);
		frame.getContentPane().add(btnNewButton_6_21);
		
		JButton btnNewButton_6_22 = new JButton("*");
		btnNewButton_6_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_6_22.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_22.setBounds(449, 517, 102, 86);
		frame.getContentPane().add(btnNewButton_6_22);
		
		JButton btnNewButton_6_23 = new JButton("=");
		btnNewButton_6_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNo=Double.parseDouble(textField.getText());// taking second number form user
				if(operation=="+") {
					result=firstNo+secondNo; //adding two no
					answer=String.format("%2f", result); // changes to formated string
					textField.setText(answer);//set the answer in textFiled
				}
				else if(operation=="-") {
					result=firstNo-secondNo; //adding two no
					answer=String.format("%2f", result); // changes to formated string
					textField.setText(answer);//set the answer in textFiled
				}
				else if(operation=="*") {
					result=firstNo*secondNo; //adding two no
					answer=String.format("%2f", result); // changes to formated string
					textField.setText(answer);//set the answer in textFiled
				}
				else if(operation=="/") {
					result=firstNo/secondNo; //adding two no
					answer=String.format("%2f", result); // changes to formated string
					textField.setText(answer);//set the answer in textFiled
				}
				else if(operation=="%") {
					result=firstNo%secondNo; //adding two no
					answer=String.format("%2f", result); // changes to formated string
					textField.setText(answer);//set the answer in textFiled
				}
				else if(operation=="x^y") {
					double  power=1;
					for(int i=0;i<secondNo;i++) {
						power=power*firstNo;
					}
					//result=firstNo%secondNo; //adding two no
					answer=String.format("%2f", power); // changes to formated string
					textField.setText(answer);//set the answer in textFiled
				}
			}
		});
				btnNewButton_6_23.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_23.setBounds(450, 709, 102, 86);
		frame.getContentPane().add(btnNewButton_6_23);
		
		JButton btnNewButton_5_1 = new JButton("+/-");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double b=Double.parseDouble(String.valueOf(textField.getText()));
				b=b*(-1);
				textField.setText(String.valueOf(b));
			}
		}
		);
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5_1.setBounds(0, 709, 102, 86);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("1");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5_2.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_5_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5_2.setBounds(113, 613, 102, 86);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("2");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5_3.getText();
				textField.setText(number);
				
			}
			
		});
		btnNewButton_5_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5_3.setBounds(225, 613, 102, 86);
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("3");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5_4.getText();
				textField.setText(number);
				
			}
		});
		btnNewButton_5_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5_4.setBounds(337, 613, 102, 86);
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("/");
		btnNewButton_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_5_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5_5.setBounds(449, 613, 102, 86);
		frame.getContentPane().add(btnNewButton_5_5);
	}
}
