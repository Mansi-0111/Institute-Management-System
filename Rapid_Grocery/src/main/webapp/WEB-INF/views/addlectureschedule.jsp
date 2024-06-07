<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>
<style>
	.btn{
		background-color: #ff9c5d;
    	border-radius: 0;
    	border: #007bff;
    	color: white;
	}
</style>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>Lecture-Schedule Form</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home </a></li>
						<li class="breadcrumb-item active">Lecture-Schedule Form</li>
					</ol>
				</div>
			</div>
		</div>
		<!-- /.container-fluid -->
	</section>



	<section class="content">
		<div class="container-fluid">
			<div class="row">
				<!-- left column -->
				<div class="col-md-6" style="margin-left: 160px;">
					<!-- general form elements -->
					<div class="card card-primary" style="border-radius:0;width:700px;">
						<div class="card-header" style="border-radius:0;background-color: #ff9d5c;">
							<h3 class="card-title">Lecture-Schedule</h3>
						</div>
		<form:form  method="get" action="savelectureschedule" modelAttribute="lectureschedule">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>


	<div class="container mt-4">
		<div class="dropdown semester">
			<button class="btn btn-secondary dropdown-toggle" type="button"
				id="dropdownMenuButton1" data-bs-toggle="dropdown"
				aria-expanded="false">Subject</button>
			<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
				<li class="btn1"><a class="dropdown-item" href="#">Programming</a></li>
				<li class="btn2"><a class="dropdown-item" href="#">Web</a></li>
				<li class="btn3"><a class="dropdown-item" href="#">Graphic</a></li>
			</ul>
		</div>
	</div>


	<div class="main row mt-4 container"></div>




	<script >

        $(document).ready(function () {

            $('.btn1').click(function () {

                $('.main').append(`
        <div class="dropdown col-3 mt-4 mb-4">
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
                <option selected>Select Course</option>
                <option value="C & C++">C & C++</option>
                <option value="Java">Java</option>
                <option value="Advance java">Advance java</option>
                <option value="PHP">PHP</option>
                <option value="Python">Python</option>
                <option value="Android">Android</option>
                <option value="iOs">iOS</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
	            <option selected>Select Course</option>
	            <option value="C & C++">C & C++</option>
                <option value="Java">Java</option>
                <option value="Advance java">Advance java</option>
                <option value="PHP">PHP</option>
                <option value="Python">Python</option>
                <option value="Android">Android</option>
                <option value="iOs">iOS</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
	            <option selected>Select Course</option>
	            <option value="C & C++">C & C++</option>
                <option value="Java">Java</option>
                <option value="Advance java">Advance java</option>
                <option value="PHP">PHP</option>
                <option value="Python">Python</option>
                <option value="Android">Android</option>
                <option value="iOs">iOS</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
	            <option selected>Select Course</option>
	            <option value="C & C++">C & C++</option>
                <option value="Java">Java</option>
                <option value="Advance java">Advance java</option>
                <option value="PHP">PHP</option>
                <option value="Python">Python</option>
                <option value="Android">Android</option>
                <option value="iOs">iOS</option>
            </select>
        </div>

        <div class="col-3 mt-4 date123" >
            <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
        </div>

        <div class="dropdown col-2 mt-4">
        <div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>

            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                
            <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>


            </select>

		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>

            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>


            </select>
          </div>
        </div>

        <div class="dropdown col-2 mt-4">
        <div>
            <select class="form-select mb-4 " name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>

            </select>
           </div>
           <div>
            <select class="form-select mb-4 " name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>
            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>
            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>
            </select>
           </div>
          	<br>
          	<center>
            <button type="submit" id="submit" class="btn btn-warning btn-lg ms-2">Save</button>
			</center>
        </div>`);

            });

            
            $('.btn2').click(function () {

                $('.main').append(`
        <div class="dropdown col-3 mt-4 mb-4">
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
                <option selected>Select Course</option>
                <option value="JQuery">JQuery</option>
                <option value="Html/css/js">Html/css/js</option>
                <option value="node.JS">node.JS</option>
                <option value="angular.JS">angular.JS</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
	            <option selected>Select Course</option>
                <option value="JQuery">JQuery</option>
                <option value="Html/css/js">Html/css/js</option>
                <option value="node.JS">node.JS</option>
                <option value="angular.JS">angular.JS</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
	            <option selected>Select Course</option>
                <option value="JQuery">JQuery</option>
                <option value="Html/css/js">Html/css/js</option>
                <option value="node.JS">node.JS</option>
                <option value="angular.JS">angular.JS</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
            <option selected>Select Course</option>
            <option value="JQuery">JQuery</option>
            <option value="Html/css/js">Html/css/js</option>
            <option value="node.JS">node.JS</option>
            <option value="angular.JS">angular.JS</option>
            </select>
        </div>

        <div class="col-3 mt-4 date123" >
            <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
        </div>

        <div class="dropdown col-2 mt-4">
        <div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="14:00">14:00</option>

            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                
            <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>


            </select>

		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>

            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>


            </select>
          </div>
        </div>

        <div class="dropdown col-2 mt-4">
        <div>
            <select class="form-select mb-4 " name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>

            </select>
           </div>
           <div>
            <select class="form-select mb-4 " name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>

            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>

            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>
            </select>
           </div>
          	<br>
          	<center>
            <button type="submit" id="submit" class="btn btn-warning btn-lg ms-2">Save</button>
			</center>
        </div>`);

            });

            
            
            $('.btn3').click(function () {

                $('.main').append(`
        <div class="dropdown col-3 mt-4 mb-4">
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
                <option selected>Select Course</option>
                <option value="Photoshop">Photoshop</option>
                <option value="Figma">Figma</option>
                <option value="illustrator">illustrator</option>
                <option value="Corel DRAW">Corel DRAW</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
	            <option selected>Select Course</option>
	            <option value="Photoshop">Photoshop</option>
                <option value="Figma">Figma</option>
                <option value="illustrator">illustrator</option>
                <option value="Corel DRAW">Corel DRAW</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
	            <option selected>Select Course</option>
	            <option value="Photoshop">Photoshop</option>
                <option value="Figma">Figma</option>
                <option value="illustrator">illustrator</option>
                <option value="Corel DRAW">Corel DRAW</option>
            </select>
            <select class="form-select mb-4" name="subject" aria-label="Default select example">
	            <option selected>Select Course</option>
	            <option value="Photoshop">Photoshop</option>
                <option value="Figma">Figma</option>
                <option value="illustrator">illustrator</option>
                <option value="Corel DRAW">Corel DRAW</option>
            </select>
        </div>

        <div class="col-3 mt-4 date123" >
            <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
                <input class="btn btn-light maindate mb-4" name="scheduleDate" onchange="aaa()" type="date" id="" value="Date"
                aria-expanded="false">
        </div>

        <div class="dropdown col-2 mt-4">
        <div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                
            <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>


            </select>

		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>

            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="startTime" aria-label="Default select example">
                <option selected>From</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
            </select>
          </div>
        </div>

        <div class="dropdown col-2 mt-4">
        <div>
            <select class="form-select mb-4 " name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>
            </select>
           </div>
           <div>
            <select class="form-select mb-4 " name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>
            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>
            </select>
		</div>
		<div>
            <select class="form-select mb-4" name="toTime" aria-label="Default select example">
                <option selected>To</option>
                <option value="10:00">10:00</option>
                <option value="11:00">11:00</option>
                <option value="12:00">12:00</option>
                <option value="13:00">13:00</option>
                <option value="14:00">14:00</option>
                <option value="15:00">15:00</option>
                <option value="16:00">16:00</option>
            </select>
           </div>
          	<br>
          	<center>
            <button type="submit" id="submit" class="btn btn-warning btn-lg ms-2">Save</button>
			</center>
        </div>`);

            });





        });

        function selectdate() {


            $('.maindate').val($('.maindate').val());



        }

        function aaa() {

            console.log($('.maindate').val());

            if ($('.maindate').val() != null) {

                var cln = $('.date123').html();

                // $('.date123').append(`${cln} ${cln} ${cln}`);

                selectdate();

            }

        }

    </script>




	


	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
	
</form:form>
		</div>
				</div>
			</div>
		</div>
	</section>
</div>
		
  <%@ include file="footer.jsp"%>