package com.stocks.stocks;

import javax.persistence.*;

@Entity

@Table(name = "stocks")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "symbol")
	private String symbol;

	@Column(name = "lastprice")
	private Integer lastprice;

	@Column(name = "tag")
	private String tag;

}