package perpustakaan;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProgramTableModel extends AbstractTableModel {

    protected String[] columnNames = {"Type", "Title", "Length"};

    private List<Perpustakaan> data;

    public ProgramTableModel(List<Perpustakaan> data) {
        this.data = data;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int row, int column) {

        switch (column) {
            case 0:
                return data.get(row).getStruk();
            case 1:
                return data.get(row).getNIM();
            case 2:
                return data.get(row).getNama();
            case 3:
                return data.get(row).getJudul();
            default:
                return "N/A";
        }
        
    }
}
