$(document).ready(function() {
  $("#userInfo").submit(function(event) {
    var blanks = ["person1", "person2", "animal", "exclamation", "verb", "noun"];
    blanks.forEach(function(blank) {
      var userInput = $("#" +blank).val();
      $("." + blank).text(userInput);
    });


    $("#story").show();
    event.preventDefault();

  });
});


// This code contains forEach loop
