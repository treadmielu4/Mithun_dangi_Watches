package com.watches.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.watches.model.watches;

@Repository
public interface watchesDAO extends CrudRepository<watches, Integer> {

	@Query(nativeQuery = true, value = "select * from watches order by price desc limit 5;")
	public List<watches> findTopFivewatches();

	public Optional<watches> findBywatchesName(String name);

	public List<watches> findByPriceBetween(Double startPrice, Double endPrice);

	public List<watches> findByVolumeBetween(Double startVolume, Double endVolume);

	public List<watches> findByDateBetween(Date startDate, Date endDate);


}
