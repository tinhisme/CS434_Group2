package testgit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Caculator extends JFrame {

	private JPanel contentPane;
	private JTextField txt_a;
	private JTextField txt_b;
	private JTextField txt_kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caculator frame = new Caculator();
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
	public Caculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CH\u01AF\u01A0NG TR\u00CCNH T\u00CDNH C\u1ED8NG TR\u1EEA NH\u00C2N CHIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(56, 24, 418, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nh\u1EADp A");
		lblNewLabel_1.setBounds(68, 86, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nh\u1EADp B");
		lblNewLabel_1_1.setBounds(68, 123, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txt_a = new JTextField();
		txt_a.setBounds(124, 83, 229, 20);
		contentPane.add(txt_a);
		txt_a.setColumns(10);
		
		txt_b = new JTextField();
		txt_b.setColumns(10);
		txt_b.setBounds(124, 120, 229, 20);
		contentPane.add(txt_b);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("K\u1EBFt qu\u1EA3");
		lblNewLabel_1_1_1.setBounds(68, 166, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txt_kq = new JTextField();
		txt_kq.setEditable(false);
		txt_kq.setColumns(10);
		txt_kq.setBounds(124, 163, 229, 20);
		contentPane.add(txt_kq);
		
		JButton btn_cong = new JButton("C\u1ED9ng");
		btn_cong.setBounds(32, 226, 89, 23);
		contentPane.add(btn_cong);
		
		JButton btn_tru = new JButton("Tr\u1EEB");
		btn_tru.setBounds(139, 226, 89, 23);
		contentPane.add(btn_tru);
		
		JButton btn_nhan = new JButton("Nh\u00E2n");
		btn_nhan.setBounds(247, 226, 89, 23);
		contentPane.add(btn_nhan);
		
		JButton btn_chia = new JButton("Chia");
		btn_chia.setBounds(357, 226, 89, 23);
		contentPane.add(btn_chia);
		
		JButton btn_lammoi = new JButton("L\u00E0m m\u1EDBi");
		btn_lammoi.setBounds(385, 162, 89, 23);
		contentPane.add(btn_lammoi);
                
                btn_lammoi.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txt_a.setText("");
                        txt_b.setText("");
                    }
                });
	}
}
