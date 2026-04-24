package com.codeapp.laptps.laptop.controller;

import com.codeapp.laptps.laptop.dtoLaptop.LaptopDTO;
import com.codeapp.laptps.laptop.entity.Laptop;
import com.codeapp.laptps.laptop.interfaceService.LaptopService;
import com.codeapp.laptps.laptop.mappersLaptop.LaptopMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping("/create")
    public LaptopDTO save(@RequestBody LaptopDTO laptopDTO){
        Laptop laptop = LaptopMapper.toEntity(laptopDTO);
        Laptop saved = laptopService.save(laptop);
        return LaptopMapper.toDTO(saved);
    }

    @GetMapping("/view")
    public List<LaptopDTO> findAll (){
        return laptopService.findAll()
                .stream()
                .map(LaptopMapper::toDTO)
                .toList();
    }

    @GetMapping("/view/{idLaptop}")
    public LaptopDTO findById (@PathVariable Integer idLaptop){
        Laptop laptop = laptopService.findById(idLaptop);
        return LaptopMapper.toDTO(laptop);
    }

    @DeleteMapping("/delete/{idLaptop}")
    public void deleteById(@PathVariable Integer idLaptop) {
        laptopService.deleteById(idLaptop);
    }

    @PutMapping("/update")
    public LaptopDTO update (@RequestBody LaptopDTO laptopDTO){

        Laptop laptop = LaptopMapper.toEntity(laptopDTO);

        Laptop updated = laptopService.update(laptop.getId(), laptop);

        return LaptopMapper.toDTO(updated);
    }
}
