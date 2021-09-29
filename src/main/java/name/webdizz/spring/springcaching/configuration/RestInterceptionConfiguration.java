package name.webdizz.spring.springcaching.configuration;

import name.webdizz.spring.springcaching.configuration.http.CacheControlHeaderInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RestInterceptionConfiguration implements WebMvcConfigurer {

    @Autowired
    private CacheControlHeaderInterceptor cacheControlHeaderInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(cacheControlHeaderInterceptor);
    }
}
