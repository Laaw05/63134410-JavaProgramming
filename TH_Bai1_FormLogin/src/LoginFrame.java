import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginName;
	private JPasswordField passWord;

	public LoginFrame() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("LOGIN/REGISTER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(82, 85, 157, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMtKhu.setBounds(82, 174, 157, 51);
		contentPane.add(lblMtKhu);
		
		loginName = new JTextField();
		loginName.setBounds(249, 91, 420, 44);
		contentPane.add(loginName);
		loginName.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginHanding();
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnLogin.setBounds(396, 285, 131, 51);
		contentPane.add(btnLogin);
		
		passWord = new JPasswordField();
		passWord.setBounds(249, 180, 436, 44);
		contentPane.add(passWord);
	}
	void LoginHanding() {
		//Lay du lieu
		String loginname= loginName.getText();
		String password= passWord.getText();
		//Handle
		if(loginname.equals("63CNTT") && password.equals("123")) {
			//Show HomeFrame
			HomeFrame homePage= new HomeFrame();
			homePage.setVisible(true);
			this.setVisible(false);
		}else {
			//Error Notification
		}
		}
}
