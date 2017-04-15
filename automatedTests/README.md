#**Automation Testing Photo Language Translation**
This repository contains all the code for Systers Photo Language Translation application's automation testing framework using Selenium and Maven as the build tool.  Travis CI is used to build and test this project.

##**Tools Used**
* Java
* JUnit
* Eclipse IDE
* Maven
* Travis CI
* Sauce Connect

##**Installing PLT**
1. Install Rails 4.2.1, Ruby 2.2.0p0, and PostgreSQL (here is a great link for help https://gorails.com/setup/ubuntu/14.04)
2. Clone the PLT repo (git clone https://github.com/systers/language-translation)
3. cd language-translation
4. gem install bundler
5. bundle install
6. apt-get install graphviz
7. apt-get install npm && apt-get install nodejs
8. Create a database.yml file in config/, there's a dummy you can use, just change what is set as host to local host, set the username to the user and password.
9. sudo su - postgres (you need to be this user to make any other usersor change password)
10. Change password for postgres user or create a new user.
11. npm install -g bower
12. rake db:create && rake db:migrate && rake db:seed
13. bower install
14. rails s
15. Enter localhost:3000 on a web browser

Check out a demo - https://www.youtube.com/watch?v=TZ5zJgytNCw

For more information, check out the full documentation - https://docs.google.com/document/d/1QXlycV24xGfdp1PV735F09dDEDsXUK-ALtefQp7YFG4/edit?usp=sharing
