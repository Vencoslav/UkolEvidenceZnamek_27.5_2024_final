import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModle extends AbstractTableModel {
    private List<TerminZkouseni> seznam = new ArrayList<>();

    public TableModle(List<TerminZkouseni> seznam) {
        this.seznam = seznam;
    }

    @Override
    public int getRowCount() {
        return seznam.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TerminZkouseni zkouseni = seznam.get(rowIndex);
        switch (columnIndex){
            case 0:
                return  zkouseni.getTema();
            case 1:
                return zkouseni.getZnamka();
            case 2:
                return  zkouseni.getDatum();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return  "Téma";
            case 1:
                return "Známka";
            case 2:
                return  "Datum";


        }
        return null;
    }
}
