package inc.nishi.dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import inc.nishi.config.MongoConfig;
import inc.nishi.models.PersistentObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.UnknownHostException;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
public abstract class WebsiteDAOSupport {

    @Autowired
    private MongoConfig mongoConfig;

    protected DB db;

    public DB getDb() {
        if(db == null) {
            try {
                MongoClient mongoClient = new MongoClient(this.mongoConfig.getHost(), this.mongoConfig.getPort());
                this.setDb(mongoClient.getDB(this.mongoConfig.getDbName()));
                if(this.mongoConfig.isSecured()) {
                    if(!this.db.authenticate(this.mongoConfig.getUsername(), this.mongoConfig.getPassword())) {
                        throw new IllegalArgumentException();
                    }
                }
            } catch (UnknownHostException e) {
                e.printStackTrace();
                throw new IllegalArgumentException();
            }
        }
        return db;
    }

    public <T extends PersistentObject> T save(T t) {
        return null;
    }

    public <T extends PersistentObject> T findUniqueDocument(T t) {
        return null;
    }

    public <T extends PersistentObject> T find(T t) {
        return null;
    }

    public <T extends PersistentObject> T update(T t) {
        return null;
    }

    public <T extends PersistentObject> T delete(T t) {
        return null;
    }


    public void setDb(DB db) {
        this.db = db;
    }

}
