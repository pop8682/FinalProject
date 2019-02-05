package kh.coupon.mvc.dto;

import java.util.Date;

public class CouponHistoryDto {

	/*coupon_history_no, 
	member_no, member_name, 
	client_no, client_name, 
	menu_no,menu_title, 
	coupon_history_quantity, 
	coupon_history_cost, 
	coupon_history_date */
	
	private int coupon_history_no; //쿠폰 구매,판매 내역의 고유번호
	private int member_no; //유저 고유번호(누가 삿는지 판단)
	private int client_no; //해당 쿠폰의 제휴업체 고유번호
	private int menu_no; //해당 제휴업체의 메뉴번호
	
	//유저 정보
	private String member_name; //유저 이름
	
	//업체 정보
	private String client_name; //해당 쿠폰의 제휴업체 명(조인을 피하기 위해 가지고있는다)
	
	//메뉴 정보
	private String menu_title; //해당 제휴업체의 메뉴타이틀
	private int menu_price; //해당 메뉴 가격
	
	//coupon_history 테이블의 기본 정보
	private int coupon_history_quantity; //거래(판매,구매) 수량
	private Date coupon_history_date; //거래(판매,구매) 내역 날짜
	private int coupon_history_cost; //거래(판매,구매)비용
	private String coupon_history_info; //거래정보(판매&구매판단 컬럼)
	
	
	public CouponHistoryDto() {
		super();
	}


	public CouponHistoryDto(int coupon_history_no, int member_no, int client_no, int menu_no, String member_name,
			String client_name, String menu_title, int menu_price, int coupon_history_quantity,
			Date coupon_history_date, int coupon_history_cost, String coupon_history_info) {
		super();
		this.coupon_history_no = coupon_history_no;
		this.member_no = member_no;
		this.client_no = client_no;
		this.menu_no = menu_no;
		this.member_name = member_name;
		this.client_name = client_name;
		this.menu_title = menu_title;
		this.menu_price = menu_price;
		this.coupon_history_quantity = coupon_history_quantity;
		this.coupon_history_date = coupon_history_date;
		this.coupon_history_cost = coupon_history_cost;
		this.coupon_history_info = coupon_history_info;
	}


	public int getCoupon_history_no() {
		return coupon_history_no;
	}


	public void setCoupon_history_no(int coupon_history_no) {
		this.coupon_history_no = coupon_history_no;
	}


	public int getMember_no() {
		return member_no;
	}


	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}


	public int getClient_no() {
		return client_no;
	}


	public void setClient_no(int client_no) {
		this.client_no = client_no;
	}


	public int getMenu_no() {
		return menu_no;
	}


	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}


	public String getMember_name() {
		return member_name;
	}


	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}


	public String getClient_name() {
		return client_name;
	}


	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}


	public String getMenu_title() {
		return menu_title;
	}


	public void setMenu_title(String menu_title) {
		this.menu_title = menu_title;
	}


	public int getMenu_price() {
		return menu_price;
	}


	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}


	public int getCoupon_history_quantity() {
		return coupon_history_quantity;
	}


	public void setCoupon_history_quantity(int coupon_history_quantity) {
		this.coupon_history_quantity = coupon_history_quantity;
	}


	public Date getCoupon_history_date() {
		return coupon_history_date;
	}


	public void setCoupon_history_date(Date coupon_history_date) {
		this.coupon_history_date = coupon_history_date;
	}


	public int getCoupon_history_cost() {
		return coupon_history_cost;
	}


	public void setCoupon_history_cost(int coupon_history_cost) {
		this.coupon_history_cost = coupon_history_cost;
	}


	public String getCoupon_history_info() {
		return coupon_history_info;
	}


	public void setCoupon_history_info(String coupon_history_info) {
		this.coupon_history_info = coupon_history_info;
	}


}