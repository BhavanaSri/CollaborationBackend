app.factory('Userservice',function($http)
{
	
	var  BASSE_URL="http://localhost:8081/collabBack";
	
    var userService={}
    
    userService.registerUser = function(user){
    	
    	console.log("hjh")
    	return $http.post(BASSE_URL +"/registration",user)
    }
    
    userService.login=function(user){
    	return $http.post(BASSE_URL +"/login",user)
    }
 


userService.logout=function(user){
	return $http.get(BASSE_URL +"/logout",user)

}
/*
userService.login=function(user){
	return $http.post(BASSE_URL +"/home",user)
}*/

    
return userservice;
})