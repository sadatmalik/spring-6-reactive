package com.creativefusion.spring6reactive.services;

import com.creativefusion.spring6reactive.model.BeerDTO;
import reactor.core.publisher.Flux;

/**
 * @author sm@creativefusion.net
 */
public interface BeerService {

    Flux<BeerDTO> listBeers();
}
