package com.JavaSmsSend;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class JavaSMS 
{
    public static void main( String[] args )
    {
    	try {
			HttpResponse response = Unirest.get("https://www.fast2sms.com/dev/bulkV2?authorization=7ecZ6GlP1vmDXHELyau0pMhFAgsTi85kSIrqWQnYKR9NUxBjz2A268qxp9OSfbRlut3hdFga7ECDW0TG&sender_id=DLT_SENDER_ID&message=YOUR_MESSAGE_ID&variables_values=12345|asdaswdx&route=dlt&numbers=8788174200,9601816964")
					  .header("cache-control", "no-cache")
					  .asString();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println( "Sms Send...!" );
    }
}
