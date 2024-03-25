// Java program to illustrate the CardLayout Class
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;


public class Survey extends JFrame implements ActionListener {

    // Declaration of objects of CardLayout class.
    CardLayout card;

    // Declaration of objects of JButton class.
    IncomePanel incomePanel;
    RiskPanel riskPanel;
    YesNoContributions yesNoContributions;
    ContributionAmount contributionAmount;
    // Declaration of objects
    // of Container class.
    Container c;

    public Survey()
    {

        // Function to set size of JFrame.
        setTitle("Survey");
        setSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        

        // Function to set visibility of JFrame.
        setVisible(true);

        // Function to set default operation of JFrame.
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // to get the content
        c = getContentPane();

        // Initialization of object "card"
        card = new CardLayout();

        // set the layout
        c.setLayout(card);

        
        incomePanel = new IncomePanel();
        incomePanel.setPreferredSize(new Dimension(400,400));
        incomePanel.requestFocus();
        incomePanel.incomeTextField.setEditable(true);
        incomePanel.next.addActionListener(this);

        riskPanel = new RiskPanel();
        riskPanel.nextButton.addActionListener(this);

        yesNoContributions = new YesNoContributions();
        yesNoContributions.next.addActionListener(this);

        contributionAmount = new ContributionAmount();
        contributionAmount.contributionAmount.setEditable(true);
        contributionAmount.next.addActionListener(this);

       



        // Adding the incomePanel
        c.add(incomePanel, "income");

        // Adding the riskPanel
        c.add(riskPanel, "risk");

        c.add(yesNoContributions, "contributions");

        c.add(contributionAmount, "amount");

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == incomePanel.next) {
            card.show(c, "risk");
        } else if (e.getSource() == riskPanel.nextButton) {
            card.show(c, "contributions");
        } else if (e.getSource() == yesNoContributions.next) {
            if(yesNoContributions.yesButton.isSelected()){
                card.show(c, "amount");

            }

        }
        // call the next card

    }


}