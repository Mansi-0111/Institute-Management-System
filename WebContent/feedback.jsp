<%@include file="Header.jsp"%>



<div class="container-fluid page-header" style="margin-bottom: 90px;height:250px;">
        <div class="container">
            <div class="d-flex flex-column justify-content-center" style="min-height: 300px">
                <h3 class="display-4 text-white text-uppercase">Feedback</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="index.jsp">Home</a></p>
                    <i class="fa fa-angle-double-right pt-1 px-3"></i>
                    <p class="m-0 text-uppercase">Feedback</p>
                </div>
            </div>
        </div>
    </div>
    

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<section id="main-content" style="padding-left: 20%;margin-bottom: -5%;">
				<div class="row" style=" padding-left:199px;">
					<div class="col-lg-8">
						<div class="card"  style=" border-radius: 8px;color:black;margin-top: -42px;border-radius:6px; height: 495px;margin-left: -61px;width: 600px;">
							<div class="card-body" style="background-color: #F2F1F8;border-radius:6px;padding: 30px;">
								
	<form action="Feedback" method="post" autocomplete="off">
		<div style="padding-left: 18px;">
		
		<div class="text-center mb-5">
                <h3 class="text-uppercase mb-3 " style="letter-spacing: 2px; color:#44425A;!important;">Give your opinion!</h3>
            </div>
		<div class="form-group">
		<label>Email</label> 
		<input type="email" class="form-control" name="feedbackemail" placeholder="Email" style="border-radius: 6px; height: 48px;width: 533px;margin-left: -12px;padding: 24px; box-sizing: border-box;border: 0;">
		</div>
		
		<div class="form-group">
		<label>Your Rate:</label> 
		<div style="margin-top: -33px;">
		<input type="radio"  name="feedbackrate" value="Excellent" style="margin-left: 84px; "> Excellent<br>
		<input type="radio" name="feedbackrate" value="Vary Good" style="margin-left: 84px;"> Vary Good<br>
		<input type="radio" name="feedbackrate" value="Good" style="margin-left: 84px;"> Good<br>
		<input type="radio" name="feedbackrate" value="Bad" style="margin-left: 84px;"> Bad<br></div>
		</div>
		
		<div class="form-group">
		<label>Message</label> 
		<input type="text" class="form-control" name="description" placeholder="message" style="border-radius: 6px; height: 48px;margin-left: -12px;width: 533px;padding: 24px; box-sizing: border-box;border: 0;">
		</div>
		
		
			</div>
		    <div style="padding-left: 183px;padding-top: 10px;";>
			<button type="submit" class="btn btn-primary" style="width: 76px;">Save</button>
			<button type="button" class="btn btn-primary">Cancel</button>
		</div>
	</form>
	
							</div>
						</div>
					</div>
				</div>
			</section>

<div style="margin-top: 125px;">
<%@include file="Footer.jsp"%>
</div>

