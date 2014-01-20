package inc.nishi.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * @author Nishi Inc
 * @since v0.1.0
 */
public class ServiceLocator implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public ApplicationContext getApplicationContext() {
        return ServiceLocator.applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ServiceLocator.applicationContext = applicationContext;
    }

    /**
     * Emulates applicationContext.getBean(p) methods
     * @param t object to ask bean
     * @return Bean
     */
    @SuppressWarnings(GlobalConstants.UNCHECKED)
    public static <T> T getBean(Class<T> t) {
         Map beans = ServiceLocator.applicationContext.getBeansOfType(t);
        if(beans.size() > 1) {
            throw new IllegalStateException("More than one beans of type " + t + " exist.");
        } else if(beans.size() == 0) {
            throw new IllegalStateException("No bean of type " + t + "exists.");
        }
        return (T) beans.get(t.getName());
    }

}
