<html>
   <head>
      <title>Traveler</title>
   </head>
   
   <body>
      <center>
      <h1>Using GET Method to Read Form Data</h1>
      
      <ul>
         <li><p><b>First Name:First Name:</b>
            <%= request.getAttribute("result")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getAttribute("result")%>
         </p></li>
      </ul>
   
   </body>
</html>