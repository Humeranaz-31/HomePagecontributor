package com.infy.homepage.dto;

public class HomePageDTO {
	 String storyTitle;
	 String contributorName;
	 String dateSubmitted;

	public String getStroyTitle() {
		return storyTitle;
	}
	public void setStroyTitle(String stroyTitle) {
		this.storyTitle = stroyTitle;
	}
	public String getContributorName() {
		return contributorName;
	}
	public void setContributorName(String contributorName) {
		this.contributorName = contributorName;
	}
	public String getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	@Override
	public String toString()  {
		return "HomePageDTO  [storyTitle=" + storyTitle + ",contributorName "+ contributorName + ", dateSubmitted="+ dateSubmitted +"]";
	}
	
	
}
