package inc.nishi.config;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
@Data
public final class MongoConfig implements Serializable {
    private String host;
    private int port;

    private String dbName;

    private boolean secured;
    private String username;
    private char[] password;

}
