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

public class CaculatingFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numA;
	private JTextField numB;
	private JTextField numC;
	private JTextField Result;

	public CaculatingFrame() {
		setTitle("Caculating ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số A:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(82, 102, 96, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số B:");
		lblNhpSB.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNhpSB.setBounds(82, 167, 96, 37);
		contentPane.add(lblNhpSB);
		
		JLabel lblNhpSC = new JLabel("Nhập số C:");
		lblNhpSC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNhpSC.setBounds(82, 235, 96, 37);
		contentPane.add(lblNhpSC);
		
		numA = new JTextField();
		numA.setBounds(233, 104, 310, 37);
		contentPane.add(numA);
		numA.setColumns(10);
		
		numB = new JTextField();
		numB.setColumns(10);
		numB.setBounds(233, 169, 310, 37);
		contentPane.add(numB);
		
		numC = new JTextField();
		numC.setColumns(10);
		numC.setBounds(233, 237, 310, 37);
		contentPane.add(numC);
		
		JLabel lblNewLabel_1 = new JLabel("PTB2 có dạng: Ax2+ Bx+ C=0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(82, 25, 461, 50);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("TÍNH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hàm xử lý tính toán
				GiaiPTB2();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(273, 302, 137, 44);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("KẾT QUẢ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(20, 366, 143, 44);
		contentPane.add(lblNewLabel_2);
		
		Result = new JTextField();
		Result.setBounds(133, 365, 578, 52);
		contentPane.add(Result);
		Result.setColumns(10);
	}
	void GiaiPTB2() {
	    // Lấy dữ liệu từ giao diện
	    String numberA = numA.getText();
	    String numberB = numB.getText();
	    String numberC = numC.getText();

	    // Chuyển dữ liệu thành số thực
	    double NumberA = Double.parseDouble(numberA);
	    double NumberB = Double.parseDouble(numberB);
	    double NumberC = Double.parseDouble(numberC);

	    // Tính denta
	    double denta = NumberB * NumberB - 4 * NumberA * NumberC;

	    if (denta > 0) {
	        // Phương trình có hai nghiệm phân biệt
	        double x1 = (-NumberB + Math.sqrt(denta)) / (2 * NumberA);
	        double x2 = (-NumberB - Math.sqrt(denta)) / (2 * NumberA);
	        String result = "Phương trình có hai nghiệm phân biệt:\n" +
	                        "x1 = " + x1 + "\n" +
	                        "x2 = " + x2;
	        Result.setText(result);
	    } else if (denta == 0) {
	        // Phương trình có nghiệm kép
	        double x = -NumberB / (2 * NumberA);
	        String result = "Phương trình có nghiệm kép:\n" +
	                        "x = " + x;
	        Result.setText(result);
	    } else {
	        // Phương trình vô nghiệm
	        Result.setText("Phương trình vô nghiệm");
	    }
	}
}
