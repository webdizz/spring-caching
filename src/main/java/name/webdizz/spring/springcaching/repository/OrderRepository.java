package name.webdizz.spring.springcaching.repository;

import name.webdizz.spring.springcaching.domain.persistence.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

import static org.hibernate.jpa.QueryHints.HINT_CACHEABLE;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @QueryHints({
            @QueryHint(name = HINT_CACHEABLE, value = "true"),
            @QueryHint(name = org.hibernate.jpa.QueryHints.HINT_CACHE_REGION, value = "order-query-results-region")
    })
    List<Order> findByItemsProductId(Long productId);
}
