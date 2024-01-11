import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class LoginFrame extends JFrame implements ActionListener {
 
    
    JLabel userLabel;
    JLabel passwordLabel;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton loginButton;
    JButton resetButton;
    
 
    LoginFrame()
    {
       //Calling methods inside constructor.
        setLayoutManager();
        createComponents();
        setLocationAndSize();
        addComponentsToContainer();
 
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
    loginButton=new JButton("LOGIN");
    resetButton=new JButton("RESET");
    }
   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       userLabel.setBounds(50,150,100,30);
       passwordLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       loginButton.setBounds(50,300,100,30);
       resetButton.setBounds(200,300,100,30);
 
 
   }
   public void addComponentsToContainer()
   {
      //Adding each components to Frame(by default to container)
       add(userLabel);
       add(passwordLabel);
       add(userTextField);
       add(passwordField);
       add(loginButton);
       add(resetButton);
   }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
 
    }
}
 
public class Login {
    public static void main(String[] a){
        //JFrame.setDefaultLookAndFeelDecorated(true); 
        LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
 
    }
 
}