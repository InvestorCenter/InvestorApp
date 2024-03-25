import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUp extends JFrame implements ActionListener {
    private JLabel titleLabel, usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signUpButton;
    private static Auth authorization = new Auth();

    public void signUpMethod() {
        setTitle("Investor Center");
        setPreferredSize(new Dimension(600, 400));
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //sign up 
        titleLabel = new JLabel("Sign up");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 10, 100, 30);

        


        //username and password indicators
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(125, 90, 80, 30);
        

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(125, 130, 80, 30);




        //username text field
        usernameField = new JTextField();
        usernameField.setBounds(200,90, 200, 30);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.black));



        //password text field
        passwordField = new JPasswordField();
        passwordField.setBounds(200, 130, 200, 30);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black));




        //sign up button
        signUpButton = new JButton("Sign up");
        signUpButton.setBounds(235, 200, 100, 30);
        signUpButton.addActionListener(this);

        add(titleLabel);

        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(signUpButton);

        pack();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //add what happens when clicked "sign up"
        authorization.Signup(usernameField.getText(), passwordField.getText());
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        setVisible(false);
        

    }
}
