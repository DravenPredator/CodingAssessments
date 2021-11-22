#Question 2

You are modifying a human resources application (see [Employee Class](./QuestionTwoOfAssessment-Original%20Employee.jpg)).

Currently, everyone is an Employee and some of those are Managers, which is determined by calling the isManager() method. 
The company has now started hiring part-time employees, so the system must be modified to keep track of them.

Create a new implementation of the Employee class which provides the flexibility required to support 
the new part-time employee notion.  You are free to refactor this class as required and add additional
classes if needed.

###Solution
Assuming all other classes can accept different pay scales and weekly hour allotments, the only modification currently
require for the Employee class would be to add a new flag that is similar to the `managerFlag` called `fullTimeFlag`.  
With the appropriate method to retrieve the value for this flag.  We are also allowing the part-time employee to then be
promoted to full time with an additional method.

Please review the [new Employee Class](./QuestionTwoOfAssessment-Solution.jpg).
