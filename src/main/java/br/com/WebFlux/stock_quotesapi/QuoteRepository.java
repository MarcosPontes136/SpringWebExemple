package br.com.WebFlux.stock_quotesapi;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository  extends PagingAndSortingRepository<Quote, Long> {
	@RestResource(rel = "quotes", path = "quotes")
	public List<Quote> findAllBySymbol(@Param("symbol") String symbol, Pageable page);

}
