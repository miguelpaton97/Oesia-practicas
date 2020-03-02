package com.oesia.formacion.practica.architecture.communications.processors;

import java.util.List;

import com.oesia.formacion.practica.architecture.communications.messages.stock.StockMessageInformation;
import com.oesia.formacion.practica.architecture.communications.messages.stock.StockMessageInformation.Builder;
import com.oesia.formacion.practica.architecture.domain.model.Message;

public class StockInformationProcessor implements Processor {

	private static final int STOCK_ARTICLE_ID_POSITION = 0;
	private static final int STOCK_DESCRIPTION_POSITION = 1;
	private static final int STOCK_COLOUR_ID_POSITION = 2;
	private static final int STOCK_SIZE_ID_POSITION = 3;
	private static final int STOCK_NUM_UNIT_POSITION = 6;

	@Override
	public void process(Message message) {

		for (List<String> row : message.getRecords()) {

			int idArticle = Integer.parseInt(row.get(STOCK_ARTICLE_ID_POSITION));
			String descriptionArticle = row.get(STOCK_DESCRIPTION_POSITION);
			int idColor = Integer.parseInt(row.get(STOCK_COLOUR_ID_POSITION));
			int idTalla = Integer.parseInt(row.get(STOCK_SIZE_ID_POSITION));
			int numUds = Integer.parseInt(row.get(STOCK_NUM_UNIT_POSITION));

			StockMessageInformation.Builder stockBuilder = new Builder();
			stockBuilder.idArticle(idArticle);
			stockBuilder.descriptionArticle(descriptionArticle);
			stockBuilder.idColor(idColor);
			stockBuilder.numUds(numUds);
			stockBuilder.idTalla(idTalla);

			StockMessageInformation stockMessageInformation = stockBuilder.build();

		}
	}
}
