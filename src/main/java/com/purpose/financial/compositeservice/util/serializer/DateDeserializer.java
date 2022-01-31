package com.purpose.financial.compositeservice.util.serializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.purpose.financial.compositeservice.exception.ClientRequestException;
import com.purpose.financial.compositeservice.util.Utils;

public class DateDeserializer extends JsonDeserializer<Date> {

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException{
		SimpleDateFormat format = new SimpleDateFormat(Utils.DATE_FORMAT);
		String date = p.getText();
		try {
			return format.parse(date);
		}
		catch (ParseException ex) {
			throw new ClientRequestException(String.format("Date Time should in the format: '%s'. ",Utils.DATE_FORMAT));
		}
	}

}
