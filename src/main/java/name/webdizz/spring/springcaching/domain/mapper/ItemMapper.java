package name.webdizz.spring.springcaching.domain.mapper;

import name.webdizz.spring.springcaching.domain.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    Item toDto(name.webdizz.spring.springcaching.domain.persistence.Item item);
}
