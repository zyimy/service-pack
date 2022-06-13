package com.desarrollo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.desarrollo.dto.PackDto;
import com.desarrollo.entity.Pack;

@Mapper(componentModel = "Spring")
public interface PackMapper {
	
	Pack packToPackDto(PackDto packDto);
	
	PackDto packDtoToPack(Pack pack);
	
	List<Pack>listPackToListPackDto(List<PackDto>listDto);
	List<PackDto>listPackDtoToListPack(List<Pack>listPack);
	

}
