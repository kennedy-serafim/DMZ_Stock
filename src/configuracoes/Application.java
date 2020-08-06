package configuracoes;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public class Application {

    /**
     * Responsavel por pegar os dados do arquivo de configuracao do sistema
     * (properties)
     *
     * @return
     */
    public static Properties getProperties() {
        Properties properties = new Properties();

        try (InputStream input = Thread.currentThread().getClass().getResourceAsStream("/configuracoes/application.properties")) {
            properties.load(input);
        } catch (IOException ioe) {
            System.err.println(Arrays.toString(ioe.getStackTrace()));
        }

        return properties;
    }
    
}
