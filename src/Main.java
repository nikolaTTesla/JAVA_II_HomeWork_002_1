//Library for GUI JOptionPane
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //I did if else binary tree here

        //Declaring variable that will store 0 or 1, depending on what button we press (1 for NO, 0 for YES), so depends on what user click we will have as an output 1 or 0
        //JOptionPane class gives us variety of choices to modify our notification GUI box-window, one of choices is used in line of the code belove
        int iDecision = JOptionPane.showConfirmDialog(null, "Do not Play video games","Choose Your Own Adventure",JOptionPane.YES_NO_OPTION);

        //Decision-making binary tree journey starts here
        if(iDecision == 1)
        {
            iDecision = JOptionPane.showConfirmDialog(null, "Do not go out for a drink","Choose Your Own Adventure",JOptionPane.YES_NO_OPTION);
            if(iDecision == 1)
            {
                iDecision = JOptionPane.showConfirmDialog(null, "Do not blame the world","Choose Your Own Adventure",JOptionPane.YES_NO_OPTION);
                if(iDecision == 1)
                {
                    //This only opens GUI window to notify user about final outcome
                    JOptionPane.showMessageDialog(null, "Simply do not go to the college any more","Choose Your Own Adventure",JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Do some homework right now and graduate with C","Choose Your Own Adventure",JOptionPane.PLAIN_MESSAGE);
                }
            }
            else
            {
                iDecision = JOptionPane.showConfirmDialog(null, "Do homework right now","Choose Your Own Adventure",JOptionPane.YES_NO_OPTION);
                if(iDecision == 1)
                {
                    JOptionPane.showMessageDialog(null, "Drop out of college","Choose Your Own Adventure",JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Do all homework right now and graduate","Choose Your Own Adventure",JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
        //Form here is repetitive, slightly modified code that represents second branch of starter decision
        else
        {
            iDecision = JOptionPane.showConfirmDialog(null, "Try to do some homework right now","Choose Your Own Adventure",JOptionPane.YES_NO_OPTION);
            if(iDecision == 1)
            {
                iDecision = JOptionPane.showConfirmDialog(null, "Do not Relax one more day","Choose Your Own Adventure",JOptionPane.YES_NO_OPTION);
                if(iDecision == 1)
                {
                    JOptionPane.showMessageDialog(null, "Blame the world and drop college","Choose Your Own Adventure",JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Do all homework magically and graduate","Choose Your Own Adventure",JOptionPane.PLAIN_MESSAGE);
                }
            }
            else
            {
                iDecision = JOptionPane.showConfirmDialog(null, "Say I'll do tomorrow new home work","Choose Your Own Adventure",JOptionPane.YES_NO_OPTION);
                if(iDecision == 1)
                {
                    JOptionPane.showMessageDialog(null, "Get a job and drop out of college","Choose Your Own Adventure",JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Pay someone to do your homework and graduate stress free","Choose Your Own Adventure",JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }
}