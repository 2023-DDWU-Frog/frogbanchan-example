package com.example.frogbanchan.service;
  
import java.util.List;
import java.sql.Timestamp;

import com.example.frogbanchan.domain.Member;
import com.example.frogbanchan.domain.Place;
import com.example.frogbanchan.domain.Reservation;
import com.example.frogbanchan.domain.Menu;
import com.example.frogbanchan.domain.PlaceMenu;
import com.example.frogbanchan.domain.History;
import com.example.frogbanchan.domain.Team;
import com.example.frogbanchan.domain.Party;
import com.example.frogbanchan.domain.Comments;

public interface FrogBanchanFacade {
	
	// MemberService
	public void insertMember(Member member);
	
	public void updateMember(Member member);
	
	public void deleteMember(String username);
	
	public Member findMemberByUsername(String username);
	
	public List<Member> findMembersByNickname(String nickname);
	
	public List<String> findUsernameList();

	public List<Team> findTeamsByUsername(String username);
	
	public List<Member> findMembersByTeamId(int teamId);

	// PlaceService
	public void insertPlace(Place place);

	public void updatePlace(Place place);

	public void deletePlace(int placeId);

	public Place findPlace(int placeId);

	public void insertAvailableTime(int placeId, List<Timestamp> availableTime);

	public Place findCalendar(int placeId);

	// ReservationService
	public void insertReservation(Reservation reservation);

	public Reservation findReservationByUsername(int placeId, String username);

	public Reservation findReservationByDate(int placeId, Timestamp date);

	// MenuService
	public Menu findMenu(int menu_id);

	public List<Menu> findMenuList();

	public List<Menu> findMenuListByTagList(List<String> likeTagList, List<String> dislikeTagList);

	public List<String> findMenuTags(int menu_id);

	public List<String> findAllTag();

	// PlaceMenuService
	public void insertPlaceMenu(PlaceMenu placeMenu);

	public void updatePlaceMenu(PlaceMenu placeMenu);

	public void deletePlaceMenu(int place_menu_id);

	public List<PlaceMenu> findMenuListByPlaceId(String place_id);

	public List<Place> findPlaceListByMenu(int menu_id);

	// HistoryService
 	public History findHistory(String username, Timestamp recorded_date);

	public List<History> findHistoryListsByUsername(String username);

	public void insertHistory(History history);

	public void updateHistory(History history);

	public void deleteHistory(String username, Timestamp recorded_date);

	// TeamService
	public void insertTeam(Team team);

	public void updateTeam(Team team);

	public void addTeamMember(int team_id, String username);

	public void deleteTeam(int team_id);
  
	public void deleteTeamMember(int team_id, String username);

	public void quitTeam(int team_id);

	public Team findTeam(int team_id);

	public List<Team> findTeamList(String username);

	public List<Member> findTeamMembers(int team_id);

	// PartyService
	public void insertParty(Party party);
	
	public void deleteParty(int party_id);
	
	public Party findParty(int party_id);
	
	public List<Party> findPartyList();
  
	// CommentsService
	public void insertComment(Comments comments);
	
	public void deleteComment(int commentId);
	
	public Comments findCommentByCommentId(int commentId);
	
	public List<Comments> findCommentsByPartyId(int partyId);
	
	public List<Comments> findCommentList();

}