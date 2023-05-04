
package com.example.frogbanchan.service;

import java.util.List;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.frogbanchan.dao.MemberDao;
import com.example.frogbanchan.dao.PlaceDao;
import com.example.frogbanchan.dao.ReservationDao;
import com.example.frogbanchan.dao.MenuDao;
import com.example.frogbanchan.dao.PlaceMenuDao;
import com.example.frogbanchan.dao.HistoryDao;
import com.example.frogbanchan.dao.TeamDao;
import com.example.frogbanchan.dao.PartyDao;
import com.example.frogbanchan.dao.CommentsDao;
import com.example.frogbanchan.domain.Member;
import com.example.frogbanchan.domain.Place;
import com.example.frogbanchan.domain.Reservation;
import com.example.frogbanchan.domain.Menu;
import com.example.frogbanchan.domain.PlaceMenu;
import com.example.frogbanchan.domain.History;
import com.example.frogbanchan.domain.Team;
import com.example.frogbanchan.domain.Party;
import com.example.frogbanchan.domain.Comments;

@Service
@Transactional
public class FrogBanchanImpl implements FrogBanchanFacade { 
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private PlaceDao placeDao;
	@Autowired
	private ReservationDao reservationDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private PlaceMenuDao placeMenuDao;
	@Autowired
	private HistoryDao historyDao;
	@Autowired
	private TeamDao teamDao;
	@Autowired
	private PartyDao partyDao;
	@Autowired
	private CommentsDao commentsDao;

	//-------------------------------------------------------------------------
	// Operation methods, implementing the PetStoreFacade interface
	//-------------------------------------------------------------------------

	// MemberService
	public void insertMember(Member member) {
		memberDao.insertMember(member);
	}

	public void updateMember(Member member) {
		memberDao.updateMember(member);
	}

	public void deleteMember(String username) {
		memberDao.deleteMember(username);
	}

	public Member findMemberByUsername(String username) {
		return memberDao.findMemberByUsername(username);
	}

	public List<Member> findMembersByNickname(String nickname) {
		return memberDao.findMembersByNickname(nickname);
	}

	public List<String> findUsernameList() {
		return memberDao.findUsernameList();
	}

	public List<Member> findMembersByTeamId(int teamId) {
		return memberDao.findMembersByTeamId(teamId);
	}

	public List<Team> findTeamsByUsername(String username) {
		return memberDao.findTeamsByUsername(username);
	}

	// PlaceService
	public void insertPlace(Place place) {
		placeDao.insertPlace(place);
	}

	public void updatePlace(Place place) {
		placeDao.updatePlace(place);
	}

	public void deletePlace(int placeId){
		placeDao.deletePlace(placeId);
	}

	public Place findPlace(int placeId){
		return placeDao.findPlace(placeId);
	}

	public void insertAvailableTime(int placeId, List<Timestamp> availableTime) {
		placeDao.insertAvailableTime(placeId, availableTime);
	}

	public Place findCalendar(int placeId) {
		return placeDao.findCalendar(placeId);
	}

	// ReservationService
	public void insertReservation(Reservation reservation){
		reservationDao.insertReservation(reservation);
	}

	public Reservation findReservationByUsername(int placeId, String username){
		return reservationDao.findReservationByUsername(placeId, username);
	}

	public Reservation findReservationByDate(int placeId, Timestamp date){
		return reservationDao.findReservationByDate(placeId, date);
	}

	// MenuService
	public Menu findMenu(int menu_id) {
		return menuDao.findMenu(menu_id);
	}

	public List<Menu> findMenuList() {
		return menuDao.findMenuList();
	}

	public List<Menu> findMenuListByTagList(List<String> likeTagList, List<String> dislikeTagList) {
		return menuDao.findMenuListByTagList(likeTagList, dislikeTagList);
	}

	public List<String> findMenuTags(int menu_id) {
     	return menuDao.findMenuTags(menu_id);
	}

	public List<String> findAllTag() {
		return menuDao.findAllTag();
	}

	// PlaceMenuService
	public List<PlaceMenu> findMenuListByPlaceId(String place_id) {
		return placeMenuDao.findMenuListByPlaceId(place_id);
	}

	public List<Place> findPlaceListByMenu(int menu_id) {
		return placeMenuDao.findPlaceListByMenu(menu_id);
	}

	@Override
	public void insertPlaceMenu(PlaceMenu placeMenu) {
		placeMenuDao.insertPlaceMenu(placeMenu);
	}

	@Override
	public void updatePlaceMenu(PlaceMenu placeMenu) {
		placeMenuDao.updatePlaceMenu(placeMenu);
	}

	@Override
	public void deletePlaceMenu(int place_menu_id) {
		placeMenuDao.deletePlaceMenu(place_menu_id);
	}

	
	// HistoryService
	public History findHistory(String username, Timestamp recorded_date) {
		return historyDao.findHistory(username, recorded_date);
	}

	public List<History> findHistoryListsByUsername(String username) {
		return historyDao.findHistoryListsByUsername(username);
	}

	public void insertHistory(History history) {
		historyDao.insertHistory(history);
	}
	
	public void updateHistory(History history) {
		historyDao.updateHistory(history);
	}
	
	public void deleteHistory(String username, Timestamp recorded_date) {
		historyDao.deleteHistory(username, recorded_date);
	}


	// TeamService
	public void insertTeam(Team team) {
		teamDao.insertTeam(team);
	}

	public void updateTeam(Team team) {
		teamDao.updateTeam(team);
	}

	public void addTeamMember(int team_id, String username) {
		teamDao.addTeamMember(team_id, username);
	}

	public void deleteTeam(int team_id) {
		teamDao.deleteTeam(team_id);
	}
  
	public void deleteTeamMember(int team_id, String username) {
		teamDao.deleteTeamMember(team_id, username);
	}

	public void quitTeam(int team_id) {
		teamDao.quitTeam(team_id);
	}

	public Team findTeam(int team_id) {
		return teamDao.findTeam(team_id);
	}
	

	public List<Team> findTeamList(String username) {
		return teamDao.findTeamList(username);
	}

	public List<Member> findTeamMembers(int team_id) {
		return teamDao.findTeamMembers(team_id);
	}

	// PartyService
	public void insertParty(Party party) {
		partyDao.insertParty(party);
	}

	public void deleteParty(int party_id) {
		partyDao.deleteParty(party_id);
	}

	public Party findParty(int party_id) {
		return partyDao.findParty(party_id);
	}

	public List<Party> findPartyList() {
		return partyDao.findPartyList();
	}

	// CommentsService
	public void insertComment(Comments comments) {
		commentsDao.insertComment(comments);
	}

	public void deleteComment(int commentId) {
		commentsDao.deleteComment(commentId);
	}

	public Comments findCommentByCommentId(int commentId) {
		return commentsDao.findCommentByCommentId(commentId);
	}

	public List<Comments> findCommentsByPartyId(int partyId) {
		return commentsDao.findCommentsByPartyId(partyId);
	}

	public List<Comments> findCommentList() {
		return commentsDao.findCommentList();
	}


}