Feature: Delete theme

			  Scenario Outline: Delete Theme
			    Given User open posts
	        When Admin open: "<role>" click theme delete button
			    
			    Examples:
			    |role 		|message								                                     |
			    |admin   	|Successful delete!		                                       |
			    |user     |Unsuccessful delete! You have no rights for this action!    |										
			  
