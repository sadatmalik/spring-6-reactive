package com.creativefusion.spring6reactive.mapper;

import com.creativefusion.spring6reactive.domain.Customer;
import com.creativefusion.spring6reactive.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * @author sm@creativefusion.net
 */
@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
