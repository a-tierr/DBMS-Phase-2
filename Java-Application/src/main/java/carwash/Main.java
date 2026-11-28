
package carwash;

public class Main {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
        System.out.println("Connected to PostgreSQL successfully.");
        HibernateUtil.shutdown();
    }
}