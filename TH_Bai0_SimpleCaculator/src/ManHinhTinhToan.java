import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtResult;
	
	public ManHinhTinhToan() {
		setTitle("ScreenCaculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(49, 22, 145, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai");
		lblNhpSTh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSTh.setBounds(49, 77, 145, 34);
		contentPane.add(lblNhpSTh);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txt1.setBounds(198, 29, 256, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txt2.setColumns(10);
		txt2.setBounds(198, 84, 256, 19);
		contentPane.add(txt2);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyCong();
			}
		});
		btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCong.setBounds(63, 148, 85, 40);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyTru();
			}
		});
		btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTru.setBounds(189, 148, 85, 40);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhận");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNhan.setBounds(307, 148, 85, 40);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyChia();
			}
		});
		btnChia.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnChia.setBounds(425, 148, 85, 40);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán");
		lblKtQuTnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(49, 224, 145, 34);
		contentPane.add(lblKtQuTnh);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setEnabled(false);
		txtResult.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtResult.setColumns(10);
		txtResult.setBounds(198, 233, 256, 19);
		contentPane.add(txtResult);
	}
	void XuLyCong() {
		String strSoA= txt1.getText();
		String strSoB= txt2.getText();
		//Chuyen kieu
		double num1= Double.parseDouble(strSoA);
		double num2= Double.parseDouble(strSoB);
		
		double sum= num1+ num2;
		
		//Hien thi ket qua
		txtResult.setText(String.valueOf(sum));
	}
	void XuLyTru() {
		String strSoA= txt1.getText();
		String strSoB= txt2.getText();
		//Chuyen kieu
		double num1= Double.parseDouble(strSoA);
		double num2= Double.parseDouble(strSoB);
		
		double sum= num1- num2;
		
		//Hien thi ket qua
		txtResult.setText(String.valueOf(sum));
	}
	void XuLyNhan() {
		String strSoA= txt1.getText();
		String strSoB= txt2.getText();
		//Chuyen kieu
		double num1= Double.parseDouble(strSoA);
		double num2= Double.parseDouble(strSoB);
		
		double sum= num1* num2;
		
		//Hien thi ket qua
		txtResult.setText(String.valueOf(sum));
	}
	void XuLyChia() {
		String strSoA= txt1.getText();
		String strSoB= txt2.getText();
		//Chuyen kieu
		double num1= Double.parseDouble(strSoA);
		double num2= Double.parseDouble(strSoB);
		
		double sum= num1 / num2;
		
		//Hien thi ket qua 	
		txtResult.setText(String.valueOf(sum));
	}
}
