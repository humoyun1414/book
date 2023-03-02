package uz.spring.euroclimate.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;
import uz.spring.euroclimate.domain.PostEntity;
import uz.spring.euroclimate.model.PostDto;
import uz.spring.euroclimate.model.request.PostRequest;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class  PostMapper {
    public static final PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(target = "name", source = "name")
    public abstract PostEntity toEntity(PostRequest postRequest);

    public abstract PostDto toDto(PostEntity bookEntity);

    @Mapping(target = "name", source = "name")
    public abstract void update(@MappingTarget PostEntity postEntity, PostRequest postRequest);

}
