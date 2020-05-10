$(document).ready(function(){
   alert("hey Jquery !!!");
   $("#submit").click(function(){
     //Get the user-defined values
    var myFirst= $('#fname').val() ; 
    var myLast= $('#lname').val() ;    
    var city= $('#city').val() ;  
 //Use JQuery AJAX request to post data to a Sling Servlet
    $.ajax({
          type: 'POST',
          url: '/bin/myServlet',
          data:'firstName='+ myFirst+'&lastName='+ myLast+'&city='+ city,
          success: function(msg){
         alert("result from servlet"+msg);

        var json = jQuery.parseJSON(msg); 
            var firstName=   json.firstName;
        alert("FirstName ****"+firstName)
            var lastName = json.lastname;
            var city = json.city;

            $('#city').val(city); 
            $('#json').val("Filed by " + firstName + " " + lastName); 
      },
        error: function(err) {
             alert("Unable to retrive data "+err);
        }
    });
         });
});




$(document).ready(function(){
   alert("hey Jquery !!!");
   $("#submit").click(function(){
     //Get the user-defined values
    var myFirst= $('#fname').val() ; 
    var myLast= $('#lname').val() ;    
    var city= $('#city').val() ;  
 //Use JQuery AJAX request to post data to a Sling Servlet
    $.ajax({
          type: 'POST',
          url: '/bin/myServlet',
          data:'firstName='+ myFirst+'&lastName='+ myLast+'&city='+ city,
          success: function(msg){
         alert("result from servlet"+msg);
      },
        error: function(err) {
             alert("Unable to retrive data "+err);
        }
    });
         });
});



