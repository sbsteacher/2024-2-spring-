package com.green.board;

import com.green.board.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
}