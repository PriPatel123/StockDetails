package com.stocks.stocks;
import java.util.List;
import org.springframework.data.repository.CrudRepository;  
import org.springframework.data.jpa.repository.JpaRepository;
public interface StocksRepository   extends CrudRepository<Stock, Integer>{

}
