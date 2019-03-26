package cafe.jjdev.restapi;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> searchBoardList();
	int deleteBoard(int boardNo);
	int updateBoard(Board board);
}
