package ao.devops.bookstore.config;

import ao.devops.bookstore.entity.Book;
import ao.devops.bookstore.entity.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;
import java.net.Proxy;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {


    @Autowired
    private EntityManager entityManager;

    @Override
    //expose all entities available
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(entityManager.getMetamodel().getEntities()
                .stream().map(Type::getJavaType)
                .toArray(Class[]::new));

        config.getCorsRegistry()
                .addMapping("/**")
                .allowedOrigins("http://localhost:4200");
    }
}
