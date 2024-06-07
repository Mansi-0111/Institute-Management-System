
<!-- <div class="col-lg-5 col-md-12 mb-5" style="margin-top:-335px;margin-left: 710px;">
                    <div class="card border-0">
                        <div class="card-header bg-light text-center p-4" style="width: 525px;height: 55px;">
                            <h4 style="margin-top: -10px;">Contact us for any query</h4>
                        </div>
                        <div class="card-body rounded-bottom bg-primary p-5" style="width: 525px;"> 
                            <form action="Inquiry" method="POST">
                                <div class="form-group">
                                    <input type="text" class="form-control border-0 p-4" name="inquiryname" placeholder="Your name" required="required" />
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control border-0 p-4" name="inquiryadd" placeholder="Your address" required="required" />
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control border-0 p-4" name="inquirymail" placeholder="Your email" required="required" />
                                </div>
                                 <div class="control-group">
                                <textarea class="form-control border-0 py-3 px-4" rows="5" id="message" name="inquiryquery" placeholder="Message" required="required" data-validation-required-message="Please enter your message"></textarea>
                                <p class="help-block text-danger"></p>
                            </div>
                                <div>
                                    <button class="btn btn-dark btn-block border-0 py-3" type="submit">Send message</button>
                                </div>
                            </form>
                         </div>
                    </div>
                </div>	 
                 -->
                
                
<%@include file="Header.jsp"%>

<div class="container-fluid page-header" style="margin-bottom: 90px;height:250px;">
        <div class="container">
            <div class="d-flex flex-column justify-content-center" style="min-height: 300px">
                <h3 class="display-4 text-white text-uppercase">Contact us</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="index.jsp">Home</a></p>
                    <i class="fa fa-angle-double-right pt-1 px-3"></i>
                    <p class="m-0 text-uppercase">Contact</p>
                </div>
            </div>
        </div>
    </div>
    

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<section id="main-content" style="padding-left: 20%;margin-bottom: -5%;">
				<div class="row" style=" padding-left:199px;">
					<div class="col-lg-8">
						<div class="card"  style=" border-radius: 8px;color:black;margin-top: -42px;border-radius:6px; height: 720px;margin-left: -9px;width: 600px;">
							<div class="card-body" style="background-color: #F2F1F8;border-radius:6px;padding: 30px;">
								
	<form action="Inquiry" method="post" autocomplete="off">
		<div style="padding-left: 18px;">
		
		<div class="text-center mb-5">
                <h3 class="text-uppercase mb-3 " style="letter-spacing: 2px; color:#44425A;!important;">Contact us for any query</h3>
            </div>
		<div class="form-group"><label>Name</label>
                                    <input type="text" class="form-control border-0 p-4" name="inquiryname" placeholder="Your name" required="required" />
                                </div>
                               <label>Address</label> 
                                <div class="form-group">
                                    <input type="text" class="form-control border-0 p-4" name="inquiryadd" placeholder="Your address" required="required" />
                                </div>
                                <label>Email</label>
                                <div class="form-group">
                                    <input type="email" class="form-control border-0 p-4" name="inquirymail" placeholder="Your email" required="required" />
                                </div>
                                <label>Write your query</label>
                                 <div class="control-group">
                                <textarea class="form-control border-0 py-3 px-4" rows="5" id="message" name="inquiryquery" placeholder="Message" required="required" data-validation-required-message="Please enter your message"></textarea>
                                <p class="help-block text-danger"></p>
                            </div>
                                <div  style="padding-left: 183px;padding-top: 10px;";>
                                    <button class="btn btn-primary  py-3" type="submit">Send message</button>
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

                