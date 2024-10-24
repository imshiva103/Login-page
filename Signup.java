
package travel.management.system;
import javax.swing.*;//it sneccesarry becouse to import the JFrame
import java.awt.*; ///this import use for to give the color of frame


public class Signup extends JFrame {
    
    Signup(){
        setBounds(350, 200, 900, 360); //its is the combination of setsize and setlocation
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //To set the panel on the frame
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233)); //BLUE COLOR
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
        //For display the username on yhe signup frame
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.BOLD, 14));
        lblusername.setBounds(50, 20, 125, 25);
        p1.add(lblusername);
        
        //Giving the text field in front username
        JTextField tfusername = new JTextField();
        tfusername.setBounds(190, 20, 180, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        
        
        
        //For display the name on yhe signup frame
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.BOLD, 14));
        lblname.setBounds(50, 60, 125, 25);
        p1.add(lblname);
       
        //Giving the text field in front of name
        JTextField tfname = new JTextField();
        tfname.setBounds(190, 60, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        
        
        
        //For display the password on the sign frame
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma",Font.BOLD, 14));
        lblpassword.setBounds(50, 100, 125, 25);
        p1.add(lblpassword);
       
        //Giving the text field in front of password
        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(190, 100, 180, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        
       

        //For display the security question on the frame
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD, 14));
        lblsecurity.setBounds(50, 140, 125, 25);
        p1.add(lblsecurity);
        
        Choice security = new Choice(); //to give the options in the form of list for security question
        security.add("What is your Fav Food ?");
        security.add("What is your Fav Color ?");
        security.add("What is your Fav Game ?");
        security.add("What is your Fav Movie ?");
        security.add("What is your Fav Actor ?");
        security.setBounds(190, 140, 180, 25);
        p1.add(security);
        
        //For display the password on the sign frame
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setFont(new Font("Tahoma",Font.BOLD, 14));
        lblanswer.setBounds(50, 190, 125, 25);
        p1.add(lblanswer);
       
        //Giving the text field in front of password
        JTextField tfanswer = new JTextField();
        tfanswer.setBounds(190, 190, 180, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        
        
        //for making buttons
        JButton create = new JButton("Create");
        create.setBackground(Color.white);
        create.setForeground(new Color(133, 193, 233));
        create.setFont(new Font("Tahoma",Font.BOLD, 14));
        create.setBounds(80, 250, 100, 30);
        p1.add(create);
        
        
        // for making buttons
         JButton back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(133, 193, 233));
        back.setFont(new Font("Tahoma",Font.BOLD, 14));
        back.setBounds(250, 250, 100, 30);
        p1.add(back);
        
        //upload image with image icon class
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);                                 //call the image on panel
        
        
        




       
        
        
        
        
        setVisible(true); //its by default false when we pass true then fram will be visible
    }
    
    public static void main(String[] args){
        new Signup();
    }
    
    
    
}
