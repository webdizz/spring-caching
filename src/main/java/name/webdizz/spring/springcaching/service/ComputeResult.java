package name.webdizz.spring.springcaching.service;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
class ComputeResult implements Serializable {
    private String name;
}
