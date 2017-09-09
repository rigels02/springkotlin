package org.rb.springkotlin.repo

import org.rb.springkotlin.model.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/*

  @author raitis
  Created on Sep 8, 2017
*/

@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {

    fun findByLastName(lastName: String): Iterable<Customer>
}