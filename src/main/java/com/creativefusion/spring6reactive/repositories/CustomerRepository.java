package com.creativefusion.spring6reactive.repositories;

import com.creativefusion.spring6reactive.domain.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author sm@creativefusion.net
 */
public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {
}
