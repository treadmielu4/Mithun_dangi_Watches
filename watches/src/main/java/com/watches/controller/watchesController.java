package com.watches.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.watches.model.watches;
import com.watches.service.watchesService;

@Controller
public class watchesController {

	@Autowired
	watchesService watchesService;

	@GetMapping(value="/allwatches")
	public ResponseEntity<?> watchesList()
	{
		return new ResponseEntity<List<watches>>(watchesService.allwatches(),HttpStatus.OK);
	}

	@GetMapping(value="/topFivewatches")
	public ResponseEntity<?> topFivewatches()
	{
		return new ResponseEntity<List<watches>>(watchesService.topFivewatches(),HttpStatus.OK);
	}

	@GetMapping(value="/searchwatchesById/{id}")
	public ResponseEntity<?> searchwatchesById(@PathVariable("id") int id)
	{
		watches watch = watchesService.searchwatchesById(id);
		if(w==null){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<watches>(watch,HttpStatus.OK);
	}

	@GetMapping(value="/searchwatchesByName/{name}")
	public ResponseEntity<?> searchwatchesById(@PathVariable("name") String name)
	{
		watches w = watchesService.searchwatchesByName(name);
		if(w==null){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<watches>(w,HttpStatus.OK);
	}

	@GetMapping(value="/searchwatchesByPrice/{startPrice}/{endPrice}")
	public ResponseEntity<?> searchwatchesByPrice(@PathVariable("startPrice") Double startPrice, @PathVariable("endPrice") Double endPrice )
	{
		List<watches> h = watchesService.searchwatchesByPrice(startPrice,endPrice);
		if(w.size()==0){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<watches>>(w,HttpStatus.OK);
	}

	@GetMapping(value="/searchwatchesByVolume/{startVolume}/{endVolume}")
	public ResponseEntity<?> searchwatchesByVolume(@PathVariable("startVolume") Double startVolume, @PathVariable("endVolume") Double endVolume )
	{
		List<watches> w = watchesService.searchwatchesByVolume(startVolume,endVolume);
		if(w.size()==0){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<watches>>(w,HttpStatus.OK);
	}

	@GetMapping(value="/searchwatchesByDate/{startDate}/{endDate}")
	public ResponseEntity<?> searchwatchesById(@PathVariable("startDate") Date startDate, @PathVariable("endDate") Date endDate )
	{
		List<watches> w = watchesService.searchwatchesByDate(startDate,endDate);
		if(w.size()==0){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<watches>>(w,HttpStatus.OK);
	}
}