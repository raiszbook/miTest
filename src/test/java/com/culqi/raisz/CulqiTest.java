package com.culqi.raisz;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;



public class CulqiTest {

	@Test
	public void test() throws Exception, IOException{
		// Given
		   String jsonMimeType = "application/json";
		   HttpUriRequest request = new HttpPost( "http://localhost:8080/card/tokens" );
		 
		   // When
		   HttpResponse response = HttpClientBuilder.create().build().execute( request );
		 
		   // Then
		   String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
		   assertEquals( jsonMimeType, mimeType );
	}

}
