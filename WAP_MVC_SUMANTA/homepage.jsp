<%@ page import= "java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<HTML>
      <HEAD>
           <TITLE>Login</TITLE>
      </HEAD>
      <BODY>

             <h1>Welcome 
             <c:set var="user" value="${sessionScope.User}"/>
             <c:out value="${user}"/>
             </h1>
             <a href="login.html">Log Out</a>

             <c:forEach items="${messages}" var="mapEntry">
             <c:set var="keyStr" value="${mapEntry.key}"/>
             <c:set var="index" value="${fn:indexOf(keyStr,'#')}"/>
             <c:set var="name" value="${fn:substring(keyStr,0,index)}"/>
             <c:set var="length" value="${fn:length(keyStr)}"/>
             <c:set var="date" value="${fn:substring(keyStr,index+1,length)}"/>
             <c:set var="message" value="${mapEntry.value}"/>

             <form style="border:solid 2px blue; width:800px" METHOD=POST action="/WAP_MVC_SUMANTA/US">

                 <font color=GREY><c:out value="${name}"/>				
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;				
                 <c:out value="${date}"/>
                 </font>

                 </br>
                 <c:out value="${message}"/>
                 <INPUT TYPE=HIDDEN NAME=id VALUE="<c:out value='${keyStr}'/>">
                 <INPUT TYPE=SUBMIT NAME=cmdSubmit VALUE=Delete>
             </form>

             </br>

             </c:forEach>


             <BR><BR>
             <FORM style="border:solid 2px green; width:800px" METHOD=POST action="/WAP_MVC_SUMANTA/US">

                 <B>what's in your mind:</B>
                 <BR>
                 <INPUT TYPE=TEXT NAME=comment>
                 <INPUT TYPE=SUBMIT NAME=cmdSubmit VALUE=Post></TD>

             </FORM>

      </BODY>
</HTML>
