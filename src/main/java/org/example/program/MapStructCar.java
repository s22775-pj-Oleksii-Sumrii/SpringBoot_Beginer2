package org.example.program;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface MapStructCar {
    @Mapping(target = "id", ignore = true)
    Car toEntity(CarCreateRequest request);
    CarResponse mapToCarResponse(Car car);
}
