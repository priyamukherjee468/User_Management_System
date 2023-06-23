#### User Management System
_______


### Requirements
* IntellijIDEA
* ServerPort: 8080(localhost:8080)
* JavaVersion: 17
* pom.xml file(no need to download external library)
* Dependencies used:lombok,Spring web

### Data Flow
Function used in
1. Controller: the final destination point that a web request can reach.
2. Repository: used for get userList.
3. Services: created method for four operations like get,add,delete,update.
4. User: user had following attributes

* User Id
* User Name
* User Phone no
* User Address

Data Structure Used: HashMap,List
  ### Project Summary
1. I have used Spring web and lombok dependencies to create this project.
2. i used four operations-

 * Add User : In AddUser functionality we Post User info through Postman & it gets added to the User list.
 * Get a user info user id: In this functionality we provide a particular User info by sending the userid in url through @Pathvariable.
 * Get all User Info : we get all user info through postman.
 * Update User Info by UserId: This functionality Updates a particular User info through Postman by sending userid.
 * Delete User Info by UserId: This functionality deletes particular User info through Postman using the Delete method by sending the user-id in URL.

