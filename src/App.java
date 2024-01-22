import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();

        sdf.applyPattern("yyyy");
        JOptionPane.showMessageDialog(new JDialog(), sdf.format(currentDate), "Year", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
