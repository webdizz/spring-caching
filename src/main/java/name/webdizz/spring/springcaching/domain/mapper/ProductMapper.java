package name.webdizz.spring.springcaching.domain.mapper;

import name.webdizz.spring.springcaching.domain.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toDto(name.webdizz.spring.springcaching.domain.persistence.Product product);
}
