package edu.aiub.essentials;

import javax.swing.*;
import java.awt.*;

public class FlatLafCustomizer {
    public static void customizer() {

//      Panel
        UIManager.put("Panel.background.arc", 10);
        UIManager.put("Panel.background", new Color(236, 240, 241));
        UIManager.put("Panel.foreground", new Color(50, 50, 50));

//      Button
        UIManager.put("Button.arc", 20);
        UIManager.put("Button.font", new Font("Inter", Font.BOLD, 14));
        UIManager.put("Button.background", new Color(44, 62, 80));
        UIManager.put("Button.foreground", new Color(255,255,255));
        UIManager.put("Button.shadow", new Color(0,0,0));

//      Label
        UIManager.put("Label.font", new Font("Inter", Font.PLAIN, 12));
        UIManager.put("Label.foreground", new Color(65, 65, 65));
//        UIManager.put("Label.background", new Color(255, 255, 255));
        UIManager.put("Label.font", new Font("Inter", Font.PLAIN, 14));

//      TabbedPane
        UIManager.put("TabbedPane.tabInsets", new Insets(10, 10, 10, 10));
        UIManager.put("TabbedPane.background", new Color(231, 76, 60));
        UIManager.put("TabbedPane.selectedBackground", new Color(44, 62, 80));
        UIManager.put("TabbedPane.hoverColor", new Color(231, 197, 60));
        UIManager.put("TabbedPane.inactiveUnderlineColor", new Color(0,0,0));
        UIManager.put("TabbedPane.underlineColor", new Color(0,0,0));
        UIManager.put("TabbedPane.foreground", Color.WHITE);
        UIManager.put("TabbedPane.font", new Font("Inter", Font.BOLD, 13));
        UIManager.put("TabbedPane.selected", new Color(50, 255, 126));
        UIManager.put("TabbedPane.showTabSeparators", true);
        UIManager.put( "TabbedPane.tabSeparatorsFullHeight", true );
//        UIManager.put("TabbedPane.hasFullBorder", true);
//        UIManager.put("TabbedPane.tabAreaBackground", new Color(231, 76, 60));
//        UIManager.put("TabbedPane.contentAreaColor", new Color(236, 240, 241));
//        UIManager.put("TabbedPane.tabAreaInsets", new Insets(20, 20, 20, 20));
//        UIManager.put("TabbedPane.tabInsets", new Insets(10, 10, 10, 10));
//        UIManager.put("TabbedPane.tabRunOverlay", 0);
//        UIManager.put("TabbedPane.tabSelectionHeight", 2);
//        UIManager.put("TabbedPane.tabAreaBackground", new Color(231, 76, 60));
//        UIManager.put("TabbedPane.contentAreaColor", new Color(236, 240, 241));
//        UIManager.put("TabbedPane.tabAreaInsets", new Insets(0, 0, 0, 0));
//

//      Table
        UIManager.put("TableHeader.background", new Color(255, 255, 255));
//        UIManager.put("TableHeader.foreground", Color.WHITE);
        UIManager.put("TableHeader.font", new Font("Inter", Font.BOLD, 14));
//        UIManager.put("TableHeader.cellBorder", BorderFactory.createEmptyBorder(0, 0, 0, 0));
//        UIManager.put("TableHeader.cellRenderer", new CustomTableHeaderRenderer());
        UIManager.put("TableHeader.focusCellBackground", new Color(231, 76, 60));
        UIManager.put("Table.background", new Color(255, 255, 255));
        UIManager.put("Table.foreground", new Color(0, 0, 0));
        UIManager.put("Table.selectionForeground", Color.WHITE);
        UIManager.put("Table.selectionBackground", new Color(231, 76, 60));
        UIManager.put("Table.showHorizontalLines", false);
        UIManager.put("Table.showVerticalLines", true);
        UIManager.put("Table.gridColor", new Color(44, 62, 80));
        UIManager.put("Table.alternateRowColor", new Color(44, 62, 80));


//      ScrollPane
        UIManager.put("ScrollPane.background", new Color(236, 240, 241));


    }
}
