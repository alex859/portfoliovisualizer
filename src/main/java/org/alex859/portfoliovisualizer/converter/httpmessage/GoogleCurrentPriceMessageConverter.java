package org.alex859.portfoliovisualizer.converter.httpmessage;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.alex859.portfoliovisualizer.model.generated.google.FinanceCurrentPrice;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GoogleCurrentPriceMessageConverter extends AbstractJackson2HttpMessageConverter
{
    public GoogleCurrentPriceMessageConverter(final ObjectMapper objectMapper)
    {
        super(objectMapper);
    }

    @Override
    public Object read(final Type type, final Class<?> contextClass, final HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException
    {
        final String response = IOUtils.toString(inputMessage.getBody(), StandardCharsets.UTF_8);
        final String cleanResponse = response.replace("//", "");
        final HttpInputMessage newInputMessage = new HttpInputMessage()
        {

            @Override
            public HttpHeaders getHeaders()
            {
                return inputMessage.getHeaders();
            }

            @Override
            public InputStream getBody() throws IOException
            {
                return IOUtils.toInputStream(cleanResponse, StandardCharsets.UTF_8);
            }
        };
        return super.read(type, contextClass, newInputMessage);
    }

    @Override
    public boolean canRead(final Class<?> clazz, final MediaType mediaType)
    {
        return FinanceCurrentPrice[].class.equals(clazz);
    }

    @Override
    public boolean canRead(final Type type, final Class<?> contextClass, final MediaType mediaType)
    {

        return FinanceCurrentPrice[].class.equals(type);
    }

    @Override
    public boolean canWrite(final Class<?> clazz, final MediaType mediaType)
    {
        // Not interested in writing
        return false;
    }

    @Override
    public boolean canWrite(final Type type, final Class<?> clazz, final MediaType mediaType)
    {
        // Not interested in writing
        return false;
    }

    @Override
    protected boolean canWrite(final MediaType mediaType)
    {
        // Not interested in writing
        return false;
    }

    @Override
    public List<MediaType> getSupportedMediaTypes()
    {
        return super.getSupportedMediaTypes();
    }
}
