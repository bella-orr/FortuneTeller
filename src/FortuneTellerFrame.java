import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

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

    //For random fortune
    Random fndFort = new Random();



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
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createIconPnl()
    {
        iconPnl = new JPanel();
        FTIcon = new ImageIcon("src/FTIcon.jpg");
        Image tellerIcon = FTIcon.getImage();
        Image modifiedFTIcon = tellerIcon.getScaledInstance(200,250, Image.SCALE_DEFAULT);
        FTIcon = new ImageIcon(modifiedFTIcon);


        fortTeller = new JLabel("Welcome to the Fortune Teller!", FTIcon, JLabel.CENTER);
        fortTeller.setFont(new Font("TimesRoman", Font.PLAIN, 20));

        fortTeller.setVerticalTextPosition((JLabel.BOTTOM));
        fortTeller.setHorizontalTextPosition((JLabel.CENTER));

        iconPnl.add(fortTeller);

    }

    private void createDisplayPnl()
    {
        displayPnl = new JPanel();
        fortuneTA = new JTextArea(10, 25);
        fortuneTA.setEditable(false);
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
        fortuneBtn.addActionListener((ActionEvent ae)->
        {


        });


        quitBtn = new JButton("Quit");
        quitBtn.setFont(new Font("Serif", Font.PLAIN, 24));
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        //add buttons in order
        controlPnl.add(fortuneBtn);
        controlPnl.add(quitBtn);


    }

}
