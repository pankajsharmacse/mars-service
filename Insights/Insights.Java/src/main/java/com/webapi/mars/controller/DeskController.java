package com.webapi.mars.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapi.mars.model.Desk;
import com.webapi.mars.model.ServiceResult;
import com.webapi.mars.service.DeskService;

@RestController
@RequestMapping("/api/webapi/proxy")
public class DeskController {

	@Autowired
	DeskService deskService;
	
    public DeskController() {
        super();
    }

    public DeskController(DeskService deskService) {
        super();
        this.deskService = deskService;
    }

    @GetMapping("/desks")
    public ResponseEntity<ServiceResult<Collection<Desk>>> getDesks()
    {
    	ServiceResult<Collection<Desk>> serviceResult= new ServiceResult<>();
    	serviceResult.setData(this.deskService.getDesks());
        return ResponseEntity.ok(serviceResult);
    }

    @GetMapping("/desksByUUId/{uuid}")
    public ResponseEntity<Collection<Desk>> getDesksByUUId(@PathVariable String uuid) {
        return ResponseEntity.ok(this.deskService.getDesksByUUId(uuid));
    }

}
