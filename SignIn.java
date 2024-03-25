import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignIn extends JFrame  {
    private JLabel titleLabel, usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInButton;
    private JButton createAccount;
    private static Auth authorization = new Auth();

    public SignIn() {
        setTitle("Investor Center");
        setPreferredSize(new Dimension(600, 400));
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //sign in 
        titleLabel = new JLabel("Sign in");
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
        

        //sign in button
        signInButton = new JButton("Sign in");
        signInButton.setBounds(235, 200, 100, 30);
        signInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean check = authorization.CheckUser(usernameField.getText(), passwordField.getText());
                if (check){
                    System.out.println("user has account");
                    setVisible(false);
                    Survey survey = new Survey();
                    survey.setVisible(true);
                    
                }
                else{
                    System.out.println("Invalid credentials");
                }
            }});

        //create account option if user doesnt have account
        createAccount = new JButton ("CREATE ACCOUNT");
        createAccount.setBounds(215, 240, 150, 30);
        createAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open SignUp window when "CREATE ACCOUNT" button is clicked
                SignUp signUp = new SignUp();
                signUp.signUpMethod();
                setVisible(false);
                

            }
        });

        add(titleLabel);
        
        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(signInButton);
        add(createAccount);


        pack();



    }
}