package com.green.board;

import com.green.board.model.BoardGetRes;
import com.green.board.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public int postBoard(BoardPostReq p) {
        System.out.println("BoardService - postBoard");
        return mapper.postBoard(p);
    }

    public List<BoardGetRes> getBoardList() {
        return mapper.getBoardList();
    }

    public int deleteBoard(int boardId) {
        return mapper.deleteBoard(boardId);
    }
}
