import javax.swing.*;


public class FortuneTellerViewer
{
    public static void main(String[] args)
    {
        FortuneTellerFrame frame = new FortuneTellerFrame();

        frame.setTitle("Fortune Teller");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}