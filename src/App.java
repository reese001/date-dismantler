import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Date todaysDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();

        sdf.applyPattern("yyyy");
        JOptionPane.showMessageDialog(null, sdf.format(todaysDate), "Year", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("MMMM");
        JOptionPane.showMessageDialog(null, sdf.format(todaysDate), "Month", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("dd");
        JOptionPane.showMessageDialog(null, sdf.format(todaysDate), "Day", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("HH");
        JOptionPane.showMessageDialog(null, sdf.format(todaysDate), "Hour", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("mm");
        JOptionPane.showMessageDialog(null, sdf.format(todaysDate), "Minutes", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("ss");
        JOptionPane.showMessageDialog(null, sdf.format(todaysDate), "Seconds", JOptionPane.PLAIN_MESSAGE);

        sdf.applyPattern("SSS");
        JOptionPane.showMessageDialog(null, sdf.format(todaysDate), "Milliseconds", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
    

