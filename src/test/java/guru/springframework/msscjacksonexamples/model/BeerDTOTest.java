package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDTOTest extends BaseTest {

    private static final String TEST_JSON = "{\"beerName\":\"beerName\",\"beerStyle\":\"Ale\",\"upc\":123124,\"price\":\"12.99\",\"createdDate\":\"2021-12-05T16:39:17+0200\",\"lastUpdatedDate\":\"2021-12-05T16:39:17.6155188+02:00\",\"myLocalDate\":\"20211205\",\"beerId\":\"8893caf8-bf06-48d0-9eaf-c10dedb18d71\"}";

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