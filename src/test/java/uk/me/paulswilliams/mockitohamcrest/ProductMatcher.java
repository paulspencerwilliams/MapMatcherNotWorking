package uk.me.paulswilliams.mockitohamcrest;

import com.mistraltech.smog.core.CompositePropertyMatcher;
import com.mistraltech.smog.core.MatchAccumulator;
import com.mistraltech.smog.core.annotation.Matches;

@Matches(Product.class)
public final class ProductMatcher extends CompositePropertyMatcher<Product> {
	private static final String MATCHED_OBJECT_DESCRIPTION = "a Product";

	private ProductMatcher(final String matchedObjectDescription, final Product template) {
		super(matchedObjectDescription);
	}

	public static ProductMatcher aProductThat() {
		return new ProductMatcher(MATCHED_OBJECT_DESCRIPTION, null);
	}

	public static ProductMatcher aProductLike(final Product template) {
		return new ProductMatcher(MATCHED_OBJECT_DESCRIPTION, template);
	}

	@Override
	protected void matchesSafely(final Product item, final MatchAccumulator matchAccumulator) {
		super.matchesSafely(item, matchAccumulator);
	}
}
