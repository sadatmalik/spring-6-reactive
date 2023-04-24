package com.creativefusion.spring6reactive.services;

import com.creativefusion.spring6reactive.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sm@creativefusion.net
 */
public interface BeerService {
    Flux<BeerDTO> listBeers();
    Mono<BeerDTO> getBeerById(Integer beerId);
}
