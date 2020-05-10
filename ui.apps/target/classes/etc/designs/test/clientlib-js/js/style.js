$(document).ready(function(){

   // alert("Hello Jquery");


     $("#submit").click(function(){

     //Get the user-defined values
    var myFirst= $('#FirstName').val() ; 
    var myLast= $('#LastName').val() ;    
    var city= $('#City').val() ;  
 //Use JQuery AJAX request to post data to a Sling Servlet
    $.ajax({
           type: 'POST',
           url: '/bin/myServlet',
          contentType:'application/json',
          dataType: 'json',
          data:JSON.stringify(jsonData),
          success: function(result){
            alert(result);     
        },
        error: function(err) {
             alert("Unable to retrive data "+err);
        }
    });
         });

});