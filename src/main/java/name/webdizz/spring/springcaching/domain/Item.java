package name.webdizz.spring.springcaching.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Item implements Serializable {

    private Long id;

    private Product product;

    private Integer quantity;
}
