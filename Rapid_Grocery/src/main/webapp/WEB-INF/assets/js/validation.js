//<script type="text/javascript">
	function checkdataname(fieldName,val){
		var f = val;
		var errorName = fieldName + "Error";
		if (f == "" || f == null) {
			$("#"+errorName).show();
			$('#'+errorName).text("* This field is required!");
//			$('#fname').css('background-color', 'red');
			$('#sendMessageButton').prop('disabled', true);
			
		} else if (!(f.match('^[a-zA-Z]{3,16}$'))) {
			$("#"+errorName).show();
			$('#'+errorName).text("* only character are allowed !");
			$('#sendMessageButton').prop('disabled', true);
		} else {
		
			$("#"+errorName).hide();
			$('#sendMessageButton').prop('disabled', false);
			
		}
	}
	function checkdataaddress(fieldName,val){
		var f = val;
		var errorName = fieldName + "Error";
		if (f == "" || f == null) {
			$("#"+errorName).show();
			$('#'+errorName).text("* This field is required!");
			
			$('#sendMessageButton').prop('disabled', true);
			
		} else if ((f.length <= 5) || (f.length > 120)) {
			$("#"+errorName).show();
			$('#'+errorName).text("* please enter the address between 5 and 120!");
			$('#sendMessageButton').prop('disabled', true);
		} else {
			$("#"+errorName).hide();
			$('#sendMessageButton').prop('disabled', false);
		}
	}
	function checkdataemail(fieldName,val){
		var f = val;
		var errorName = fieldName + "Error";
		if (f == "" || f == null) {
			$("#"+errorName).show();
			$('#'+errorName).text("* You have to enter your email");
			//$('#fname').css("background-color", "#cd2d00");
			$('#sendMessageButton').prop('disabled', true);
		} else if (f.indexOf('@')<= 0){
			$("#"+errorName).show();
			$('#'+errorName).text("* Invalid position of @");
			$('#sendMessageButton').prop('disabled', true);
		} else if ((f.charAt(f.length - 4)!= '.')&& (f.charAt(f.length - 3) != '.')) {
			$("#"+errorName).show();
			$('#'+errorName).text("* Invalid position of dot(.)");
			$('#sendMessageButton').prop('disabled', true);
		} else {
			$("#"+errorName).hide();
			$('#sendMessageButton').prop('disabled', false);
		}
	}
	function checkdatacontact(fieldName,val){
		var f = val;
		var r = /^[6-9][0-9]{9}$/;
		var errorName = fieldName + "Error";
		if (f == "" || f == null) {
			$(this).css("border-color", "#cd2d00");
			$("#"+errorName).show();
			$('#'+errorName).text("* You have to enter your phone!");
			//$('#fname').css("background-color", "#cd2d00");
			$('#sendMessageButton').prop('disabled', true);
			
		} else if (isNaN(f)){
			$("#"+errorName).show();
			$('#'+errorName).text("* Only number are allowed");
			$('#sendMessageButton').prop('disabled', true);
		} else if ((f.length > 10) || (f.length < 10)) {
			$("#"+errorName).show();
			$('#'+errorName).text("* phone number length must be 10 number");
			$('#sendMessageButton').prop('disabled', true);
		}else if (!r.test(f)) {
			$("#"+errorName).show();
			$('#'+errorName).text("* Please enter currect number between 6 to 9");
			$('#sendMessageButton').prop('disabled', true);
		}  
		else {
			$("#"+errorName).hide();
			$('#sendMessageButton').prop('disabled', false);
		}
	}
	function checkdatapassword(fieldName,val){
		var f = val;
		var errorName = fieldName + "Error";
		if (f == "" || f == null) {
			$("#"+errorName).show();
			$('#'+errorName).text("* You have to enter your password!");
			//$('#fname').css("background-color", "#cd2d00");
			
			$('#sendMessageButton').prop('disabled', true);
			
		} else if (f.length < 8) {
			$("#"+errorName).show();
			$('#'+errorName).text("* password length must be Greater than 8 digit");
			$('#sendMessageButton').prop('disabled', true);
		}else {
			$("#"+errorName).hide();
			$('#sendMessageButton').prop('disabled', false);
		}
	}
	function checkdataconfirm(fieldName,val){
		var p = $("#password").val();
		var f = val;
		var errorName = fieldName + "Error";
		if (f == "" || f == null) {
			$("#"+errorName).show();
			$('#'+errorName).text("* You have to enter confirm password!");
			//$('#fname').css("background-color", "#cd2d00");
			$('#sendMessageButton').prop('disabled', true);
			
		} else if (f.length < 8) {
			$("#"+errorName).show();
			$('#'+errorName).text("* password length must be Greater than 8 digit");
			$('#sendMessageButton').prop('disabled', true);
		}
		else if (p!=f) {
			$("#"+errorName).show();
			$('#'+errorName).text("* password and confirm password not matched");
			$('#sendMessageButton').prop('disabled', true);
		}else {
			$("#"+errorName).hide();
			$('#sendMessageButton').prop('disabled', false);
		}
	}
	
	//</script>





/*
	$(document).ready(function () {
		$('.first_name').on("keyup", function () {
			alert("ashjh");
			var f = $(this).val();
			
			if (f == "" || f == null) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$('#fname').text("* You have to enter your first name !");
				$('#submit').css('background-color', "red");
			} else if ((f.length <= 2) || (f.length > 20)) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$('#fname').text("* Please enter the correct name between 2 to 20 !");
				$('#submit').css('background-color', "red");
			} else if (!($(this).val().match('^[a-zA-Z]{3,16}$'))) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$('#fname').text("* only character are allowed !");
				$('#submit').css('background-color', "red");
			} else {
				$(this).css("border-color", "green");
				$('#submit').attr('disabled', false);
				$('#fname').text("");
				$('#submit').css('background-color', "green");
			}
		})

		$('.last_name').on("keyup", function () {
			var l = $(this).val();

			if (l == "" || l == null) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$('#lname').text("* You have to enter your Last name !");
				$('#submit').css('background-color', "red");
			} else if ((l.length <= 2) || (l.length > 20)) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$('#lname').text("* Please enter the correct name between 2 to 20 !");
				$('#submit').css('background-color', "red");
			} else if (!($(this).val().match('^[a-zA-Z]{3,16}$'))) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$('#lname').text("* only character are allowed !");
				$('#submit').css('background-color', "red");
			} else {
				$(this).css("border-color", "green");
				$('#submit').attr('disabled', false);
				$('#lname').text("");
				$('#submit').css('background-color', "green");
			}
		});

		$('.email').on("keyup", function () {
			var g = $(this).val();
			if (g == "" || g == null) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#email").text("* You have to enter your email!");
				$('#submit').css('background-color', "red");

			} else if (g.indexOf('@') <= 0) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#email").text("*invalid position of @");
				$('#submit').css('background-color', "red");
			}
			//return index value :charAt then total length devang@gmail.com length is:16 return charAt is position of cdot(.) lenth-position 16-4 12 identify the position 
			else if ((g.charAt(g.length - 4) != '.') && (g.charAt(g.length - 3) != '.')) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#email").text("*invalid position of dot(.)");
				$('#submit').css('background-color', "red");

			} else {
				$(this).css("border-color", "green");
				$('#submit').attr('disabled', false);
				$("#email").text(" ");
				$('#submit').css('background-color', "green");
			}
		});

		$('.mobile').on("keyup", function () {
			var f = $('.mobile').val();
			var r = /^[6-9][0-9]{9}$/;
			if (f == "" || f == null) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#mobile").text("* You have to enter your phone!");
				$('#submit').css('background-color', "red");
			}
			else if (isNaN(f)) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#mobile").text("* Only number are alloweds!");
				$('#submit').css('background-color', "red");
			} else if ((f.length > 10) || (f.length < 10)) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#mobile").text("* phone number length must be 10 number");
				$('#submit').css('background-color', "red");
			} else if (!r.test(f)) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#mobile").text("*Please enter currect number between 6 to 9");
				$('#submit').css('background-color', "red");
			} else {
				$(this).css("border-color", "green");
				$('#submit').attr('disabled', false);
				$("#mobile").text(" ");
				$('#submit').css('background-color', "green");
			}
		});

		$('.address').on("keyup", function () {
			var l = $(this).val();
			if (l == "" || l == null) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#address").text("* You have to enter your address!");
				$('#submit').css('background-color', "red");
			} else if ((l.length <= 5) || (l.length > 120)) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#address").text("*please enter the address between 5 and 120");
				$('#submit').css('background-color', "red");
			}else {
				$(this).css("border-color", "green");
				$('#submit').attr('disabled', false);
				$("#address").text(" ");
				$('#submit').css('background-color', "green");
			}
		});

		$('.state').on("keyup", function () {
			var l = $(this).val();
			if (l == "" || l == null) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#state").text("* You have to enter your state!");
				$('#submit').css('background-color', "red");
			} else if ((l.length <= 2) || (l.length > 20)) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#state").text("*please enter the name between 2 and 20");
				$('#submit').css('background-color', "red");
			} else if (!($(this).val().match('^[a-zA-Z]{3,16}$'))) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#state").text("* Only character are allowed");
				$('#submit').css('background-color', "red");
			} else {
				$(this).css("border-color", "green");
				$('#submit').attr('disabled', false);
				$("#state").text(" ");
				$('#submit').css('background-color', "green");
			}
		});

		$('.country').on("keyup", function () {
			var l = $(this).val();
			if (l == "" || l == null) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#country").text("* You have to enter your Country!");
				$('#submit').css('background-color', "red");
			} else if ((l.length <= 2) || (l.length > 20)) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#country").text("*please enter the name between 2 and 20");
				$('#submit').css('background-color', "red");
			} else if (!($(this).val().match('^[a-zA-Z]{3,16}$'))) {
				$(this).css("border-color", "#cd2d00");
				$('#submit').attr('disabled', true);
				$("#country").text("* Only character are allowed");
				$('#submit').css('background-color', "red");

			} else {

				$(this).css("border-color", "green");
				$('#submit').attr('disabled', false);
				$("#country").text(" ");
				$('#submit').css('background-color', "green");
			}
		});

		$('.password').on("keyup", function() {
                var f = $(this).val();
                if (f == "" || f == null) {
                    $(this).css("border-color", "#cd2d00");
                    $('#submit').attr('disabled', true);
                    $("#password").text("* You have to enter your password!");
                    $('#submit').css('background-color', "red");
                } else if ((f.length < 8) || (f.length > 8)) {
                    $(this).css("border-color", "#cd2d00");
                    $('#submit').attr('disabled', true);
                    $("#password").text("*password length must be 8 digit");
                    $('#submit').css('background-color', "red");
                } else {
                    $(this).css("border-color", "green");
                    $('#submit').attr('disabled', false);
                    $("#password").text(" ");
                    $('#submit').css('background-color', "green");
                }
            });

			$('.confirm').on("keyup", function() {
                var f = $(this).val();
                var p = $(".password").val();
                if (f == "" || f == null) {
                    $(this).css("border-color", "#cd2d00");
                    $('#submit').attr('disabled', true);
                    $("#confirm").text("* You have to enter confirm password!");
                    $('#submit').css('background-color', "red");
                } else if ((f.length < 8) || (f.length > 8)) {
                    $(this).css("border-color", "#cd2d00");
                    $('#submit').attr('disabled', true);
                    $("#confirm").text("*password length must be 8 digit");
                    $('#submit').css('background-color', "red");
                } else if (p != f) {
                    $(this).css("border-color", "#cd2d00");
                    $('#submit').attr('disabled', true);
                    $("#confirm").text("*password and confirm password not matched");
                    $('#submit').css('background-color', "red");
                } else {
                    $(this).css("border-color", "green");
                    $('#submit').attr('disabled', false);
                    $("#confirm").text(" ");
                    $('#submit').css('background-color', "green");
                }
            });
	});
*/