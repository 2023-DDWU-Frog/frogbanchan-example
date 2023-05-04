package com.example.frogbanchan.dao;

import java.sql.Timestamp;
import java.util.List;
import com.example.frogbanchan.domain.Place;

public interface PlaceDao {

	//사업자 최초가입
	void insertPlace(Place place);
	/*	INSERT INTO Place(place_id, password, name, address, menu_list)
		VALUES (#{placeId}, #{password}, #{name}, #{address}, #{menuList})
	*/
	
	//가게수정 : 메뉴, 상호명, 주소 변경
	Place updatePlace(Place place);
	/*	UPDATE Place
	  	SET name = #{name}
	      	address = #{address}
	      	menu_list =#{menuList}
	  	WHERE place_id = #{placeId}
	*/

	//가게 삭제
	void deletePlace(int placeId);
	/*	DELETE Place
	  	WHERE place_id = #{placeId}
	*/
	
	//가게 조회(myPageforPlace)
	Place findPlace(int placeId);
	/*  SELECT Place
	  	WHERE place_id = #{placeId}
	*/

	//예약 가능 시간 체크
	void insertAvailableTime(int placeId, List<Timestamp> availableTime);
	/*	insert into Place(place_id, available_time)
		values (#{placeId}, #{availableime})
	*/

	//캘린더 조회 
	/*ReservationDAO에 들어가야 한다고 생각했지만 가게 이름, 예약 가능 날짜가 들어가야하므로 placeDAO
		사업자, 일반 사용자 둘다 가게 이름, 예약 가능 날짜를 얻어야함.
		사업자는 예약 가능 날짜를 얻어 자신이 클릭한 날짜 확인, 사용자는 가능한 날짜 확인 */
	Place findCalendar(int placeId);
	/*	SELECT Place
		WHERE place_id = #{placeId}
	*/
	
}
	