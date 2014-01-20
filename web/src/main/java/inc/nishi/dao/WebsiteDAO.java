package inc.nishi.dao;


import inc.nishi.models.PersistentObject;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
public interface WebsiteDAO {

    /**
     *
     * @param t object to save
     * @param <T> extends PersistentObject
     * @return T
     */
    public <T extends PersistentObject> T save(T t);

    /**
     *
     * @param t object to make search for
     * @param <T> extends PersistentObject
     * @return T
     */
    public <T extends PersistentObject> T findUniqueDocument(T t);

    /**
     *
     * @param t object to find
     * @param <T> extends PersistentObject
     * @return T
     */
    public <T extends PersistentObject> T find(T t);

    /**
     *
     * @param t object to update
     * @param <T> extends PersistentObject
     * @return T
     */
    public <T extends PersistentObject> T update(T t);

    /**
     *
     * @param t object to delete
     * @param <T> extends PersistentObject
     * @return T
     */
    public <T extends PersistentObject> T delete(T t);

}
