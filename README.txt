1.Please put the WAP_MVC_SUMANTA folder into tomcat's webapps folder.

2.From the scripts folder run the two batch files. In the "build.bat" change 
the specified path if required as I have used a 64 bit OS.The sample tables 
are created in derby by "create_sample_db.bat". The sql scripts are separately 
written in the sql "scripts.txt" file.

3.provide the suitable entry's in the file .\WAP_MVC_SUMANTA\WEB-INF\classes\DAO\Configuration.java. 
bd_source contains the database details in a BasicDataSource class. tomcat-dbcp.jar might be needed
to be included in CLASSPATH."login_table" and "message_table" are the tablenames for storing 
"Users(varchar,varchar)" and "Comments(Varchar,varchar,varchar)".

4..\WAP_MVC_SUMANTA\WEB-INF\lib is the derby's lib folder with all it's contents and jstl-1.2.jar.
this may nedd to be changed if version differs.

5.To start the application after running tomcat in brosers URL bar write 
http://127.0.0.1:8080:WAP_MVC_SUMANTA/login.html




If some problem occurs or some modification is needed kindly make me know.
----------------------------------------------------------------------------------
Sumanta Bhattacharjee
B.E. I.T.
Jadavpur University
Kolkata, India
email:sumanta1190@gmail.com