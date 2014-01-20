package inc.nishi.dao.impl;

import inc.nishi.dao.RepositoryDAO;
import inc.nishi.dao.WebsiteDAOSupport;
import inc.nishi.models.MongoObjectId;
import inc.nishi.models.Repository;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
public class RepositoryDAOImpl extends WebsiteDAOSupport implements RepositoryDAO {


    @Override
    public Repository delete(MongoObjectId repositoryId) {
        return null;
    }
}
