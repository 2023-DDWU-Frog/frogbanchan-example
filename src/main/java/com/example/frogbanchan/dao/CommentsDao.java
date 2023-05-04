package com.example.frogbanchan.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.example.frogbanchan.domain.Comments;

public interface CommentsDao {
	// comment 삽입
	void insertComment(Comments comments) throws DataAccessException;
	/* String query = "INSERT INTO COMMENT (COMMENT_ID, PARTY_ID, WRITER, WRITTEN_DATE, CONTENT) "
								  + "VALUES (SEQUENCE_Comments.nextval, ?, ?, ?, ?)"
	*/

	// comment 삭제
	void deleteComment(int commentId) throws DataAccessException;
	/* String query = "DELETE FROM COMMENT "
									+ "WHERE COMMENT_ID = ?"
	*/

	// 특정 Party의 comment 삭제
	void deleteCommentsByPartyId(int partyId) throws DataAccessException;
	/* String query = "DELETE FROM COMMENT "
									+ "WHERE PARTY_ID = ?"
	*/

	// comment id로 comment 객체 가져오기
	Comments findCommentByCommentId(int commentId) throws DataAccessException;
	/* String query = "SELECT * "
								  + "FROM COMMENT "
									+ "WHERE COMMENT_ID = ?"
	*/

	// party id로 comment 객체 가져오기 (시간순 오름차순 정렬)
	List<Comments> findCommentsByPartyId(int partyId) throws DataAccessException;
	/* String query = "SELECT * "
								  + "FROM COMMENT "
									+ "WHERE PARTY_ID = ? "
									+ "ORDER BY WRITTEN_DATE"
	*/

	// 전체 comment 가져오기
	List<Comments> findCommentList() throws DataAccessException;
	/* String query = "SELECT * "
								  + "FROM COMMENTS"
	*/

}