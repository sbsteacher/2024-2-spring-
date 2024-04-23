package com.green.board;

import com.green.board.model.BoardGetDetailRes;
import com.green.board.model.BoardGetRes;
import com.green.board.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
    List<BoardGetRes> getBoardList();
    BoardGetDetailRes getBoardOne(long boardId);
    int deleteBoard(int p);
}