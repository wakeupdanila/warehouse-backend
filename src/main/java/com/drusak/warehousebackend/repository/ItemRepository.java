package com.drusak.warehousebackend.repository;

import com.drusak.warehousebackend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {

}
