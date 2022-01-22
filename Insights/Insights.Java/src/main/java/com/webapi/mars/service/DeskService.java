package com.webapi.mars.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapi.mars.model.Desk;
import com.webapi.mars.repository.DeskRepository;

@Service
public class DeskService {
    @Autowired
    private DeskRepository deskRepository;

    public DeskService() {
        super();
    }

    public DeskService(DeskRepository deskRepository) {
        super();
        this.deskRepository = deskRepository;
    }

    public Collection<Desk> getDesks()
    {
        return this.deskRepository.findAll();
    }

	public Collection<Desk> getDesksByUUId(String uuid) {
		
		return this.deskRepository.findByUUId(uuid);
	}
}
