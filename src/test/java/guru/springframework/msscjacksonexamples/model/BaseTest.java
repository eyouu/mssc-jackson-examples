package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDTO getDto() {
        return BeerDTO.builder()
                .id(UUID.fromString("8893caf8-bf06-48d0-9eaf-c10dedb18d71"))
                .beerName("beerName")
                .beerStyle("Ale")
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(123124L)
                .myLocalDate(LocalDate.now())
                .build();
    }
}
