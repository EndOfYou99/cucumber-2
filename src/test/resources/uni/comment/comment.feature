Feature: Post comment

			  Scenario Outline: Post comment
			    Given User open post
	        When Open comment entry field
			    And User "<user>" write: "<comment>"
			    And Click add comment button 
			    Then See: "<message>"
			    
			    Examples:
			    |user 		|comment	 																	|message					|
			    |emmy		  |Nice work!                                 |Success!					|
			    |emmy  		|																						|Empty comment!   |					
			    |		      |Nice work!                                 |Pleas login!     |					
