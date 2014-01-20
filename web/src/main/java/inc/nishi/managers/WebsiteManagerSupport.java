package inc.nishi.managers;

import inc.nishi.dao.RepositoryDAO;
import inc.nishi.utils.ServiceLocator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
public abstract class WebsiteManagerSupport {

    @Autowired
    protected ServiceLocator serviceLocator;

    @Autowired
    protected RepositoryDAO repositoryDAO;

}
