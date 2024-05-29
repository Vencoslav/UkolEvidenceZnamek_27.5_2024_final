import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<TerminZkouseni> seznam = new ArrayList<>();

        TerminZkouseni zkouseni1 = new TerminZkouseni("Pro");
        seznam.add(zkouseni1);

        TerminZkouseni zkouseni2 = new TerminZkouseni("Čj",2,LocalDate.of(2024,5,20));
        seznam.add(zkouseni2);

        TerminZkouseni zkouseni3 = new TerminZkouseni("Fyz",4,LocalDate.of(2024,5,28));
        seznam.add(zkouseni3);

        MainForm form = new MainForm(seznam);
        form.setVisible(true);
    }


}