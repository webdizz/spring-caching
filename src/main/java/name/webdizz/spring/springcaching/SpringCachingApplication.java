package name.webdizz.spring.springcaching;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@Slf4j
public class SpringCachingApplication {

    public static void main(String[] args) {
        String setActiveProfiles = System.getenv().get("--spring.profiles.active");

        if (setActiveProfiles.contains("hazelcast")) {
            System.setProperty("javax.cache.spi.CachingProvider", "com.hazelcast.cache.impl.HazelcastServerCachingProvider");
        } else {
            System.setProperty("javax.cache.spi.CachingProvider", "org.ehcache.jsr107.EhcacheCachingProvider");
        }
        log.info("Active caching provider: " + System.getProperty("javax.cache.spi.CachingProvider"));

        SpringApplication.run(SpringCachingApplication.class, args);
    }

}
