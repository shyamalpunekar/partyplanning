// business logic
var pingPong = function(inputN) {
  var result = [];
  for (var i = 0; i <= inputN; i++ ) {
    if (i % 3 === 0 && i % 15 !== 0) {
      result.push("PING");
    } else if (i % 5 === 0 && i % 15 !== 0) {
      result.push("PONG");
    } else if (i % 15 === 0) {
      result.push("PING-PONG");
    } else {
      result.push(i);
    }
  }
  return result;
};
// user interface
$(function() {
  $(".ping-pong" ).submit(function(event) {
    event.preventDefault();
    $(".Rules").hide();
    $(".About").hide();
    $("ul#showOutput").empty();
    var inputN = parseInt($("#inputNumber").val());
    var output = pingPong(inputN);
    for (var i = 1; i <= inputN; i++) {
     $("#showOutput").append("<li>" + output[i] + "</li>");
   }
  });
  $("#clickRules").click(function() {
    $(".Rules").show();
  });
  $("#clickAbout").click(function() {
    $(".About").show();
  });
});
