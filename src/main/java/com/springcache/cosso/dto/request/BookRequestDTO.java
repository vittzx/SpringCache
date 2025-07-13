package com.springcache.cosso.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class BookRequestDTO {

    private Long id;
    private String name;
    private String category;
    private String author;
    private String publisher;
    private Integer edition;
}
