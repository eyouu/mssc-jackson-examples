package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

    @JsonProperty("beerId") // during serialization/deserialization this field will have this name.
    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc;

    @JsonFormat(shape = JsonFormat.Shape.STRING) // now this field will be serialized as String type.
    private BigDecimal price;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;
}
