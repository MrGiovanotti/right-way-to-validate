# right-way-to-validate
Example about how to correctly make validations with spring boot

This is an example about how to correctly validate springboot applications.

This a simple application which simulates sending a message. The validation here is not made
in the controllers, since controllers should only take the job of handling HTTP requests.

Validation is made in a "validators" package, using annotations such as @RestControllerAdvice,
@ExceptionHandler.

This class which is in charge of validating, is called by services, which is the place where
validations should be done instead the controllers.
