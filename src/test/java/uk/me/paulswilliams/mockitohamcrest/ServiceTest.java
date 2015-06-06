package uk.me.paulswilliams.mockitohamcrest;

import org.junit.Test;

import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static uk.me.paulswilliams.mockitohamcrest.ProductMatcher.aProductLike;

public class ServiceTest {

	@Test
	public void serviceInvokesRepositoryWithProduct() {
		Product product = new Product(1, "Apple");
		Repository repository = mock(Repository.class);
		new Service(repository).create(product);
		verify(repository).create(argThat(aProductLike(product)));
	}
}
