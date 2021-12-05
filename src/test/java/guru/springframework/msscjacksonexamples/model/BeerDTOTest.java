package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@JsonTest
class BeerDTOTest extends BaseTest {

    private static final String TEST_JSON = "{\"id\":\"8893caf8-bf06-48d0-9eaf-c10dedb18d71\",\"beerName\":\"beerName\",\"beerStyle\":\"Ale\",\"upc\":123124,\"price\":12.99,\"createdDate\":\"2021-12-05T15:59:50.9572453+02:00\",\"lastUpdatedDate\":\"2021-12-05T15:59:50.9582424+02:00\"}";

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldSerialize() throws JsonProcessingException {
        BeerDTO beerDTO = getDto();

        String result = objectMapper.writeValueAsString(beerDTO);

        System.out.println(result);
    }

    @Test
    void shouldDeserialize() throws JsonProcessingException {
        BeerDTO result = objectMapper.readValue(TEST_JSON, BeerDTO.class);

        System.out.println(result);
    }
}