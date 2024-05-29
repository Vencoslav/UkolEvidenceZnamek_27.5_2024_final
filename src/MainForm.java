import javax.swing.*;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel panelMain;
    private JTextArea textArea;
    private JScrollPane jScrollPane;
    private JTable table1;
    private JButton prumnerBt;
    private List<TerminZkouseni> seznam;
    public MainForm(List<TerminZkouseni> seznam){
//        To znamená, že proměnná seznam v třídě MainForm bude odkazovat na stejný seznam
//        jako ten, který byl předán jako argument konstruktoru.
        this.seznam = seznam;

        setContentPane(panelMain);
        setSize(300,400);
        setTitle("Úkol: Evidence známek");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        display();
        initMenu();

        prumnerBt.addActionListener(e->{vypocitejPrumerZnamek();});
    }

    public void display(){
        for (TerminZkouseni zkouseni : seznam) {
            textArea.append(zkouseni.getTema() + " - " + zkouseni.getZnamka() + " - " + zkouseni.getDatum() + "\n");
        }
        TableModle tableModle = new TableModle(seznam);
        table1.setModel(tableModle);


    }

    public void initMenu(){
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu nastav = new JMenu("Natav všechny známky na:");
        menuBar.add(nastav);

        JMenuItem znamka1 = new JMenuItem("1");
        nastav.add(znamka1);
        znamka1.addActionListener(e->{nastavZnamkuNa1();});

        JMenuItem znamka2 = new JMenuItem("2");
        nastav.add(znamka2);
        znamka2.addActionListener(e ->{nastavZnamkuNa2();});

        JMenuItem znamka3 = new JMenuItem("3");
        nastav.add(znamka3);
        znamka3.addActionListener(e ->{nastavZnamkuNa3();});
    }

    public void vypocitejPrumerZnamek() {
        double soucet = 0;
        for (TerminZkouseni zkouseni : seznam) {
            soucet += zkouseni.getZnamka();
        }
        double prumer = soucet / seznam.size();  // Je to až tady protože kdyby to bylo v for tak by to dělilo každé číslo vždy jednotlivě
        JOptionPane.showMessageDialog(this, "Průměr známek: " + prumer);
    }


    public void nastavZnamkuNa1(){
        for(TerminZkouseni zkouseni : seznam){
             zkouseni.setZnamka(1);
        }
    }
    public void nastavZnamkuNa2(){
        for(TerminZkouseni zkouseni : seznam){
            zkouseni.setZnamka(2);
        }
    }
    public void nastavZnamkuNa3(){
        for(TerminZkouseni zkouseni : seznam){
            zkouseni.setZnamka(3);
        }
    }


}