package inc.nishi.managers.impl;

import inc.nishi.managers.RepositoryManager;
import inc.nishi.managers.WebsiteManagerSupport;
import inc.nishi.models.MongoObjectId;
import inc.nishi.models.Repository;


public class RepositoryManagerImpl extends WebsiteManagerSupport implements RepositoryManager {

    @Override
    public Repository delete(MongoObjectId repositoryId) {
        return this.repositoryDAO.delete(repositoryId);
    }

}
