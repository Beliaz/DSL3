package main.java;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cells
{
    Cells()
    {
        this(new double[]{ 1 }, new double[]{ 1 });
    }

    Cells(double[] columnWeights, double[] rowWeights)
    {
        cells = new ArrayList<>();

        for (int i = 0; i < rowWeights.length; ++i) {

            java.util.List<GridBagConstraints> row = new ArrayList<>();

            for (int j = 0; j < columnWeights.length; ++j) {

                GridBagConstraints c = new GridBagConstraints();

                c.fill = GridBagConstraints.BOTH;

                c.gridx = j;
                c.gridy = i;

                c.weightx = columnWeights[c.gridx];
                c.weighty = rowWeights[c.gridy];

                row.add(c);
            }

            cells.add(row);
        }

        if(cells.size() == 0)
        {
            java.util.List<GridBagConstraints> row = new ArrayList<>();

            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.weighty = 1;
            c.gridy = 0;
            c.weightx = 1;
            row.add(c);

            cells.add(row);
        }
    }

    GridBagConstraints getConstraint(int columnIndex, int rowIndex)
    {
        if(rowIndex >= cells.size()) throw new IllegalArgumentException();
        if(columnIndex >= cells.get(0).size()) throw new IllegalArgumentException();

        return cells.get(rowIndex).get(columnIndex);
    }

    List<List<GridBagConstraints>> cells;
}
