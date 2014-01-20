package inc.nishi.managers;


import inc.nishi.models.MongoObjectId;
import inc.nishi.models.Repository;

public interface RepositoryManager {

    /**
     *
     * @param repositoryId _id of repository to delete
     * @return deleted repository
     */
    public Repository delete(MongoObjectId repositoryId);

}
