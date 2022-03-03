/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgit;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Tinh
 */
public class UCLN_v1 extends JFrame {

   
    private JPanel contentPane;
    private JTextField txt_a;
    private JTextField txt_b;
    private JTextField txt_kq;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UCLN_v1 frame = new UCLN_v1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UCLN_v1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 535, 380);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("CHUONG TRINH TIM UCLN");
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

        JButton btntimUCLN = new JButton("Tim UCLN");
        btntimUCLN.setBounds(40, 226, 100, 23);
        contentPane.add(btntimUCLN);

        btntimUCLN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txt_a.getText());
                int b = Integer.parseInt(txt_b.getText());
                txt_kq.setText("" + USCLN(a, b));
            }
        });
    }

    public static int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }
}
