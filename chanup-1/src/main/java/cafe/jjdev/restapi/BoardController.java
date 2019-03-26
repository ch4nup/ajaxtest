package cafe.jjdev.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	//리턴값을 json방식의 문자열로 바꾸어 줌 //@CrossOrigin 외부에서도 호출할수 있게 해줌
public class BoardController {
	@Autowired
	BoardService boardService;
	// @Controller view 연결
	// @RestController 함수
	@GetMapping("/list") //List를 요청하면 리턴값을 json이 문자열로 바꾸어 리턴.
	public List<Board> boardList(){
		System.out.println("01 boardList.BoardController");		
		List<Board> listBoard = boardService.getBoardList();
		return listBoard;
	}
	@PostMapping("/add")
	public int addBoard(Board board) {	//json방식으로 넘어온 문자열을 Board타입으로 바꿈
		System.out.println("01 addBoard.BoardController");
		System.out.println("Board : " + board);
		int result = boardService.addBoard(board);
		return result;
	}
	@PostMapping("/modifyById")
	public int modifyById(Board board) {
		System.out.println("01 modifyById.BoardController");
		int result = boardService.modifyBoard(board);
		return result;
	}
	@GetMapping("/remove")
	public int removeBoard(@RequestParam(value="ck[]", required=true) int[] ck) {
		System.out.println("01 removeBoard.BoardController");
		System.out.println("ck : " + ck);
		System.out.println("ck[0] : " + ck[0]);
		int i = boardService.removeBoard(ck);
		return i;
	}
}
