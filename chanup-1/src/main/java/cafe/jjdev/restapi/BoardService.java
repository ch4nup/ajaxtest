package cafe.jjdev.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
@Autowired
	BoardMapper boardMapper;
	
	public int addBoard(Board board) {
		System.out.println("02 addBoard.BoardService");
		int result = boardMapper.insertBoard(board);
		return result;
	}
	public List<Board> getBoardList() {
		System.out.println("02 getBoardList.BoardService");
		List<Board> listBoard = boardMapper.searchBoardList();		
		return listBoard;
	}
	public int removeBoard(int[] ck) {
		System.out.println("02 removeBoard.BoardService");
		int i = 0;
		int boardNo = 0;
		for(i=0; i<ck.length; i++) {
			boardNo = ck[i];
			boardMapper.deleteBoard(boardNo);
		}		
		return i;
	}
	public int modifyBoard(Board board) {
		System.out.println("02 modifyById.BoardController");
		int result = boardMapper.updateBoard(board);
		return result;
	}
}
