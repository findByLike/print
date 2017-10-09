package com.supply.print.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.supply.print.model.Users;
@Mapper
public interface UsersMapper {
	Users getOne(Integer id);
}
