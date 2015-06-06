package uk.me.paulswilliams.mockitohamcrest;

import java.util.HashMap;

public class Service {
	private final Repository repository;

	public Service(Repository repository) {
		this.repository = repository;
	}

	public void create(Product product) {
		Product clone = new Product(product.id, product.name);
		HashMap<String, Product> map = new HashMap<>();
		map.put(product.name, clone);
		repository.create(map);
	}


}
