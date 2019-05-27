package com.example.board.Controller;

import com.example.board.domain.BoardVO;
import com.example.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BoardListController {

    @Autowired
    private BoardMapper boardMapper;

    @RequestMapping("/board")
    public List<BoardVO> board() throws Exception {
        List<BoardVO> board = boardMapper.boardList();
        return board;
    }

    @RequestMapping("/board/{bno}")
    public BoardVO board(@PathVariable int bno) throws Exception {
        BoardVO board = boardMapper.selectBoardOne(bno);
        return board;
    }

//    @RequestMapping("/board")
//    public ModelAndView board() throws Exception {
//        List<BoardVO> board = boardMapper.boardList();
//        return new ModelAndView("boardList", "list", board);
//    }

    @RequestMapping("/titlelist")
    public ModelAndView title() throws Exception {
        List<BoardVO> title = boardMapper.titleList();
        return new ModelAndView("titleList", "list", title);
    }

}
