package com.watches.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watches.dao.watchesDAO;
import com.watches.model.watches;

@Service
public class watchesService {

	@Autowired
	watchesDAO watchesDao;

	public List<watches> allwatches(){
		return (List<watches>) watchesDao.findAll();
	}

	public List<watches> topFivewatches(){
		return (List<watches>) watchesDao.findTopFivewatches();
	}

	public watches searchwatchesById(int id){
		Optional<watches> w = watchesDao.findById(id);
		if(w.isPresent()){
			return w.get();
		}
		return null;
	}

	public watches searchwatchesByName(String name){
		Optional<watches> w = watchesDao.findBywatchesName(name);
		if(w.isPresent()){
			return w.get();
		}
		return null;
	}

	public List<watches> searchwatchesByPrice(Double startPrice, Double endPrice){
		return (List<watches>) watchesDao.findByPriceBetween(startPrice,endPrice);
	}

	public List<watches> searchwatchesByVolume(Double startVolume, Double endVolume){
		return (List<watches>) watchesDao.findByVolumeBetween(startVolume,endVolume);
	}

	public List<watches> searchwatchesByDate(Date startDate, Date endDate){
		return (List<watches>) watchesDao.findByDateBetween(startDate,endDate);
	}

}