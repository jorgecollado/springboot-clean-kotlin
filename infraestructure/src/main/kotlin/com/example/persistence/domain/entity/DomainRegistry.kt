package com.example.persistence.domain.entity;

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class DomainRegistry(
    var qname: String,
    var qtype: String,
    var content: String,
    var ttl: Int,
    @Id @GeneratedValue var id: Long? = null
)
