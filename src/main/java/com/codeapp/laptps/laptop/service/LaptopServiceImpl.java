package com.codeapp.laptps.laptop.service;

import com.codeapp.laptps.common.exception.CustomException;
import com.codeapp.laptps.laptop.entity.Laptop;
import com.codeapp.laptps.laptop.interfaceService.LaptopService;
import com.codeapp.laptps.laptop.mappersLaptop.LaptopMapper;
import com.codeapp.laptps.laptop.repository.LaptopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    public LaptopServiceImpl(LaptopRepository laptopRepository) {

        this.laptopRepository = laptopRepository;
    }

    @Override
    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public List<Laptop> findAll() {

        return laptopRepository.findAll();
    }

    @Override
    public Laptop findById(Integer id) {
        return laptopRepository.findById(id).orElseThrow(() ->
                new CustomException("No se encuentra el id: ")
        );
    }

    @Override
    public Laptop update(Integer id, Laptop laptop) {
        Laptop laptopDb = findById(id);
        LaptopMapper.updateEntity(laptop, laptopDb);
        return save(laptopDb);
    }

    @Override
    public void deleteById(Integer id) {
        Laptop laptop = laptopRepository.findById(id).orElseThrow(() ->
                new CustomException("No se encuentra el id: ")
        );
        laptopRepository.delete(laptop);
    }
}
