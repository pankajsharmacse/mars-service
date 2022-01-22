/*
 * Copyright (c) 2020 Refinitiv. All rights reserved.
 */

package com.webapi.mars.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.webapi.mars.model.Desk;

@Repository
public class DeskRepository {
	
	public Collection<Desk> getListDesks()
	{
		Desk desk = new Desk();
        desk.setDeskName("ABC");
        desk.setTcid("ABC");

        Desk desk1 = new Desk();
        desk1.setDeskName("XYZ");
        desk1.setTcid("XYZ");

        Desk desk2 = new Desk();
        desk2.setDeskName("PQR");
        desk2.setTcid("PQR");

        List<Desk> deskList = new ArrayList<>();
        deskList.add(desk);
        deskList.add(desk1);
        deskList.add(desk2);

        return deskList;

	}

    public Collection<Desk> findByUUId(final String uuid) {
    	return getListDesks();
 
    }

    public Collection<Desk> findAll() {
    	return getListDesks();
    }
}
