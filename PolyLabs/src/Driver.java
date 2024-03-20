import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        
        /*DbConnection db = new DbConnection();
        db.openConnection();
        db.executeQuery("SELECT * FROM student");
        db.closeConnection();

        MySQLConnection connection = new MySQLConnection();
        connection.openConnection();
        connection.executeQuery("SELECT * FROM student");
        connection.closeConnection();

        MsSQLConnection con = new MsSQLConnection();
        con.openConnection();
        con.executeQuery("SELECT * FROM student");
        con.closeConnection();*/

        // Polimorfik tip:
        // DbConnection -> base class
        // MySQLConnection ve MsSQLConnection subclass'tır.

        Scanner input = new Scanner(System.in);
        System.out.print("Database tipi seçin [1 (MsSQL),2 (MySQL),3 (Oracle)] : ");
        int dbType = input.nextInt();
        DbConnection connection = null;

        switch (dbType) {
            case 1:
                connection = new MsSQLConnection();
                break;
            case 2:
                connection = new MySQLConnection();
                break;
            case 3:
                connection = new Oracle();
                break;
            default:
                System.out.println("Yanlış veri tabanı.");
                break;
        }
        if(connection != null) {
            connection.openConnection();
            connection.executeQuery("SELECT * FROM student");
            connection.closeConnection();
        }
    }
}