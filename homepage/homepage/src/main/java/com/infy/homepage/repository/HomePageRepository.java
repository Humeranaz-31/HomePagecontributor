package com.infy.homepage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface HomePageRepository extends JpaRepository<ContributorName, String>  {
	ContributorName findByContributor(String Contributor );
	ContributorName deleteByContributor(String Contributor );
	
}