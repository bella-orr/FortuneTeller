import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FortuneTellerFrame extends JFrame
{
    //Panels
    JPanel mainPnl;
    JPanel iconPnl; //Top Panel
    JPanel displayPnl; //Middle Panel
    JPanel controlPnl; //Bottom Panel

    JLabel fortTeller;
    ImageIcon FTIcon;

    JTextArea fortuneTA;
    JScrollPane scroller;

    //Buttons
    JButton quitBtn;
    JButton fortuneBtn;

    public FortuneTellerFrame()
    {
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        createIconPnl();
        mainPnl.add(iconPnl, BorderLayout.NORTH);

        createDisplayPnl();
        mainPnl.add(displayPnl, BorderLayout.CENTER);

        createControlPnl();
        mainPnl.add(controlPnl, BorderLayout.SOUTH);

        add(mainPnl);
    }

    private void createIconPnl()
    {
        iconPnl = new JPanel();
        FTIcon = new ImageIcon("src/FTIcon.jpg");

        fortTeller = new JLabel("Welcome to the Fortune Teller!", FTIcon, JLabel.CENTER);
        fortTeller.setFont(new Font("TimesRoman", Font.PLAIN, 20));

        fortTeller.setVerticalTextPosition((JLabel.BOTTOM));
        fortTeller.setVerticalTextPosition((JLabel.CENTER));

        iconPnl.add(fortTeller);

    }

    private void createDisplayPnl()
    {
        displayPnl = new JPanel();
        fortuneTA = new JTextArea(10, 25);
        scroller = new JScrollPane(fortuneTA);
        displayPnl.add(scroller);
    }

    private void createControlPnl()
    {
        controlPnl = new JPanel();
        controlPnl.setLayout(new GridLayout(1,2));

        //Name buttons
        fortuneBtn = new JButton("Read My Fortune!");
        fortuneBtn.setFont(new Font("Serif", Font.PLAIN, 24));


        quitBtn = new JButton("Quit");
        quitBtn.setFont(new Font("Serif", Font.PLAIN, 24));
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        //add buttons in order
        controlPnl.add(fortuneBtn);
        controlPnl.add(quitBtn);


    }

}
