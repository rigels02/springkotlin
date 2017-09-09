package org.rb.springkotlin.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/*

  @author raitis
  Created on Sep 8, 2017
*/

@Entity
class Customer(
        val firstName: String,
        val lastName: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1) {

    private constructor() : this("", "")
}