package testgit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Tinhbac2 extends JFrame {
	
	private JPanel contentPane;
	  private JTextField textFieldA;
	    private JTextField textFieldB;
	    private JTextField textFieldC;
	    private JButton btnKetQua;
	    private JTextArea textArea;
	    private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tinhbac2 frame = new Tinhbac2();
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
	public Tinhbac2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Java Swing - giải phương trình bậc 2");
        // tạo các label hằng số
        JLabel labelHangSo = new JLabel("Hằng số:");
        JLabel labelHangSoA = new JLabel("a:");
        JLabel labelHangSoB = new JLabel("b:");
        JLabel labelHangSoC = new JLabel("c:");
        labelHangSo.setBounds(20, 20, 50, 20);
        labelHangSoA.setBounds(20, 50, 30, 20);
        labelHangSoB.setBounds(100, 50, 30, 20);
        labelHangSoC.setBounds(180, 50, 30, 20);
        // tạo các trường nhập hằng số
        textFieldA = new JTextField();
        textFieldB = new JTextField();
        textFieldC = new JTextField();
        textFieldA.setBounds(40, 50, 40, 20);
        textFieldB.setBounds(120, 50, 40, 20);
        textFieldC.setBounds(200, 50, 40, 20);
        // tạo button để tính nghiệm của phương trình bậc 2
        btnKetQua = new JButton("Kết Quả");
      
        btnKetQua.setBounds(20, 80, 80, 30);
        // tạo textarea để hiện thị kết quả
        textArea = new JTextArea();
        textArea.setBounds(20, 120, 350, 150);
        // add các đối tượng vào jframe
        getContentPane().add(labelHangSo);
        getContentPane().add(labelHangSoA);
        getContentPane().add(textFieldA);
        getContentPane().add(labelHangSoB);
        getContentPane().add(textFieldB);
        getContentPane().add(labelHangSoC);
        getContentPane().add(textFieldC);
        getContentPane().add(btnKetQua);
        getContentPane().add(textArea);
        // thiết lập bố cục (layout)
        getContentPane().setLayout(null);
        
        btnNewButton = new JButton("đóng");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        	}
        });
        btnNewButton.setBounds(200, 80	,80 , 30);
        contentPane.add(btnNewButton);
        // thiết lập kích thước jframe
        setSize(558, 521);
        // hiển thị jframe
        setVisible(true);
	}
	public JTextField getTextFieldA() {
        return textFieldA;
    }
 
    public void setTextFieldA(JTextField textFieldA) {
        this.textFieldA = textFieldA;
    }
 
    public JTextField getTextFieldB() {
        return textFieldB;
    }
 
    public void setTextFieldB(JTextField textFieldB) {
        this.textFieldB = textFieldB;
    }
 
    public JTextField getTextFieldC() {
        return textFieldC;
    }
 
    public void setTextFieldC(JTextField textFieldC) {
        this.textFieldC = textFieldC;
    }
 
    public JButton getBtnKetQua() {
        return btnKetQua;
    }
 
    public void setBtnKetQua(JButton btnKetQua) {
        this.btnKetQua = btnKetQua;
    }
 
    public JTextArea getTextArea() {
        return textArea;
    }
 
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

}
