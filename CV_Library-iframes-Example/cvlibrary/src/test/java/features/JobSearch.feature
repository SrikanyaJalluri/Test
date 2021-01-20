# new feature
# Tags: optional
@srikanya
Feature: Job Search

  Scenario Outline: Check the advanced search happy Path
    Given User as jobseeker opens the url "<URL>"
    And   JobSeeker is on landing page and open advance search
    When  He search for a job with following details "<JobTitle>", "<Location>", "<Distance>", "<SalaryMin>","<SalaryMax>","<Salarytype>","<Jobtype>"
    And   Search for the jobs
    Then  He should receive the matching jobs

    Examples:
      |         URL                    |     JobTitle     | Location | Distance       | SalaryMin | SalaryMax | Salarytype | Jobtype |
      | https://www.cv-library.co.uk/  | Automation Tester| Slough   | up to 10 miles | 20000     | 40000     | Per annum  | Permanent  |



