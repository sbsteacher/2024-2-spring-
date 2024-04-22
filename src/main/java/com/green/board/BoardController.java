package com.green.board;

import com.green.board.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; //화면 응답
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; //데이터 응답

@RestController
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

    private final BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        System.out.println(p);
        service.postBoard(p);
        return 10;
    }

}