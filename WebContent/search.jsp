<div class="diamond"></div>

<html>
  <body>
  <script type="text/javascript" src="${pageContext.request.contextPath}/searchform.js"></script>
    <div class="diamond"></div>
    <div class="form-wrap">
      <h2 class="mob">Hotel Booking Form</h2>
      <h3 class="mob">Mobile Version</h3>
      <h5 class="mob">view on a desktop for the full experience</h5>
      <form action="/tntplanner/plan" method="POST">
        <div class="location">
          <label for="location">FROM</label><br/>
          <input type="text" name="fromCity" placeholder="New York, NY"/><br/>
          <label for="location2">TO</label><br/>
          <input type="text" name="toCity" placeholder="New York, NY"/><br/>
        </div>
        <div class="dates">
          <div class="arrival">
            <label for="arrival">ARRIVAL</label><br/>
            <input name="fromDate" type="text" onfocus="(this.type='date')" onblur="(this.type='text')" placeholder="10/03/2016"/>
          </div>
          <div class="departure">
            <label for="arrival">DEPARTURE</label><br/>
            <input name="toDate" type="text" onfocus="(this.type='date')" onblur="(this.type='text')" placeholder="05/11/2016"/>
          </div>
        </div>
        		<input type = "submit" value = "Submit" />      <div class="linkbox">
        
      </form>

      </div>
    </div>
  </body>
</html>