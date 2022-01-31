package com.purpose.financial.compositeservice.util.serializer;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class TimeStampSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date date, JsonGenerator jGen, SerializerProvider arg2)
			throws IOException {
		jGen.writeNumber(date.getTime());
	}

}