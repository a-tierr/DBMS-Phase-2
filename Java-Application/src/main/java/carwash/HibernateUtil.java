package carwash;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Builds one SessionFactory for the whole application from hibernate.cfg.xml.
 *
 * Any value in hibernate.cfg.xml can also be overridden from the command line, e.g.
 *   -Ddb.url=jdbc:postgresql://localhost:5432/carwash
 *   -Ddb.username=postgres  -Ddb.password=secret  -Ddb.hbm2ddl=update
 */
public final class HibernateUtil {

    static {
        // Route Hibernate's own log messages through slf4j, so the console shows the
        // generated SQL but not the bootstrap noise (see simplelogger.properties).
        System.setProperty("org.jboss.logging.provider", "slf4j");
    }

    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration().configure(); // reads hibernate.cfg.xml
            override(configuration, "db.url", "hibernate.connection.url");
            override(configuration, "db.username", "hibernate.connection.username");
            override(configuration, "db.password", "hibernate.connection.password");
            override(configuration, "db.hbm2ddl", "hibernate.hbm2ddl.auto");
            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Could not start Hibernate: " + ex.getMessage());
            System.err.println("Check the database URL, username and password in src/main/resources/hibernate.cfg.xml");
            throw new ExceptionInInitializerError(ex);
        }
    }

    private static void override(Configuration configuration, String systemProperty, String hibernateProperty) {
        String value = System.getProperty(systemProperty);
        if (value != null && !value.trim().isEmpty()) {
            configuration.setProperty(hibernateProperty, value);
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    public static void shutdown() {
        SESSION_FACTORY.close();
    }
}
