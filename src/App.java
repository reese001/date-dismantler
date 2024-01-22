import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();

        sdf.applyPattern("yyyy");
        JOptionPane.showMessageDialog(new JDialog(), sdf.format(currentDate), "Year", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("MMMM");
        JOptionPane.showMessageDialog(new JDialog(), sdf.format(currentDate), "Month", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("dd");
        JOptionPane.showMessageDialog(new JDialog(), sdf.format(currentDate), "Day", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("HH");
        JOptionPane.showMessageDialog(new JDialog(), sdf.format(currentDate), "Hour", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("mm");
        JOptionPane.showMessageDialog(new JDialog(), sdf.format(currentDate), "Minutes", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("ss");
        JOptionPane.showMessageDialog(new JDialog(), sdf.format(currentDate), "Seconds", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("SSS");
        JOptionPane.showMessageDialog(new JDialog(), sdf.format(currentDate), "Milliseconds", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
    
}
