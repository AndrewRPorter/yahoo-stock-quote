package com.aporter.main;

/**
 * This class acts as a container to store stock information
 * such as price, dayLow, dayHigh, etc. It also contains a method
 * that prints out all the information in an easy to read format.
 * 
 * @author Andrew
 *
 */
public class Stock {
	
	private String ticker, price, dayLow, dayHigh, dividend, yield, yearLow, yearHigh,
	fifty_day_avg, two_hundred_day_avg, marketCap, priceBook, EPS, EBITDA, pe, volume,
	avgDailyVolume, exchange;
	
	public Stock( String ticker ) {
		this.ticker = ticker;
	}
	
	public String getTicker() {
		return ticker;
	}
	
	public void setPrice( String price ) {
		this.price = price;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setDayLow( String dayLow ) {
		this.dayLow = dayLow;
	}
	
	public String getDayLow() {
		return dayLow;
	}

	public void setDayHigh( String dayHigh ) {
		this.dayHigh = dayHigh;
	}
	
	public String getDayHigh() {
		return dayHigh;
	}
	
	public void setDividend( String dividend ) {
		this.dividend = dividend;
	}
	
	public String getDividend() {
		return dividend;
	}
	
	public void setYield( String yield ) {
		this.yield = yield;
	}
	
	public String getYield() {
		return yield;
	}
	
	public void setYearLow( String yearLow ) {
		this.yearLow = yearLow;
	}
	
	public String getYearLow() {
		return yearLow;
	}
	
	public void setYearHigh( String yearHigh ) {
		this.yearHigh = yearHigh;
	}
	
	public String getYearHigh() {
		return yearHigh;
	}
	
	public void setFiftyDayAvg( String fifty_day_avg ) {
		this.fifty_day_avg = fifty_day_avg;
	}
	
	public String getFiftyDayAvg() {
		return fifty_day_avg;
	}
	
	public void setTwoHundredDayAvg( String two_hundred_day_avg ) {
		this.two_hundred_day_avg = two_hundred_day_avg;
	}
	
	public String getTwoHundredDayAvg() {
		return two_hundred_day_avg;
	}
	
	public void setMarketCap( String marketCap ) {
		this.marketCap = marketCap;
	}
	
	public String getMarketCap() {
		return marketCap;
	}
	
	public void setPriceBook( String priceBook ) {
		this.priceBook = priceBook;
	}
	
	public String getPriceBook() {
		return priceBook;
	}
	
	public void setEPS( String EPS ) {
		this.EPS = EPS;
	}
	
	public String getEPS() {
		return EPS;
	}
	
	public void setEBITDA( String EBITDA ) {
		this.EBITDA = EBITDA;
	}
	
	public String getEBITDA() {
		return EBITDA;
	}
	
	public void setPE( String pe ) {
		this.pe = pe;
	}
	
	public String getPE() {
		return pe;
	}
	
	public void setVolume( String volume ) {
		this.volume = volume;
	}
	
	public String getVolume() {
		return volume;
	}
	
	public void setAvgDailyVolume( String avgDailyVolume ) {
		this.avgDailyVolume = avgDailyVolume;
	}
	
	public String getAvgDailyVolume() {
		return avgDailyVolume;
	}
	
	public void setExchange( String exchange ) {
		this.exchange = exchange;
	}
	
	public String getExchange() {
		return exchange;
	}
}
