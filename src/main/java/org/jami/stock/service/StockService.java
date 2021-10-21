package org.jami.stock.service;

import java.util.List;

import org.jami.stock.model.ProductStock;

public interface StockService {

	ProductStock getStockBySku(final String sku);

	ProductStock getStocksBySkus(final List<String> skus);

}
