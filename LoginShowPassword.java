import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
 
class LoginFrame extends JFrame implements ActionListener {
 
    //Container container=getContentPane();
    JLabel userLabel,passwordLabel;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton loginButton,resetButton;
    JCheckBox showPassword;
 
 
    LoginFrame()
    {
       //Calling methods inside constructor.
        setLayoutManager();
        createComponents();
        setLocationAndSize();
        addComponentsToContainer();
        registration();
 
    }
   public void setLayoutManager()
   {
       setLayout(null);
   }
   public void createComponents()
   {

    userLabel=new JLabel("USERNAME");
    passwordLabel=new JLabel("PASSWORD");
    userTextField=new JTextField();
    passwordField=new JPasswordField();
    passwordField.setEchoChar('*');
    loginButton=new JButton("LOGIN");
    resetButton=new JButton("RESET");
    showPassword=new JCheckBox("Show Password");
   }
   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       userLabel.setBounds(50,150,100,30);
       passwordLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       showPassword.setBounds(150,250,150,30);
       loginButton.setBounds(50,300,100,30);
       resetButton.setBounds(200,300,100,30);
 
 
   }
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       add(userLabel);
       add(passwordLabel);
       add(userTextField);
       add(passwordField);
       add(showPassword);
       add(loginButton);
       add(resetButton);
   }
 
   
   
   public void registration()
   {
    // Handling checkbox events
    showPassword.addItemListener(new ItemListener() { 
    public void itemStateChanged(ItemEvent e) { 
        if (e.getStateChange() == ItemEvent.SELECTED) {
            passwordField.setEchoChar((char) 0); 
        } else {  
           passwordField.setEchoChar('*');  
        } 
    }
}); 




   } 
 
    @Override
    public void actionPerformed(ActionEvent e) {
 
    }
}
 
public class LoginShowPassword {
    public static void main(String[] a){
        JFrame.setDefaultLookAndFeelDecorated(true); 
        LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        //frame.setBounds(30,30,370,450);
        frame.setSize(370,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
 
    }
 
}