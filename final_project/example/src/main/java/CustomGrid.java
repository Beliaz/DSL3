package main.java;

import javax.swing.*;
import java.awt.*;

public class CustomGrid {
    public CustomGrid(JPanel panel, Cells cells) {
        this.panel = panel;
        this.cells = cells;

        panel.setLayout(new GridBagLayout());
    }

    public CustomGrid(double[] columnWeights, double[] rowWeights) {
        this(new JPanel(), new Cells(columnWeights, rowWeights));
    }

    public CustomGrid() {
        this(new JPanel(), new Cells());
    }


    public JPanel getPanel() {
        return panel;
    }

    public Cells getCells() {
        return cells;
    }

    public void add(JComponent component, int columnIndex, int rowIndex)
    {
        panel.add(component, cells.getConstraint(columnIndex, rowIndex));
    }

    public void add(CustomGrid grid, int columnIndex, int rowIndex)
    {
        add(grid.getPanel(), columnIndex, rowIndex);
    }

    JPanel panel;
    Cells cells;
}
