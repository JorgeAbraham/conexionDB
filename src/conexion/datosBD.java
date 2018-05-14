/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;



/**
 *
 * @author Diana
 */
public class datosBD 
{
    
   // private String dbURL = "jdbc:mysql://localhost:3306/";
    private String dbURL = "jdbc:mysql://192.168.1.2:3306/";
    private String dbUserName = "investigacion";
   // private String dbUserName = "root";
    private String dbPassword = "root";
    private String DriverBD="com.mysql.jdbc.Driver";
    

    public String getDriverBD() {
        return DriverBD;
    }

    public void setDriverBD(String DriverBD) {
        this.DriverBD = DriverBD;
    }

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }

    public  String getDbUserName() {
        return dbUserName;
    }

    public  void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public  String getDbPassword() {
        return dbPassword;
    }

    public  void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }



    
}
