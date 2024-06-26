package com.green.board;

import com.green.board.model.BoardGetDetailRes;
import com.green.board.model.BoardGetRes;
import com.green.board.model.BoardPostReq;
import com.green.board.model.BoardPutReq;
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

    public BoardGetDetailRes getBoardOne(long boardId) {
        return mapper.getBoardOne(boardId);
    }

    public int putBoard(BoardPutReq p) {
        return mapper.putBoard(p);
    }

    public int deleteBoard(long boardId) {
        return mapper.deleteBoard(boardId);
    }
}
