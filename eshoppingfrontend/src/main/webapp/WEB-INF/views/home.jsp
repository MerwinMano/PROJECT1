<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file ="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Online shopping</title>
</head>
<body>

<center>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img class="first-slide home-image" src="resources/images/IMAGE1`.jpg" alt="first slide" >
                    <div class="container">
                        <div class="carousel-caption">
                            <h1></h1>
                            <p></p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="second-slide home-image" src="resources/images/IMAGE2.jpg" alt="Second slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1></h1>
                            <p></p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="third-slide home-image " src="resources/images/IMAGE33.jpg" alt="Third slide"height="2000px" width="1500px">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1></h1>
                            <p></p>
                        </div>
                    </div>
                </div>
                 <div class="item">
                    <img class="forth-slide home-image " src="resources/images/IMAGE4.jpg" alt="forth slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1></h1>
                            <p></p>
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" ></span>
                <span class="sr-only">Next</span>
            </a>
        </div><!-- /.carousel -->        
        
        
        
        
        <div class="col">
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="">
      <div class="caption">
          <p>Explore Products</p>
        </div>
        <img src="resources/images/VIVO.jpg" alt="logo1" height="600px" width="600px">
       </a>
    </div>
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="">
      <div class="caption">
          <p>fLAT 5% Offer</p>
        </div>
        <img src="resources/images/IMAGE1.jpg" alt="logo2" height="500px" width="500px">
        
      </a>
    </div>
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="">
       <div class="caption">
          <p>Buy with Us</p>
        </div>
        <img src="resources/images/IMAGE5.jpg" alt="logo3" height="500px" width="500px" >
       
      </a>
    </div>
  </div>
</div>
         
</center>
<%@ include file ="footer.jsp"%>
</body>
</html>