package name.webdizz.spring.springcaching.configuration.http;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheControl {

    int maxAge() default 10;

    CachedIn cachedIn() default CachedIn.PUBLIC;

    static enum CachedIn {
        PUBLIC("public"),
        PRIVATE("private");
        private String directive;

        CachedIn(String directive) {
            this.directive = directive;
        }

        String value() {
            return directive.toLowerCase();
        }
    }
}


