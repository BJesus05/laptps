package com.codeapp.laptps.laptop.repository;

import com.codeapp.laptps.laptop.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Integer> {

}
