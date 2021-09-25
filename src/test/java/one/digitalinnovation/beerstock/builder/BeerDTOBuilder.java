package one.digitalinnovation.beerstock.builder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.Builder;
import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.enums.BeerType;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Skol";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 25;

    @Builder.Default
    private int quantity = 15;

    @Builder.Default
    private BeerType type = BeerType.ALE;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
