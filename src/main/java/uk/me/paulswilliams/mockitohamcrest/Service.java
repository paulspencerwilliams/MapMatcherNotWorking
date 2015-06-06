package uk.me.paulswilliams.mockitohamcrest;

public class Service {
	private final Repository repository;

	public Service(Repository repository) {
		this.repository = repository;
	}

	public void create(Product product) {
		repository.create(new Product(product.id, product.name));
	}


}
