package com.creativefusion.spring6reactive.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author sm@creativefusion.net
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    @Id // Spring Id annotation - Reactive stack so no JPA implementation
    private Integer id;
    private String beerName;
    private String beerStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

}
