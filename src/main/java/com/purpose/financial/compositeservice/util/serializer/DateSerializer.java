package com.purpose.financial.compositeservice.util.serializer;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.purpose.financial.compositeservice.util.Utils;

public class DateSerializer extends JsonSerializer<Date>{
	@Override
	public void serialize(Date date, JsonGenerator jGen, SerializerProvider provider)
			throws IOException {
		DateFormat formatter = new SimpleDateFormat(Utils.DATE_FORMAT);
		jGen.writeString(formatter.format(date));
	}

}
