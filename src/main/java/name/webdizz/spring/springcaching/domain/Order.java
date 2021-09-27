package name.webdizz.spring.springcaching.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Order implements Serializable {

    private Long id;

    private List<Item> items;
}
