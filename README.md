# MicroservicesConnection
# Kubernetes connection

Used Feign client to establish connection between OrderService and UserService.
OrderService calls UserService to get User object based on userId.
These two services are running on 9080 and 9081 port simultaneosly in local.

To use feign client, make an interface in OrderService for calling UserService microservice.
Annotate that interface with annotation @FeignClient.
Make a method like @GetMapping or @PostMapping similar to what you have in UserService Controller.
Autowrie this interface in your service layer and simply use it to make your api call to UserService microservice.

Note : The implentation of the method declared in interface is implemented internally by Spring.
