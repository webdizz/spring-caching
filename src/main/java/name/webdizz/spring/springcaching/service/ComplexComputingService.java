package name.webdizz.spring.springcaching.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ComplexComputingService {

    @Data
    @AllArgsConstructor
    class ComputeResult {
        private String name;
    }

    @Cacheable("complex-compute")
    public ComputeResult compute() {
        log.info("== Result is about to be precomputed ==");
        return new ComputeResult("Some precomputed result name");
    }
}
