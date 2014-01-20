package inc.nishi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MongoObjectId extends ObjectId {

    public MongoObjectId() {
        super();
    }

    public MongoObjectId(String string) {
        super(string);
    }

    /**
     *
     * @param t object
     * @return MongoObjectId
     */
    public static MongoObjectId getObjectId(Object t) {
        if(t instanceof MongoObjectId) {
            return (MongoObjectId) t;
        } else if(t instanceof String) {
            return new MongoObjectId((String)t);
        } else if(t instanceof PersistentObject) {
            return ((PersistentObject) t).get_id();
        } else {
            throw new IllegalArgumentException();
        }
    }

}
