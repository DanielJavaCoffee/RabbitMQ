package br.com.valdir.commons.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {

    private Long id;
    private String name;

    private Double price;
}
