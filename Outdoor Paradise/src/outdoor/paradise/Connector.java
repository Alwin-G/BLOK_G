/* @author alwin */
package outdoor.paradise;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.util.ArrayList;

public class Connector {
    //Hans heeft dit getyped
    String url = "jdbc:sqlserver://localhost; DatabaseName = outdoor_paradise";
    String login = "sa";
    String pass = "root";
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public DefaultTableModel GetEmployee(String variable, String search) {
        
        String getItems = "SELECT user_id as id, first_name, last_name, profession_id, manager_id, department_id, phone, email, address_id, birth_date ";
        
        if(search.equals("id")) {
            
            if(variable.isEmpty())
            { return searchData(getItems + "FROM employee JOIN \"user\" ON employee.user_id = \"user\".id ORDER BY \"user\".id"); }
            
            else
            { return searchData(getItems + "FROM employee JOIN \"user\" ON employee.user_id = \"user\".id WHERE \"user\".id = '" + variable + "' ORDER BY \"user\".id"); }
        }
        
        else if(search.equals("first_name")) {
            
            if(variable.isEmpty())
            { return searchData(getItems + "FROM employee JOIN \"user\" ON employee.user_id = \"user\".id ORDER BY \"user\".first_name"); }
        
            else
            { return searchData(getItems + "FROM employee JOIN \"user\" ON employee.user_id = \"user\".id WHERE \"user\".first_name like '%" + variable + "%' ORDER BY \"user\".first_name"); }
        }
        
        else { return new DefaultTableModel(); }
    }
    
    public DefaultTableModel GetTrip(String variable, String search) {
        
        //String getItems = "Select number, name, sales_price as price, start_date, duration, children_allowed, cancelled";
        
        if(search.equals("number"))
        {
            if(variable.isEmpty())
            { return searchData("SELECT * FROM product JOIN trip ON product.number = trip.product_number ORDER BY product.number"); }
        
            else
            { return searchData("SELECT * FROM product JOIN trip ON product.number = trip.product_number WHERE number = '" + variable + "' ORDER BY product.number"); }
        }
        
        else if(search.equals("name"))
        {
            if(variable.isEmpty())
            { return searchData("SELECT * FROM product JOIN trip ON product.number = trip.product_number ORDER BY product.name"); }
        
            else
            { return searchData("SELECT * FROM product JOIN trip ON product.number = trip.product_number WHERE name LIKE '%" + variable + "%' ORDER BY product.name"); }
        }
        
        else { return new DefaultTableModel(); }
    }
    
    private DefaultTableModel searchData(String query) {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, login, pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            DefaultTableModel temp = fillTable(rs);
            
            conn.close();
            
            return temp;
        }
            
        catch(Exception e) { return null; }
    }
    
    private DefaultTableModel fillTable(ResultSet rs)  throws SQLException {
        
        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String> columnNames = new Vector<>();
        int columnCount = metaData.getColumnCount();
            
        for (int column = 1; column <= columnCount; column++)
        { columnNames.add(metaData.getColumnName(column)); }
            
        Vector<Vector<Object>> data = new Vector<>();
            
        while(rs.next())
        {
            Vector<Object> local = new Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++)
            { local.add(rs.getObject(columnIndex)); }
               
            data.add(local);
        }
            
        return new DefaultTableModel(data, columnNames);
    }
    
    public boolean updateSelection(String table, String identifiër, ArrayList<String> values) {
        
        int counter = 0;
        
        if(table.equals("trip"))
        {
            cud("UPDATE product SET "
                + "name = '" + values.get(counter++) + "', "
                + "image = '" + values.get(counter++) + "', "
                + "description = '" + values.get(counter++) + "', "
                + "introduction_date = '" + values.get(counter++) + "', "
                + "sales_price = '" + values.get(counter++) + "', "
                + "margin = '" + values.get(counter++) + "', "
                + "category_id = '" + values.get(counter++) + "' "
                + "WHERE number = '" + identifiër + "'");
           
            cud("UPDATE trip SET "
                + "duration = '" + values.get(counter++) + "', "
                + "start_date = '" + values.get(counter++) + "', "
                + "children_allowed = '" + values.get(counter++) + "', "
                + "min_participants = '" + values.get(counter++) + "', "
                + "max_participants = '" + values.get(counter++) + "', "
                + "cancelled = '" + values.get(counter) + "' "
                + "WHERE product_number = '" + identifiër + "'");
            
            return true;
        }
        
        else
        { return false; }
    }
    
    public boolean CreateSelection(String table, ArrayList<String> values) {
        
        int counter = 0;
        
        if(table.equals("trip"))
        {
            cud("INSERT INTO product VALUES('"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter++) + "')");
           
            cud("INSERT INTO trip VALUES ("
                + "(SELECT MAX(number) FROM product),'"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter++) + "','"
                + values.get(counter) + "')");
            
            return true;
        }
        
        else
        { return false; }
    }
    
    public void deleteSelection(String table, String identifiër) {
        if(table.equals("trip"))
        {
            cud("DELETE FROM trip WHERE product_number = '" + identifiër + "'");
            cud("DELETE FROM product WHERE number = '" + identifiër + "'");
        }
    }
    
    private void cud(String query) {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, login, pass);
            Statement st = conn.createStatement();
            st.executeQuery(query);
            conn.commit();
            
            conn.close();
        }
            
        catch(Exception e) { System.out.println(e); }
    }
}
