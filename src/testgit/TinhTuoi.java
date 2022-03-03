package testgit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TinhTuoi extends JFrame {

	private JPanel contentPane;
	private JTextField txt_tuoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TinhTuoi frame = new TinhTuoi();
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
	public TinhTuoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("XEM TU\u1ED4I");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel.setBounds(172, 11, 95, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nh\u1EADp tu\u1ED5i c\u1EE7a b\u1EA1n");
		lblNewLabel_1.setBounds(28, 58, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		txt_tuoi = new JTextField();
		txt_tuoi.setBounds(147, 55, 233, 20);
		contentPane.add(txt_tuoi);
		txt_tuoi.setColumns(10);
		
		JButton btnNewButton = new JButton("Xem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tuổi của bạn là " + txt_tuoi.getText() , "Kết quả", 
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBounds(147, 103, 89, 23);
		contentPane.add(btnNewButton);
	}
}
