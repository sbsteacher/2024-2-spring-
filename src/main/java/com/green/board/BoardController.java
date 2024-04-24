package com.green.board;

import com.green.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller; //화면 응답
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
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

    @GetMapping("/{boardId}")
    public BoardGetDetailRes getBoardOne(@PathVariable long boardId) {
        return service.getBoardOne(boardId);
    }

    @PutMapping
    public int putBoard(@RequestBody BoardPutReq p) {
        return service.putBoard(p);
    }

    @DeleteMapping
    public int deleteBoard(@RequestParam(name="board_id") long boardId) {
        System.out.println("boardId: " + boardId);
        return service.deleteBoard(boardId);
    }

}
