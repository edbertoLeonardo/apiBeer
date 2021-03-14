package br.com.leonardo.apibeer.mapper;

import br.com.leonardo.apibeer.dto.BeerDTO;
import br.com.leonardo.apibeer.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}