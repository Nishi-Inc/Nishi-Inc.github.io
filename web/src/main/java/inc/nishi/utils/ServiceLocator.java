package inc.nishi.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

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
    public static Object getBean(Object t) {
        if(t instanceof String) {
            return ServiceLocator.applicationContext.getBean((String) t);
        }
        return ServiceLocator.applicationContext.getBean(t.getClass());
    }

}
