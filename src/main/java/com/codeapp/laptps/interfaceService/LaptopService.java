package com.codeapp.laptps.interfaceService;

import com.codeapp.laptps.entity.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop save(Laptop laptop);
    List<Laptop>  findAll();
    Laptop findById(Integer id);
    Laptop update(Laptop laptop);
    void deleteById(Integer id);

}
