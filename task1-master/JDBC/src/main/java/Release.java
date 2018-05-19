import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Release {
    public static void release(ResultSet rs, Statement st, Connection c){
        if (rs!=null){
            try{rs.close();}
            catch (Exception e){e.getStackTrace();}
        }
        if(st!=null){
            try{st.close();}
            catch (Exception e){
                e.getStackTrace();
            }
        }
        if (c!=null){
            try {
                c.close();
            }
            catch (Exception e){
                e.getStackTrace();
            }
        }
    }
}
