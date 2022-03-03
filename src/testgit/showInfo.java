/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgit;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import static testgit.UCLN_v1.USCLN;


public class showInfo extends JFrame{
    
    private JPanel contentPane;
    private JTextField txt_name;
    private JTextField txt_age;
    private JTextField txt_kq;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    showInfo frame = new showInfo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    
    public showInfo(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 535, 380);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        JLabel lblNewLabel = new JLabel("CHUONG TRINH Hien Thi thong tin");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(65, 30, 418, 30);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Ten");
        lblNewLabel_1.setBounds(68, 86, 46, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Tuoi");
        lblNewLabel_1_1.setBounds(68, 123, 46, 14);
        contentPane.add(lblNewLabel_1_1);

        txt_name = new JTextField();
        txt_name.setBounds(124, 83, 229, 20);
        contentPane.add(txt_name);
        txt_name.setColumns(10);

        txt_age = new JTextField();
        txt_age.setColumns(10);
        txt_age.setBounds(124, 120, 229, 20);
        contentPane.add(txt_age);


        JButton btnShow = new JButton("Hien Thi");
        btnShow.setBounds(40, 226, 100, 23);
        contentPane.add(btnShow);
        
        
        
        
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, 
                        "Tên là " + txt_name.getText() + "\n" +
                                "Tuổi là " + txt_age.getText() + "\n" 
                );
            }
        });
    }
 }


