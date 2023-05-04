package com.example.frogbanchan.dao;

import java.sql.Timestamp;
import com.example.frogbanchan.domain.Reservation;


public interface ReservationDao {

	//예약(일반 사용자)
	void insertReservation(Reservation reservation);
	/*	INSERT INTO Reservation(username, place_id, reservation_date, seat)
		VALUES (#{username}, #{placeId}, #{reservationDate}, #{seat})
	*/
	
	//예약 조회(일반 사용자)
	Reservation findReservationByUsername(int placeId, String username);
	/*	SELECT Reservation
		WHERE username = #{username} AND place_id = #{placeId}
	*/

	//예약 조회(사업자)
	Reservation findReservationByDate(int placeId, Timestamp date);
	/*	SELECT Reservation
		WHERE place_id = #{placeId} AND reservationDate = #{date}
	*/
}
