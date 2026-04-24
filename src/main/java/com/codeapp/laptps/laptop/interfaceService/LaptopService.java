package com.codeapp.laptps.laptop.interfaceService;

import com.codeapp.laptps.laptop.entity.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop save(Laptop laptop);
    List<Laptop>  findAll();
    Laptop findById(Integer id);
    Laptop update(Integer id, Laptop laptop);
    void deleteById(Integer id);

}
