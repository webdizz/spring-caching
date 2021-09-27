package name.webdizz.spring.springcaching.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {

    private Long id;

    private String name;

}
