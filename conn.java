import java.sql.*;
public class conn {
Connection c;
Statement s;
conn() {
try {
c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "RishaV@180902"); // replace the
password according to account
s = c.createStatement();
} catch (Exception e) {
}
}
}
