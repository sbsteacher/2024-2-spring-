package com.green.board;

import com.green.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller; //화면 응답
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

    private final BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        System.out.println(p);
        return service.postBoard(p);
    }

    @GetMapping
    public List<BoardGetRes> getBoardList() {
        return service.getBoardList();
    }

    @GetMapping("{boardId}")
    public BoardGetDetailRes getBoardOne(@PathVariable long boardId) {
        return service.getBoardOne(boardId);
    }

    @DeleteMapping
    public int deleteBoard(@RequestParam(name="board_id") int boardId) {
        return service.deleteBoard(boardId);
    }

}
