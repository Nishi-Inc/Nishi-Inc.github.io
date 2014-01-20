package inc.nishi.models;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
@Data
public abstract class PersistentObject implements Serializable {
    private MongoObjectId _id;
    private String displayName;

}
