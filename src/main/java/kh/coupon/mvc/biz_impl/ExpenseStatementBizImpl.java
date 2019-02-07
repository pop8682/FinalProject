package kh.coupon.mvc.biz_impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kh.coupon.mvc.biz.ExpenseStatementBiz;
import kh.coupon.mvc.dao.ExpenseStatementDao;
import kh.coupon.mvc.dto.Coupon_historyDto;

@Service
public class ExpenseStatementBizImpl implements ExpenseStatementBiz{

	@Autowired
	private ExpenseStatementDao expenseStatementDao;

	@Override
	public List<Coupon_historyDto> monthlyExpenseStatement(int member_no, String year, String month) {
		// TODO Auto-generated method stub
		System.out.println("***Biz에 있는  member_no : " + member_no + " year : "+ year + " month : " + month );
		
		return expenseStatementDao.monthlyExpenseStatement(member_no, year, month);
	}

	
	
	

}
