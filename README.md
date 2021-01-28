# quarkus-cucumber

Hi, I created this little project to try to find a better way to play with Quarkus and CucumberTest.

The principal problem that we have is: 

"CucumberTest being a test framework integrates with the JUnit Platform rather then JUnit Jupiter. Together these two components are part of JUnit 5.Extensions are part of Jupiter. Not the JUnit Platform."
mpkorstanje in the cucumber-jvm slack

I created 3 branches:

- Spring: only if you want to look others implementations.

- Quarkus: This is a working example using the workaround from @tisoft. In this case, the class uses @QuarkusTest to start quarkus and after that it creates the test. The problem is:
"Well I think the problem is that none of these are part of the public API.So it's prone to breaking if/when Cucumbers internals change." mpkorstanje in the cucumber-jvm slack

- Quarkus-target: I think that this one is our target. Run the test in the cucumber way, only providing a ObjectFactory for the injections when we need it. I created the files and the configuration for cucumber. The test not work because i dont know how to start Quarkus.


Thank you for your collaboration

