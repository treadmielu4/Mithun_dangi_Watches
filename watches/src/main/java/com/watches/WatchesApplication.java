
		final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return args -> {
			repository.save(new watches(1, "Sonata", 7000, 4, format.parse("2020-01-01")));
			repository.save(new watches(2, "Titan", 4000,2, format.parse("2020-02-01")));
			repository.save(new watches(3, "Rolex", 3000, 2, format.parse("2020-04-01")));
			repository.save(new watches(4, "Ferrari", 6000, 1, format.parse("2019-04-01")));
			repository.save(new watches(5, "Casio", 7000, 6, format.parse("2018-04-01")));
			repository.save(new watches(6, "Fastrack", 1000, 3, format.parse("2017-01-01")));
		};
	}

}