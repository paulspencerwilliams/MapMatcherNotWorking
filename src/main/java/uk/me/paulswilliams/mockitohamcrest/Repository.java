package uk.me.paulswilliams.mockitohamcrest;

import java.util.HashMap;

public interface Repository {
	void create(HashMap<String, Product> products);
}
