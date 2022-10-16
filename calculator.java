package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Canvas;
import java.awt.Point;
import java.awt.Cursor;

public class calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_output;
	private JTextField textField_check;
	
	double inputNum ;
	double answer ;
	int calculation;
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 345);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button_1 = new Button("1");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setFont(new Font("Dialog", Font.BOLD, 25));
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "1");
			}
		});
		button_1.setBounds(43, 188, 40, 34);
		contentPane.add(button_1);
		
		Button button_2 = new Button("2");
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "2");
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 25));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(108, 188, 40, 34);
		contentPane.add(button_2);
		
		Button button_4 = new Button("4");
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "4");
			}
		});
		button_4.setFont(new Font("Dialog", Font.BOLD, 25));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(44, 148, 40, 34);
		contentPane.add(button_4);
		
		Button button_5 = new Button("5");
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "5");
			}
		});
		button_5.setFont(new Font("Dialog", Font.BOLD, 25));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(108, 148, 40, 34);
		contentPane.add(button_5);
		
		Button button_3 = new Button("3");
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setFont(new Font("Dialog", Font.BOLD, 25));
		button_3.setBackground(Color.WHITE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "3");
			}
		});
		button_3.setBounds(172, 188, 40, 34);
		contentPane.add(button_3);
		
		Button button_delete = new Button("Delete");
		button_delete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText("");
				textField_check.setText("");
			}
		});
		button_delete.setFont(new Font("Dialog", Font.BOLD, 13));
		button_delete.setBackground(Color.WHITE);
		button_delete.setBounds(43, 268, 40, 34);
		contentPane.add(button_delete);
		
		Button button_6 = new Button("6");
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setFont(new Font("Dialog", Font.BOLD, 25));
		button_6.setBackground(Color.WHITE);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "6");
			}
		});
		button_6.setBounds(172, 148, 40, 34);
		contentPane.add(button_6);
		
		Button button_multi = new Button("*");
		button_multi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					inputNum =  Double.parseDouble(textField_output.getText());
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Enter valid input....");
					}
					calculation = 3;
					textField_output.setText("");
					textField_check.setText(inputNum + "*");
			}
		});
		button_multi.setFont(new Font("Dialog", Font.BOLD, 25));
		button_multi.setBackground(Color.WHITE);
		button_multi.setBounds(236, 148, 40, 34);
		contentPane.add(button_multi);
		
		Button button_7 = new Button("7");
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "7");
			}
		});
		button_7.setFont(new Font("Dialog", Font.BOLD, 25));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(44, 110, 40, 34);
		contentPane.add(button_7);
		
		Button button_sub = new Button("-");
		button_sub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					inputNum =  Double.parseDouble(textField_output.getText());
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Enter valid input....");
					}
					calculation = 2;
					textField_output.setText("");
					textField_check.setText(inputNum + "-");
			}
		});
		button_sub.setFont(new Font("Dialog", Font.BOLD, 25));
		button_sub.setBackground(Color.WHITE);
		button_sub.setBounds(236, 228, 40, 34);
		contentPane.add(button_sub);
		
		Button button_8 = new Button("8");
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "8");
			}
		});
		button_8.setFont(new Font("Dialog", Font.BOLD, 25));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(108, 110, 40, 34);
		contentPane.add(button_8);
		
		Button button_9 = new Button("9");
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "9");
			}
		});
		button_9.setFont(new Font("Dialog", Font.BOLD, 25));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(172, 110, 40, 34);
		contentPane.add(button_9);
		
		Button button_divid = new Button("/");
		button_divid.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_divid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					inputNum =  Double.parseDouble(textField_output.getText());
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Enter valid input....");
					}
					calculation = 4;
					textField_output.setText("");
					textField_check.setText(inputNum + "/");
			}
		});
		button_divid.setFont(new Font("Dialog", Font.BOLD, 25));
		button_divid.setBackground(Color.WHITE);
		button_divid.setBounds(236, 188, 40, 34);
		contentPane.add(button_divid);
		
		Button button_00 = new Button(".");
		button_00.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + ".");
			}
		});
		button_00.setFont(new Font("Dialog", Font.PLAIN, 30));
		button_00.setBackground(Color.WHITE);
		button_00.setBounds(44, 226, 40, 34);
		contentPane.add(button_00);
		
		Button button_add = new Button("+");
		button_add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_add.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				
				try {
				inputNum =  Double.parseDouble(textField_output.getText());
				
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Enter valid input....");
				}
				
				calculation = 1;
				textField_output.setText("");
				textField_check.setText(inputNum + "+");
				
			}
		});
		button_add.setFont(new Font("Dialog", Font.BOLD, 25));
		button_add.setBackground(Color.WHITE);
		button_add.setBounds(172, 228, 40, 34);
		contentPane.add(button_add);
		
		Button button_0 = new Button("0");
		button_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_0.setFont(new Font("Dialog", Font.BOLD, 25));
		button_0.setBackground(Color.WHITE);
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_output.setText(textField_output.getText() + "0");
			}
		});
		button_0.setBounds(108, 228, 40, 34);
		contentPane.add(button_0);
		
		JButton button_Enter = new JButton("=");
		button_Enter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				operation();
				textField_check.setText("");
			
			}
		});
		button_Enter.setBackground(Color.WHITE);
		button_Enter.setForeground(Color.BLACK);
		button_Enter.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_Enter.setBounds(107, 268, 170, 34);
		contentPane.add(button_Enter);
		
		Label label_tittle = new Label("CALCULATOR");
		label_tittle.setForeground(new Color(128, 0, 0));
		label_tittle.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		label_tittle.setAlignment(Label.CENTER);
		label_tittle.setBounds(43, 0, 233, 34);
		contentPane.add(label_tittle);
		
		Button button_back = new Button("<--");
		button_back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int length = textField_output.getText().length();
				int number = textField_output.getText().length() -1 ;
				String store;
				
				if(length > 0) {
					StringBuilder back = new StringBuilder (textField_output.getText());
					back.deleteCharAt(number);
					store = back.toString() ;
					textField_output.setText(store);
					
				}
			}
		});
		button_back.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		button_back.setBackground(Color.WHITE);
		button_back.setBounds(236, 110, 40, 34);
		contentPane.add(button_back);
		
		textField_output = new JTextField();
		textField_output.setBorder(null);
		textField_output.setBackground(UIManager.getColor("window"));
		textField_output.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_output.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_output.setBounds(43, 60, 233, 34);
		contentPane.add(textField_output);
		textField_output.setColumns(10);
		
		textField_check = new JTextField();
		textField_check.setBorder(null);
		textField_check.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_check.setBackground(Color.WHITE);
		textField_check.setEditable(false);
		textField_check.setBounds(43, 42, 233, 20);
		contentPane.add(textField_check);
		textField_check.setColumns(10);
	}
	
	private void operation() {
		
		try {
	
		
	switch (calculation){
	
		case 1://addition
			answer= inputNum +  Double.parseDouble(textField_output.getText());
			textField_output.setText(Double.toString(answer));
			break;

		case 2://subtraction
			answer= inputNum -  Double.parseDouble(textField_output.getText());
			textField_output.setText(Double.toString(answer));
			break;
			
		case 3://multiplication
			answer= inputNum *  Double.parseDouble(textField_output.getText());
			textField_output.setText(Double.toString(answer));
			break;
		
		case 4://division
			answer= inputNum /  Double.parseDouble(textField_output.getText());
			textField_output.setText(Double.toString(answer));
			break;	
		
				}
			}
			
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Enter valid input....");
			}
	
		}
	
}


	
