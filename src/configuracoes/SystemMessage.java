package configuracoes;

import java.io.InputStream;
import javax.swing.ImageIcon;

/**
 * Classe de configurações do sistema padrão
 *
 * @author Kennedy Melvin Serafim
 */
public final class SystemMessage {

    /**
     * Mensagem de contacto do suporte técnico
     */
    public static final String SUPPORT_TECH = "Se o problema persistir contacte o Suporte Técnico.";

    /**
     * Cor Secundára do Sistema
     *
     * 009999
     */
    public static final String COLOR_DEFAULT = "#0099CC";

    /**
     * Cor Principal do Sistema
     */
    public static final String COLOR_PRIMARY = "#1A768D";

    /**
     * Image padrão do Sistema
     */
    public static final String IMAGE_URL = Application.getProperties().getProperty("system.icon");

    public static final String CONNECTION_ERROR = "Comunicação com o Servidor Falhou."
            + "\nLamentamos...!"
            + "\n\n\n"
            + "Queira por favor, Contactar o Suporte Técnico:"
            + "\n" + Application.getProperties().getProperty("developer.email")
            + "\n" + Application.getProperties().getProperty("developer.phone");

    /**
     *
     * @return
     */
    public static final ImageIcon setIconDatabaseJOptionPane() {
        ImageIcon icon = new ImageIcon(SystemMessage.class.getResource(Application.getProperties().getProperty("system.icon.error")));
        return icon;
    }

    public static final String SYSTEM_NAME = Application.getProperties().getProperty("system.name")
            + " " + Application.getProperties().getProperty("system.version");

    /**
     *
     * @return
     */
    public static InputStream inputStream() {
        return SystemMessage.class.getResourceAsStream(IMAGE_URL);
    }
}
