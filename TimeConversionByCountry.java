import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;

class TimeConversionByCountry extends JFrame {
    JFrame frame = new JFrame(" ");

    JComboBox<String> cb;
    JTextField t2;
    JLabel l1, l2;
    JButton b1;
    Container cc;

    TimeConversionByCountry() {
        super("Time Conversion");
        final JFormattedTextField t1;
        DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        t1 = new JFormattedTextField(date);
        t1.setValue(new Date());
        t2 = new JTextField(50);
        String Country[] = {"Select a Country", "Australia", "Canada", "United States", "Germany", "China", "France", "Brazil", "Argentina",
                "Indonesia", "Bangladesh", "Japan", "Colombia", "Italy", "Egypt", "Russia", "Austria" };
        cb = new JComboBox<>(Country);

        l1 = new JLabel("INDIAN TIME");

        cc = getContentPane();
        cc.setLayout(null);

        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) cb.getSelectedItem();
                if (!selectedCountry.equals("Select a Country")) {
                    String dateTime = getCurrentDateTime(selectedCountry);
                    t2.setText(dateTime);
                } else {
                    t2.setText("");
                }
            }
        });

        cc.add(l1);
        cc.add(t1);
        cc.add(cb);
        cc.add(t2);

        setSize(800, 400);
        setLocation(0, 0);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1.setBounds(150, 50, 200, 70);
        cb.setBounds(103, 170, 140, 50);
        t1.setBounds(280, 60, 300, 50);
        t2.setBounds(280, 168, 300, 50);
    }

    String getCurrentDateTime(String selectedCountry) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        TimeZone timeZone = TimeZone.getDefault();

        if (selectedCountry.equals("Australia")) {
            timeZone = TimeZone.getTimeZone("Australia");
        } else if (selectedCountry.equals("Canada")) {
            timeZone = TimeZone.getTimeZone("Canada");
        } else if (selectedCountry.equals("United States")) {
            timeZone = TimeZone.getTimeZone("United States");
        } else if (selectedCountry.equals("Germany")) {
            timeZone = TimeZone.getTimeZone("Germany");
        } else if (selectedCountry.equals("China")) {
            timeZone = TimeZone.getTimeZone("China");
        } else if (selectedCountry.equals("France")) {
            timeZone = TimeZone.getTimeZone("France");
        } else if (selectedCountry.equals("Brazil")) {
            timeZone = TimeZone.getTimeZone("Brazil");
        } else if (selectedCountry.equals("Argentina")) {
            timeZone = TimeZone.getTimeZone("Argentina");
        } else if (selectedCountry.equals("Indonesia")) {
            timeZone = TimeZone.getTimeZone("Indonesia");
        } else if (selectedCountry.equals("Bangladesh")) {
            timeZone = TimeZone.getTimeZone("Bangladesh");
        } else if (selectedCountry.equals("Japan")) {
            timeZone = TimeZone.getTimeZone("Japan");
        } else if (selectedCountry.equals("Colombia")) {
            timeZone = TimeZone.getTimeZone("Colombia");
        } else if (selectedCountry.equals("Italy")) {
            timeZone = TimeZone.getTimeZone("Italy");
        } else if (selectedCountry.equals("Egypt")) {
            timeZone = TimeZone.getTimeZone("Egypt");
        } else if (selectedCountry.equals("Russia")) {
            timeZone = TimeZone.getTimeZone("Russia");
        } else if (selectedCountry.equals("Austria")) {
            timeZone = TimeZone.getTimeZone("Austria");
        }

        dateFormat.setTimeZone(timeZone);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        new TimeConversionByCountry();
    }
}