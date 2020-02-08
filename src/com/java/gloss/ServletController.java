
package com.java.gloss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private TradeMethods trade;
	private InstrumentMethods instrument;
	private TradeReportingMethods tradeReporting;

	public ServletController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		trade = new TradeMethods();
		instrument = new InstrumentMethods();
		tradeReporting=new TradeReportingMethods();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String option = request.getParameter("command");
		
		if (option == null) {
			option = "Welcome";
		}
		try {
			switch (option) {
			case "TradeCapture":
				tradeCapture(request, response);
				break;
			case "InstrumentCapture":
				instrumentCapture(request, response);
				break;
			case "TradeEnquiry":
				tradeEnquiry(request, response);
				break;
			case "Welcome":
				welcomePage(request, response);
				break;

			default:
				welcomePage(request, response);
				break;
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

	private void tradeEnquiry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ref=Integer.parseInt(request.getParameter("tradeReference"));
		TradeDetails trade=tradeReporting.searchTrade(ref);
		request.setAttribute("TradeEnquiry", trade);
		RequestDispatcher dispacther = request.getRequestDispatcher("/ViewTradeEnquiry.jsp");
		dispacther.forward(request, response);
		
	}

	private void instrumentCapture(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String instrName = request.getParameter("InstrumentName");
		String instrReference = request.getParameter("InstrumentRef");
		String market = request.getParameter("market");

		instrument.addInstrument(instrName, instrReference, market);
		response.sendRedirect(request.getContextPath() + "/ServletController");
		 
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void welcomePage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WelcomePage.jsp");
		dispatcher.forward(request, response);
	}

	private void tradeCapture(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String company = request.getParameter("company");
		String instrument = request.getParameter("instrument");
		String party = request.getParameter("party");
		int price = Integer.parseInt(request.getParameter("price"));
		String market = request.getParameter("market");
		int quantity = Integer.parseInt(request.getParameter("quantity"));

		trade.addTradeDetails(company, instrument, party, price, market, quantity);
		response.sendRedirect(request.getContextPath() + "/ServletController");

	}
}
