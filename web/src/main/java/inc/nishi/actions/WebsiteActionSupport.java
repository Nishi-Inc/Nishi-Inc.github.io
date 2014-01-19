package inc.nishi.actions;

import inc.nishi.utils.ServiceLocator;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
@Data
public abstract class WebsiteActionSupport {

    @Autowired
    private ServiceLocator serviceLocator;

    protected ServiceLocator getServiceLocator() {
        return serviceLocator;
    }

}
