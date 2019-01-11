# embedded-tomcat-rest-example
A simple example of a REST API with Jersey on an embedded Tomcat

Run `rest.Application` to start a server on `http://localhost:8080/api/v1`
There is only one resource provided at `/examples` for demonstration purposes

## Currently available endpoints
### GET @ `http://localhost:8080/api/v1/examples`
Returns a JSON array of Examples

### GET @ `http://localhost:8080/api/v1/examples/{id}`
Returns a single JSON Example by its id

### PUT @ `http://localhost:8080/api/v1/examples/{id}`
Updates a single JSON Example by its id. Requires an Example JSON in request body as follows:
>{"id":"4","title":"Example 4"}

### DELETE @ `http://localhost:8080/api/v1/examples/{id}`
Deletes an Example by id

### POST @ `http://localhost:8080/api/v1/examples/post`
Creates a new JSON Example. Requires an Example JSON in request body as follows:
>{"id":"4","title":"Example 4"}