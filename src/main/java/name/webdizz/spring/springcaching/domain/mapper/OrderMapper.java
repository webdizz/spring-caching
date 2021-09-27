package name.webdizz.spring.springcaching.domain.mapper;

import name.webdizz.spring.springcaching.domain.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toDto(name.webdizz.spring.springcaching.domain.persistence.Order order);
}
