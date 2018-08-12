
import java.sql.*;

public class NewCon 
{

    private static Connection con;
  
  static
{

        try

        {

            
            Class.forName("com.mysql.jdbc.Driver");

        }

        catch(ClassNotFoundException e1)

        {
 
           System.out.println(e1);

        }

    }

//provides connection to client objects
    
public static Connection connect()
    
{
 
       try
 
       {

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","tiger");

        }catch(SQLException e2)
{
            System.out.println(e2);

        }

        return con;

    }

    public static void close()throws SQLException
{
 
       if(!con.isClosed())
 
           con.close();

    }

    private NewCon()
{

    }
}

