package studentProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class uchenik extends JFrame {

 private JPanel contentPane;
 private JTextField name1;
 private JTextField name3;
 private JTextField name2;
 private JTextField txtegn;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
 EventQueue.invokeLater(new Runnable() {
 public void run() {
 try {
 uchenik frame = new uchenik();
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
 public uchenik() {
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setBounds(100, 100, 506, 343);
 contentPane = new JPanel();
 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 setContentPane(contentPane);
 contentPane.setLayout(null);
 JLabel lblNewLabel = new JLabel("\u0418\u043C\u0435:");
 lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
 lblNewLabel.setBounds(29, 30, 46, 14);
 contentPane.add(lblNewLabel);
 JLabel lblNewLabel_1 = new JLabel("\u041F\u0440\u0435\u0437\u0438\u043C\u0435:");
 lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
 lblNewLabel_1.setBounds(330, 32, 137, 14);
 contentPane.add(lblNewLabel_1);
 JLabel lblNewLabel_2 = new JLabel("\u0424\u0430\u043C\u0438\u043B\u0438\u044F:");
 lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
 lblNewLabel_2.setBounds(29, 131, 137, 14);
 contentPane.add(lblNewLabel_2);
 name1 = new JTextField();
 name1.setBounds(29, 55, 137, 20);
 contentPane.add(name1);
 name1.setColumns(10);
 name3 = new JTextField();
 name3.setColumns(10);
 name3.setBounds(29, 156, 137, 20);
 contentPane.add(name3);
 name2 = new JTextField();
 name2.setColumns(10);
 name2.setBounds(330, 57, 137, 20);
 contentPane.add(name2);
 JLabel lblproverka = new JLabel("");
 lblproverka.setBackground(Color.RED);
 lblproverka.setBounds(300, 156, 20, 20);
 contentPane.add(lblproverka);
 lblproverka.setOpaque(true);
 txtegn = new JTextField();
 txtegn.getDocument().;
 txtegn.addKeyListener(new KeyAdapter() {
 @Override
 public void keyTyped(KeyEvent e) {
 if (e.getKeyChar()<'0'||e.getKeyChar()>'9') e.consume();
 egn egn=new egn(txtegn.getText()+e.getKeyChar());
 if (egn.isCorrect()) lblproverka.setBackground(Color.green);
 else lblproverka.setBackground(Color.red);
 }
 });
 txtegn.setColumns(10);
 txtegn.setBounds(330, 156, 137, 20);
 contentPane.add(txtegn);
 JLabel lblNewLabel_2_1 = new JLabel("\u0415\u0413\u041D:");
 lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
 lblNewLabel_2_1.setBounds(330, 133, 137, 14);
 contentPane.add(lblNewLabel_2_1);
 JPanel proverka = new JPanel();
 proverka.setBackground(Color.RED);
 proverka.setBounds(300, 156, 20, 20);
 contentPane.add(proverka);
 JLabel izvejdane = new JLabel("");
 izvejdane.setHorizontalAlignment(SwingConstants.CENTER);
 izvejdane.setFont(new Font("Tahoma", Font.PLAIN, 17));
 izvejdane.setBounds(29, 249, 438, 31);
 contentPane.add(izvejdane);
 JButton btnNewButton = new JButton("OK");
 btnNewButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 student s=new student (name1.getText(),name2.getText(),name3.getText(),txtegn.getText());
 izvejdane.setText(s.toString());
 /*
  egn egn=new egn(txtegn.getText());
 if (egn.isCorrect()) lblproverka.setBackground(Color.green);
 else proverka.setBackground(Color.red);
 */
 }
 });
 btnNewButton.setBounds(203, 207, 90, 31);
 contentPane.add(btnNewButton);
 }
}
