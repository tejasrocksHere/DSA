class DatabaseConfig{
    static String url;
    static String username;
    static String password;

    static {
        url = "jdbc:mysql://localhost:3306";
        username = "";
        password = "";
        System.out.println("Database configuration loaded.");
    }

 public DatabaseConfig(String url1,String username1,String password1){
url+=url1;
username+=username1;
password+=password1;
 }
 public static void printConfig() {
    System.out.println("URL: " + url);
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
}

}
public class StaticKeyword {
    public static void main(String[] args) {
        
DatabaseConfig d1= new DatabaseConfig("/mydb","tejas","passwrod");
// DatabaseConfig d2= new DatabaseConfig();
d1.printConfig();
    }
}
