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
    Random rndFort = new Random();

    //Fortunes
    String [] fortunes = {"Someone will invite you to a karaoke party.", "Never gonna give you up, never gonna let you down",
            "A golden egg of opportunity will come to you this month.", "Go take a rest, you deserve it.", "Good news will come by mail.",
            "Be careful where you step.", "You are cleverly disguised as a responsible adult.", "Big journeys begin with a single step.",
            "You will get a high five from the bearcat today.", "An alien of some sort will be appearing shortly.", "Change can hurt, but it leads to a path of something better.",
            "Wealth awaits you very soon."
    };




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


        fortTeller = new JLabel("Welcome to The Fortune Teller!", FTIcon, JLabel.CENTER);
        fortTeller.setFont(new Font("TimesRoman", Font.PLAIN, 20));

        fortTeller.setVerticalTextPosition((JLabel.BOTTOM));
        fortTeller.setHorizontalTextPosition((JLabel.CENTER));

        iconPnl.add(fortTeller);

    }

    private void createDisplayPnl()
    {
        displayPnl = new JPanel();
        fortuneTA = new JTextArea(15, 35);
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
            int f = rndFort.nextInt(fortunes.length);

            fortuneTA.append(fortunes[f]+"\n");

        });


        quitBtn = new JButton("Quit");
        quitBtn.setFont(new Font("Serif", Font.PLAIN, 24));
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        //add buttons in order
        controlPnl.add(fortuneBtn);
        controlPnl.add(quitBtn);


    }

}
