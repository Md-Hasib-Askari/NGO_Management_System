package edu.aiub.essentials;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import static javax.swing.JLabel.*;

public class TableColumnCenterizer {
    public static void centerTableColumn(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
}
