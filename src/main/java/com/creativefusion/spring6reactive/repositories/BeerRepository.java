package com.creativefusion.spring6reactive.repositories;

import com.creativefusion.spring6reactive.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author sm@creativefusion.net
 */
public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {
}
