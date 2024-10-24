
package travel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*; // this package image setting
import javax.swing.border.*;  //this package for border package


public class Login extends JFrame{
    
    Login(){
        // These are only left side pannel
        setSize(900, 400);    //for frame making
        setLocation(300, 200);
        setLayout(null);
        
        getContentPane().setBackground(Color.gray);   
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.gray);       // For making divisionon frame
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);                    // its works when only setlayout is NULL
        add(p1);
        
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login image.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p1.add(image);                                 //call the image on panel
        
        
        
        
        
        JPanel p2 = new JPanel();    //this is for right panel
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);
        
        
        // For The Username
        JLabel lblusername = new JLabel("Username"); //USING JLABEL WRITE THE SYNATX ON THE FRAME
        lblusername.setFont(new Font("SAN_SERIF", Font.BOLD, 20)); //coreect the font style
        lblusername.setBounds(60, 20, 100, 25);
        p2.add(lblusername);
        
        
        
        JTextField tfusername = new JTextField();  //for fix the colum
        tfusername.setBounds(60, 50, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder()); // removing the border
        p2.add(tfusername);
        
        
        
        
        
         // For The User Password
        JLabel lblpassword = new JLabel("Password"); //USING JLABEL WRITE THE SYNATX ON THE FRAME
        lblpassword.setFont(new Font("SAN_SERIF", Font.BOLD, 20)); //coreect the font style
        lblpassword.setBounds(60, 110, 100, 25);
        p2.add(lblpassword);
        
        
        JTextField tfpassword = new JTextField();  //for fix the colum
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder()); // removing the border
        p2.add(tfpassword);
        
        
        
        // For Login Button
        JButton login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(Color.gray);
        login.setForeground(Color.WHITE); //clor of syntax
        login.setBorder(new LineBorder(new Color(0,0,0))); //this for border color
        p2.add(login);
        
        
        
        
         // For Signup Button
        JButton signup = new JButton("Signup");
        signup.setBounds(230, 200, 130, 30);
        signup.setBackground(Color.gray);
        signup.setForeground(Color.WHITE); //clor of syntax
        signup.setBorder(new LineBorder(new Color(0,0,0))); //this for border color
        p2.add(signup);
        
        
        
        
         
         // For Forgot Password Button
        JButton FPassword = new JButton("Forgot Password?");
        FPassword.setBounds(130, 250, 130, 30);
        FPassword.setBackground(Color.gray);
        FPassword.setForeground(Color.WHITE); //clor of syntax
        FPassword.setBorder(new LineBorder(new Color(0,0,0))); //this for border color
        p2.add(FPassword);
        
        //This is for side Text
        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(280, 250, 100, 30);
        text.setForeground(Color.BLACK);
         p2.add(text);
        
        
        
        
        setVisible(true);  //for showing frame
        
        
    }
    
    public static void main(String[] args){
        new Login();   //anonnymouse object in java
    }
    
}
