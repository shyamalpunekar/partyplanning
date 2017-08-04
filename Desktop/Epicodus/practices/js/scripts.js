$(document).ready(function() {
  $("form").submit(function(event) {
    event.preventDefault();
    var name = $(".name");
    alert("hi" + name);
  })
});
