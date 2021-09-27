package name.webdizz.spring.springcaching.domain.mapper;

import name.webdizz.spring.springcaching.domain.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order map(name.webdizz.spring.springcaching.domain.persistence.Order order);

    List<Order> map(List<name.webdizz.spring.springcaching.domain.persistence.Order> orders);
}
