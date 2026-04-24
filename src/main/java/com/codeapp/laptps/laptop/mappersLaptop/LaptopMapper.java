package com.codeapp.laptps.laptop.mappersLaptop;

import com.codeapp.laptps.laptop.entity.Laptop;
import com.codeapp.laptps.laptop.dtoLaptop.LaptopDTO;

public class LaptopMapper {

    public static LaptopDTO toDTO(Laptop laptop) {
        LaptopDTO dto = new LaptopDTO();
        dto.setId(laptop.getId());
        dto.setMarca(laptop.getMarca());
        dto.setModelo(laptop.getModelo());
        dto.setProcesador(laptop.getProcesador());
        dto.setRam(laptop.getRam());
        dto.setAlmacenamiento(laptop.getAlmacenamiento());
        dto.setTipoDisco(laptop.getTipoDisco());
        dto.setSistemaOperativo(laptop.getSistemaOperativo());
        dto.setTamanioPantalla(laptop.getTamanioPantalla());
        return dto;
    }

    public static Laptop toEntity(LaptopDTO dto) {
        Laptop laptop = new Laptop();
        laptop.setId(dto.getId());
        laptop.setMarca(dto.getMarca());
        laptop.setModelo(dto.getModelo());
        laptop.setProcesador(dto.getProcesador());
        laptop.setRam(dto.getRam());
        laptop.setAlmacenamiento(dto.getAlmacenamiento());
        laptop.setTipoDisco(dto.getTipoDisco());
        laptop.setSistemaOperativo(dto.getSistemaOperativo());
        laptop.setTamanioPantalla(dto.getTamanioPantalla());
        return laptop;
    }

    public static void updateEntity(Laptop source, Laptop target) {
        target.setMarca(source.getMarca());
        target.setModelo(source.getModelo());
        target.setProcesador(source.getProcesador());
        target.setRam(source.getRam());
        target.setAlmacenamiento(source.getAlmacenamiento());
        target.setTipoDisco(source.getTipoDisco());
        target.setSistemaOperativo(source.getSistemaOperativo());
        target.setTamanioPantalla(source.getTamanioPantalla());
    }


}

