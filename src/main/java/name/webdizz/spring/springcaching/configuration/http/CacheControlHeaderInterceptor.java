package name.webdizz.spring.springcaching.configuration.http;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class CacheControlHeaderInterceptor extends WebRequestHandlerInterceptorAdapter {

    public CacheControlHeaderInterceptor(WebRequestInterceptor requestInterceptor) {
        super(requestInterceptor);
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            CacheControl cacheControlAnnotation = ((HandlerMethod) handler).getMethodAnnotation(CacheControl.class);
            if (cacheControlAnnotation != null) {
                String cachedIn = cacheControlAnnotation.cachedIn().value();
                response.addHeader("Cache-Control", cachedIn + " max-age=" + cacheControlAnnotation.maxAge());
            }
        }
        return true;
    }
}

