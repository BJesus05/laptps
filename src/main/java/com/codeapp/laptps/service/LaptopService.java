package com.codeapp.laptps.service;

import com.codeapp.laptps.entity.Laptop;
import com.codeapp.laptps.repository.LaptopRepository;

import java.util.List;

public interface LaptopService {

    Laptop save(Laptop laptop);
    List<Laptop>  findAll();
    Laptop findById(Integer id);
    Laptop update(Laptop laptop);
    void deleteById(Integer id);

}
