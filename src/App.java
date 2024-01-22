import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Date currentDate = new Date();

        JOptionPane.showMessageDialog(new JDialog(), new SimpleDateFormat("yyyy").format(currentDate), "Year", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(new JDialog(), new SimpleDateFormat("MMMM").format(currentDate), "Month", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(new JDialog(), new SimpleDateFormat("dd").format(currentDate), "Day", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(new JDialog(), new SimpleDateFormat("HH").format(currentDate), "Hour", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(new JDialog(), new SimpleDateFormat("mm").format(currentDate), "Minutes", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(new JDialog(), new SimpleDateFormat("ss").format(currentDate), "Seconds", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(new JDialog(), new SimpleDateFormat("SSS").format(currentDate), "Milliseconds", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
    
}
