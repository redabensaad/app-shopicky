package com.redabensaad.shopicky.mapper;

import com.redabensaad.shopicky.dto.AlbumDTO;
import com.redabensaad.shopicky.model.Album;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AlbumMapper {
    
    @Mapping(target = "songIds", expression = "java(album.getSongs().stream().map(song -> song.getId()).toList())")
    AlbumDTO toDto(Album album);
    
    @Mapping(target = "songs", ignore = true)
    Album toEntity(AlbumDTO albumDTO);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "songs", ignore = true)
    void updateEntityFromDto(AlbumDTO albumDTO, @MappingTarget Album album);
} 