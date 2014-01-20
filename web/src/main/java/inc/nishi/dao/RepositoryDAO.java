package inc.nishi.dao;

import inc.nishi.models.MongoObjectId;
import inc.nishi.models.Repository;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
@org.springframework.stereotype.Repository("RepositoryDAO")
public interface RepositoryDAO extends WebsiteDAO {

    /**
     *
     * @param repositoryId _id of repo to delete
     * @return deleted repository
     */
    public Repository delete(MongoObjectId repositoryId);

}
