/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr;
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public class TheModel extends AbstractTableModel {
    private String[] columns;
    private Object[][] rows;
    //private Object data;
    
   // public TheModel(){}
    
    public TheModel(Object[][] data, String[] columnName){
    
        this.rows = data;
        this.columns = columnName;
    }

    
    public Class getColumnClass(int column){
// 4 is the index of the column image
        if(column == 7){
            return Icon.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }
    
    
    public int getRowCount() {
     return this.rows.length;
    }

    public int getColumnCount() {
     return this.columns.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
    return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col){
        return this.columns[col];
    }

    //void removeRow(int Row) {
       // public void removeRowAt(int row) {
  //  data.removeElementAt(Row);
    //fireTableDataChanged();
    //fireTableRowsDeleted(Row - 1, data.size() - 1);
//}
     // fireTableRowsDeleted(SelectedRow,0);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}


}

