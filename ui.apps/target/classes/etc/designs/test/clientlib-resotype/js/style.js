alert("Hello");
$(document).ready(function(){
   alert("Resource Type Jquery !!!");
   $("#ps").click(function(){
       //Use JQuery AJAX request to post data to a Sling Servlet
    $.ajax({
          type: 'GET',
          url: '/content/test/servlettestingpage.sample.html',
          success: function(msg){
         alert("result from servlet"+msg);
      },
        error: function(err) {
             alert("Unable to retrive data "+err);
        }
    });
         });
});



