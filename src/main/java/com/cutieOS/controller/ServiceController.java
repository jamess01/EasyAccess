package com.cutieOS.controller;


import com.cutieOS.entity.Servicio;
import com.cutieOS.services.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController
{

    @Autowired
    ServiceDao serviceDao;

    @GetMapping("/servicios")
    public List<Servicio> getAllServices(){return
            serviceDao.getAllServices();}

    @PostMapping("/servicios")
    public boolean insertService (@RequestBody Servicio servicio){ return serviceDao.insertService(servicio);}

    @PutMapping("/servicios/{id_service}")
    public Servicio putService(@RequestBody Servicio servicio, @PathVariable int id_service){
        servicio.setId_service(id_service);
        return serviceDao.putService(servicio);
    }

}
