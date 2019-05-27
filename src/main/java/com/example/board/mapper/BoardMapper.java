package com.example.board.mapper;

import com.example.board.domain.BoardVO;
import java.util.List;

public interface BoardMapper {
    // 글작성
    public void boardInsert (BoardVO board) throws Exception;

    // 글목록
    public List<BoardVO> boardList() throws Exception;

    public List<BoardVO> titleList() throws Exception;

    public BoardVO selectBoardOne(int bno) throws Exception;
}