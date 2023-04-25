package com.creativefusion.spring6reactive.mapper;

import com.creativefusion.spring6reactive.domain.Beer;
import com.creativefusion.spring6reactive.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * @author sm@creativefusion.net
 */
@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}

